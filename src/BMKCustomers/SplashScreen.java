/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BMKCustomers;

/**
 *
 * @author BenMitnicK
 */

import java.awt.*;
import javax.swing.*;

public class SplashScreen extends JWindow {
    
    private int duration;

  public SplashScreen(int d) {
    duration = d;
  }

  public void showSplash() {
      
    // Transparency Background  
    setBackground(new Color(0, 255, 0, 0));

    // Set the window's bounds, centering the window
    int width = 800;
    int height = 500;
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (screen.width-width)/2;
    int y = (screen.height-height)/2;
    setBounds(x,y,width,height);

    // Build the splash screen
    JLabel label = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("images/splash.png")));
    add(label, BorderLayout.CENTER);
  
    // Display it
    setVisible(true);

    // Wait a little while, maybe while loading resources
    try { Thread.sleep(duration); } catch (Exception e) {}

    setVisible(false);
  }

  public void showSplashAndExit() {
    showSplash();
    System.exit(0);
  }
}
