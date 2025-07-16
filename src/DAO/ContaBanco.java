package DAO;

import Models.ContaModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ContaBanco {
    
    public void inserirContaBD(ContaModel novaConta) {
        String sql = "INSERT INTO tbcontas(descricao, valor, formaPagamento, parcelas, dataCompra, usuario) VALUES (?, ?, ?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement stmt = null;
        
        try {
            connection = new ConexaoDAO().conectorBD();
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, novaConta.getDescricao());
            stmt.setDouble(2, novaConta.getValor());
            stmt.setString(3, novaConta.getFormaPagamento().name());
            stmt.setInt(4, novaConta.getParcelas());
            stmt.setDate(5, java.sql.Date.valueOf(novaConta.getDataCompra()));
            stmt.setInt(6, novaConta.getUsuario().getId());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Conta inserida com sucesso!");
            
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao inserir conta no banco: " + e.getMessage());
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão");
            }
        }
    }
}
