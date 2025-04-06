package br.com.orcamento.dao;

import br.com.orcamento.db.Conexao;
import br.com.orcamento.model.Despesa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DespesaDAO {
    public void inserirDespesa(Despesa despesa) {
        String sql = "INSERT INTO despesas (valor, categoria, descricao, data) VALUES (?, ?, ?, ?)";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDouble(1, despesa.getValor());
            stmt.setString(2, despesa.getCategoria());
            stmt.setString(3, despesa.getDescricao());
            stmt.setString(4, despesa.getData());
            stmt.executeUpdate();

            System.out.println("Despesa cadastrada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar despesa: " + e.getMessage());
        }
    }
}
