/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BMKCustomers;

import java.awt.AWTException;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.CodeSource;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.imageio.ImageIO;

/**
 *
 * @author BenMitnicK
 */
public class ScreenShot {
    
    static SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd hh mm ss a");  
    
    public static void ScreenFullDisplay() throws URISyntaxException{
        
        try {
            
            CodeSource codeSource = Main.class.getProtectionDomain().getCodeSource();
            File jarFile = new File(codeSource.getLocation().toURI().getPath());
            String jarDir = jarFile.getParentFile().getPath();
            
            File dir = new File(jarDir + "screenshots/" + BMKCustomersForm.t_LastName.getText());
            
            if (!dir.exists())
            {
                boolean result = dir.mkdir();  
            if(result){    
            }

            }
            Calendar now = Calendar.getInstance();  
            Robot robot = new Robot();
            //Dimension de l'écran
            Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
            //capture d'écran
            BufferedImage bi = robot.createScreenCapture(new Rectangle(dimension.width, dimension.height));

            ImageIO.write(bi, "png", new File(dir + "/" + "screenshot_" + BMKCustomersForm.t_LastName.getText() + "_"  +formatter.format(now.getTime())+ ".png"));
        } catch (AWTException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   
    public static BufferedImage getScreenShot(
    Component component) {

    BufferedImage image = new BufferedImage(
      component.getWidth(),
      component.getHeight(),
      BufferedImage.TYPE_INT_RGB
      );
    // call the Component's paint method, using
    // the Graphics object of the image.
    component.paint( image.getGraphics() );
    return image;
  }
    
    public static void ScreenWindows() throws SQLException, URISyntaxException{
   
        try {
            
            CodeSource codeSource = Main.class.getProtectionDomain().getCodeSource();
            File jarFile = new File(codeSource.getLocation().toURI().getPath());
            String jarDir = jarFile.getParentFile().getPath();
            
            File dir;
            
            if(OSValidator.IS_UNIX){
                dir = new File(jarDir + "/screenshots/" + BMKCustomersForm.t_LastName.getText());
            }else{
                dir = new File("screenshots/" + BMKCustomersForm.t_LastName.getText());
            }
            
            if (!dir.exists())
            {
                boolean result = dir.mkdir();  
            if(result){}

            }
            Calendar now = Calendar.getInstance();
            Robot robot = new Robot();
       
            BufferedImage image = getScreenShot(BMKCustomersForm.jPanel);
            //enregistrer l'image
            ImageIO.write(image, "png", new File(dir + "/" + "screenshot_" + BMKCustomersForm.t_LastName.getText() + "_" +formatter.format(now.getTime())+ ".png"));
        } catch (AWTException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
