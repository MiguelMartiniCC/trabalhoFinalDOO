package Models;

import DAO.UsuarioBanco;
import Models.Enums.PerfilEnum;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioModel {

    private int id;
    private String nome;
    private String senha;
    private PerfilEnum perfil;
    private ArrayList<ContaModel> contas;

    public UsuarioModel() {
    }

    public UsuarioModel(int id, String nome, String senha, PerfilEnum perfil) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.perfil = perfil;
    }

    public UsuarioModel(String nome, String senha, PerfilEnum perfil) {
        this.nome = nome;
        this.senha = senha;
        this.perfil = perfil;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public PerfilEnum getPerfil() {
        return perfil;
    }

    public ArrayList<ContaModel> getContas() {
        return contas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setPerfil(PerfilEnum perfil) {
        this.perfil = perfil;
    }

    public void setContas(ArrayList<ContaModel> contas) {
        this.contas = contas;
    }

    public ArrayList<UsuarioModel> listarUsuariosDAO() {
        return new UsuarioBanco().listarUsuariosBD();
    }

    public UsuarioModel verificarCredenciaisDAO(String login, String senha) throws SQLException {
        UsuarioBanco usuarioLogin = new UsuarioBanco();
        UsuarioModel usuarioEncontrado = usuarioLogin.conferirLoginUsuarioBD(login, senha);

        if (usuarioEncontrado != null) {
            System.out.println("Acesso concedido!");
            return usuarioEncontrado;
        } else {
            System.out.println("Acesso negado!");
            return null;
        }
    }

    public ArrayList<UsuarioModel> buscarUsuariosPorNomeDAO(String nome) {
        return new UsuarioBanco().buscarUsuariosPorNomeBD(nome);
    }

    public UsuarioModel buscarUsuarioPorIdDAO(int idBusca) {
        return new UsuarioBanco().buscarUsuarioPorIdBD(idBusca);
    }

    public void alterarUsuarioDAO(UsuarioModel usuarioEditado) {
        UsuarioBanco edicaoUsuario = new UsuarioBanco();
        edicaoUsuario.editarUsuarioBD(usuarioEditado);
    }

    public void excluirUsuarioDAO(int idBusca) {
        UsuarioBanco exclusaoUsuario = new UsuarioBanco();
        exclusaoUsuario.deletarUsuarioBD(idBusca);
    }

    public void cadastrarUsuarioDAO(UsuarioModel usuario) {
        UsuarioBanco novoCategoria = new UsuarioBanco();
        novoCategoria.inserirUsuarioBD(usuario);
        System.out.println("Dados enviados para o banco de dados!");
    }
}
