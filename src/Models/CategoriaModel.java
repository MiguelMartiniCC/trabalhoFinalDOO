package Models;

import DAO.CategoriaBanco;
import java.util.ArrayList;

public class CategoriaModel {

    private int id;
    private String nome;

    public CategoriaModel() {
    }

    public CategoriaModel(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public CategoriaModel(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Métodos DAO, comunicação com CategoriaBanco.
    public void cadastrarCategoriaDAO(CategoriaModel categoria) {
        CategoriaBanco novoCategoria = new CategoriaBanco();
        novoCategoria.inserirCategoriaBD(categoria);
        System.out.println("Dados enviados para o banco de dados!");
    }

    public ArrayList<CategoriaModel> listarCategoriasDAO() {
        return new CategoriaBanco().listarCategoriasBD();
    }

    public ArrayList<CategoriaModel> buscarCategoriasPorNomeDAO(String nome) {
        return new CategoriaBanco().buscarCategoriasPorNomeBD(nome);
    }

    public CategoriaModel buscarCategoriaPorIdDAO(int idBusca) {
        return new CategoriaBanco().buscarCategoriaPorIdBD(idBusca);
    }

    public void alterarCategoriaDAO(CategoriaModel categoriaEditada) {
        CategoriaBanco edicaoCategoria = new CategoriaBanco();
        edicaoCategoria.editarCategoriaBD(categoriaEditada);
    }

    public void excluirCategoriaDAO(int idBusca) {
        CategoriaBanco exclusaoCategoria = new CategoriaBanco();
        exclusaoCategoria.deletarCategoriaBD(idBusca);
    }
}
