package Controllers;

import Models.Enums.PerfilEnum;
import Models.UsuarioModel;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuarioController {

    public void cadastrarUsuarioController(String nome, String senha, PerfilEnum perfil) {
        if ((nome != null && nome.length() > 0) && (senha != null && senha.length() > 0)) {
            UsuarioModel novoUsuario = new UsuarioModel(nome, senha, perfil);
            novoUsuario.cadastrarUsuarioDAO(novoUsuario);
        } else {
            JOptionPane.showMessageDialog(null, "Digite os dados corretamente!");
        }
    }

    public ArrayList<UsuarioModel> listarUsuariosController() {
        UsuarioModel usuario = new UsuarioModel();
        return usuario.listarUsuariosDAO();
    }

    public UsuarioModel logarUsuarioController(String login, String senha) throws SQLException {
        if ((login != null && login.length() > 0) && (senha != null && senha.length() > 0)) {
            UsuarioModel usuarioLogin = new UsuarioModel();
            return usuarioLogin.verificarCredenciaisDAO(login, senha);
        } else {
            JOptionPane.showMessageDialog(null, "Informações Incorretas!");
            return null;
        }
    }

    public ArrayList<UsuarioModel> buscarUsuariosPorNomeController(String nome) {
        UsuarioModel usuarios = new UsuarioModel();
        return usuarios.buscarUsuariosPorNomeDAO(nome);
    }

    public UsuarioModel buscarUsuarioPorIdController(int idBusca) {
        UsuarioModel usuario = new UsuarioModel();
        return usuario.buscarUsuarioPorIdDAO(idBusca);
    }

    public void alterarUsuarioController(int id, String nome, String senha, PerfilEnum perfil) {
        if ((nome != null && nome.length() > 0) && (senha != null && senha.length() > 0)) {
            UsuarioModel antigoUsuario = new UsuarioModel(id, nome, senha, perfil);
            antigoUsuario.alterarUsuarioDAO(antigoUsuario);
        } else {
            JOptionPane.showMessageDialog(null, "Digite os dados corretamente!");
        }
    }

    public void excluirUsuarioController(int id) {
        int i = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o usuario?");
        if (i == JOptionPane.YES_OPTION) {
            UsuarioModel excluirUsuario = new UsuarioModel();
            excluirUsuario.excluirUsuarioDAO(id);
        } else if (i == JOptionPane.NO_OPTION) {
            System.out.println("Clicou em Não");
        } else if (i == JOptionPane.CANCEL_OPTION) {
            System.out.println("Clicou em Cancelar");
        }
    }
}
