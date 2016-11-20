/**
 * Created by hbrtxito on 11/12/16.
 */
import java.awt.*;
import javax.swing.*;


public class PanelView extends JFrame {

    /** This are all 4 panels **/

    JPanel panel_Expenses           = new JPanel();
    JPanel panel_Income             = new JPanel();
    JPanel panel_Monthly_Expenses   = new JPanel();
    JPanel panel_Query              = new JPanel();

    /** Panel I Components **/

    /** Labels **/

    JLabel lbl_date_1               = new JLabel("DATE");
    JLabel lbl_quantity             = new JLabel("QUANTITY");
    JLabel lbl_product              = new JLabel("PRODUCT");
    JLabel lbl_price                = new JLabel("PRICE");
    JLabel lbl_payment              = new JLabel("PAYMENT");
    JLabel lbl_category             = new JLabel("CATEGORY");
    JLabel lbl_comments_1           = new JLabel("COMMENTS");

    /** Text Area **/

    JTextArea txt_quantity          = new JTextArea();
    JTextArea txt_product           = new JTextArea();
    JTextArea txt_price             = new JTextArea();
    JTextArea txt_comments          = new JTextArea();

    /** Combos **/
    JComboBox cmb_pay               = new JComboBox();
    JComboBox cmb_type              = new JComboBox();

    /** Buttons for panel I **/

    JButton btn_submit_1            = new JButton("SUBMIT");

    /**  Panel II Components **/

    /** Labels **/

    JLabel lbl_date_2               = new JLabel("DATE");
    JLabel lbl_user                 = new JLabel("USER");
    JLabel lbl_income               = new JLabel("INCOME");
    JLabel lbl_comments_2           = new JLabel("COMMENTS");

    /** Combos **/

    JComboBox cmb_user              = new JComboBox();

    /** Text Areas **/

    JTextArea txt_income            = new JTextArea();
    JTextArea txt_comments_2        = new JTextArea();

    /** Button for panel II **/

    JButton btn_submit_2            = new JButton("SUBMIT");

    /** Panel III Components **/

    /** Labels Panel III **/

    JLabel lbl_date_3               = new JLabel("CALENDAR DATE");
    JLabel lbl_from_3               = new JLabel("FROM");
    JLabel lbl_to_3                 = new JLabel("TO");
    JLabel lbl_hsk_3                = new JLabel("HSIENKAI");
    JLabel lbl_hbrt_3               = new JLabel("HEBERT");
    JLabel lbl_barney               = new JLabel("BARNEY");
    JLabel lbl_fix_3                = new JLabel("UTILITIES");
    JLabel lbl_house_3              = new JLabel("HOUSE");
    JLabel lbl_extra_3              = new JLabel("EXTRA");
    JLabel lbl_food_3               = new JLabel("FOOD");
    JLabel lbl_total_3              = new JLabel("GRAND TOTAL");

    /** Text Areas for Panel III **/

    JTextArea txt_hsk_3             = new JTextArea();
    JTextArea txt_hbrt_3            = new JTextArea();
    JTextArea txt_barney_3          = new JTextArea();
    JTextArea txt_fix_3             = new JTextArea();
    JTextArea txt_house_3           = new JTextArea();
    JTextArea txt_extra_3           = new JTextArea();
    JTextArea txt_food_3            = new JTextArea();
    JTextArea txt_grand_total       = new JTextArea();


    /** PANEL IV Components **/

    /** Labels Panel IV **/

    JLabel lbl_total_per_month_4   = new JLabel("TOTAL PER MONTH");
    JLabel lbl_from_4              = new JLabel("FROM");
    JLabel lbl_to_4                = new JLabel("TO");
    JLabel lbl_on_4                = new JLabel("ON");
    JLabel lbl_query_total_4       = new JLabel("TOTAL");

    /** Text Areas Panel IV **/

    JTextArea txt_total_per_month_4 = new JTextArea();
    JTextArea txt_on_4              = new JTextArea();
    JTextArea txt_query_total_4     = new JTextArea();

    /** Combo Box for Panel IV **/

    JComboBox cmb_month_4           = new JComboBox();

    /** Button for panel IV **/

    JButton btn_get_4               = new JButton("TOTAL");
    JButton btn_total_on_4          = new JButton("TOTAL ON");


    JTabbedPane tabbedPane = new JTabbedPane();


    public PanelView(){
        /** Panel  EXPENSES **/

        /** setting Layout **/
        panel_Expenses.setLayout(null);

        /** Set BackGround Color **/
        panel_Expenses.setBackground(Color.lightGray);

        /** All label for panel I **/

        panel_Expenses.add(lbl_quantity);
        panel_Expenses.add(lbl_date_1);
        panel_Expenses.add(lbl_product);
        panel_Expenses.add(lbl_price);
        panel_Expenses.add(lbl_payment);
        panel_Expenses.add(lbl_category);
        panel_Expenses.add(lbl_comments_1);


        /** Position of the labels **/
        lbl_date_1.setBounds(20 , 10 , 300 , 30);
        lbl_product.setBounds(220 , 150 , 300 , 30);
        lbl_quantity.setBounds(20, 150, 300, 30);
        lbl_price.setBounds(430 , 150, 300 , 30 );
        lbl_payment.setBounds(30 , 300 , 300 , 30);
        lbl_category.setBounds(230 , 300 , 300 , 30);
        lbl_comments_1.setBounds(430 , 300 , 300 , 30);


        /** All Text Areas for panel I **/

        panel_Expenses.add(txt_quantity);
        panel_Expenses.add(txt_product);
        panel_Expenses.add(txt_price);
        panel_Expenses.add(txt_comments);

        /** Position of the Text Area **/

        txt_quantity.setBounds(30, 185 , 50 , 30);
        txt_product.setBounds(180, 185 , 150 , 30);
        txt_price.setBounds(410 , 185 , 100 , 30);
        txt_comments.setBounds(410 , 330 , 150 , 30);

        /** All ComboBox for Panel I **/

        panel_Expenses.add(cmb_pay);
        panel_Expenses.add(cmb_type);

        /** Position for all ComboBox **/

        cmb_pay.setBounds(20 , 330 , 100 , 30);
        cmb_type.setBounds(200 , 330 , 125 , 30);

        /** Button panel I **/

        panel_Expenses.add(btn_submit_1);

        /** Position button panel I **/

        btn_submit_1.setBounds(450 , 430 , 100 , 30);


        /** Panel INCOME **/

        /** Setting Layout **/
        panel_Income.setLayout(null);


        /** Set BackGround Color **/
        Color clr_2 = new Color(204, 255, 153);   // blue
        panel_Income.setBackground(clr_2);

        /** All label for panel II **/

        panel_Income.add(lbl_date_2);
        panel_Income.add(lbl_user);
        panel_Income.add(lbl_comments_2);
        panel_Income.add(lbl_income);

        /** Position of the labels **/
        lbl_date_2.setBounds(20 , 10 , 300 , 30);
        lbl_user.setBounds(40 , 90 , 300 , 30);
        lbl_income.setBounds(200 , 90 , 300 , 30);
        lbl_comments_2.setBounds( 400 , 90 , 300 , 30);

        /** All Text Areas for Panel II **/
        panel_Income.add(txt_income);
        panel_Income.add(txt_comments_2);


        /** Position for Text Area **/
        txt_income.setBounds(180 , 115 , 100 , 30);
        txt_comments_2.setBounds(380 , 115 , 150 , 30 );

        /** ComboBox for panel II **/
        panel_Income.add(cmb_user);

        /** Position for ComboBox **/
        cmb_user.setBounds(20 , 115 , 100 , 30);

        /** Button panel II **/

        panel_Income.add(btn_submit_2);

        /** Position button panel I **/

        btn_submit_2.setBounds(200 , 230 , 100 , 30);


        /** Panel Monthly Expenses **/

        /** setting layout **/
        panel_Monthly_Expenses.setLayout(null);

        /** Set BackGround Color **/
        Color clr_3 = new Color(153, 204, 255);   // blue
        panel_Monthly_Expenses.setBackground(clr_3);

        /** All label for panel II **/

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

        /** Position for all labels on panel II **/

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

        /** All text Areas for Panel III **/

        panel_Monthly_Expenses.add(txt_hbrt_3);
        panel_Monthly_Expenses.add(txt_hsk_3);
        panel_Monthly_Expenses.add(txt_barney_3);
        panel_Monthly_Expenses.add(txt_fix_3);
        panel_Monthly_Expenses.add(txt_house_3);
        panel_Monthly_Expenses.add(txt_extra_3);
        panel_Monthly_Expenses.add(txt_food_3);
        panel_Monthly_Expenses.add(txt_grand_total);

        /** Position for Text Areas panel III **/

        txt_hbrt_3.setBounds(20, 130 , 100 , 30 );
        txt_hsk_3.setBounds(160 , 130 , 110 , 30 );
        txt_barney_3.setBounds(330 , 130 , 100, 30);
        txt_fix_3.setBounds(20 , 260 , 100 , 30 );
        txt_house_3.setBounds(160 ,260 , 100 , 30);
        txt_extra_3.setBounds(330, 260 , 100 , 30);
        txt_food_3.setBounds(20, 430 , 100 , 30);
        txt_grand_total.setBounds(250 , 430 , 150 , 30 );


        /** PANEL QUERIES **/

        /** setting layout **/
        panel_Query.setLayout(null);

        /** Set BackGround Color **/
        Color clr_4 = new Color(141, 249, 235);   // blue
        panel_Query.setBackground(clr_4);

        /** All Labels for Panel IV **/

        panel_Query.add(lbl_total_per_month_4);
        panel_Query.add(lbl_from_4);
        panel_Query.add(lbl_to_4);
        panel_Query.add(lbl_on_4);
        panel_Query.add(lbl_query_total_4);

        /** Position for all Labels **/

        lbl_total_per_month_4.setBounds(20 , 40 , 300 , 30 );
        lbl_from_4.setBounds(40 , 150 , 300 , 30);
        lbl_to_4.setBounds(150 , 150 , 300 , 30);
        lbl_on_4.setBounds(40 , 250 , 300 , 30);
        lbl_query_total_4.setBounds (150 , 250 , 300 , 30);

        /** Text Areas for panel IV **/

        panel_Query.add(txt_total_per_month_4);
        panel_Query.add(txt_on_4);
        panel_Query.add(txt_query_total_4);

        /** Position for the text Areas **/

        txt_total_per_month_4.setBounds(330 , 70 , 100 , 30);
        txt_on_4.setBounds(20 , 280 , 100 , 30);
        txt_query_total_4.setBounds(300, 280, 150 , 30);

        /** ComboBox for Panel IV **/

        panel_Query.add(cmb_month_4);

        /** Position for ComboBox **/

        cmb_month_4.setBounds(20 , 70 , 120 , 30);

        /** Buttons on Panel IV **/

        panel_Query.add(btn_get_4);
        panel_Query.add(btn_total_on_4);

        /** Position button on panel IV **/

        btn_get_4.setBounds(180 , 70, 100 , 30);
        btn_total_on_4.setBounds(150 , 280 , 120 , 30);


        /** Adding Panels to the app **/
        tabbedPane.add("Expenses",panel_Expenses);
        tabbedPane.add("Income",panel_Income);
        tabbedPane.add("Monthly Exp",panel_Monthly_Expenses);
        tabbedPane.add("Queries",panel_Query);


        add(tabbedPane);


    }


}
