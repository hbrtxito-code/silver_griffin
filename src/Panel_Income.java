import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import javax.swing.*;

/**
 * Created by hbrtxito on 12/6/16.
 */
public class Panel_Income extends JPanel{

    // Panel II Components

    //  Labels

    private JLabel lbl_date_2               = new JLabel("DATE");
    private JLabel lbl_user                 = new JLabel("USER");
    private JLabel lbl_income               = new JLabel("INCOME");
    private JLabel lbl_comments_2           = new JLabel("COMMENTS");
    private JLabel lbl_statement            = new JLabel("Statement");

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
public Panel_Income(){

        // Layout
        setLayout(null);

        // All label for panel II

        add(lbl_date_2);
        add(lbl_user);
        add(lbl_comments_2);
        add(lbl_income);

        // Position of the labels
        lbl_date_2.setBounds(20 , 10 , 300 , 30);
        lbl_user.setBounds(40 , 150 , 300 , 30);
        lbl_income.setBounds(200 , 150 , 300 , 30);
        lbl_comments_2.setBounds( 400 , 150 , 300 , 30);

        // All Text Areas for Panel II
        add(txt_income);
        add(txt_comments_2);


        // Position for Text Area
        txt_income.setBounds(180 , 175 , 100 , 30);
        txt_comments_2.setBounds(380 , 175 , 150 , 30 );


        // JCalendar JDate Chooser
        add(cal_income);
        cal_income.setBounds(120, 50, 125, 20);


        // ComboBox for panel II
        add(cmb_user);

        // Position for ComboBox
        cmb_user.setBounds(20 , 175 , 100 , 30);

        // Button panel II

        add(btn_submit_2);

        // Position button panel I

        btn_submit_2.setBounds(430 , 250 , 100 , 30);

        // Button Close for panel II

        add(btn_close_2);

        // Position for Button Close panel II

        btn_close_2.setBounds(300 , 250 , 100 , 30);

        // Set BackGround Color
        Color clr_2 = new Color(141, 249, 235);   // blue
        setBackground(clr_2);

        // Expense Service

        Services expense_service = new Services();

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
                    txt_comments_2.setText("");
                }

                //Attempt to Insert into the Database

                if (expense_service.insert_2(income)){
                    // LABEL FOR TESTING

                    add(lbl_statement);
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

        btn_close_2.addActionListener(new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame();
            System.out.println("Good Bye ");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
            });
    }


}