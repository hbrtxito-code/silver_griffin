import com.mxrck.autocompleter.TextAutoCompleter;
import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.*;

/**
 * Created by hbrtxito on 12/6/16.
 */
public class Panel_Expenses extends JPanel {


    // Labels

    private JLabel lbl_date_1 = new JLabel("DATE");
    private JLabel lbl_quantity = new JLabel("QUANTITY");
    private JLabel lbl_product = new JLabel("PRODUCT");
    private JLabel lbl_store = new JLabel("STORE");
    private JLabel lbl_price = new JLabel("PRICE");
    private JLabel lbl_payment = new JLabel("PAYMENT");
    private JLabel lbl_category = new JLabel("CATEGORY");
    private JLabel lbl_comments_1 = new JLabel("COMMENTS");
    private JLabel lbl_statement = new JLabel();
    private JLabel lbl_empty_comment = new JLabel();
    private JLabel lbl_last_entry = new JLabel();

    // Text Area - JTextField

    private JTextField txt_quantity = new JTextField();
    private JTextField txt_product = new JTextField();
    private JTextField txt_price = new JTextField();
    private JTextField txt_comments = new JTextField();

    // Combos

    private JComboBox<String> cmb_store = new JComboBox<>(new String[]{"OTHERS", "CULVERTS", "ALDIS", "BURLINGTON",
            "COSTCO","ASIAN GROCERY", "MENARDS", "WALMART", "HYBEE", "WOODMANS", "WALGREENS",
             "PICK'N SAVE"});

    private JComboBox<String> cmb_pay = new JComboBox<>(new String[]{"CREDIT", "DEBIT", "CASH"});

    private JComboBox<String> cmb_type = new JComboBox<>(new String[]{"HOUSE", "FIXED", "FOOD", "BARNEY",
            "HEBERT", "HSIENKAI", "EXTRA"});
    // Buttons for panel I //

    private JButton btn_submit_1 = new JButton("SUBMIT");
    private JButton btn_close_1 = new JButton("CLOSE");

    // JCalendar

    private JDateChooser cal_expenses = new JDateChooser();

    private TextAutoCompleter textAutoCompleter = new TextAutoCompleter(txt_product);

    public Panel_Expenses(){

        // Auto suggester function
        help();

        // setting Layout 
        setLayout(null);

        /// Set BackGround Color
        Color clr_1 = new Color(51, 133, 255);   // blue
        setBackground(clr_1);

        // All label for panel I 

        add(lbl_quantity);
        add(lbl_date_1);
        add(lbl_product);
        add(lbl_price);
        add(lbl_store);
        add(lbl_payment);
        add(lbl_category);
        add(lbl_comments_1);
        add(lbl_empty_comment);
        add(lbl_last_entry);


        // Position of the labels 
        lbl_date_1.setBounds(20 , 10 , 300 , 30);
        lbl_product.setBounds(160 , 300 , 300 , 30);
        lbl_store.setBounds(330 , 150 , 300 ,30);
        lbl_quantity.setBounds(20, 300, 300, 30);
        lbl_price.setBounds(320 , 300, 300 , 30 );
        lbl_payment.setBounds(30 , 150 , 300 , 30);
        lbl_category.setBounds(170 , 150 , 300 , 30);
        lbl_comments_1.setBounds(430 , 300 , 300 , 30);
        lbl_empty_comment.setBounds(20 , 480 , 150 , 70);
        lbl_last_entry.setBounds(20 , 460 ,480 ,30);


        // All Text Areas for panel I

        // BORDERS AREAS  - Panel I
        txt_quantity.setBorder(BorderFactory.createLineBorder(Color.black));
        txt_product.setBorder(BorderFactory.createLineBorder(Color.black));
        txt_price.setBorder(BorderFactory.createLineBorder(Color.black));
        txt_comments.setBorder(BorderFactory.createLineBorder(Color.black));

        //Text Areas new font

        txt_quantity.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        txt_product.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        txt_price.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        txt_comments.setFont(new Font("Comic Sans MS", Font.BOLD, 14));

        // Adding to the Panel I
        add(txt_quantity);
        add(txt_product);
        add(txt_price);
        add(txt_comments);

        // Position of the Text Area 

        txt_quantity.setBounds(30, 330 , 50 , 30);
        txt_product.setBounds(120, 330 , 150 , 30);
        txt_price.setBounds(290 , 330 , 100 , 30);
        txt_comments.setBounds(410 , 330 , 150 , 30);

        // All ComboBox for Panel I 

        add(cmb_pay);
        add(cmb_type);
        add(cmb_store);


        // Position for all ComboBox 

        cmb_store.setBounds(300 , 185 , 100 ,30);
        cmb_pay.setBounds(20 , 185 , 100 , 30);
        cmb_type.setBounds(150 , 185 , 125 , 30);

        //Border for JComboBox
        cmb_store.setBorder(BorderFactory.createLineBorder(Color.black));
        cmb_pay.setBorder(BorderFactory.createLineBorder(Color.black));
        cmb_type.setBorder(BorderFactory.createLineBorder(Color.black));

        // JCalendar JDate Chooser 

        cal_expenses.setBounds(120, 50, 125, 20);
        add(cal_expenses);

        // Button panel I 

        add(btn_submit_1);
        add(btn_close_1);

        // Position button panel I 

        btn_submit_1.setBounds(330 , 430 , 100 , 30);
        btn_close_1.setBounds(450 , 430 , 100 , 30);


        // Expenses Service

        Services expense_service = new Services();

        btn_submit_1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame =new JFrame();
                // To Fill the class Expenses
                Expenses expenses = new Expenses();

                // JDateChooser Test -  Getting date from selected date
                // If DateChooser was not selected "null
                if (cal_expenses.getDate() == null) {

                    //custom title, warning icon

                    JOptionPane.showMessageDialog(frame,
                            "DATE SET AS TODAY.",
                            "BUDGET APPLICATION",
                            JOptionPane.INFORMATION_MESSAGE);


                    try {
                        java.util.Date today = new java.util.Date();

                        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                        String start_date = formatter.format(today);
                        System.out.println(start_date);
                        Date day = formatter.parse(start_date);
                        java.sql.Date date = new java.sql.Date(day.getTime());


                        expenses.setDate(date);

                    } catch (ParseException exp) {
                    exp.printStackTrace();
                    }


                }
                else{

                    try {

                        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                        String start_date = formatter.format(cal_expenses.getDate());
                        System.out.println(start_date);
                        Date day = formatter.parse(start_date);
                        java.sql.Date date = new java.sql.Date(day.getTime());

                        expenses.setDate(date);

                    } catch (ParseException exp) {
                        exp.printStackTrace();
                    }


                }

                // Getting Number from Text Areas Quantity


                String st_quantity = txt_quantity.getText().trim();

                if(st_quantity.isEmpty()  || st_quantity.matches("[a-zA-Z_]+")){

                    //custom title, warning icon
                    JOptionPane.showMessageDialog(frame,
                            "INVALID QUANTITY.",
                            "BUDGET APPLICATION",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }
                else{

                    int num_quantity = Integer.parseInt(st_quantity);
                    expenses.setQuantity(num_quantity);
                }

                // Getting Product from Text Area Product

                String st_product = txt_product.getText().trim();

                if(st_product.isEmpty()  || st_product.matches("[0-9]+")){
                    //custom title, warning icon
                    JOptionPane.showMessageDialog(frame,
                            "INVALID PRODUCT.",
                            "BUDGET APPLICATION",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }
                else {
                    expenses.setProduct(st_product.toUpperCase());

                }
                // Getting the object from ComboBox - STORE

                String st_store = (String) cmb_store.getSelectedItem();
                expenses.setStore(st_store);

                //Getting Price for a text Area Price

                String st_price = txt_price.getText().trim();

                if (st_price.isEmpty() || st_price.matches("[a-zA-Z_]+")){
                    //custom title, warning icon
                    JOptionPane.showMessageDialog(frame,
                            "INVALID PRICE.",
                            "BUDGET APPLICATION",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }
                else {
                    int num_quantity = Integer.parseInt(st_quantity);
                    float num_price = Float.parseFloat(st_price);

                    if (num_quantity>1){
                        num_price = num_quantity*num_price;
                        expenses.setPrice(num_price);

                    }else {
                        num_price = Float.parseFloat(st_price);
                        expenses.setPrice(num_price);
                    }


                }
                // Getting the object from ComboBox - PAYMENT

                String st_payment = (String) cmb_pay.getSelectedItem();
                expenses.setPayment(st_payment);

                // Getting the object from ComboBox - Category

                String st_type = (String) cmb_type.getSelectedItem();
                expenses.setCategory(st_type);

                // Getting TEXT from Text Areas - Comments

                String st_comments = txt_comments.getText().trim().toUpperCase();

                if (st_comments.isEmpty()){
                    //custom title, warning icon
                    lbl_empty_comment.setText("NO COMMENT ADDED");


                    expenses.setComments("");
                }
                else {
                    expenses.setComments(st_comments);
                    txt_comments.setText("");
                }

                //Attempt to Insert into the Database

                if (expense_service.insert(expenses)){

                    Create_File test_c = new Create_File();

                    // LABEL FOR TESTING

                    add(lbl_statement);
                    lbl_statement.setBounds(20 , 550 , 150 , 70);
                    lbl_statement.setFont(new Font("Serif", Font.BOLD, 14));
                    lbl_last_entry.setText(expenses.toString());
                    test_c.create_File(expenses.toString());

                    txt_quantity.setText("");
                    txt_product.setText("");
                    txt_price.setText("");


                    lbl_statement.setText("INSERT SUCCESSFUL");
                    System.out.println("INSERT SUCCESSFUL ");
                    txt_quantity.requestFocus();


                }else {
                    lbl_statement.setText(" PROGRAM ERROR ");
                    lbl_statement.setForeground (Color.red);
                    lbl_statement.setFont(new Font("Serif", Font.BOLD, 14));

                }

            }
        });
        // Close App Button

        btn_close_1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame();
                System.out.println("Good Bye ");
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));

            }
        });



    }


    protected void help() {
        Autocomplete operation_1 = new Autocomplete();

        List<String> product_list = operation_1.autocomplete();

        System.out.println(product_list.size() + " HI");

        for (String temp : product_list) {

            textAutoCompleter.addItem(temp);
        }

    }
}