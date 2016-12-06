/**
 * Created by hbrtxito on 11/20/16.
 */

import java.io.Serializable;
import java.sql.*;
import java.util.logging.*;


public class Services implements Serializable {

    protected PreparedStatement statement ;

    public boolean insert(Expenses expenses) {
        JdbcHelper jdbcHelper = new JdbcHelper();


        try {
            String sql = "INSERT INTO tbl_expenses (product, category , store , quantity , price , payment , date , comment) VALUES (?, ? , ? ,? ,? ,?, ?,?)";

            statement = jdbcHelper.getConnection().prepareStatement(sql);
            statement.setString(1, expenses.getProduct());
            statement.setString(2, expenses.getCategory());
            statement.setString(3 , expenses.getStore());
            statement.setInt(4, expenses.getQuantity());
            statement.setFloat(5, expenses.getPrice());
            statement.setString(6, expenses.getPayment());
            statement.setDate(7 , new java.sql.Date(expenses.getDate().getTime()));
            statement.setString(8, expenses.getComments());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new Expense was inserted successfully!");
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            //Closing the connection
            try {
                if (statement != null) {
                    statement.close();
                    jdbcHelper.conn.close();
                    System.out.println("Connection closed.");

                }
            }catch (SQLException ex)
            {Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
            }finally {
                statement=null;
                jdbcHelper.conn=null;}
        }

        return false;
    }


    public boolean insert_2(Income income) {

        try {

            String sql = "INSERT INTO tbl_income (user , income , comments , date ) VALUES (?, ? , ? , ?)";

            JdbcHelper jdbcHelper = new JdbcHelper();


            PreparedStatement statement = jdbcHelper.getConnection().prepareStatement(sql);
            statement.setString(1, income.getStr_user());
            statement.setFloat(2, income.getAmount());
            statement.setString(3 , income.getComments());
            statement.setDate(4 , new java.sql.Date(income.getDate().getTime()));

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new Income was inserted successfully!");
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            //Closing the connection
            try{
                statement.close();
                if (statement.isClosed())
                    System.out.println("Connection closed.");}
            catch (SQLException ex)
            { Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public void fill_data(){

        JdbcHelper jdbcHelper = new JdbcHelper();
        try {
            String sql = "";


            statement = jdbcHelper.getConnection().prepareStatement(sql);
        }catch (SQLException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            //Closing the connection
            try {
                if (statement != null) {
                    statement.close();
                    jdbcHelper.conn.close();
                    System.out.println("Connection closed.");

                }
            } catch (SQLException ex) {
                Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                statement = null;
                jdbcHelper.conn = null;
            }
        }




    }

}