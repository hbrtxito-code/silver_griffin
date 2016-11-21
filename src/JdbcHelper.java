/**
 * Created by hbrtxito on 11/20/16.
 */

import java.sql.*;


public class JdbcHelper {

    final private String dbURL = "jdbc:mysql://localhost:3306/budget_db";
    final private String username = "root";
    final private String password = "dv9535nr";
    private Connection conn;

    public JdbcHelper() {
        getConnection();
    }

    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(dbURL, username, password);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return conn;
    }

    public ResultSet select(String nameTable, String[] columnsList, String condition) {

        try {
            String sql = "SELECT ";

            for (int i = 0; i < columnsList.length; i++) {
                String column = columnsList[i];
                sql = sql + column;
                if (i + 1 < columnsList.length) {
                    sql = sql + ",";
                }

            }

            sql = sql + " FROM " + nameTable + " ";

            if (!condition.isEmpty()) {
                sql = sql + " WHERE " + condition;
            }

            System.out.println("SQL: " + sql);

            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public int getLastInsert(String nameTable) {

        int maxID = -1;

        try {
            String sql = "SELECT MAX(id) FROM " + nameTable;

            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                maxID = result.getInt(1);
            }
            return maxID;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return maxID;
    }

    public String getDbURL() {
        return dbURL;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}