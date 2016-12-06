import javax.swing.*;
import com.mxrck.autocompleter.TextAutoCompleter;
import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.*;
import javax.swing.JFrame;

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
        add(lbl_query_total_4);

        // Position for all Labels

        lbl_total_per_month_4.setBounds(20 , 40 , 300 , 30 );
        lbl_from_4.setBounds(40 , 150 , 300 , 30);
        lbl_to_4.setBounds(150 , 150 , 300 , 30);
        lbl_on_4.setBounds(40 , 250 , 300 , 30);
        lbl_query_total_4.setBounds (150 , 250 , 300 , 30);

        // Text Areas for panel IV

        add(txt_total_per_month_4);
        add(txt_on_4);
        add(txt_query_total_4);

        // Position for the text Areas

        txt_total_per_month_4.setBounds(330 , 70 , 100 , 30);
        txt_on_4.setBounds(20 , 280 , 100 , 30);
        txt_query_total_4.setBounds(300, 280, 150 , 30);

        // ComboBox for Panel IV

        add(cmb_month_4);

        // Position for ComboBox

        cmb_month_4.setBounds(20 , 70 , 120 , 30);

        // Buttons on Panel IV

        add(btn_get_4);
        add(btn_total_on_4);

        // Position button on panel IV

        btn_get_4.setBounds(180 , 70, 100 , 30);
        btn_total_on_4.setBounds(150 , 280 , 120 , 30);

    }

}
