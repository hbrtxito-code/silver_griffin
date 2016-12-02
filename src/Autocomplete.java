import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by hbrtxito on 12/1/16.
 */
public class Autocomplete {

    public List autocomplete() {
        List<String> product_list = new ArrayList<>();

        ResultSet resultSet;

        JdbcHelper jdbcHelper = new JdbcHelper();

        Statement statement = null ;

        try {
           statement = jdbcHelper.conn.createStatement();

            resultSet = statement.executeQuery("SELECT product FROM tbl_expenses");

            while (resultSet.next()) {

                product_list.add(resultSet.getString(1));

            }

            System.out.println(product_list.size());
        } catch (SQLException ex)
        { Logger.getLogger(Expense_Service.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //Closing the connection
            try {
                if (statement != null)
                    statement.close();
                }catch (SQLException ex) {
                Logger.getLogger(Expense_Service.class.getName()).log(Level.SEVERE, null, ex);
                try {
                    if (jdbcHelper.conn != null)
                    jdbcHelper.conn.close();
            }catch (SQLException se){
                se.printStackTrace();
            }
        }


        }
        return product_list;

    }
}
