package Models;

import Models.Enums.FormaPagamentoEnum;
import Models.Enums.StatusPagamentoEnum;
import java.time.LocalDate;
import java.util.ArrayList;

public class ContaModel {

    private int id;
    private String descricao;
    private double valor;
    private FormaPagamentoEnum formaPagamento;
    private int parcelas;
    private LocalDate dataCompra;
    private LocalDate dataPagamento;
    private StatusPagamentoEnum statusPagamento;
    private UsuarioModel usuario;
    private ArrayList<CategoriaModel> categorias;

    public ContaModel() {
    }

    public ContaModel(int id, String descricao, double valor, FormaPagamentoEnum formaPagamento, int parcelas, LocalDate dataCompra, LocalDate dataPagamento, StatusPagamentoEnum statusPagamento, UsuarioModel usuario, ArrayList<CategoriaModel> categorias) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.parcelas = parcelas;
        this.dataCompra = dataCompra;
        this.dataPagamento = dataPagamento;
        this.statusPagamento = statusPagamento;
        this.usuario = usuario;
        this.categorias = categorias;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public FormaPagamentoEnum getFormaPagamento() {
        return formaPagamento;
    }

    public int getParcelas() {
        return parcelas;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public StatusPagamentoEnum getStatusPagamento() {
        return statusPagamento;
    }

    public UsuarioModel getUsuario() {
        return usuario;
    }

    public ArrayList<CategoriaModel> getCategorias() {
        return categorias;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setFormaPagamento(FormaPagamentoEnum formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public void setStatusPagamento(StatusPagamentoEnum statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public void setUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
    }

    public void setCategorias(ArrayList<CategoriaModel> categorias) {
        this.categorias = categorias;
    }

}
