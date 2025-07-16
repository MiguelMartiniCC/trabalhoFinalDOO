package DAO;

import Models.Enums.PerfilEnum;
import Models.UsuarioModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuarioBanco {

    public void inserirUsuarioBD(UsuarioModel novoUsuario) {
        String sql = "INSERT INTO TBUsuarios(nome, senha, perfil) VALUES(?, ?, ?)";
        Connection connection = null;
        PreparedStatement stmt = null;

        try {
            connection = new ConexaoDAO().conectorBD();
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, novoUsuario.getNome());
            stmt.setString(2, novoUsuario.getSenha());
            stmt.setString(3, novoUsuario.getPerfil().name());
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

    public ArrayList<UsuarioModel> listarUsuariosBD() {
        Connection conn = null;
        PreparedStatement stmt = null;
        UsuarioModel usuario = null;
        ArrayList<UsuarioModel> listaUsuarios = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM TBUsuarios";

        try {
            conn = new ConexaoDAO().conectorBD();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            if (rs != null) {
                listaUsuarios = new ArrayList<>();
                while (rs.next()) {
                    usuario = new UsuarioModel();
                    usuario.setId(rs.getInt("id"));
                    usuario.setNome(rs.getString("nome"));
                    usuario.setSenha(rs.getString("senha"));
                    usuario.setPerfil(PerfilEnum.valueOf(rs.getString("perfil")));
                    listaUsuarios.add(usuario);
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

        return listaUsuarios;
    }

    public UsuarioModel conferirLoginUsuarioBD(String login, String senha) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM TBUsuarios WHERE nome = ? AND senha = ?";

        try {
            conn = new ConexaoDAO().conectorBD();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, login.trim());
            stmt.setString(2, senha.trim());

            rs = stmt.executeQuery();

            if (rs.next()) {
                UsuarioModel usuario = new UsuarioModel();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setPerfil(PerfilEnum.valueOf(rs.getString("perfil")));
                System.out.println("Login realizado com sucesso.");
                return usuario;
            } else {
                System.out.println("Login ou senha incorretos.");
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao acessar os dados!");
            return null;
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao encerrar a conexão!");
            }
        }
    }

    public ArrayList<UsuarioModel> buscarUsuariosPorNomeBD(String nome) {
        Connection conexao = null;
        PreparedStatement stmt = null;
        UsuarioModel usuario = null;
        ArrayList<UsuarioModel> listaUsuarios = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM TBUsuarios WHERE nome LIKE '%"
                + nome + "%' ORDER BY nome";

        try {
            conexao = new ConexaoDAO().conectorBD();
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();

            if (rs != null) {
                listaUsuarios = new ArrayList<>();
                while (rs.next()) {
                    usuario = new UsuarioModel();

                    //Obtém os dados das linhas de cada campo do BD, e converte para o modelo de usuario.
                    usuario.setId(rs.getInt("id"));
                    usuario.setNome(rs.getString("nome"));
                    usuario.setSenha(rs.getString("senha"));
                    usuario.setPerfil(PerfilEnum.valueOf(rs.getString("perfil")));

                    listaUsuarios.add(usuario);
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
        return listaUsuarios;
    }

    //Buscar usuario por id no BD.
    public UsuarioModel buscarUsuarioPorIdBD(int idBusca) {
        Connection conexao = null;
        PreparedStatement stmt = null;
        UsuarioModel usuario = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM TBUsuarios WHERE id = ?";

        try {
            conexao = new ConexaoDAO().conectorBD();
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idBusca);
            rs = stmt.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    usuario = new UsuarioModel();
                    usuario.setId(rs.getInt("id"));
                    usuario.setNome(rs.getString("nome"));
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
        return usuario;
    }

    //Edita uma usuario existente no BD.
    public void editarUsuarioBD(UsuarioModel usuarioEditada) {
        Connection conexao = null;
        PreparedStatement stmt = null;

        String sql = "UPDATE TBUsuarios SET nome = ?, senha = ?, perfil = ? WHERE id = ?";

        try {
            conexao = new ConexaoDAO().conectorBD();
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, usuarioEditada.getNome());
            stmt.setString(2, usuarioEditada.getSenha());
            stmt.setString(3, usuarioEditada.getPerfil().name());
            stmt.setInt(4, usuarioEditada.getId());

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

    //Deleta uma usuario existente no BD.
    public void deletarUsuarioBD(int idBusca) {
        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "DELETE FROM TBUsuarios WHERE id = " + idBusca;

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
