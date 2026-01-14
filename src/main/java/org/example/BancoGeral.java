package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class BancoGeral {
    private Connection conn;

    public void conectar() {

       try {
           conn = DriverManager.getConnection("jdbc:sqlite:alunos.db");
           System.out.println("Conexão com SQLite estabelecida.");
       } catch (SQLException e) {
           System.out.println("Erro ao conectar: " + e.getMessage());
       }
    }

    public void criarTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS aluno (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                     "nome TEXT NOT NULL," +
                     "idade INTEGER," +
                     "objetivo TEXT)";
        try {
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            System.out.println("Tabela criada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela: " + e.getMessage());
        }
    }

}
