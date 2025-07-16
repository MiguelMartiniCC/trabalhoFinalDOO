package Models;

public class ContaCategoriaModel {

    private ContaModel conta;
    private CategoriaModel categoria;

    public ContaCategoriaModel() {
    }

    public ContaCategoriaModel(ContaModel conta, CategoriaModel categoria) {
        this.conta = conta;
        this.categoria = categoria;
    }

    public ContaModel getConta() {
        return conta;
    }

    public CategoriaModel getCategoria() {
        return categoria;
    }

    public void setConta(ContaModel conta) {
        this.conta = conta;
    }

    public void setCategoria(CategoriaModel categoria) {
        this.categoria = categoria;
    }

}
