import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by hbrtxito on 12/1/16.
 */
public class Autocomplete {

    public List autocomplete() {
        List<String> product_list = new ArrayList<String>();

        ResultSet resultSet;

        JdbcHelper jdbcHelper = new JdbcHelper();

        try {
            java.sql.Statement statement = jdbcHelper.conn.createStatement();

            resultSet = statement.executeQuery("SELECT product FROM tbl_expenses");

            while (resultSet.next()) {

                product_list.add(resultSet.getString(1));

            }

            System.out.println(product_list.size());
        } catch (SQLException ex)
        { Logger.getLogger(Expense_Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return product_list;

    }
}
