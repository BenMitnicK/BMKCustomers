/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BMKCustomers;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author BenMitnicK
 */
public class Main {
      
    public static void main(String[] args) throws IOException, SQLException, URISyntaxException {
        SplashScreen splash = new SplashScreen(5000);
        splash.showSplash();
        Utils.CheckFoldersExist();
        SQLiteQueries.connect();
        SQLiteQueries.checkTablesExist();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BMKCustomersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BMKCustomersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BMKCustomersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BMKCustomersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //Turn off metal's use of bold fonts
	//UIManager.put("swing.boldMetal", Boolean.FALSE);
	//Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {  
                        ResultSet res = SQLiteQueries.query("SELECT PassWordApp FROM AppOptions");                       
                                    if ("".equals(res.getString("PassWordApp"))){
                                        new TabbedPane().createAndShowGUI();
                                    }else{
                                        new PasswordForm().setVisible(true);
                                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (URISyntaxException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
}
