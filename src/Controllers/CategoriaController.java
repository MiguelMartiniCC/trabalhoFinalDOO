package Controllers;

import Models.CategoriaModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CategoriaController {

    public void cadastrarCategoriaController(String nome) {
        if ((nome != null && nome.length() > 0)) {
            CategoriaModel novaCategoria = new CategoriaModel(nome);
            novaCategoria.cadastrarCategoriaDAO(novaCategoria);
        } else {
            JOptionPane.showMessageDialog(null, "Digite os dados corretamente!");
        }
    }

    public ArrayList<CategoriaModel> listarCategoriasController() {
        CategoriaModel categoria = new CategoriaModel();
        return categoria.listarCategoriasDAO();
    }

    public ArrayList<CategoriaModel> buscarCategoriasPorNomeController(String nome) {
        CategoriaModel categorias = new CategoriaModel();
        return categorias.buscarCategoriasPorNomeDAO(nome);
    }

    public CategoriaModel buscarCategoriaPorIdController(int idBusca) {
        CategoriaModel categoria = new CategoriaModel();
        return categoria.buscarCategoriaPorIdDAO(idBusca);
    }

    public void alterarCategoriaController(int id, String nome) {
        if ((nome != null && nome.length() > 0)) {
            CategoriaModel antigoCategoria = new CategoriaModel(id, nome);
            antigoCategoria.alterarCategoriaDAO(antigoCategoria);
        } else {
            JOptionPane.showMessageDialog(null, "Digite os dados corretamente!");
        }
    }

    public void excluirCategoriaController(int id) {
        int i = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o categoria?");
        if (i == JOptionPane.YES_OPTION) {
            CategoriaModel excluirCategoria = new CategoriaModel();
            excluirCategoria.excluirCategoriaDAO(id);
        } else if (i == JOptionPane.NO_OPTION) {
            System.out.println("Clicou em Não");
        } else if (i == JOptionPane.CANCEL_OPTION) {
            System.out.println("Clicou em Cancelar");
        }
    }

}
