/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BMKCustomers;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author BenMitnicK
 */
public class TabbedPane extends JPanel{
    
    public static JFrame frame = new JFrame();
    
    public TabbedPane() throws IOException, SQLException, URISyntaxException{
        
        super(new GridLayout(1, 1));
        
        JTabbedPane tabbedPane = new JTabbedPane();
        ImageIcon iconCustomers = createImageIcon("/images/tab_customers.png");
        ImageIcon icon_NewCustomers = createImageIcon("/images/tab_addcustomers.png");
        ImageIcon icon_Mail = createImageIcon("/images/tab_mail.png");
        ImageIcon icon_Options = createImageIcon("/images/tab_options.png");
        ImageIcon icon_About = createImageIcon("/images/tab_about.png");

        tabbedPane.addTab("Customers", iconCustomers, new BMKCustomersForm().jsp_panel1, "Data Of Your Customers");
 
        tabbedPane.addTab("New Customer", icon_NewCustomers, new CustomerForm().jPanel, "ADD New Customer");

        tabbedPane.addTab("Mail", icon_Mail, new MailForm().jPanel, "Send E-Mail");
        
        tabbedPane.addTab("Options", icon_Options, new OptionsForm().jsp_panel1, "Options Of App");

        tabbedPane.addTab("About", icon_About, new AboutForm().jPanel, "About BMKCustomers");

        tabbedPane.addChangeListener(new ChangeListener() { //add the Listener

            public void stateChanged(ChangeEvent e) {
                    if(tabbedPane.getSelectedIndex()==2) //Index starts at 0, so Index 2 = Tab3
                    {
                        MailForm.jt_EmailCustomer.setText(BMKCustomersForm.t_Email.getText());
                    }
            }
        });
        
        //Add the tabbed pane to this panel.
        add(tabbedPane);
        
        //The following line enables to use scrolling tabs.
        //tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        
    }
    
    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = TabbedPane.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    protected JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }
    
    public void createAndShowGUI() throws IOException, SQLException, URISyntaxException {
        //Create and set up the window.
        URL url = ClassLoader.getSystemResource("images/icon.png");
        Image img = getToolkit().getImage(url);
        frame.setIconImage(img);
        frame.setName("BMKCustomers");
        frame.setTitle("BMKCustomers For XBOX360 V5");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                try {
                    onExit();
                } catch (IOException ex) {
                    Logger.getLogger(TabbedPane.class.getName()).log(Level.SEVERE, null, ex);
                } catch (URISyntaxException ex) {
                    Logger.getLogger(TabbedPane.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        
        //Create and set up the content pane.
        JComponent newContentPane = new TabbedPane();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.getContentPane().add(new TabbedPane(), BorderLayout.CENTER);

        Dimension ss = Toolkit.getDefaultToolkit ().getScreenSize ();
        Dimension frameSize;
        
        if(OSValidator.IS_UNIX){
            frameSize = new Dimension ( 1285, 770 );
        }else{
            frameSize = new Dimension ( 1245, 770 );
        }
        
        frame.setBounds ( ss.width / 2 - frameSize.width / 2, 
                          ss.height / 2 - frameSize.height / 2,
                          frameSize.width, frameSize.height );
        frame.setVisible(true);
        
    }
    
    public void onExit() throws IOException, URISyntaxException {
        int retour = JOptionPane.showConfirmDialog(frame, "Are You Sure You Want To Quit ??", "Exit Confirmation", JOptionPane.OK_CANCEL_OPTION);
        if (retour == 0){
            SQLiteQueries.close();
            Utils.CheckFileImageExist();
            System.exit(0);
        }       
    }                                 
}
