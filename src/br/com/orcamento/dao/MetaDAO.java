package br.com.orcamento.dao;

import br.com.orcamento.db.Conexao;
import br.com.orcamento.model.Meta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MetaDAO {
    public void inserirMeta(Meta meta) {
        String sql = "INSERT INTO metas (valor, mes) VALUES (?, ?)";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDouble(1, meta.getValor());
            stmt.setString(2, meta.getMes());
            stmt.executeUpdate();

            System.out.println("Meta cadastrada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar meta: " + e.getMessage());
        }
    }
}
