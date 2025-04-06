package br.com.orcamento.model;

public class Meta {
    private double valor;
    private String mes;

    public Meta(double valor, String mes) {
        this.valor = valor;
        this.mes = mes;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
}
