import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.Format;
import java.text.SimpleDateFormat;

/**
 * Created by hbrtxito on 12/6/16.
 */
public class Panel_Monthly extends JPanel {

    // Labels Panel III

    private JLabel lbl_date_3               = new JLabel("DATE");
    private JLabel lbl_from_3               = new JLabel("FROM");
    private JLabel lbl_to_3                 = new JLabel("TO");
    private JLabel lbl_hsk_3                = new JLabel("HSIENKAI");
    private JLabel lbl_hbrt_3               = new JLabel("HEBERT");
    private JLabel lbl_barney               = new JLabel("BARNEY");
    private JLabel lbl_fix_3                = new JLabel("UTILITIES");
    private JLabel lbl_house_3              = new JLabel("HOUSE");
    private JLabel lbl_extra_3              = new JLabel("EXTRA");
    private JLabel lbl_food_3               = new JLabel("FOOD");

    // Text Areas for Panel III

    private JTextArea txt_hsk_3             = new JTextArea();
    private JTextArea txt_hbrt_3            = new JTextArea();
    private JTextArea txt_barney_3          = new JTextArea();
    private JTextArea txt_fix_3             = new JTextArea();
    private JTextArea txt_house_3           = new JTextArea();
    private JTextArea txt_extra_3           = new JTextArea();
    private JTextArea txt_food_3            = new JTextArea();

    //JComboBox for month Selection

    private JDateChooser cal_monthly_start  = new JDateChooser();

    private JDateChooser cal_monthly_end    = new JDateChooser();

    // JButton

    private JButton btn_submit_3                = new JButton("SUBMIT");

    public Panel_Monthly(){

        // Set LAYOUT

        setLayout(null);
        // Position for all labels on panel II

        // Set BackGround Color
        Color clr_3 = new Color(101, 229, 85);   // blue
        setBackground(clr_3);

        lbl_date_3.setBounds(20 ,20 , 300 , 30 );
        lbl_from_3.setBounds(20 , 75 , 300 , 30);
        lbl_to_3.setBounds(220 , 75 , 300 , 30);
        lbl_hbrt_3.setBounds(90 , 180 , 300 , 30);
        lbl_hsk_3.setBounds(245 , 180 , 300 , 30 );
        lbl_barney.setBounds(400 , 180 , 300 , 30);
        lbl_fix_3.setBounds(90 , 290 , 300 , 30 );
        lbl_house_3.setBounds(245 , 290 , 300 , 30);
        lbl_extra_3.setBounds(410, 290 , 300 , 30);
        lbl_food_3.setBounds(90 , 400 , 300 , 30);

        // All label for panel III

        add(lbl_date_3);
        add(lbl_from_3);
        add(lbl_to_3);
        add(lbl_hbrt_3);
        add(lbl_hsk_3);
        add(lbl_barney);
        add(lbl_fix_3);
        add(lbl_house_3);
        add(lbl_extra_3);
        add(lbl_food_3);

        // All text Areas for Panel III 

        add(txt_hbrt_3);
        add(txt_hsk_3);
        add(txt_barney_3);
        add(txt_fix_3);
        add(txt_house_3);
        add(txt_extra_3);
        add(txt_food_3);

        // Position for Text Areas panel III 

        txt_hbrt_3.setBounds(70, 210 , 100 , 30 );
        txt_hsk_3.setBounds(220 , 210 , 110 , 30 );
        txt_barney_3.setBounds(380 , 210 , 100, 30);
        txt_fix_3.setBounds(70 , 320 , 100 , 30 );
        txt_house_3.setBounds(220 ,320 , 100 , 30);
        txt_extra_3.setBounds(380, 320 , 100 , 30);
        txt_food_3.setBounds(70, 430 , 100 , 30);

        //Set Borders

        txt_hbrt_3.setBorder(BorderFactory.createLineBorder(Color.black));
        txt_hsk_3.setBorder(BorderFactory.createLineBorder(Color.black));
        txt_barney_3.setBorder(BorderFactory.createLineBorder(Color.black));
        txt_barney_3.setBorder(BorderFactory.createLineBorder(Color.black));
        txt_fix_3.setBorder(BorderFactory.createLineBorder(Color.black));
        txt_house_3.setBorder(BorderFactory.createLineBorder(Color.black));
        txt_extra_3.setBorder(BorderFactory.createLineBorder(Color.black));
        txt_food_3.setBorder(BorderFactory.createLineBorder(Color.black));


        // JComboBox added
        add(cal_monthly_start);
        add(cal_monthly_end);

        //JComboBox Position
        cal_monthly_start.setBounds(80 , 80 , 100 , 20);
        cal_monthly_end.setBounds(250 , 80 , 100 , 20);

        //JButton Submit
        add(btn_submit_3);

        //Position JButton
        btn_submit_3.setBounds(400 , 75 ,100 , 30);

        // Services
         Services services = new Services();


        btn_submit_3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //JFrame

                JFrame frame = new JFrame();

                // JDateChooser Test -  Getting date from selected date
                // If DateChooser was not selected "null
                if (cal_monthly_start.getDate() == null || cal_monthly_end.getDate()==null) {
                    //custom title, warning icon
                    JOptionPane.showMessageDialog(frame,
                            "DATE NO SELECTED.",
                            "BUDGET APPLICATION",
                            JOptionPane.INFORMATION_MESSAGE);
                    return;

                }
                else{
                    //Getting Start Date
                    Format formatter = new SimpleDateFormat("yyyy-MM-dd");
                    String start_date = formatter.format(cal_monthly_start.getDate());
                    System.out.println(start_date);

                    //Getting end date
                    String end_date = formatter.format(cal_monthly_end.getDate());
                    System.out.println(end_date);

                    //Food Expenses

                    Double hbrt_expenses = services.third_panel_results(start_date , end_date ,"HEBERT" );
                    txt_hbrt_3.setText(hbrt_expenses.toString());

                    // Hsienkai Expenses

                    Double hsk_expenses = services.third_panel_results(start_date , end_date ,"HSIENKAI" );
                    txt_hsk_3.setText(hsk_expenses.toString());

                    // Barney Expenses

                    Double barney_expenses = services.third_panel_results(start_date , end_date ,"BARNEY" );
                    txt_barney_3.setText(barney_expenses.toString());

                    // Utilites Expenses

                    Double fix_expenses = services.third_panel_results(start_date , end_date ,"FIXED" );
                    txt_fix_3.setText(fix_expenses.toString());

                    // House Expenses

                    Double house_expenses = services.third_panel_results(start_date , end_date ,"HOUSE" );
                    txt_house_3.setText(house_expenses.toString());

                    // EXTRA Expenses

                    Double extra_expenses = services.third_panel_results(start_date , end_date ,"EXTRA" );
                    txt_extra_3.setText(extra_expenses.toString());

                    // FOOD Expenses

                    Double food_expenses = services.third_panel_results(start_date , end_date ,"FOOD" );
                    txt_food_3.setText(food_expenses.toString());
                }



            }
        });



    }
}
