/**
 * Created by hbrtxito on 11/12/16.
 */
import javax.swing.JFrame;
import javax.swing.JTabbedPane;


public class PanelView  {
    JFrame frame = new JFrame();
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
    }
}

