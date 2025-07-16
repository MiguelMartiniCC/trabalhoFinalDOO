package DAO;

import Models.CategoriaModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CategoriaBanco {

    //Inserção de categorias no BD.
    public void inserirCategoriaBD(CategoriaModel novaCategoria) {
        String sql = "INSERT INTO TBCategorias(nome) VALUES(?)";

        Connection connection = null;
        PreparedStatement stmt = null;

        try {
            connection = new ConexaoDAO().conectorBD();
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, novaCategoria.getNome());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos no banco com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco");
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao fechar o stmt");
            }
        }
    }

    //Listagem de categorias do BD.
    public ArrayList<CategoriaModel> listarCategoriasBD() {
        Connection conn = null;
        PreparedStatement stmt = null;
        CategoriaModel categoria = null;
        ArrayList<CategoriaModel> listaCategorias = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM TBCategorias";

        try {
            conn = new ConexaoDAO().conectorBD();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            if (rs != null) {
                listaCategorias = new ArrayList<>();
                while (rs.next()) {
                    categoria = new CategoriaModel();
                    categoria.setId(rs.getInt("id"));
                    categoria.setNome(rs.getString("nome"));
                    listaCategorias.add(categoria);
                }
            }
            System.out.println("Dados coletados com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao selecionar os dados!");
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao fechar o stmt");
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException sQLException) {
                sQLException.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao encerrar a conexão!");
            }
        }

        return listaCategorias;
    }

    //Buscar categorias com mesmo nome no BD.
    public ArrayList<CategoriaModel> buscarCategoriasPorNomeBD(String nome) {
        //Definição de tipos.
        Connection conexao = null;
        PreparedStatement stmt = null;
        CategoriaModel categoria = null;
        ArrayList<CategoriaModel> listaCategorias = null;
        ResultSet rs = null;

        //Comando sql para selecionar por nome.
        String sql = "SELECT * FROM TBCategorias WHERE nome LIKE '%"
                + nome + "%' ORDER BY nome";

        //Tentando obter os categorias do BD por nome.
        try {
            conexao = new ConexaoDAO().conectorBD();
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();

            if (rs != null) {
                listaCategorias = new ArrayList<>();
                while (rs.next()) {
                    categoria = new CategoriaModel();

                    //Obtém os dados das linhas de cada campo do BD, e converte para o modelo de categoria.
                    categoria.setId(rs.getInt("id"));
                    categoria.setNome(rs.getString("nome"));

                    listaCategorias.add(categoria);
                }
            }
            System.out.println("Dados selecionados com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao selecionar os dados.");
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao fechar o stmt.");
                System.out.println("Erro ao fechar o stmt.");
            }
            try {
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException sQLException) {
                sQLException.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao encerrar a conexão.");
                System.out.println("Erro ao encerrar a conexão.");
            }
        }
        return listaCategorias;
    }

    //Buscar categoria por id no BD.
    public CategoriaModel buscarCategoriaPorIdBD(int idBusca) {
        Connection conexao = null;
        PreparedStatement stmt = null;
        CategoriaModel categoria = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM TBCategorias WHERE id = ?";

        try {
            conexao = new ConexaoDAO().conectorBD();
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idBusca);
            rs = stmt.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    categoria = new CategoriaModel();
                    categoria.setId(rs.getInt("id"));
                    categoria.setNome(rs.getString("nome"));
                }
            }

            System.out.println("Dado obtido com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao selecionar o dado.");
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao fechar o stmt.");
                System.out.println("Erro ao fechar o stmt.");
            }
            try {
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException sQLException) {
                sQLException.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao encerrar a conexão.");
                System.out.println("Erro ao encerrar a conexão.");
            }
        }
        return categoria;
    }

    //Edita uma categoria existente no BD.
    public void editarCategoriaBD(CategoriaModel categoriaEditada) {
        Connection conexao = null;
        PreparedStatement stmt = null;

        String sql = "UPDATE TBCategorias SET nome = ? WHERE id = ?";

        try {
            conexao = new ConexaoDAO().conectorBD();

            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, categoriaEditada.getNome());
            stmt.setInt(2, categoriaEditada.getId());

            stmt.execute();

            JOptionPane.showMessageDialog(null, "Edição realizada com sucesso!");
            System.out.println("Edição de dado realizado com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao editar o dado.");
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao fechar o stmt.");
                System.out.println("Erro ao fechar o stmt.");
            }
            try {
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException sQLException) {
                sQLException.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao encerrar a conexão.");
                System.out.println("Erro ao encerrar a conexão.");
            }
        }
    }

    //Deleta uma categoria existente no BD.
    public void deletarCategoriaBD(int idBusca) {
        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "DELETE FROM TBCategorias WHERE id = " + idBusca;

        try {
            conn = new ConexaoDAO().conectorBD();
            stmt = conn.prepareStatement(sql);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
            System.out.println("Exclusão realizada com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao excluir o dado.");
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao fechar o stmt.");
                System.out.println("Erro ao fechar o stmt.");
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException sQLException) {
                sQLException.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao encerrar a conexão.");
                System.out.println("Erro ao encerrar a conexão.");
            }
        }
    }
}
