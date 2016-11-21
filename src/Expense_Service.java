/**
 * Created by hbrtxito on 11/20/16.
 */

import java.sql.*;
import java.util.logging.*;


public class Expense_Service {

    public JdbcHelper jdbcHelper = new JdbcHelper();

    public boolean insert(Expenses expenses) {

        try {
            String sql = "INSERT INTO tbl_expenses (product, category , quantity , price , payment , date , comment) VALUES (?, ? , ? ,? ,? ,?, ?)";

            JdbcHelper jdbcHelper = new JdbcHelper();


            PreparedStatement statement = jdbcHelper.getConnection().prepareStatement(sql);
            statement.setString(1, expenses.getProduct());
            statement.setString(2, expenses.getCategory());
            statement.setInt(3, expenses.getQuantity());
            statement.setFloat(4, expenses.getPrice());
            //statement.setDate(5 , new java.sql.Date(expenses.getDate()));


            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new seller was inserted successfully!");
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Expense_Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
