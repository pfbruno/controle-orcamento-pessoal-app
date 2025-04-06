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

    // Getters e Setters
}
