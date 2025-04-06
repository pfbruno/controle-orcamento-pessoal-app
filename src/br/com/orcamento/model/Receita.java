package br.com.orcamento.model;

public class Receita {
    private double valor;
    private String categoria;
    private String descricao;
    private String data;

    public Receita(double valor, String categoria, String descricao, String data) {
        this.valor = valor;
        this.categoria = categoria;
        this.descricao = descricao;
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
