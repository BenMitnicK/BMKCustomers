/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMKCustomers;

/**
 *
 * @author BenMitnicK
 */
import java.awt.GridBagLayout;
import java.awt.Image;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;
import java.beans.PropertyChangeEvent;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class BackgroundProgressBar extends SwingWorker<Void, Void> {

        public static JProgressBar pb;
        public static int progress = 10;
        private JDialog dialog;
        private JLabel jLabel;

    public BackgroundProgressBar() {

        addPropertyChangeListener((PropertyChangeEvent evt) -> {
            if ("progress".equalsIgnoreCase(evt.getPropertyName())) {

                if (dialog == null) {
                    dialog = new JDialog();
                    jLabel = new JLabel();
                    URL url = ClassLoader.getSystemResource("images/icon.png");
                    Image img = dialog.getToolkit().getImage(url);
                    dialog.setIconImage(img);
                    dialog.setTitle("Processing");
                    dialog.setLayout(new GridBagLayout());
                    dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                    jLabel.setIcon(new ImageIcon(getClass().getResource("/images/loading.gif")));
                    dialog.add(jLabel, JLabel.CENTER);
                    pb = new JProgressBar();               
                    pb.setValue(0);
                    pb.setStringPainted(true);
                    dialog.pack();
                    dialog.setLocationRelativeTo(null);
                    dialog.setModal(true);
                    dialog.setVisible(true);
                }
            }
        });
    }

    public static void restartApplication() throws IOException, URISyntaxException
    {
          final String javaBin = System.getProperty("java.home") + File.separator + "bin" + File.separator + "java";
          final File currentJar = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());

          if(!currentJar.getName().endsWith(".jar"))
            return;

          final ArrayList<String> command = new ArrayList<String>();
          command.add(javaBin);
          command.add("-jar");
          command.add(currentJar.getPath());

          final ProcessBuilder builder = new ProcessBuilder(command);
          builder.start();
          System.exit(0);
    }

    @Override
    protected void done() {
        if (dialog != null) {                     

            try {
                dialog.dispose();
                restartApplication();                
            } catch (IOException ex) {
                Logger.getLogger(BackgroundProgressBar.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException ex) {
                Logger.getLogger(BackgroundProgressBar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    protected Void doInBackground() throws Exception {                 
        while(progress<100){
            setProgress(progress);
            try{Thread.sleep(100);} // make the process last a while
            catch (InterruptedException e){}
        }
    return null;
    }  
}