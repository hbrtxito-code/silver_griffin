/**
 * Created by hbrtxito on 11/12/16.
 */
import javax.swing.*;


public class PanelView  {
    JFrame frame = new JFrame("B U D G E T   A P P L I C A T I O N ");
    JTabbedPane tabbedPane = new JTabbedPane();
    Panel_Expenses fp = new Panel_Expenses();
    Panel_Income sp = new Panel_Income();
    Panel_Monthly tp =  new Panel_Monthly();
    Panel_Query qp = new Panel_Query();

    public PanelView(){
        tabbedPane.add("EXPENSES PANEL", fp);
        tabbedPane.add("INCOME PANEL", sp);
        tabbedPane.add("PANEL MONTHLY" , tp);
        tabbedPane.add("PANEL QUERY" , qp);
        frame.getContentPane().add(tabbedPane);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(650, 650);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
        SwingUtilities.updateComponentTreeUI(frame);
    }
}

