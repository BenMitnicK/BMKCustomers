/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMKCustomers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.CodeSource;

/**
 *
 * @author Abdel Le BG
 */
public class Utils {
    
    public static void CheckFoldersExist() throws URISyntaxException{
        CodeSource codeSource = Main.class.getProtectionDomain().getCodeSource();
        File jarFile = new File(codeSource.getLocation().toURI().getPath());
        String jarDir = jarFile.getParentFile().getPath();
                    
            File dir_data;
            File dir_screenshots;
            
            if(OSValidator.IS_UNIX){
                dir_data = new File(jarDir + "/data/");
                dir_screenshots = new File(jarDir + "/screenshots/");
                        
                if (!dir_data.exists() && !dir_screenshots.exists()){
                    boolean result = dir_data.mkdir();  
                    boolean result2 = dir_screenshots.mkdir();
                    if(result){}if(result2){}
                }else if (!dir_data.exists() && dir_screenshots.exists()){
                    boolean result = dir_data.mkdir();
                    if(result){}
                }else if (dir_data.exists() && !dir_screenshots.exists()){
                    boolean result = dir_screenshots.mkdir();
                    if(result){}
                }                       
            }else{
                dir_data = new File("data/");
                dir_screenshots = new File("screenshots/");
                        
                    if (!dir_data.exists() && !dir_screenshots.exists()){
                        boolean result = dir_data.mkdir();  
                        boolean result2 = dir_screenshots.mkdir();
                        if(result){}if(result2){}
                    }else if (!dir_data.exists() && dir_screenshots.exists()){
                        boolean result = dir_data.mkdir();
                        if(result){}
                    }else if (dir_data.exists() && !dir_screenshots.exists()){
                        boolean result = dir_screenshots.mkdir();
                        if(result){}
                    }                        
            }
    }
    
    public static void CopyFile() throws URISyntaxException, FileNotFoundException, IOException{        
        CodeSource codeSource = Main.class.getProtectionDomain().getCodeSource();
        File jarFile = new File(codeSource.getLocation().toURI().getPath());
        String jarDir = jarFile.getParentFile().getPath();
                    
            File data_source;
            File data_dest;
            
            if(OSValidator.IS_UNIX){
                try {
                    data_source = new File(jarDir + "/data/Customers.db");
                    data_dest = new File(jarDir + "/data/Customers_save.db");
                    
                    FileInputStream fis = new FileInputStream(data_source);
                    FileOutputStream fos = new FileOutputStream(data_dest);
                    int count = 0;

                    while((count = fis.read()) > -1){
                        fos.write(count);
                    }
                    fis.close();
                    fos.close();
                } catch (FileNotFoundException e) {
                    System.err.println("FileStreamsReadnWrite: " + e);
                } catch (IOException e) {
                    System.err.println("FileStreamsReadnWrite: " + e);
                }                
            }else{
                try {
                    data_source = new File("data/Customers.db");
                    data_dest = new File("data/Customers_save.db");
                    
                    FileInputStream fis = new FileInputStream(data_source);
                    FileOutputStream fos = new FileOutputStream(data_dest);
                    int count = 0;

                    while((count = fis.read()) > -1){
                        fos.write(count);
                    }
                    fis.close();
                    fos.close();
                } catch (FileNotFoundException e) {
                    System.err.println("FileStreamsReadnWrite: " + e);
                } catch (IOException e) {
                    System.err.println("FileStreamsReadnWrite: " + e);
                }                
            }        
    }
    
    public static void CheckFileImageExist() throws URISyntaxException{
        CodeSource codeSource = Main.class.getProtectionDomain().getCodeSource();
        File jarFile = new File(codeSource.getLocation().toURI().getPath());
        String jarDir = jarFile.getParentFile().getPath();
        
        File f_jpg = new File(jarDir + "/image.jpg");
        File f_jpeg = new File(jarDir + "/image.jpeg");
        File f_png = new File(jarDir + "/image.png");
        File f_gif = new File(jarDir + "/image.gif");
        File f_bmp = new File(jarDir + "/image.bmp");
        
        File f_jpg2 = new File("image.jpg");
        File f_jpeg2 = new File("image.jpeg");
        File f_png2 = new File("image.png");
        File f_gif2 = new File("image.gif");
        File f_bmp2 = new File("image.bmp");
        
        if(OSValidator.IS_UNIX){
            if (f_jpg.exists() || f_jpeg.exists() || f_png.exists() || f_gif.exists() || f_bmp.exists()){
                boolean result = f_jpg.delete();
                boolean result2 = f_jpeg.delete();
                boolean result3 = f_png.delete();
                boolean result4 = f_gif.delete();
                boolean result5 = f_bmp.delete();
            }
        }else{           
            if (f_jpg2.exists() || f_jpeg2.exists() || f_png2.exists() || f_gif2.exists() || f_bmp2.exists()){
                boolean result = f_jpg2.delete();
                boolean result2 = f_jpeg2.delete();
                boolean result3 = f_png2.delete();
                boolean result4 = f_gif2.delete();
                boolean result5 = f_bmp2.delete();
            }           
        } 
    }   
}
