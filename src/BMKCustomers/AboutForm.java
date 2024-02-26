/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BMKCustomers;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author BenMitnicK
 */
public class AboutForm extends JPanel{
    
    BackgroundImage jPanel;
    
    public AboutForm() throws IOException, URISyntaxException{       
        initComponents();      
    }
    
    private void initComponents() throws IOException {
        if(OSValidator.IS_UNIX){
            BufferedImage image = ImageIO.read(getClass().getClassLoader().getResource("images/about_linux.png"));
            jPanel = new BackgroundImage(image);
            add(jPanel);
        }else{
            BufferedImage image = ImageIO.read(getClass().getClassLoader().getResource("images/about.png"));
            jPanel = new BackgroundImage(image);
            add(jPanel);
        }        
    }
}
