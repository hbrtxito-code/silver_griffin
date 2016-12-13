import com.mxrck.autocompleter.TextAutoCompleter;
import com.toedter.calendar.JDateChooser;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;

/**
 * Created by hbrtxito on 12/6/16.
 */
public class Panel_Query extends JPanel{

    // PANEL IV Components

    // Labels Panel IV

    private JLabel lbl_total_per_month_4   = new JLabel("TOTAL PER MONTH");
    private JLabel lbl_from_4              = new JLabel("FROM");
    private JLabel lbl_to_4                = new JLabel("TO");
    private JLabel lbl_on_4                = new JLabel("ON");
    private JLabel lbl_total_per_item      = new JLabel("TOTAL PER ITEM");

    // Text Areas Panel IV

    private JTextField txt_total_per_month_4 = new JTextField();
    private JTextField txt_on_4              = new JTextField();
    private JTextField txt_query_total_4     = new JTextField();

    // Combo Box for Panel IV
    String[] months = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY",
                    "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};

    private JComboBox cmb_month_4           = new JComboBox(months);

    // Button for panel IV

    private JButton btn_get_4               = new JButton("TOTAL");
    private JButton btn_total_on_4          = new JButton("TOTAL");
    private JButton btn_close_4             = new JButton("CLOSE");



    // JDateChooser

    private JDateChooser cal_date_start     = new JDateChooser();
    private JDateChooser cal_date_end       = new JDateChooser();

    //Auto Suggest Box for products

    private TextAutoCompleter textAutoCompleter = new TextAutoCompleter(txt_on_4);

    public Panel_Query(){

        help();


        // PANEL QUERIES

        // setting layout

        setLayout(null);

        // Set BackGround Color
        Color clr_4 = new Color(141, 249, 235);   // blue
        setBackground(clr_4);

        // All Labels for Panel IV

        add(lbl_total_per_month_4);
        add(lbl_from_4);
        add(lbl_to_4);
        add(lbl_on_4);
        add(lbl_total_per_item);
        // Position for all Labels

        lbl_total_per_month_4.setBounds(20 , 20 , 300 , 30 );
        lbl_from_4.setBounds(80 , 245 , 300 , 30);
        lbl_to_4.setBounds(320 , 245 , 300 , 30);
        lbl_on_4.setBounds(80 , 340 , 300 , 30);
        lbl_total_per_item.setBounds(20 , 180 , 300 ,30);

        // Text Areas for panel IV

        add(txt_total_per_month_4);
        add(txt_on_4);
        add(txt_query_total_4);

        // Position for the text Areas

        txt_total_per_month_4.setBounds(420 , 70 , 100 , 30);
        txt_on_4.setBounds(150 , 340 , 100 , 30);
        txt_query_total_4.setBounds(420, 340, 100 , 30);

        //Borders

        txt_total_per_month_4.setBorder(BorderFactory.createLineBorder(Color.black));
        txt_on_4.setBorder(BorderFactory.createLineBorder(Color.black));
        txt_query_total_4.setBorder(BorderFactory.createLineBorder(Color.black));


        // ComboBox for Panel IV

        add(cmb_month_4);

        // Position for ComboBox

        cmb_month_4.setBounds(150 , 70 , 100 , 30);

        // Buttons on Panel IV

        add(btn_get_4);
        add(btn_total_on_4);
        add(btn_close_4);

        // Position button on panel IV

        btn_get_4.setBounds(270 , 70, 120 , 30);
        btn_total_on_4.setBounds(270 , 340 , 120 , 30);
        btn_close_4.setBounds(420 , 430 , 100 , 30);

        // Adding JDateChooser

        add(cal_date_start);
        add(cal_date_end);

        // Position JDateChooser

        cal_date_start.setBounds(150 , 250  , 100 , 20);
        cal_date_end.setBounds(420 , 250 , 100 , 20);

        // to get the current year
        int year = Calendar.getInstance().get(Calendar.YEAR);

        //Service

        Services services = new Services();


        btn_get_4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                //Getting the index of a month "+1"
                int num_month = (cmb_month_4.getSelectedIndex()+1);
                System.out.println(num_month);

                Double total_per_month =  services.fourth_panel_results(num_month , year);

                txt_total_per_month_4.setText(total_per_month.toString());

            }
        });

        btn_close_4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame();
                System.out.println("Good Bye ");
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
        });

        btn_total_on_4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //JFrame

                JFrame frame = new JFrame();

                if (cal_date_start.getDate() == null || cal_date_end.getDate()==null ) {

                    //custom title, warning icon
                    JOptionPane.showMessageDialog(frame,
                            "DATE NO SELECTED.",
                            "BUDGET APPLICATION",
                            JOptionPane.INFORMATION_MESSAGE);
                    return ;

                }
                else {
                    String st_on = txt_on_4.getText().trim();

                    if (st_on.isEmpty() || st_on.matches("[0-9]+")){
                        //custom title, warning icon
                        JOptionPane.showMessageDialog(frame,
                                "INVALID PRODUCT.",
                                "BUDGET APPLICATION",
                                JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    else {

                        //Getting Start Date
                        Format formatter = new SimpleDateFormat("yyyy-MM-dd");
                        String start_date = formatter.format(cal_date_start.getDate());
                        System.out.println(start_date);

                        //Getting end date
                        String end_date = formatter.format(cal_date_end.getDate());
                        System.out.println(end_date);

                        Double total_on = services.fourth_panel_results_on(start_date ,end_date ,st_on ) ;
                        txt_query_total_4.setText(total_on.toString());

                    }

                }

            }
        });
    }

    public void help() {
        Autocomplete operation_1 = new Autocomplete();

        java.util.List<String> product_list = operation_1.autocomplete();

        System.out.println(product_list.size() + " HI");

        for (String temp : product_list) {

            textAutoCompleter.addItem(temp);
        }

    }

}




