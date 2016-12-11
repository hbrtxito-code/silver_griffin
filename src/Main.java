/**
 * Created by hbrtxito on 11/12/16.
 */

import javax.swing.*;

import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;



public class Main {

    public static void main(String args[]) { SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            try
            {
                UIManager.setLookAndFeel(new GraphiteLookAndFeel() {
                });
            }

        /*catch (ClassNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (InstantiationException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IllegalAccessException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }*/catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
            new PanelView();

        }
    });



    }

}
