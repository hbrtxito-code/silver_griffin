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

    public int max_id() {

        JdbcHelper jdbcHelper = new JdbcHelper();

        int max_product_id=0;

        try {
            String sql = "select max(productID) from tbl_expenses ;";

            PreparedStatement statement = jdbcHelper.getConnection().prepareStatement(sql);

            ResultSet result = statement.executeQuery();

            while (result.next()) {
                max_product_id = result.getInt(1);
                System.out.println(max_product_id);

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
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
        return max_product_id;

    }

    public double third_panel_results(String start, String end , String category) {

        JdbcHelper jdbcHelper = new JdbcHelper();

        double total_test =0 ;

        try {
            // Query to fin out how much is spent on a month by categories
            String query = "Select sum(price) from tbl_expenses where  date>=\""+ start + "\" and date<=\"" + end
                            + "\" and category= \"" + category+ "\"";
            System.out.println(query);

            PreparedStatement statement = jdbcHelper.getConnection().prepareStatement(query);

            ResultSet result = statement.executeQuery();

            while (result.next()) {
                total_test = result.getDouble(1);
                System.out.println(total_test);

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }
        finally {
            try {
            if (statement != null) {
                statement.close();
                jdbcHelper.conn.close();
                System.out.println("Connection closed.");

            }
                    }catch (SQLException ex){
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
            }finally {
                        statement=null;
                        jdbcHelper.conn=null;

        }

        }
        return  total_test;

    }

    public double fourth_panel_results(int month , int year ) {

        JdbcHelper jdbcHelper = new JdbcHelper();

        double total_test =0 ;

        try {
            // Query to fin out how much is spent on a month by categories
            String query = "Select sum(price) from tbl_expenses where  month(date)=" + month + " and year(date)="+ year;
            System.out.println(query);

            PreparedStatement statement = jdbcHelper.getConnection().prepareStatement(query);

            ResultSet result = statement.executeQuery();

            while (result.next()) {
                total_test = result.getDouble(1);
                System.out.println(total_test);

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }
        finally {
            try {
                if (statement != null) {
                    statement.close();
                    jdbcHelper.conn.close();
                    System.out.println("Connection closed.");

                }
            }catch (SQLException ex){
                Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
            }finally {
                statement=null;
                jdbcHelper.conn=null;

            }

        }
        return  total_test;

    }
    public double fourth_panel_results_on(String start , String end , String product ) {

        JdbcHelper jdbcHelper = new JdbcHelper();

        double total_test =0 ;

        try {
            // Query to fin out how much is spent on a month by categories
            String query = "Select sum(price) from tbl_expenses where date>=\"" + start + "\" and date<=\""+ end
                    + "\" and product like \"" + product + "%\"";
            System.out.println(query);

            PreparedStatement statement = jdbcHelper.getConnection().prepareStatement(query);

            ResultSet result = statement.executeQuery();

            while (result.next()) {
                total_test = result.getDouble(1);
                System.out.println(total_test);

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }
        finally {
            try {
                if (statement != null) {
                    statement.close();
                    jdbcHelper.conn.close();
                    System.out.println("Connection closed.");

                }
            }catch (SQLException ex){
                Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
            }finally {
                statement=null;
                jdbcHelper.conn=null;

            }

        }
        return  total_test;

    }

}
