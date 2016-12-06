/**
 * Created by hbrtxito on 11/12/16.
 */

import javax.swing.*;

public class Main {
    public static void main(String args[]) { SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {

            new PanelView();
        }
    });



    }

}
