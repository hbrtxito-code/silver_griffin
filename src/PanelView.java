/**
 * Created by hbrtxito on 11/12/16.
 */
import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import javax.swing.*;


public class PanelView extends JFrame {

    // This are all 4 panels

    private JPanel panel_Expenses           = new JPanel();
    private JPanel panel_Income             = new JPanel();
    private JPanel panel_Monthly_Expenses   = new JPanel();
    private JPanel panel_Query              = new JPanel();

    // Panel I Components

    // Labels

    private JLabel lbl_date_1               = new JLabel("DATE");
    private JLabel lbl_quantity             = new JLabel("QUANTITY");
    private JLabel lbl_product              = new JLabel("PRODUCT");
    private JLabel lbl_store                = new JLabel("STORE");
    private JLabel lbl_price                = new JLabel("PRICE");
    private JLabel lbl_payment              = new JLabel("PAYMENT");
    private JLabel lbl_category             = new JLabel("CATEGORY");
    private JLabel lbl_comments_1           = new JLabel("COMMENTS");
    private JLabel lbl_statement            = new JLabel();
    private JLabel lbl_empty_comment        = new JLabel();

    // Text Area - JTextField

    private JTextField txt_quantity          = new JTextField();
    private JTextField txt_product           = new JTextField();
    private JTextField txt_price             = new JTextField();
    private JTextField txt_comments          = new JTextField();

    // Combos

    private JComboBox <String> cmb_store    = new JComboBox<>(new String [] {"" , "ALDIS", "COTSCO" ,"MENARDS", "WALMART" , "HYBEE" , "RESTAURANT"} );

    private JComboBox <String> cmb_pay      = new JComboBox<>(new String [] {" CREDIT", " DEBIT" , " CASH"});

    private JComboBox <String> cmb_type     = new JComboBox<>(new String[] {" HOUSE", " FIXED" , " FOOD" , " BARNEY",
                                                                            " HEBERT" , " HSIENKAI", " EXTRA"});
    // Buttons for panel I //

    private JButton btn_submit_1            = new JButton("SUBMIT");
    private JButton btn_close_1             = new JButton("CLOSE");

    // JCalendar

    private JDateChooser cal_expenses = new JDateChooser();

    //public JFrame

    private JFrame frame = new JFrame();


    // Panel II Components

    //  Labels

    private JLabel lbl_date_2               = new JLabel("DATE");
    private JLabel lbl_user                 = new JLabel("USER");
    private JLabel lbl_income               = new JLabel("INCOME");
    private JLabel lbl_comments_2           = new JLabel("COMMENTS");

    //  Combos

    private JComboBox <String> cmb_user    = new JComboBox<>(new String [] { "HEBERT", "HSIENKAI" , "HOUSE"} );

    //  Text Areas 

    private JTextField txt_income            = new JTextField();
    private JTextField txt_comments_2        = new JTextField();



    // Button for panel II 

    private JButton btn_submit_2            = new JButton("SUBMIT");
    private JButton btn_close_2          = new JButton("CLOSE");

    // JCalendar

    private JDateChooser cal_income         = new JDateChooser();

    // Panel III Components


    // Labels Panel III 

    private JLabel lbl_date_3               = new JLabel("CALENDAR DATE");
    private JLabel lbl_from_3               = new JLabel("FROM");
    private JLabel lbl_to_3                 = new JLabel("TO");
    private JLabel lbl_hsk_3                = new JLabel("HSIENKAI");
    private JLabel lbl_hbrt_3               = new JLabel("HEBERT");
    private JLabel lbl_barney               = new JLabel("BARNEY");
    private JLabel lbl_fix_3                = new JLabel("UTILITIES");
    private JLabel lbl_house_3              = new JLabel("HOUSE");
    private JLabel lbl_extra_3              = new JLabel("EXTRA");
    private JLabel lbl_food_3               = new JLabel("FOOD");
    private JLabel lbl_total_3              = new JLabel("GRAND TOTAL");

    // Text Areas for Panel III 

    private JTextArea txt_hsk_3             = new JTextArea();
    private JTextArea txt_hbrt_3            = new JTextArea();
    private JTextArea txt_barney_3          = new JTextArea();
    private JTextArea txt_fix_3             = new JTextArea();
    private JTextArea txt_house_3           = new JTextArea();
    private JTextArea txt_extra_3           = new JTextArea();
    private JTextArea txt_food_3            = new JTextArea();
    private JTextArea txt_grand_total       = new JTextArea();

    // PANEL IV Components

    // Labels Panel IV 

    private JLabel lbl_total_per_month_4   = new JLabel("TOTAL PER MONTH");
    private JLabel lbl_from_4              = new JLabel("FROM");
    private JLabel lbl_to_4                = new JLabel("TO");
    private JLabel lbl_on_4                = new JLabel("ON");
    private JLabel lbl_query_total_4       = new JLabel("TOTAL");

    // Text Areas Panel IV 

    private JTextArea txt_total_per_month_4 = new JTextArea();
    private JTextArea txt_on_4              = new JTextArea();
    private JTextArea txt_query_total_4     = new JTextArea();

    // Combo Box for Panel IV 

    private JComboBox cmb_month_4           = new JComboBox();

    // Button for panel IV 

    private JButton btn_get_4               = new JButton("TOTAL");
    private JButton btn_total_on_4          = new JButton("TOTAL ON");


    private JTabbedPane tabbedPane = new JTabbedPane();

    private Expense_Service expense_service = new Expense_Service();


    public PanelView(){
        // Panel  EXPENSES 

        // setting Layout 
       panel_Expenses.setLayout(null);

        /// Set BackGround Color
        Color clr_1 = new Color(204, 204, 255);   // blue
        panel_Expenses.setBackground(clr_1);

        // All label for panel I 

        panel_Expenses.add(lbl_quantity);
        panel_Expenses.add(lbl_date_1);
        panel_Expenses.add(lbl_product);
        panel_Expenses.add(lbl_price);
        panel_Expenses.add(lbl_store);
        panel_Expenses.add(lbl_payment);
        panel_Expenses.add(lbl_category);
        panel_Expenses.add(lbl_comments_1);
        panel_Expenses.add(lbl_empty_comment);


        // Position of the labels 
        lbl_date_1.setBounds(20 , 10 , 300 , 30);
        lbl_product.setBounds(160 , 300 , 300 , 30);
        lbl_store.setBounds(330 , 150 , 300 ,30);
        lbl_quantity.setBounds(20, 300, 300, 30);
        lbl_price.setBounds(320 , 300, 300 , 30 );
        lbl_payment.setBounds(30 , 150 , 300 , 30);
        lbl_category.setBounds(170 , 150 , 300 , 30);
        lbl_comments_1.setBounds(430 , 300 , 300 , 30);
        lbl_empty_comment.setBounds(20 , 430 , 150 , 70);


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
        panel_Expenses.add(txt_quantity);
        panel_Expenses.add(txt_product);
        panel_Expenses.add(txt_price);
        panel_Expenses.add(txt_comments);

        // Position of the Text Area 

        txt_quantity.setBounds(30, 330 , 50 , 30);
        txt_product.setBounds(120, 330 , 150 , 30);
        txt_price.setBounds(290 , 330 , 100 , 30);
        txt_comments.setBounds(410 , 330 , 150 , 30);

        // All ComboBox for Panel I 

        panel_Expenses.add(cmb_pay);
        panel_Expenses.add(cmb_type);
        panel_Expenses.add(cmb_store);


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
        panel_Expenses.add(cal_expenses);

        // Button panel I 

        panel_Expenses.add(btn_submit_1);
        panel_Expenses.add(btn_close_1);

        // Position button panel I 

        btn_submit_1.setBounds(330 , 430 , 100 , 30);
        btn_close_1.setBounds(450 , 430 , 100 , 30);


        // Panel INCOME 

        // Setting Layout 
        panel_Income.setLayout(null);


        // Set BackGround Color 
        Color clr_2 = new Color(204, 255, 153);   // blue
        panel_Income.setBackground(clr_2);


        // Operations for Panel I 

        btn_submit_1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // To Fill the class Expenses
                Expenses expenses = new Expenses();

                // JDateChooser Test -  Getting date from selected date
                // If DateChooser was not selected "null
                if (cal_expenses.getDate() == null) {
                    //custom title, warning icon

                    java.util.Date today = new java.util.Date();
                    expenses.setDate(today);

                    JOptionPane.showMessageDialog(frame,
                            "DATE SET AS TODAY.",
                            "BUDGET APPLICATION",
                            JOptionPane.INFORMATION_MESSAGE);

                }
                else{
                    java.util.Date util_date = cal_expenses.getDate();
                    java.sql.Date sql_date = new  java.sql.Date(util_date.getTime());
                    expenses.setDate(sql_date);

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
                    // LABEL FOR TESTING

                    panel_Expenses.add(lbl_statement);
                    lbl_statement.setBounds(20 , 450 , 150 , 70);
                    lbl_statement.setFont(new Font("Serif", Font.BOLD, 14));
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
                System.out.println("Good Bye ");
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));

            }
        });

        // All label for panel II 

        panel_Income.add(lbl_date_2);
        panel_Income.add(lbl_user);
        panel_Income.add(lbl_comments_2);
        panel_Income.add(lbl_income);

        // Position of the labels 
        lbl_date_2.setBounds(20 , 10 , 300 , 30);
        lbl_user.setBounds(40 , 150 , 300 , 30);
        lbl_income.setBounds(200 , 150 , 300 , 30);
        lbl_comments_2.setBounds( 400 , 150 , 300 , 30);

        // All Text Areas for Panel II 
        panel_Income.add(txt_income);
        panel_Income.add(txt_comments_2);


        // Position for Text Area 
        txt_income.setBounds(180 , 175 , 100 , 30);
        txt_comments_2.setBounds(380 , 175 , 150 , 30 );


        // JCalendar JDate Chooser
        panel_Income.add(cal_income);
        cal_income.setBounds(120, 50, 125, 20);


        // ComboBox for panel II 
        panel_Income.add(cmb_user);

        // Position for ComboBox 
        cmb_user.setBounds(20 , 175 , 100 , 30);

        // Button panel II 

        panel_Income.add(btn_submit_2);

        // Position button panel I 

        btn_submit_2.setBounds(430 , 250 , 100 , 30);

        // Button Close for panel II

        panel_Income.add(btn_close_2);

        // Position for Button Close panel II

        btn_close_2.setBounds(300 , 250 , 100 , 30);

        //Income Button Action Listener

        btn_submit_2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Class Income
                Income income =new Income();

                // Frame for Validation actions

                JFrame frame = new JFrame();

                // JDateChooser Test -  Getting date from selected date
                // If DateChooser was not selected "null
                if (cal_income.getDate() == null) {
                    //custom title, warning icon

                    java.util.Date today = new java.util.Date();
                    income.setDate(today);

                    JOptionPane.showMessageDialog(frame,
                            "DATE SET AS TODAY.",
                            "BUDGET APPLICATION",
                            JOptionPane.INFORMATION_MESSAGE);

                }
                else{
                    java.util.Date util_date = cal_income.getDate();
                    java.sql.Date sql_date = new  java.sql.Date(util_date.getTime());
                    income.setDate(sql_date);

                }

                //Getting Income from the Text Area

                String st_income = txt_income.getText().trim();

                if (st_income.isEmpty() || st_income.matches("[a-zA-Z_]+")){
                    //custom title, warning icon
                    JOptionPane.showMessageDialog(frame,
                            "INVALID PRICE.",
                            "BUDGET APPLICATION",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }
                else {
                    float num_income = Float.parseFloat(st_income);
                    income.setAmount(num_income);

                    }

                // Getting the object from ComboBox - USER

                String st_user = (String) cmb_user.getSelectedItem();
                income.setStr_user(st_user);

                // Getting the object from Comments Box

                String st_comments = txt_comments_2.getText().trim().toUpperCase();

                if (st_comments.isEmpty()){
                    //custom title, warning icon
                    JOptionPane.showMessageDialog(frame,
                            "NO COMMENT ADDED.",
                            "BUDGET APPLICATION",
                            JOptionPane.WARNING_MESSAGE);
                    income.setComments("");
                }
                else {
                    income.setComments(st_comments);
                    txt_comments.setText("");
                }

                //Attempt to Insert into the Database

                if (expense_service.insert_2(income)){
                    // LABEL FOR TESTING

                    panel_Expenses.add(lbl_statement);
                    lbl_statement.setBounds(20 , 450 , 150 , 70);
                    lbl_statement.setFont(new Font("Serif", Font.BOLD, 14));
                    txt_comments_2.setText("");
                    txt_income.setText("");


                    lbl_statement.setText("INSERT SUCCESSFUL");
                    System.out.println("INSERT SUCCESSFUL ");


                }else {
                    lbl_statement.setText(" PROGRAM ERROR ");
                    lbl_statement.setForeground (Color.red);
                    lbl_statement.setFont(new Font("Serif", Font.BOLD, 14));

                }
            }
        });
        // Close App Button

        btn_close_2.addActionListener(e -> this.dispose());

        // Panel III - Monthly Expenses

        // setting layout 
        panel_Monthly_Expenses.setLayout(null);

        // Set BackGround Color 
        Color clr_3 = new Color(153, 204, 255);   // blue
        panel_Monthly_Expenses.setBackground(clr_3);

        // All label for panel II 

        panel_Monthly_Expenses.add(lbl_date_3);
        panel_Monthly_Expenses.add(lbl_from_3);
        panel_Monthly_Expenses.add(lbl_to_3);
        panel_Monthly_Expenses.add(lbl_hbrt_3);
        panel_Monthly_Expenses.add(lbl_hsk_3);
        panel_Monthly_Expenses.add(lbl_barney);
        panel_Monthly_Expenses.add(lbl_fix_3);
        panel_Monthly_Expenses.add(lbl_house_3);
        panel_Monthly_Expenses.add(lbl_extra_3);
        panel_Monthly_Expenses.add(lbl_food_3);
        panel_Monthly_Expenses.add(lbl_total_3);

        // Position for all labels on panel II 

        lbl_date_3.setBounds(20 ,30 , 300 , 30 );
        lbl_from_3.setBounds(180 , 30 , 300 , 30);
        lbl_to_3.setBounds(320 , 30 , 300 , 30);
        lbl_hbrt_3.setBounds(40 , 100 , 300 , 30);
        lbl_hsk_3.setBounds(180 , 100 , 300 , 30 );
        lbl_barney.setBounds(350 , 100 , 300 , 30);
        lbl_fix_3.setBounds(40 , 230 , 300 , 30 );
        lbl_house_3.setBounds(180 , 230 , 300 , 30);
        lbl_extra_3.setBounds(350, 230 , 300 , 30);
        lbl_food_3.setBounds(40 , 400 , 300 , 30);
        lbl_total_3.setBounds(280 , 400 , 300 , 30);

        // All text Areas for Panel III 

        panel_Monthly_Expenses.add(txt_hbrt_3);
        panel_Monthly_Expenses.add(txt_hsk_3);
        panel_Monthly_Expenses.add(txt_barney_3);
        panel_Monthly_Expenses.add(txt_fix_3);
        panel_Monthly_Expenses.add(txt_house_3);
        panel_Monthly_Expenses.add(txt_extra_3);
        panel_Monthly_Expenses.add(txt_food_3);
        panel_Monthly_Expenses.add(txt_grand_total);

        // Position for Text Areas panel III 

        txt_hbrt_3.setBounds(20, 130 , 100 , 30 );
        txt_hsk_3.setBounds(160 , 130 , 110 , 30 );
        txt_barney_3.setBounds(330 , 130 , 100, 30);
        txt_fix_3.setBounds(20 , 260 , 100 , 30 );
        txt_house_3.setBounds(160 ,260 , 100 , 30);
        txt_extra_3.setBounds(330, 260 , 100 , 30);
        txt_food_3.setBounds(20, 430 , 100 , 30);
        txt_grand_total.setBounds(250 , 430 , 150 , 30 );


        // PANEL QUERIES 

        // setting layout 
        panel_Query.setLayout(null);

        // Set BackGround Color 
        Color clr_4 = new Color(141, 249, 235);   // blue
        panel_Query.setBackground(clr_4);

        // All Labels for Panel IV 

        panel_Query.add(lbl_total_per_month_4);
        panel_Query.add(lbl_from_4);
        panel_Query.add(lbl_to_4);
        panel_Query.add(lbl_on_4);
        panel_Query.add(lbl_query_total_4);

        // Position for all Labels 

        lbl_total_per_month_4.setBounds(20 , 40 , 300 , 30 );
        lbl_from_4.setBounds(40 , 150 , 300 , 30);
        lbl_to_4.setBounds(150 , 150 , 300 , 30);
        lbl_on_4.setBounds(40 , 250 , 300 , 30);
        lbl_query_total_4.setBounds (150 , 250 , 300 , 30);

        // Text Areas for panel IV 

        panel_Query.add(txt_total_per_month_4);
        panel_Query.add(txt_on_4);
        panel_Query.add(txt_query_total_4);

        // Position for the text Areas 

        txt_total_per_month_4.setBounds(330 , 70 , 100 , 30);
        txt_on_4.setBounds(20 , 280 , 100 , 30);
        txt_query_total_4.setBounds(300, 280, 150 , 30);

        // ComboBox for Panel IV 

        panel_Query.add(cmb_month_4);

        // Position for ComboBox 

        cmb_month_4.setBounds(20 , 70 , 120 , 30);

        // Buttons on Panel IV 

        panel_Query.add(btn_get_4);
        panel_Query.add(btn_total_on_4);

        // Position button on panel IV 

        btn_get_4.setBounds(180 , 70, 100 , 30);
        btn_total_on_4.setBounds(150 , 280 , 120 , 30);


        // Adding Panels to the app 
        tabbedPane.add("Expenses",panel_Expenses);
        tabbedPane.add("Income",panel_Income);
        tabbedPane.add("Monthly Exp",panel_Monthly_Expenses);
        tabbedPane.add("Queries",panel_Query);


        add(tabbedPane);

    }


}
