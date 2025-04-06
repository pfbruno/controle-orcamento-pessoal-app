package br.com.orcamento.app;

import br.com.orcamento.dao.ReceitaDAO;
import br.com.orcamento.model.Receita;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de Controle de Orçamento Pessoal Iniciado.");

        Receita r = new Receita(2500.00, "Salário", "Salário de abril", "2025-04-06");
        ReceitaDAO dao = new ReceitaDAO();
        dao.inserirReceita(r);
    }
}
