import javax.swing.*;

/**
 * Created by hbrtxito on 12/6/16.
 */
public class Panel_Monthly extends JPanel {

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

    public Panel_Monthly(){

        // Set LAYOUT

        setLayout(null);
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
        add(lbl_total_3);

        // All text Areas for Panel III 

        add(txt_hbrt_3);
        add(txt_hsk_3);
        add(txt_barney_3);
        add(txt_fix_3);
        add(txt_house_3);
        add(txt_extra_3);
        add(txt_food_3);
        add(txt_grand_total);

        // Position for Text Areas panel III 

        txt_hbrt_3.setBounds(20, 130 , 100 , 30 );
        txt_hsk_3.setBounds(160 , 130 , 110 , 30 );
        txt_barney_3.setBounds(330 , 130 , 100, 30);
        txt_fix_3.setBounds(20 , 260 , 100 , 30 );
        txt_house_3.setBounds(160 ,260 , 100 , 30);
        txt_extra_3.setBounds(330, 260 , 100 , 30);
        txt_food_3.setBounds(20, 430 , 100 , 30);
        txt_grand_total.setBounds(250 , 430 , 150 , 30 );
    }
}
