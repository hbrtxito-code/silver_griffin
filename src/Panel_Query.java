import com.toedter.calendar.JDateChooser;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.util.Calendar;
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

    private JTextArea txt_total_per_month_4 = new JTextArea();
    private JTextArea txt_on_4              = new JTextArea();
    private JTextArea txt_query_total_4     = new JTextArea();

    // Combo Box for Panel IV

    private JComboBox cmb_month_4           = new JComboBox();

    // Button for panel IV

    private JButton btn_get_4               = new JButton("TOTAL");
    private JButton btn_total_on_4          = new JButton("TOTAL");
    private JButton btn_close_4             = new JButton("CLOSE");



    // JDateChooser

    private JDateChooser date_start         = new JDateChooser();
    private JDateChooser date_end           = new JDateChooser();



    public Panel_Query(){
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

        add(date_start);
        add(date_end);

        // Position JDateChooser

        date_start.setBounds(150 , 250  , 100 , 20);
        date_end.setBounds(420 , 250 , 100 , 20);

        // Date for Results  " + 1 " months start from 0

        int year = Calendar.getInstance().get(Calendar.YEAR);

        int month = Calendar.getInstance().get(Calendar.MONTH);


        btn_close_4.addActionListener(new AbstractAction() {
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
