package jdbc.jdbcProgram.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DB {
    // Método para ler as propriedades do arquivo db.properties
    private static Properties loadProperties(){
        try (FileInputStream fs = new FileInputStream("db.properties")){
            Properties prop = new Properties();
            prop.load(fs);
            return prop;
        } catch (IOException e){
            throw new DbException(e.getMessage());
        }
    }

    // Variavel estática para representar a conexão com o banco de dados
    private static Connection conn = null;

    // Métodos para abrir uma conexão com o banco de dados
    public static Connection getConnection(){
        if (conn == null){
            try {
                Properties prop = loadProperties();
                String url = prop.getProperty("dburl");
                conn = DriverManager.getConnection(url, prop);
            } catch (SQLException e){
                throw new DbException(e.getMessage());
            }
        }
        return conn;
    }

    // Métodos para fechar uma conexão com o banco de dados
    public static void closeConnection(){
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException e){
                throw new DbException(e.getMessage());
            }
        }
    }

    // Método para fechar uma Statement
    public static void closeStatement(Statement st){
        if (st != null){
            try {
                st.close();
            } catch (SQLException e){
                throw new DbException(e.getMessage());
            }
        }
    }

    // Método para fechar um ResultSet
    public static void closeResultSet(ResultSet rs){
        if (rs != null){
            try {
                rs.close();
            } catch (SQLException e){
                throw new DbException(e.getMessage());
            }
        }
    }
}
