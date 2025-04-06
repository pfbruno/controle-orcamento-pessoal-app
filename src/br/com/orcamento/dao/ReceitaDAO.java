package br.com.orcamento.dao;

import br.com.orcamento.db.Conexao;
import br.com.orcamento.model.Receita;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ReceitaDAO {
    public void inserirReceita(Receita receita) {
        String sql = "INSERT INTO receitas (valor, categoria, descricao, data) VALUES (?, ?, ?, ?)";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDouble(1, receita.getValor());
            stmt.setString(2, receita.getCategoria());
            stmt.setString(3, receita.getDescricao());
            stmt.setString(4, receita.getData());
            stmt.executeUpdate();

            System.out.println("Receita cadastrada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar receita: " + e.getMessage());
        }
    }
}
