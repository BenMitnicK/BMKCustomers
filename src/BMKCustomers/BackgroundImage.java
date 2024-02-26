/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BMKCustomers;

/**
 *
 * @author BenMitnicK
 */
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Objects;

import javax.swing.JPanel;

public class BackgroundImage extends JPanel {
  BufferedImage image;

  public BackgroundImage(BufferedImage image) {
      this.image = image;
  }

  public BackgroundImage() { 
      super(); 
  }
  
  @Override
  protected void paintComponent(Graphics g) {
    if(Objects.nonNull(image)){
        
        int x = (getWidth() - image.getWidth()) / 2;
        int y = (getHeight() - image.getHeight()) / 2;
        g.drawImage(image, x, y, this);
    }else{       
        super.paintComponent(g);
    }
  }
}