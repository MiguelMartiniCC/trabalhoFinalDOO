package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBInit {

    public void inicializar() {
        try {
            try (Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/accountmanager",
                    "root", ""); Statement stmt = conn.createStatement()) {

                String sqlCriarDB = "CREATE DATABASE IF NOT EXISTS accountmanager";
                stmt.executeUpdate(sqlCriarDB);
                System.out.println("Banco 'accountmanager' verificado/criado com sucesso.");
            }

            try (Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/accountmanager",
                    "root", ""); Statement stmt = conn.createStatement()) {

                String sqlCriarTabelaUsuario = """
                   CREATE TABLE IF NOT EXISTS TBUsuarios(
                        id INT PRIMARY KEY AUTO_INCREMENT,
                        nome VARCHAR(100) NOT NULL,
                        senha VARCHAR(255) NOT NULL,
                        perfil ENUM('ADMIN','NORMAL') NOT NULL
                        );
                        """;

                String sqlCriarTabelaContas = """
                        CREATE TABLE IF NOT EXISTS TBContas(
                        id INT PRIMARY KEY AUTO_INCREMENT,
                        descricao VARCHAR(200) NOT NULL,
                        valor DECIMAL(10,2) NOT NULL,
                        forma_pagamento ENUM('CREDITO','DEBITO','PIX','DINHEIRO','BOLETO') NOT NULL,
                        parcelas INT,
                        data_compra DATE NOT NULL,
                        data_pagamento DATE,
                        status_pagamento ENUM('PAGA','PENDENTE','ATRASADA') NOT NULL,
                        usuario_id INT NOT NULL,
                        FOREIGN KEY (usuario_id) REFERENCES TBUsuarios(id)
                        );
                        """;

                String sqlCriarTabelaCategorias = """
                        CREATE TABLE IF NOT EXISTS TBCategorias(
                        id INT PRIMARY KEY AUTO_INCREMENT,
                        nome VARCHAR(100) NOT NULL
                        );
                        """;

                String sqlCriarTabelaContasCategorias = """
                        CREATE TABLE IF NOT EXISTS TBContasCategorias(
                        conta_id INT NOT NULL,
                        categoria_id INT NOT NULL,
                        PRIMARY KEY (conta_id, categoria_id),
                        FOREIGN KEY (conta_id) REFERENCES TBContas(id) ON DELETE CASCADE,
                        FOREIGN KEY (categoria_id) REFERENCES TBCategorias(id) ON DELETE CASCADE
                        );
                        """;

                String sqlUsuarioAdmin = """
                        INSERT INTO TBUsuarios (nome, senha, perfil)
                        SELECT 'admin', '12345', 'ADMIN'
                        WHERE NOT EXISTS (
                                 SELECT 1 FROM TBUsuarios WHERE nome = 'admin'
                        );
                        """;
                stmt.executeUpdate(sqlCriarTabelaUsuario);
                System.out.println("Tabela 'Usuarios' verificada/criada com sucesso.");

                stmt.executeUpdate(sqlCriarTabelaContas);
                System.out.println("Tabela 'Contas' verificada/criada com sucesso.");

                stmt.executeUpdate(sqlCriarTabelaCategorias);
                System.out.println("Tabela 'Categorias' verificada/criada com sucesso.");

                stmt.executeUpdate(sqlCriarTabelaContasCategorias);
                System.out.println("Tabela 'Contas_Categorias' verificada/criada com sucesso.");

                stmt.executeUpdate(sqlUsuarioAdmin);
                System.out.println("Usuário 'admin' verificado/criado com sucesso.");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao criar/verificar banco e tabelas:");
            e.printStackTrace();
        }
    }
}
