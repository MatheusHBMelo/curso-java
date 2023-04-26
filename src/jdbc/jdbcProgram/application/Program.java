package jdbc.jdbcProgram.application;

import jdbc.jdbcProgram.db.DB;
import jdbc.jdbcProgram.db.DbException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) {
        // Conexões necessárias
        Connection conn = null;
        Statement st = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        // Retornando todos os elementos de uma tabela {GETALL - SELECT}
        try {
            conn = DB.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM seller");
            while (rs.next()){
                System.out.println("ID: " + rs.getInt("Id") + " - Nome: " + rs.getString("Name"));
            }
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
            DB.closeConnection();
        }

        // Inserindo um elemento em uma tabela {POST - INSERT}
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            conn = DB.getConnection();
            String sql = "INSERT INTO seller(Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES(?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, "Camila");
            ps.setString(2, "camila@email.com");
            ps.setDate(3, new java.sql.Date(sdf.parse("01/01/2001").getTime()));
            ps.setDouble(4, 1302.00);
            ps.setInt(5, 2);
            int rowsAffected = ps.executeUpdate();
            System.out.println("Done! Rows affected: " + rowsAffected);
        } catch (SQLException | ParseException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(ps);
            DB.closeConnection();
        }

        // Atualizando um elemento de uma tabela [PUT - UPDATE}
        try {
            conn = DB.getConnection();
            String sql = "UPDATE seller SET Email = ? WHERE Id = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, "max123@email.com");
            ps.setInt(2, 9);
            int rowsAffected = ps.executeUpdate();
            System.out.println("Done! Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(ps);
            DB.closeConnection();
        }

        // Deletando um elemento de uma tabela {DELETE - DELETE}
        try {
            conn = DB.getConnection();
            String sql = "DELETE FROM seller WHERE Id = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, 11);
            int rowsAffected = ps.executeUpdate();
            System.out.println("Done! Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(ps);
            DB.closeConnection();
        }

        // Protegendo as instruções SQL e o banco de dados de falhas
        try {
            conn = DB.getConnection();
            conn.setAutoCommit(false); // Desativando o autocommit para que o controle seja manual
            st = conn.createStatement();
            int row1 = st.executeUpdate("UPDATE seller SET BaseSalary = 1000 WHERE DepartmentId = 1");

            /* Código para forçar uma falha, com ele comentado o código funciona sem a tal falha.
            int x = 1;
            if (x < 2){
                throw new SQLException("Fake Error");
            }
             */

            int row2 = st.executeUpdate("INSERT INTO department(Name) VALUES('shoes')");

            conn.commit(); // Realizando a transação caso não ocorra falhas se não tiver erros

            System.out.println("Row1: " + row1);
            System.out.println("Row2: " + row2);
        } catch (SQLException e){
            try {
                conn.rollback(); // Retornando o banco de dados para a versão anterior à com problemas
                throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("Error trying to rollback! Caused by: " + ex.getMessage());
            }
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
