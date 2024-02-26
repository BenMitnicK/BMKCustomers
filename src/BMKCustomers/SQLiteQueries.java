/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMKCustomers;

import java.awt.Color;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.security.CodeSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.jdom2.*;
import org.jdom2.filter.ElementFilter;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author BenMitnicK
 */
public class SQLiteQueries {    
    
    public static String CustomersList;
    public static String LastName;
    public static String FirstName;
    public static String pseudo;
    public static String email;
    public static String address;
    public static String CPU_KEY;
    public static String CPU_KEY2;
    public static String DVD_KEY;
    public static String Dash_Version_Now;
    public static String Dash_Version_Hack;
    public static String Console_Type;
    public static String CB_Version;
    public static String Hack;
    public static String ModChip;
    public static String DualNand;
    public static String MFR_Date;
    public static String Console_ID;
    public static String Serial;
    public static String Region;
    public static String OSIG;
    public static String BigBlock_BB;
    public static String BadBlock_BB;
    public static String LDV;
    public static String FCRT;
    public static String Comment;
    public static String t_Comment;
    public static String Flash_Drive;
    public static String Display;
    public static String Subject;
    public static String MailCustomer;
    public static String Email;
    public static String MailTechnician;
    public static String MailPassWord;
    public static String jta_Area;
    public static String jb_t_AllColor;
    public static String jb_tf_AllColor;
    public static String jb_EditBodyXboxData; 
    public static String jb_SaveComment; 
    public static String jb_SaveBodyXboxData; 
    public static String jb_DelCustomer;
    public static String jb_Attachment;
    public static String jb_SendMail;    
    public static String CB_DashVersionHack;
    public static String CB_ModChip;
    public static String CB_DualNand;
    public static String CB_Hack;
    public static String CB_DriveType;
    public static String CB_FlashDriveType;
    public static String ImageBase;
    public static String ImageMail;
    public static String ImageEditBodyXbox;
    public static String ImageCustomer;
    public static String ImageComment;
    public static String ImageOptions;
    public static String t_address;
    public static String t_Dash_Version_Now;
    public static String t_CB_Version;
    public static String t_CPU_KEY;
    public static String t_DVD_KEY;
    public static String t_Dash_Version_Hack;
    public static String t_Console_ID;
    public static String t_OSIG;
    public static String t_Serial;
    public static String t_Region;
    public static String t_MFR_Date;
    public static String t_LastName;
    public static String t_pseudo;
    public static String t_email;
    public static String t_FirstName;
    public static String t_LDV;
    public static String t_FCRT;
    public static String t_Flash_Drive;
    public static String t_Flash_Drive_Type;
    public static String t_Drive_Type;
    public static String t_BadBlock_BB;
    public static String t_BigBlock_BB;
    public static String t_Hack;
    public static String t_ModChip;
    public static String t_DualNand;
    public static String t_Console_Type;
    public static String l_WarningMessage;
    public static String t_AppPassword;
    public static String t_EmailPassWord;
    public static String t_Subject;
    public static String t_EmailTechnician;
    public static String t_MailCustomer;
    public static String t_MailTechnician;
    public static String t_MailPassWord;    
    public static String t_SMTP_PORT;
    public static String t_SMTP_ADDRESS;

    static Element racine = new Element("personnes");
    static Document document = new Document(racine);

    static File f;
    public static File dirImage;
    public static BufferedImage img;
    public static InputStream istreamImage;

    private static final String DBPath = "Customers.db";
    public static Connection connection = null;
    private static Statement statement = null;

    public static Connection connect() throws SQLException, URISyntaxException {            
        try {                    
            CodeSource codeSource = Main.class.getProtectionDomain().getCodeSource();
            File jarFile = new File(codeSource.getLocation().toURI().getPath());
            String jarDir = jarFile.getParentFile().getPath();
            Class.forName("org.sqlite.JDBC");
            if(OSValidator.IS_UNIX){
                    connection = DriverManager.getConnection("jdbc:sqlite:" + jarDir + "/data/" + DBPath);
            }else{
                    connection = DriverManager.getConnection("jdbc:sqlite:data/" + DBPath);
            }
        statement = connection.createStatement();
        return connection;
        } catch (ClassNotFoundException | SQLException notFoundException) { notFoundException.printStackTrace(); }
    return null;
    }

    public static void close() {
	try {
            connection.close();
            statement.close();
	} catch (SQLException e) {e.printStackTrace();}
    }

    public static ResultSet query(String requet) {
	ResultSet resultat = null;
        try {
            resultat = statement.executeQuery(requet);
        } catch (SQLException e) { e.printStackTrace(); }
    return resultat;
    }
        
    public static void createTable() throws SQLException, IOException{                    
        try {
            PreparedStatement customersTables;
            customersTables = connection.prepareStatement("CREATE TABLE IF NOT EXISTS Customers (CUSID INTEGER PRIMARY KEY AUTOINCREMENT, Firstname VARCHAR(20), Lastname VARCHAR(20) UNIQUE NOT NULL, Pseudo VARCHAR(20), Email VARCHAR(30), Address VARCHAR(256), Comment VARCHAR(256), Image BLOB, ImageExtension VARCHAR(256))");
            customersTables.executeUpdate();
            customersTables = connection.prepareStatement("CREATE TABLE IF NOT EXISTS Consoles (CONID INTEGER PRIMARY KEY AUTOINCREMENT, CpuKey VARCHAR(32), DvdKey VARCHAR(32), DashVersionNow VARCHAR(5), DashVersionHack VARCHAR(5), ConsoleType VARCHAR(20), ModChip VARCHAR(20), DualNand VARCHAR(50), Hack VARCHAR(20), CBVersion VARCHAR(8), MFRDate VARCHAR(10), ConsoleID VARCHAR(20), Serial VARCHAR(20), Region VARCHAR(30), OSIG VARCHAR(40), BigBlock VARCHAR(3), BadBlock VARCHAR(3), LDV VARCHAR(2), FCRT VARCHAR(5), FlashDrive VARCHAR(3), FlashDriveType VARCHAR(4), DriveType VARCHAR(20))");
            customersTables.executeUpdate();
            customersTables = connection.prepareStatement("CREATE TABLE IF NOT EXISTS AppOptions (APPID INTEGER PRIMARY KEY AUTOINCREMENT, Base VARCHAR(3), EditBodyXboxData VARCHAR(3), Mail VARCHAR(3), AddCustomers VARCHAR(3), Options VARCHAR(3), Display VARCHAR(7), PassWordApp VARCHAR(30), TechMail VARCHAR(40), EmailPassWord VARCHAR(30), SMTP VARCHAR(20), PORT VARCHAR(5))");
            customersTables.executeUpdate();
            customersTables = connection.prepareStatement("CREATE TABLE IF NOT EXISTS ComboBoxOptions (COMID INTEGER PRIMARY KEY AUTOINCREMENT, DashVersionHack VARCHAR(5), Modchip VARCHAR(50), DualNand VARCHAR(50), Hack VARCHAR(20), DriveType VARCHAR(20), FlashDriveType VARCHAR(4))");
            customersTables.executeUpdate();
            customersTables = connection.prepareStatement("CREATE TABLE IF NOT EXISTS LabelOptions (LABID INTEGER PRIMARY KEY AUTOINCREMENT, CustomersList VARCHAR(12), CpuKey VARCHAR(12), DvdKey VARCHAR(12), DashVersionNow VARCHAR(12), DashVersionHack VARCHAR(12), ConsoleType VARCHAR(12), ModChip VARCHAR(12), DualNand VARCHAR(12), Hack VARCHAR(12), CBVersion VARCHAR(12), MFRDate VARCHAR(12), ConsoleID VARCHAR(12), Serial VARCHAR(12), Region VARCHAR(12), OSIG VARCHAR(12), BigBlock VARCHAR(12), BadBlock VARCHAR(12), LDV VARCHAR(12), FCRT VARCHAR(12), FlashDrive VARCHAR(12), Comment VARCHAR(12), FirstName VARCHAR(12), LastName VARCHAR(12), Pseudo VARCHAR(12), EMail VARCHAR(12), Address VARCHAR(12), SaveBodyXboxData VARCHAR(12), WarningMessage VARCHAR(12), MailTechnician VARCHAR(12), MailPasswordTech VARCHAR(12), MailCustomer VARCHAR(12), MailSubject VARCHAR(12), MailAttachment VARCHAR(12), SendMail VARCHAR(12), btallcolor VARCHAR(12))");
            customersTables.executeUpdate();
            customersTables = connection.prepareStatement("CREATE TABLE IF NOT EXISTS TextFieldOptions (TEXID INTEGER PRIMARY KEY AUTOINCREMENT, CpuKey VARCHAR(12), DvdKey VARCHAR(12), DashVersionNow VARCHAR(12), DashVersionHack VARCHAR(12), ConsoleType VARCHAR(12), ModChip VARCHAR(12), DualNand VARCHAR(12), Hack VARCHAR(12), CBVersion VARCHAR(12), MFRDate VARCHAR(12), ConsoleID VARCHAR(12), Serial VARCHAR(12), Region VARCHAR(12), OSIG VARCHAR(12), BigBlock VARCHAR(12), BadBlock VARCHAR(12), LDV VARCHAR(12), FCRT VARCHAR(12), FlashDrive VARCHAR(12), FlashDriveType VARCHAR(12), DriveType VARCHAR(12), Comment VARCHAR(12), FirstName VARCHAR(12), LastName VARCHAR(12), Pseudo VARCHAR(12), EMail VARCHAR(12), Address VARCHAR(12), MailTechnician VARCHAR(12), MailPasswordTech VARCHAR(12), MailCustomer VARCHAR(12), MailSubject VARCHAR(12), MailArea VARCHAR(12), btallcolor VARCHAR(12))");
            customersTables.executeUpdate();
            customersTables.close();			                       
	} catch (SQLException e) {e.printStackTrace();}           
    }
    
    public static String Display() throws SQLException{       
        ResultSet result = query("SELECT Display FROM AppOptions");
        String res = null;
        try {           
            while (result.next()) {
                res = result.getString("Display");  
            }
        } catch (SQLException e) {e.printStackTrace();}
        return res;
    }
        
    public static int CustomersCount() throws IOException{      
        int i = 0;
        ResultSet result = query("SELECT Lastname FROM Customers");        
	try {
            while (result.next()) {
                i++;
            }
        } catch (SQLException e) {e.printStackTrace();}
        return i;
    }
        
    public static int idCustomer() throws SQLException{      
        int res = 0;
        ResultSet result = query("SELECT CUSID FROM Customers WHERE Lastname=\"" +BMKCustomersForm.jc_CustomersList.getSelectedItem()+ "\"");
        try {
            while (result.next()) {
                res = StringToInt(result.getString("CUSID"));
            }
        } catch (SQLException e) {e.printStackTrace();}
        return res;
    }
    
    public static void element(String str) throws IOException, SQLException, URISyntaxException{
        int res = idCustomer();
        ResultSet result = query("SELECT * FROM Customers JOIN Consoles ON Consoles.CONID=Customers.CUSID WHERE CONID=" +res+ "");
        try {           
            while (result.next()) {
                
                BMKCustomersForm.t_CPU_KEY.setText(result.getString("CpuKey"));
                BMKCustomersForm.t_DVD_KEY.setText(result.getString("DvdKey"));
                BMKCustomersForm.t_Dash_Version_Now.setText(result.getString("DashVersionNow"));
                BMKCustomersForm.t_Dash_Version_Hack.setText(result.getString("DashVersionHack"));
                BMKCustomersForm.t_Console_Type.setText(result.getString("ConsoleType"));
                BMKCustomersForm.t_ModChip.setText(result.getString("ModChip"));
                BMKCustomersForm.t_DualNand.setText(result.getString("DualNand"));
                BMKCustomersForm.t_Hack.setText(result.getString("Hack"));
                BMKCustomersForm.t_CB_Version.setText(result.getString("CBVersion"));
                BMKCustomersForm.t_MFR_Date.setText(result.getString("MFRDate"));           
                BMKCustomersForm.t_Console_ID.setText(result.getString("ConsoleID"));
                BMKCustomersForm.t_Serial.setText(result.getString("Serial"));
                BMKCustomersForm.t_Region.setText(result.getString("Region"));
                BMKCustomersForm.t_OSIG.setText(result.getString("OSIG"));
                BMKCustomersForm.t_BigBlock_BB.setText(result.getString("BigBlock"));
                BMKCustomersForm.t_BadBlock_BB.setText(result.getString("BadBlock"));
                BMKCustomersForm.t_LDV.setText(result.getString("LDV"));
                BMKCustomersForm.t_FCRT.setText(result.getString("FCRT"));
                BMKCustomersForm.t_Flash_Drive.setText(result.getString("FlashDrive"));
                BMKCustomersForm.t_Flash_Drive_Type.setText(result.getString("FlashDriveType"));
                BMKCustomersForm.t_Drive_Type.setText(result.getString("DriveType"));           
                BMKCustomersForm.t_FirstName.setText(result.getString("Firstname"));
                BMKCustomersForm.t_LastName.setText(result.getString("Lastname"));
                BMKCustomersForm.t_Email.setText(result.getString("Email"));
                BMKCustomersForm.t_Pseudo.setText(result.getString("Pseudo"));
                BMKCustomersForm.t_Address.setText(result.getString("Address"));
                BMKCustomersForm.t_Comment.setText(result.getString("Comment"));
                
                istreamImage = result.getBinaryStream("Image");
                String ext = result.getString("ImageExtension");                
                
                if("BMKCustomersForm".equals(str)){   
                    if(Objects.nonNull(istreamImage)){
                        BufferedImage image;
                        BufferedImage image2 = null;
                        ByteArrayInputStream bais = null;
                        ByteArrayOutputStream bos = new ByteArrayOutputStream();

                        if("gif".equals(ext)){                    
                            byte[] buffer = new byte[1024];
                            int length = 0;

                            while((length = istreamImage.read(buffer)) != -1){ bos.write(buffer, 0, length); }

                            bais = new ByteArrayInputStream(bos.toByteArray());
                            image2 = ImageIO.read(bais);
                        }

                        image = ImageIO.read(istreamImage); 

                        if(OSValidator.IS_UNIX){
                            CodeSource codeSource = Main.class.getProtectionDomain().getCodeSource();
                            File jarFile = new File(codeSource.getLocation().toURI().getPath());
                            String jarDir = jarFile.getParentFile().getPath();

                            switch (ext) {
                                case "jpg" -> ImageIO.write(image, "JPG", new File(jarDir + "/image.jpg"));
                                case "jpeg" -> ImageIO.write(image, "JPEG", new File(jarDir + "/image.jpg"));
                                case "png" -> ImageIO.write(image, "PNG", new File(jarDir + "/image.png"));
                                case "gif" -> ImageIO.write(image2, "GIF", new File(jarDir + "/image.gif"));
                                case "bmp" -> ImageIO.write(image, "BMP", new File(jarDir + "/image.gif"));
                                default -> {
                                }    
                            }

                            String path = jarDir + "/image." + ext;
                            BMKCustomersForm.tp_image.setIcon(null);
                            try {
                                img = ImageIO.read(new File(path));

                                if(img.getWidth()>312 || img.getHeight()>300){
                                    BMKCustomersForm.tp_image.setIcon(new ImageIcon(img.getScaledInstance(322, 195, 100)));
                                }else{
                                    BMKCustomersForm.tp_image.setIcon(new ImageIcon(img));
                                }
                                BMKCustomersForm.tp_image.revalidate();
                                BMKCustomersForm.tp_image.repaint();
                                //BMKCustomersForm.tp_image.update(BMKCustomersForm.tp_image.getGraphics());
                            } catch (IOException ex) { }  

                        }else{

                            switch (ext) {
                                case "jpg" -> ImageIO.write(image, "JPG", new File("image.jpg"));
                                case "jpeg" -> ImageIO.write(image, "JPEG", new File("image.jpg"));
                                case "png" -> ImageIO.write(image, "PNG", new File("image.png"));
                                case "gif" -> ImageIO.write(image2, "GIF", new File("image.gif"));
                                case "bmp" -> ImageIO.write(image, "BMP", new File("image.gif"));
                                default -> { }    
                            }

                            String path = "image." + ext;
                            BMKCustomersForm.tp_image.setIcon(null);
                            try {
                                img = ImageIO.read(new File(path));

                                if(img.getWidth()>312 || img.getHeight()>300){
                                    BMKCustomersForm.tp_image.setIcon(new ImageIcon(img.getScaledInstance(314, 195, 100)));
                                }else{
                                    BMKCustomersForm.tp_image.setIcon(new ImageIcon(img));
                                }
                                BMKCustomersForm.tp_image.revalidate();
                                BMKCustomersForm.tp_image.repaint();
                                //BMKCustomersForm.tp_image.update(BMKCustomersForm.tp_image.getGraphics());
                             } catch (IOException ex) { }  
                        }
                    }else{                    
                        BMKCustomersForm.tp_image.setIcon(null);
                        BMKCustomersForm.tp_image.revalidate();
                        BMKCustomersForm.tp_image.repaint();
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static BufferedImage scale(BufferedImage bi, double scaleValue) { 
        AffineTransform tx = new AffineTransform(); 
        tx.scale(scaleValue, scaleValue); 
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR); 
        BufferedImage biNew = new BufferedImage( (int) (bi.getWidth() / scaleValue), (int) (bi.getHeight() / scaleValue), bi.getType()); 
        return op.filter(bi, biNew);  
    }
    
    public static void deleteCustomer() throws SQLException{
	try {
            int res = idCustomer();
            PreparedStatement deleteCustomer;
            deleteCustomer = connection.prepareStatement("DELETE FROM Customers WHERE CUSID=" +res+ "");
            deleteCustomer.executeUpdate();
            deleteCustomer = connection.prepareStatement("DELETE FROM Consoles WHERE CONID=" +res+ "");
            deleteCustomer.executeUpdate();
            deleteCustomer.close();
	} catch (SQLException e) {e.printStackTrace();}
    }
    
    // convert from bitmap to byte array
    public static BufferedImage getBuff(BufferedImage img) {
        img = new BufferedImage(10, 80, BufferedImage.TYPE_BYTE_BINARY);
        return img;
    }
    
    public static void addImage(String location, String extension) throws SQLException, FileNotFoundException, IOException, URISyntaxException{
        int res = idCustomer();
        File monImage = new File(location);
        FileInputStream istreamImage = new FileInputStream(monImage);
	try {                       
            PreparedStatement updateImage = connection.prepareStatement("UPDATE Customers SET Image=?  WHERE CUSID=" +res+ "");
            PreparedStatement updateImageExtension = connection.prepareStatement("UPDATE Customers SET ImageExtension=\"" +extension+ "\"  WHERE CUSID=" +res+ "");
            updateImage.setBinaryStream(1, istreamImage, (int) monImage.length());
            updateImage.executeUpdate();
            updateImageExtension.executeUpdate();
            updateImage.close();
            updateImageExtension.close();
            element("BMKCustomersForm");
	} catch (SQLException e) {e.printStackTrace();}
    }
    
    public static void delImage() throws IOException, URISyntaxException{
        try {
            int res = idCustomer();
            PreparedStatement deleteImage;
            deleteImage = connection.prepareStatement("UPDATE Customers SET Image=NULL  WHERE CUSID=" +res+ "");
            deleteImage.executeUpdate();
            deleteImage = connection.prepareStatement("UPDATE Customers SET ImageExtension=NULL  WHERE CUSID=" +res+ "");
            deleteImage.executeUpdate();
            deleteImage.close();
            element("BMKCustomersForm");
	} catch (SQLException e) {e.printStackTrace();}
    }
    
    public static void getElements() throws SQLException{
        int res = idCustomer();
        ResultSet result = query("SELECT * FROM Customers JOIN Consoles ON Consoles.CONID=Customers.CUSID WHERE CUSID=" +res+ "");
		
        while (result.next()) {
            CustomerEditBodyXboxDataForm.t_FirstName.setText(result.getString("Firstname"));
            CustomerEditBodyXboxDataForm.t_LastName.setText(result.getString("Lastname"));
            CustomerEditBodyXboxDataForm.t_Pseudo.setText(result.getString("Pseudo"));
            CustomerEditBodyXboxDataForm.t_Email.setText(result.getString("Email"));
            CustomerEditBodyXboxDataForm.t_Address.setText(result.getString("Address"));
            CustomerEditBodyXboxDataForm.t_Comment.setText(result.getString("Comment"));
            CustomerEditBodyXboxDataForm.t_CPU_KEY.setText(result.getString("CpuKey"));
            CustomerEditBodyXboxDataForm.t_DVD_KEY.setText(result.getString("DvdKey"));
            CustomerEditBodyXboxDataForm.t_Dash_Version_Now.setText(result.getString("DashVersionNow"));
            CustomerEditBodyXboxDataForm.jc_Dash_Version_Hack.setSelectedItem(result.getString("DashVersionHack"));
            CustomerEditBodyXboxDataForm.t_ConsoleType.setText(result.getString("ConsoleType"));
            CustomerEditBodyXboxDataForm.jc_ModChip.setSelectedItem(result.getString("ModChip"));
            CustomerEditBodyXboxDataForm.jc_DualNand.setSelectedItem(result.getString("DualNand"));
            CustomerEditBodyXboxDataForm.jc_Hack.setSelectedItem(result.getString("Hack"));                               
            CustomerEditBodyXboxDataForm.t_CB_Version.setText(result.getString("CBVersion"));
            CustomerEditBodyXboxDataForm.t_MFR_Date.setText(result.getString("MFRDate"));
            CustomerEditBodyXboxDataForm.t_Console_ID.setText(result.getString("ConsoleID"));
            CustomerEditBodyXboxDataForm.t_Serial.setText(result.getString("Serial"));
            CustomerEditBodyXboxDataForm.t_Region.setText(result.getString("Region"));
            CustomerEditBodyXboxDataForm.t_OSIG.setText(result.getString("OSIG")); 
            CustomerEditBodyXboxDataForm.jc_BigBlock_BB.setSelectedItem(result.getString("BigBlock"));
            CustomerEditBodyXboxDataForm.jc_BadBlock_BB.setSelectedItem(result.getString("BadBlock"));
            CustomerEditBodyXboxDataForm.jc_LDV.setSelectedItem(result.getString("LDV"));
            CustomerEditBodyXboxDataForm.t_FCRT.setText(result.getString("FCRT"));
            CustomerEditBodyXboxDataForm.jc_Flash_Drive.setSelectedItem(result.getString("FlashDrive"));
            CustomerEditBodyXboxDataForm.jc_Flash_Drive_Type.setSelectedItem(result.getString("FlashDriveType"));
            CustomerEditBodyXboxDataForm.jc_Drive_Type.setSelectedItem(result.getString("DriveType"));                                
                                
            if("False".equals(result.getString("FCRT"))){
                CustomerEditBodyXboxDataForm.t_FCRT.setForeground(Color.GREEN);
            }else{
                CustomerEditBodyXboxDataForm.t_FCRT.setForeground(Color.RED);
            }
        }
    }
    
    public static void addCustomer() throws SQLException{
	try {                      
            PreparedStatement insertCustomer;
            insertCustomer = connection.prepareStatement("INSERT INTO Customers (Firstname,Lastname,Email,Pseudo,Address,Comment,Image,ImageExtension) VALUES(?,?,?,?,?,?,?,?)");
            insertCustomer.setString(1, CustomerForm.Getfirstname());
            insertCustomer.setString(2, CustomerForm.Getlastname().toUpperCase());
            insertCustomer.setString(3, CustomerForm.Getemail().toLowerCase());
            insertCustomer.setString(4, CustomerForm.Getpseudo());
            insertCustomer.setString(5, CustomerForm.Getaddress());
            insertCustomer.setString(6, "");
            insertCustomer.setString(7, "");
            insertCustomer.setString(8, "");
            insertCustomer.executeUpdate();

            insertCustomer = connection.prepareStatement("INSERT INTO Consoles (CpuKey,DvdKey,DashVersionNow,DashVersionHack,ConsoleType,ModChip,DualNand,Hack,CBVersion,MFRDate,ConsoleID,Serial,Region,OSIG,BigBlock,BadBlock,LDV,FCRT,FlashDrive,FlashDriveType,DriveType) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            insertCustomer.setString(1, CustomerForm.Getcpukey());
            insertCustomer.setString(2, CustomerForm.Getdvdkey());
            insertCustomer.setString(3, CustomerForm.Getdashnow());
            insertCustomer.setString(4, CustomerForm.Getdashhack().toString());
            insertCustomer.setString(5, CustomerForm.Getconsoletype());
            insertCustomer.setString(6, CustomerForm.Getmodchip().toString());
            insertCustomer.setString(7, CustomerForm.Getdualnand().toString());
            insertCustomer.setString(8, CustomerForm.Gethack().toString());
            insertCustomer.setString(9, CustomerForm.Getcbversion());
            insertCustomer.setString(10, CustomerForm.Getmfrdate());
            insertCustomer.setString(11, CustomerForm.Getconsoleid());
            insertCustomer.setString(12, CustomerForm.Getserial());
            insertCustomer.setString(13, CustomerForm.Getregion());
            insertCustomer.setString(14, CustomerForm.Getosig());
            insertCustomer.setString(15, CustomerForm.Getbigblock().toString());
            insertCustomer.setString(16, CustomerForm.Getbadblock().toString());
            insertCustomer.setString(17, CustomerForm.Getldv().toString());
            insertCustomer.setString(18, CustomerForm.Getfcrt());
            insertCustomer.setString(19, CustomerForm.Getflashdrive().toString());
            insertCustomer.setString(20, CustomerForm.Getflashdrivetype().toString());
            insertCustomer.setString(21, CustomerForm.Getdrivetype().toString());
            insertCustomer.executeUpdate();
            insertCustomer.close();
        } catch (SQLException e) {e.printStackTrace();}
    }
        
    public static void updateCustomer() throws SQLException{		
	try {                       
            int res = idCustomer();
            PreparedStatement updateCustomerInfo;                    
            updateCustomerInfo = connection.prepareStatement("UPDATE Customers SET Firstname=\"" +CustomerEditBodyXboxDataForm.EditbodyGetfirstname()+ "\"  WHERE CUSID=" +res+ "");
            updateCustomerInfo.executeUpdate();
            updateCustomerInfo = connection.prepareStatement("UPDATE Customers SET Lastname=\"" +CustomerEditBodyXboxDataForm.EditbodyGetlastname().toUpperCase()+ "\"  WHERE CUSID=" +res+ "");
            updateCustomerInfo.executeUpdate();
            updateCustomerInfo = connection.prepareStatement("UPDATE Customers SET Email=\"" +CustomerEditBodyXboxDataForm.EditbodyGetemail().toLowerCase()+ "\"  WHERE CUSID=" +res+ "");
            updateCustomerInfo.executeUpdate();
            updateCustomerInfo = connection.prepareStatement("UPDATE Customers SET Pseudo=\"" +CustomerEditBodyXboxDataForm.EditbodyGetpseudo()+ "\"  WHERE CUSID=" +res+ "");                            
            updateCustomerInfo.executeUpdate();
            updateCustomerInfo = connection.prepareStatement("UPDATE Customers SET Address=\"" +CustomerEditBodyXboxDataForm.EditbodyGetaddress()+ "\"  WHERE CUSID=" +res+ "");
            updateCustomerInfo.executeUpdate();
            updateCustomerInfo = connection.prepareStatement("UPDATE Customers SET Comment=\"" +CustomerEditBodyXboxDataForm.GetComment()+ "\"  WHERE CUSID=" +res+ "");
            updateCustomerInfo.executeUpdate();
            updateCustomerInfo = connection.prepareStatement("UPDATE Consoles SET CpuKey=\"" +CustomerEditBodyXboxDataForm.EditxboxGetcpukey()+ "\"  WHERE CONID=" +res+ "");
            updateCustomerInfo.executeUpdate();
            updateCustomerInfo = connection.prepareStatement("UPDATE Consoles SET DvdKey=\"" +CustomerEditBodyXboxDataForm.EditxboxGetdvdkey()+ "\"  WHERE CONID=" +res+ "");
            updateCustomerInfo.executeUpdate();
            updateCustomerInfo = connection.prepareStatement("UPDATE Consoles SET DashVersionNow=\"" +CustomerEditBodyXboxDataForm.EditxboxGetdashnow()+ "\"  WHERE CONID=" +res+ "");
            updateCustomerInfo.executeUpdate();
            updateCustomerInfo = connection.prepareStatement("UPDATE Consoles SET DashVersionHack=\"" +CustomerEditBodyXboxDataForm.EditxboxGetdashhack()+ "\"  WHERE CONID=" +res+ "");
            updateCustomerInfo.executeUpdate();
            updateCustomerInfo = connection.prepareStatement("UPDATE Consoles SET ConsoleType=\"" +CustomerEditBodyXboxDataForm.EditxboxGetconsoletype()+ "\"  WHERE CONID=" +res+ "");
            updateCustomerInfo.executeUpdate();
            updateCustomerInfo = connection.prepareStatement("UPDATE Consoles SET ModChip=\"" +CustomerEditBodyXboxDataForm.EditxboxGetmodchip()+ "\"  WHERE CONID=" +res+ "");
            updateCustomerInfo.executeUpdate();
            updateCustomerInfo = connection.prepareStatement("UPDATE Consoles SET DualNand=\"" +CustomerEditBodyXboxDataForm.EditxboxGetdualnand()+ "\"  WHERE CONID=" +res+ "");
            updateCustomerInfo.executeUpdate();
            updateCustomerInfo = connection.prepareStatement("UPDATE Consoles SET Hack=\"" +CustomerEditBodyXboxDataForm.EditxboxGethack()+ "\"  WHERE CONID=" +res+ "");
            updateCustomerInfo.executeUpdate();
            updateCustomerInfo = connection.prepareStatement("UPDATE Consoles SET CBVersion=\"" +CustomerEditBodyXboxDataForm.EditxboxGetcbversion()+ "\"  WHERE CONID=" +res+ "");
            updateCustomerInfo.executeUpdate();
            updateCustomerInfo = connection.prepareStatement("UPDATE Consoles SET MFRDate=\"" +CustomerEditBodyXboxDataForm.EditxboxGetmfrdate()+ "\"  WHERE CONID=" +res+ "");
            updateCustomerInfo.executeUpdate();
            updateCustomerInfo = connection.prepareStatement("UPDATE Consoles SET ConsoleID=\"" +CustomerEditBodyXboxDataForm.EditxboxGetconsoleid()+ "\"  WHERE CONID=" +res+ "");
            updateCustomerInfo.executeUpdate();
            updateCustomerInfo = connection.prepareStatement("UPDATE Consoles SET Serial=\"" +CustomerEditBodyXboxDataForm.EditxboxGetserial()+ "\"  WHERE CONID=" +res+ "");
            updateCustomerInfo.executeUpdate();
            updateCustomerInfo = connection.prepareStatement("UPDATE Consoles SET Region=\"" +CustomerEditBodyXboxDataForm.EditxboxGetregion()+ "\"  WHERE CONID=" +res+ "");
            updateCustomerInfo.executeUpdate();
            updateCustomerInfo = connection.prepareStatement("UPDATE Consoles SET OSIG=\"" +CustomerEditBodyXboxDataForm.EditxboxGetosig()+ "\"  WHERE CONID=" +res+ "");
            updateCustomerInfo.executeUpdate();
            updateCustomerInfo = connection.prepareStatement("UPDATE Consoles SET BigBlock=\"" +CustomerEditBodyXboxDataForm.EditxboxGetbigblock()+ "\"  WHERE CONID=" +res+ "");
            updateCustomerInfo.executeUpdate();
            updateCustomerInfo = connection.prepareStatement("UPDATE Consoles SET BadBlock=\"" +CustomerEditBodyXboxDataForm.EditxboxGetbadblock()+ "\"  WHERE CONID=" +res+ "");
            updateCustomerInfo.executeUpdate();
            updateCustomerInfo = connection.prepareStatement("UPDATE Consoles SET LDV=\"" +CustomerEditBodyXboxDataForm.EditxboxGetldv()+ "\"  WHERE CONID=" +res+ "");
            updateCustomerInfo.executeUpdate();
            updateCustomerInfo = connection.prepareStatement("UPDATE Consoles SET FCRT=\"" +CustomerEditBodyXboxDataForm.EditxboxGetfcrt()+ "\"  WHERE CONID=" +res+ "");
            updateCustomerInfo.executeUpdate();
            updateCustomerInfo = connection.prepareStatement("UPDATE Consoles SET FlashDrive=\"" +CustomerEditBodyXboxDataForm.EditxboxGetflashdrive()+ "\"  WHERE CONID=" +res+ "");
            updateCustomerInfo.executeUpdate();
            updateCustomerInfo = connection.prepareStatement("UPDATE Consoles SET FlashDriveType=\"" +CustomerEditBodyXboxDataForm.EditxboxGetflashdrivetype()+ "\"  WHERE CONID=" +res+ "");
            updateCustomerInfo.executeUpdate();
            updateCustomerInfo = connection.prepareStatement("UPDATE Consoles SET DriveType=\"" +CustomerEditBodyXboxDataForm.EditxboxGetdrivetype()+ "\"  WHERE CONID=" +res+ "");
            updateCustomerInfo.executeUpdate();
            updateCustomerInfo.close();                    
	} catch (SQLException e) {e.printStackTrace();}
    }
    
    public static void initAppOptions() throws SQLException{       
	try {                      
            PreparedStatement initAllOptions;
            initAllOptions = connection.prepareStatement("INSERT INTO AppOptions (Base,EditBodyXboxData,Mail,AddCustomers,Options,Display,PassWordApp,TechMail,EmailPassWord,SMTP,PORT) VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            initAllOptions.setString(1, "YES");
            initAllOptions.setString(2, "YES");
            initAllOptions.setString(3, "YES");
            initAllOptions.setString(4, "YES");
            initAllOptions.setString(5, "YES");
            initAllOptions.setString(6, "ENABLE");
            initAllOptions.setString(7, "");
            initAllOptions.setString(8, "");
            initAllOptions.setString(9, "");
            initAllOptions.setString(10, "");
            initAllOptions.setString(11, "");
            initAllOptions.executeUpdate();
            
            initAllOptions = connection.prepareStatement("INSERT INTO ComboBoxOptions (DashVersionHack,Modchip,DualNand,Hack,DriveType,FlashDriveType) VALUES(?,?,?,?,?,?)");
            initAllOptions.setString(1, "");
            initAllOptions.setString(2, "");
            initAllOptions.setString(3, "");
            initAllOptions.setString(4, "");
            initAllOptions.setString(5, "");
            initAllOptions.setString(6, "");
            initAllOptions.executeUpdate();
            
            initAllOptions = connection.prepareStatement("INSERT INTO LabelOptions (CustomersList,CpuKey,DvdKey,DashVersionNow,DashVersionHack,ConsoleType,ModChip,DualNand,Hack,CBVersion,MFRDate,ConsoleID,Serial,Region,OSIG,BigBlock,BadBlock,LDV,FCRT,FlashDrive,Comment,FirstName,LastName,Pseudo,EMail,Address,SaveBodyXboxData,WarningMessage,MailTechnician,MailPasswordTech,MailCustomer,MailSubject,MailAttachment,SendMail,btallcolor) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            initAllOptions.setString(1, "0,102,102");
            initAllOptions.setString(2, "153,0,153");
            initAllOptions.setString(3, "153,0,153");
            initAllOptions.setString(4, "0,102,0");
            initAllOptions.setString(5, "0,102,0");
            initAllOptions.setString(6, "0,102,0");
            initAllOptions.setString(7, "0,102,0");
            initAllOptions.setString(8, "0,102,0");
            initAllOptions.setString(9, "0,102,0");
            initAllOptions.setString(10, "0,102,0");
            initAllOptions.setString(11, "0,102,0");
            initAllOptions.setString(12, "0,102,0");
            initAllOptions.setString(13, "0,102,0");
            initAllOptions.setString(14, "0,102,0");
            initAllOptions.setString(15, "0,102,0");
            initAllOptions.setString(16, "0,102,0");
            initAllOptions.setString(17, "0,102,0");
            initAllOptions.setString(18, "0,102,0");
            initAllOptions.setString(19, "0,102,0");
            initAllOptions.setString(20, "0,102,0");
            initAllOptions.setString(21, "0,102,0");
            initAllOptions.setString(22, "51,0,102");
            initAllOptions.setString(23, "51,0,102");
            initAllOptions.setString(24, "51,0,102");
            initAllOptions.setString(25, "51,0,102");
            initAllOptions.setString(26, "51,0,102");
            initAllOptions.setString(27, "0,102,0");
            initAllOptions.setString(28, "153,0,0");
            initAllOptions.setString(29, "0,102,0");
            initAllOptions.setString(30, "0,102,0");
            initAllOptions.setString(31, "0,102,0");
            initAllOptions.setString(32, "0,102,0");
            initAllOptions.setString(33, "0,102,102");
            initAllOptions.setString(34, "0,102,102");
            initAllOptions.setString(35, "");
            initAllOptions.executeUpdate();
            
            initAllOptions = connection.prepareStatement("INSERT INTO TextFieldOptions (CpuKey,DvdKey,DashVersionNow,DashVersionHack,ConsoleType,ModChip,DualNand,Hack,CBVersion,MFRDate,ConsoleID,Serial,Region,OSIG,BigBlock,BadBlock,LDV,FCRT,FlashDrive,FlashDriveType,DriveType,Comment,FirstName,LastName,Pseudo,EMail,Address,MailTechnician,MailPasswordTech,MailCustomer,MailSubject,MailArea,btallcolor) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            initAllOptions.setString(1, "153,0,153");
            initAllOptions.setString(2, "153,0,153");
            initAllOptions.setString(3, "0,0,0");
            initAllOptions.setString(4, "0,0,0");
            initAllOptions.setString(5, "0,0,0");
            initAllOptions.setString(6, "0,0,0");
            initAllOptions.setString(7, "0,0,0");
            initAllOptions.setString(8, "0,0,0");
            initAllOptions.setString(9, "0,0,0");
            initAllOptions.setString(10, "0,0,0");
            initAllOptions.setString(11, "0,0,0");
            initAllOptions.setString(12, "0,0,0");
            initAllOptions.setString(13, "0,0,0");
            initAllOptions.setString(14, "0,0,0");
            initAllOptions.setString(15, "0,0,0");
            initAllOptions.setString(16, "0,0,0");
            initAllOptions.setString(17, "0,0,0");
            initAllOptions.setString(18, "0,0,0");
            initAllOptions.setString(19, "0,0,0");
            initAllOptions.setString(20, "0,0,0");
            initAllOptions.setString(21, "0,0,0");
            initAllOptions.setString(22, "0,0,0");
            initAllOptions.setString(23, "0,0,0");
            initAllOptions.setString(24, "0,0,0");
            initAllOptions.setString(25, "0,0,0");
            initAllOptions.setString(26, "0,0,0");
            initAllOptions.setString(27, "0,0,0");
            initAllOptions.setString(28, "0,0,0");
            initAllOptions.setString(29, "0,0,0");
            initAllOptions.setString(30, "0,0,0");
            initAllOptions.setString(31, "0,0,0");
            initAllOptions.setString(32, "0,0,0");
            initAllOptions.setString(33, "");
            initAllOptions.executeUpdate();
            initAllOptions.close();         
        } catch (SQLException e) {e.printStackTrace();}
    }
    
    public static void updateOptions() throws SQLException, IOException, URISyntaxException{		
	try {        
            PreparedStatement updateOptions;                    
            updateOptions = connection.prepareStatement("UPDATE AppOptions SET Base=\"" +OptionsForm.CB_Base.getSelectedItem()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE AppOptions SET EditBodyXboxData=\"" +OptionsForm.CB_EditBodyXbox.getSelectedItem()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE AppOptions SET Mail=\"" +OptionsForm.CB_Mail.getSelectedItem()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE AppOptions SET AddCustomers=\"" +OptionsForm.CB_Customer.getSelectedItem()+ "\"");                            
            updateOptions.executeUpdate();
            
            updateOptions = connection.prepareStatement("UPDATE AppOptions SET Options=\"" +OptionsForm.CB_Options.getSelectedItem()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE AppOptions SET Display=\"" +OptionsForm.CB_Display.getSelectedItem()+ "\"");
            updateOptions.executeUpdate();  
            String str2 = new String(OptionsForm.t_AppPassword.getPassword());
            updateOptions = connection.prepareStatement("UPDATE AppOptions SET PassWordApp=\"" +str2+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE AppOptions SET TechMail=\"" +OptionsForm.t_EmailTechnician.getText()+ "\"");
            updateOptions.executeUpdate();
            String str = new String(OptionsForm.t_EmailPassWord.getPassword());
            updateOptions = connection.prepareStatement("UPDATE AppOptions SET EmailPassWord=\"" +str+ "\"");
            updateOptions.executeUpdate();           
            updateOptions = connection.prepareStatement("UPDATE AppOptions SET SMTP=\"" +OptionsForm.t_SMTP_ADDRESS.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE AppOptions SET PORT=\"" +OptionsForm.t_SMTP_PORT.getText()+ "\"");                            
            updateOptions.executeUpdate();
    
            updateOptions = connection.prepareStatement("UPDATE ComboBoxOptions SET DashVersionHack=\"" +OptionsForm.tcb_Dash_Version_Hack.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE ComboBoxOptions SET Modchip=\"" +OptionsForm.tcb_ModChip.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE ComboBoxOptions SET DualNand=\"" +OptionsForm.tcb_DualNand.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE ComboBoxOptions SET Hack=\"" +OptionsForm.tcb_Hack.getText()+ "\"");                            
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE ComboBoxOptions SET DriveType=\"" +OptionsForm.tcb_Drive_Type.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE ComboBoxOptions SET FlashDriveType=\"" +OptionsForm.tcb_Flash_Drive_Type.getText()+ "\"");
            updateOptions.executeUpdate();
            
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET CustomersList=\"" +OptionsForm.t_CustomersList.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET CpuKey=\"" +OptionsForm.t_CPU_KEY.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET DvdKey=\"" +OptionsForm.t_DVD_KEY.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET DashVersionNow=\"" +OptionsForm.t_Dash_Version_Now.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET DashVersionHack=\"" +OptionsForm.t_Dash_Version_Hack.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET ConsoleType=\"" +OptionsForm.t_Console_Type.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET ModChip=\"" +OptionsForm.t_ModChip.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET DualNand=\"" +OptionsForm.t_DualNand.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET Hack=\"" +OptionsForm.t_Hack.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET CBVersion=\"" +OptionsForm.t_CB_Version.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET MFRDate=\"" +OptionsForm.t_MFR_Date.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET ConsoleID=\"" +OptionsForm.t_Console_ID.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET Serial=\"" +OptionsForm.t_Serial.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET Region=\"" +OptionsForm.t_Region.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET OSIG=\"" +OptionsForm.t_OSIG.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET BigBlock=\"" +OptionsForm.t_BigBlock.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET BadBlock=\"" +OptionsForm.t_BadBlock.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET LDV=\"" +OptionsForm.t_LDV.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET FCRT=\"" +OptionsForm.t_FCRT.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET FlashDrive=\"" +OptionsForm.t_FlashDrive.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET Comment=\"" +OptionsForm.t_Comment.getText()+ "\"");
            updateOptions.executeUpdate();           
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET FirstName=\"" +OptionsForm.t_First_Name.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET LastName=\"" +OptionsForm.t_Last_Name.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET Pseudo=\"" +OptionsForm.t_Pseudo.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET EMail=\"" +OptionsForm.t_Email.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET Address=\"" +OptionsForm.t_Address.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET SaveBodyXboxData=\"" +OptionsForm.t_SaveBodyXboxData.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET WarningMessage=\"" +OptionsForm.t_WarningMessage.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET MailTechnician=\"" +OptionsForm.t_MailTechnician.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET MailPasswordTech=\"" +OptionsForm.t_MailPassWord.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET MailCustomer=\"" +OptionsForm.t_MailCustomer.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET MailSubject=\"" +OptionsForm.t_Subject.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET MailAttachment=\"" +OptionsForm.t_Attachment.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET SendMail=\"" +OptionsForm.t_SendMail.getText()+ "\"");
            updateOptions.executeUpdate();    
            updateOptions = connection.prepareStatement("UPDATE LabelOptions SET btallcolor=\"" +OptionsForm.jbl_t_All_color+ "\"");
            updateOptions.executeUpdate();
            
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET CpuKey=\"" +OptionsForm.tf_CPU_KEY.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET DvdKey=\"" +OptionsForm.tf_DVD_KEY.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET DashVersionNow=\"" +OptionsForm.tf_Dash_Version_Now.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET DashVersionHack=\"" +OptionsForm.tf_Dash_Version_Hack.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET ConsoleType=\"" +OptionsForm.tf_Console_Type.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET ModChip=\"" +OptionsForm.tf_ModChip.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET DualNand=\"" +OptionsForm.tf_DualNand.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET Hack=\"" +OptionsForm.tf_Hack.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET CBVersion=\"" +OptionsForm.tf_CB_Version.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET MFRDate=\"" +OptionsForm.tf_MFR_Date.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET ConsoleID=\"" +OptionsForm.tf_Console_ID.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET Serial=\"" +OptionsForm.tf_Serial.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET Region=\"" +OptionsForm.tf_Region.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET OSIG=\"" +OptionsForm.tf_OSIG.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET BigBlock=\"" +OptionsForm.tf_BigBlock.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET BadBlock=\"" +OptionsForm.tf_BadBlock.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET LDV=\"" +OptionsForm.tf_LDV.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET FCRT=\"" +OptionsForm.tf_FCRT.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET FlashDrive=\"" +OptionsForm.tf_Flash_Drive.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET FlashDriveType=\"" +OptionsForm.tf_Flash_Drive_Type.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET DriveType=\"" +OptionsForm.tf_Drive_Type.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET Comment=\"" +OptionsForm.tf_Comment.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET FirstName=\"" +OptionsForm.tf_First_Name.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET LastName=\"" +OptionsForm.tf_Last_Name.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET Pseudo=\"" +OptionsForm.tf_Pseudo.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET EMail=\"" +OptionsForm.tf_Email.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET Address=\"" +OptionsForm.tf_Address.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET MailTechnician=\"" +OptionsForm.tf_MailTechnician.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET MailPasswordTech=\"" +OptionsForm.tf_MailPassWord.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET MailCustomer=\"" +OptionsForm.tf_MailCustomer.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET MailSubject=\"" +OptionsForm.tf_Subject.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET MailArea=\"" +OptionsForm.tf_MailArea.getText()+ "\"");
            updateOptions.executeUpdate();
            updateOptions = connection.prepareStatement("UPDATE TextFieldOptions SET btallcolor=\"" +OptionsForm.jbt_tf_All_color+ "\"");
            updateOptions.executeUpdate();
            updateOptions.close();  
            BackgroundProgressBar.restartApplication();
	} catch (SQLException e) {e.printStackTrace();}        
    }
    
    public static void getElementsOptions() throws SQLException{
        ResultSet result;        
	try {                                     
            result = query("SELECT * FROM AppOptions");
                while (result.next()) {
                    ImageBase = result.getString("Base");
                    ImageEditBodyXbox = result.getString("EditBodyXboxData");
                    ImageMail = result.getString("Mail");
                    ImageCustomer = result.getString("AddCustomers");                   
                    ImageOptions = result.getString("Options");
                    Display = result.getString("Display");
                    t_AppPassword = result.getString("PassWordApp");
                    t_EmailTechnician = result.getString("TechMail");
                    t_EmailPassWord = result.getString("EmailPassWord");                   
                    t_SMTP_ADDRESS = result.getString("SMTP");
                    t_SMTP_PORT = result.getString("PORT");
                }
            
            result = query("SELECT * FROM ComboBoxOptions");
                while (result.next()) {
                    CB_DashVersionHack = result.getString("DashVersionHack");
                    CB_ModChip = result.getString("Modchip");
                    CB_DualNand = result.getString("DualNand");
                    CB_Hack = result.getString("Hack");
                    CB_DriveType = result.getString("DriveType");
                    CB_FlashDriveType = result.getString("FlashDriveType");
                }
            
            result = query("SELECT * FROM LabelOptions");
                while (result.next()) {
                    CustomersList = result.getString("CustomersList");
                    CPU_KEY = result.getString("CpuKey");
                    DVD_KEY = result.getString("DvdKey");
                    Dash_Version_Now = result.getString("DashVersionNow");
                    Dash_Version_Hack = result.getString("DashVersionHack");
                    Console_Type = result.getString("ConsoleType");
                    ModChip = result.getString("ModChip");
                    DualNand = result.getString("DualNand");
                    Hack = result.getString("Hack");
                    CB_Version = result.getString("CBVersion");
                    MFR_Date = result.getString("MFRDate");
                    Console_ID = result.getString("ConsoleID");
                    Serial = result.getString("Serial");
                    Region = result.getString("Region");
                    OSIG = result.getString("OSIG");
                    BigBlock_BB = result.getString("BigBlock");
                    BadBlock_BB = result.getString("BadBlock");
                    LDV = result.getString("LDV");
                    FCRT = result.getString("FCRT");
                    Flash_Drive = result.getString("FlashDrive");
                    Comment = result.getString("Comment");                   
                    FirstName = result.getString("FirstName");
                    LastName = result.getString("LastName");           
                    pseudo = result.getString("Pseudo");
                    email = result.getString("EMail");
                    address = result.getString("Address");
                    jb_SaveBodyXboxData = result.getString("SaveBodyXboxData");
                    l_WarningMessage = result.getString("WarningMessage");
                    MailTechnician = result.getString("MailTechnician");
                    MailPassWord = result.getString("MailPasswordTech");
                    MailCustomer = result.getString("MailCustomer");
                    Subject = result.getString("MailSubject");
                    jb_Attachment = result.getString("MailAttachment");            
                    jb_SendMail = result.getString("SendMail");
                    jb_t_AllColor = result.getString("btallcolor");                   
                }
            
            result = query("SELECT * FROM TextFieldOptions");
                while (result.next()) {
                    t_CPU_KEY = result.getString("CpuKey");
                    t_DVD_KEY = result.getString("DvdKey");
                    t_Dash_Version_Now = result.getString("DashVersionNow");
                    t_Dash_Version_Hack = result.getString("DashVersionHack");
                    t_Console_Type = result.getString("ConsoleType");
                    t_ModChip = result.getString("ModChip");
                    t_DualNand = result.getString("DualNand");
                    t_Hack = result.getString("Hack");
                    t_CB_Version = result.getString("CBVersion");
                    t_MFR_Date = result.getString("MFRDate");
                    t_Console_ID = result.getString("ConsoleID");
                    t_Serial = result.getString("Serial");
                    t_Region = result.getString("Region");
                    t_OSIG = result.getString("OSIG");
                    t_BigBlock_BB = result.getString("BigBlock");
                    t_BadBlock_BB = result.getString("BadBlock");
                    t_LDV = result.getString("LDV");
                    t_FCRT = result.getString("FCRT");
                    t_Flash_Drive = result.getString("FlashDrive");
                    t_Flash_Drive_Type = result.getString("FlashDriveType");
                    t_Drive_Type = result.getString("DriveType");
                    t_Comment = result.getString("Comment");
                    t_FirstName = result.getString("FirstName");
                    t_LastName = result.getString("LastName");
                    t_pseudo = result.getString("Pseudo");
                    t_email = result.getString("EMail");
                    t_address = result.getString("Address");
                    t_MailTechnician = result.getString("MailTechnician");
                    t_MailPassWord = result.getString("MailPasswordTech");
                    t_MailCustomer = result.getString("MailCustomer");           
                    t_Subject = result.getString("MailSubject");                    
                    jta_Area = result.getString("MailArea");
                    jb_tf_AllColor = result.getString("btallcolor");
                } 
                OptionsForm.jbl_t_All_color = jb_t_AllColor;
                OptionsForm.jbt_tf_All_color = jb_tf_AllColor;
        } catch (SQLException e) {e.printStackTrace();}
    }
    
    public static void alterTables() throws SQLException{
	try {                      
            PreparedStatement alterTables;
            alterTables = connection.prepareStatement("ALTER TABLE Customers ADD COLUMN Image BLOB");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("ALTER TABLE Customers ADD COLUMN ImageExtension VARCHAR(256)");
            alterTables.executeUpdate();
            
            alterTables = connection.prepareStatement("ALTER TABLE LabelOptions RENAME FistName TO Firstname");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("ALTER TABLE LabelOptions DROP COLUMN SavesCustomer");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("ALTER TABLE LabelOptions DROP COLUMN SaveXboxData");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("ALTER TABLE LabelOptions DROP COLUMN KVInfo");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("ALTER TABLE LabelOptions RENAME SaveBodyData TO SaveBodyXboxData");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("ALTER TABLE LabelOptions ADD COLUMN btallcolor VARCHAR(12)");
            alterTables.executeUpdate();
            
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET CustomersList='0,102,102'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET CpuKey='153,0,153'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET DvdKey='153,0,153'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET DashVersionNow='0,102,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET DashVersionHack='0,102,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET ConsoleType='0,102,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET ModChip='0,102,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET DualNand='0,102,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET Hack='0,102,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET CBVersion='0,102,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET MFRDate='0,102,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET ConsoleID='0,102,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET Serial='0,102,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET Region='0,102,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET OSIG='0,102,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET BigBlock='0,102,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET BadBlock='0,102,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET LDV='0,102,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET FCRT='0,102,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET FlashDrive='0,102,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET Comment='0,102,0'");
            alterTables.executeUpdate();           
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET FirstName='51,0,102'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET LastName='51,0,102'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET Pseudo='51,0,102'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET EMail='51,0,102'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET Address='51,0,102'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET SaveBodyXboxData='0,102,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET WarningMessage='153,0,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET MailTechnician='0,102,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET MailPasswordTech='0,102,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET MailCustomer='0,102,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET MailSubject='0,102,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET MailAttachment='0,102,102'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE LabelOptions SET SendMail='0,102,102'");
            alterTables.executeUpdate();
            
            alterTables = connection.prepareStatement("ALTER TABLE TextFieldOptions RENAME FistName TO Firstname");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("ALTER TABLE TextFieldOptions ADD COLUMN btallcolor VARCHAR(12)");
            alterTables.executeUpdate();
            
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET CpuKey='153,0,153'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET DvdKey='153,0,153'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET DashVersionNow='0,0,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET DashVersionHack='0,0,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET ConsoleType='0,0,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET ModChip='0,0,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET DualNand='0,0,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET Hack='0,0,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET CBVersion='0,0,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET MFRDate='0,0,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET ConsoleID='0,0,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET Serial='0,0,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET Region='0,0,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET OSIG='0,0,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET BigBlock='0,0,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET BadBlock='0,0,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET LDV='0,0,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET FCRT='0,0,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET FlashDrive='0,0,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET FlashDriveType='0,0,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET DriveType='0,0,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET Comment='0,0,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET FirstName='0,0,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET LastName='0,0,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET Pseudo='0,0,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET EMail='0,0,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET Address='0,0,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET MailTechnician='0,0,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET MailPasswordTech='0,0,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET MailCustomer='0,0,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET MailSubject='0,0,0'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE TextFieldOptions SET MailArea='0,0,0'");
            alterTables.executeUpdate();
            
            alterTables = connection.prepareStatement("ALTER TABLE AppOptions RENAME EditBodyData TO EditBodyXboxData");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("ALTER TABLE AppOptions DROP COLUMN EditXboxData");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("ALTER TABLE AppOptions ADD COLUMN Options VARCHAR(3)");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("ALTER TABLE AppOptions ADD COLUMN EmailPassWord VARCHAR(30)");
            alterTables.executeUpdate();
            
            alterTables = connection.prepareStatement("UPDATE AppOptions SET Base='YES'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE AppOptions SET EditBodyXboxData='YES'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE AppOptions SET Mail='YES'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE AppOptions SET AddCustomers='YES'");                            
            alterTables.executeUpdate();            
            alterTables = connection.prepareStatement("UPDATE AppOptions SET Options='YES'");
            alterTables.executeUpdate();
            alterTables = connection.prepareStatement("UPDATE AppOptions SET Display='ENABLE'");
            alterTables.executeUpdate();             
            alterTables.close();
        } catch (SQLException e) {e.printStackTrace();}
    }
    
    public static void CustomersXMLtoBDD(String file) throws IOException, URISyntaxException{
        Readxml(file);
        ElementFilter filter = new ElementFilter("civil"); 
        try { 
            if(racine.getChild("civil") != null){
                PreparedStatement insertCustomer;
                insertCustomer = connection.prepareStatement("INSERT INTO Customers (Firstname,Lastname,Email,Pseudo,Address,Comment,Image,ImageExtension) VALUES(?,?,?,?,?,?,?,?)");
                for(Element c:racine.getDescendants(filter)){
                    insertCustomer.setString(1, c.getChild("FirstName").getText());
                    insertCustomer.setString(2, c.getChild("LastName").getText());
                    insertCustomer.setString(3, c.getChild("email").getText());
                    insertCustomer.setString(4, c.getChild("pseudo").getText());
                    insertCustomer.setString(5, c.getChild("address").getText());
                    insertCustomer.setString(6, c.getChild("Comment").getText());
                    insertCustomer.setString(7, "");
                    insertCustomer.setString(8, "");
                    insertCustomer.executeUpdate();
                }
     
                for(Element c:racine.getDescendants(filter)){
                    insertCustomer = connection.prepareStatement("INSERT INTO Consoles (CpuKey,DvdKey,DashVersionNow,DashVersionHack,ConsoleType,ModChip,DualNand,Hack,CBVersion,MFRDate,ConsoleID,Serial,Region,OSIG,BigBlock,BadBlock,LDV,FCRT,FlashDrive,FlashDriveType,DriveType) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                    insertCustomer.setString(1, c.getChild("CPU_KEY").getText());
                    insertCustomer.setString(2, c.getChild("DVD_KEY").getText());
                    insertCustomer.setString(3, c.getChild("Dash_Version_Now").getText());
                    insertCustomer.setString(4, c.getChild("Dash_Version_Hack").getText());
                    insertCustomer.setString(5, c.getChild("Console_Type").getText());
                    insertCustomer.setString(6, c.getChild("ModChip").getText());
                    insertCustomer.setString(7, c.getChild("DualNand").getText());
                    insertCustomer.setString(8, c.getChild("Hack").getText());
                    insertCustomer.setString(9, c.getChild("CB_Version").getText());
                    insertCustomer.setString(10, c.getChild("MFR_Date").getText());
                    insertCustomer.setString(11, c.getChild("Console_ID").getText());
                    insertCustomer.setString(12, c.getChild("Serial").getText());
                    insertCustomer.setString(13, c.getChild("Region").getText());
                    insertCustomer.setString(14, c.getChild("OSIG").getText());
                    insertCustomer.setString(15, c.getChild("BigBlock_BB").getText());
                    insertCustomer.setString(16, c.getChild("BadBlock_BB").getText());
                    insertCustomer.setString(17, c.getChild("LDV").getText());
                    insertCustomer.setString(18, c.getChild("FCRT").getText());
                    insertCustomer.setString(19, c.getChild("Flash_Drive").getText());
                    insertCustomer.setString(20, c.getChild("Flash_Drive_Type").getText());
                    insertCustomer.setString(21, c.getChild("Drive_Type").getText());
                    insertCustomer.executeUpdate();
                    insertCustomer.close();
                }
                BackgroundProgressBar.restartApplication();
            }else{
                JOptionPane.showMessageDialog(TabbedPane.frame, "Problem With Your XML File Maybe It's Not Customers.xml", "Error Customer XML",JOptionPane.OK_OPTION);
            }          
        } catch (SQLException e) { JOptionPane.showMessageDialog(TabbedPane.frame, "Problem With Your XML File Maybe LastName Already Exist", "Error Customer XML",JOptionPane.OK_OPTION); } 
    }
    
    private static void Readxml(String file) throws IOException {
        SAXBuilder xml = new SAXBuilder();
        try {
            document = xml.build(new File(file)); 
        } catch(Exception e){ JOptionPane.showMessageDialog(TabbedPane.frame, "Problem With Your XML File", "Error Customer XML",JOptionPane.OK_OPTION); }      
        racine = document.getRootElement();
    }
    
    public static void checkTablesExist() throws SQLException, IOException, URISyntaxException{       
        DatabaseMetaData dbm = connection.getMetaData();
        ResultSet tables = dbm.getTables(null, null, "Customers", null);
        if (!tables.next()) {
          createTable();
          initAppOptions();
        }else{
            String query = "SELECT COUNT(*) AS CNTREC FROM pragma_table_info('LabelOptions') WHERE name='btallcolor'";
            PreparedStatement pst = connection.prepareStatement(query);
            //PreparedStatement check;
            try (ResultSet rs = pst.executeQuery()) {
            // Only expecting a single result
                if (rs.next()) {
                    boolean found = rs.getBoolean(1); // "found" column
                    if (found) {
                        
                    } else {
                        Utils.CopyFile();
                        alterTables();
                    }
                }
            } catch ( SQLException e) {e.printStackTrace(); }
        }                
    }
    
    public static Boolean ElementVerifLastName(String LastName) throws IOException, SQLException{        
        boolean reponse = false;
        ResultSet result = query("SELECT Lastname FROM Customers");
            while (result.next()) {
                if(result.getString("Lastname").equals(LastName)){ reponse = true; }                           
            }       
        return reponse;             
    }
    
    private static int StringToInt(String STR) {
        int str = Integer.parseInt(STR);
        return str;
    }       
}
