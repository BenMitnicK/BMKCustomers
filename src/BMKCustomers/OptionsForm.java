/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BMKCustomers;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.CodeSource;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author BenMitnicK
 */
public class OptionsForm extends JPanel{

    /**
     * Creates new form Options
     * @throws java.io.IOException
     * @throws java.net.URISyntaxException
     */
    public OptionsForm() throws IOException, URISyntaxException {
        initComponents();
        GetColorTextLabel();
        GetColorTextTextField();
        GetBackgroungDisplay();
        GetComboBox();
        GetAppOptions();       
    }

    public static JComboBox<String> CB_Base;
    public static JComboBox<String> CB_Customer;
    public static JComboBox<String> CB_Display;
    public static JComboBox<String> CB_EditBodyXbox;
    public static JComboBox<String> CB_Mail;
    public static JComboBox<String> CB_Options;
    private JButton jbl_Last_Name;
    public static JButton jb_Reset;
    public static JButton jb_Save;
    private JButton jbl_t_All;
    private JButton jbt_tf_All;
    private JButton jbl_Address;
    private JButton jbl_BadBlock;
    private JButton jbl_BigBlock;
    private JButton jbl_CB_Version;
    private JButton jbl_CPU_KEY;
    private JButton jbl_Comment;
    private JButton jbl_Console_ID;
    private JButton jbl_Console_Type;
    private JButton jbl_CustomersList;
    private JButton jbl_DVD_KEY;
    private JButton jbl_Dash_Version_Hack;
    private JButton jbl_Dash_Version_Now;
    private JButton jbl_DualNand;
    private JButton jbl_Email;
    private JButton jbl_FCRT;
    private JButton jbl_First_Name;
    private JButton jbl_FlashDrive;
    private JButton jbl_Hack;
    private JButton jbl_LDV;
    private JButton jbl_MFR_Date;
    private JButton jbl_ModChip;
    private JButton jbl_OSIG;
    private JButton jbl_Pseudo;
    private JButton jbl_Region;
    private JButton jbl_SaveBodyXboxData;
    private JButton jbl_Serial;
    private JButton jbl_WarningMessage;   
    private JButton jbl_MailCustomer;
    private JButton jbl_MailPassWord;
    private JButton jbl_Subject;
    private JButton jbl_Attachment;
    private JButton jbl_SendMail;
    private JButton jbl_MailTechnician;    
    private JButton jbt_Address;
    private JButton jbt_BadBlock;
    private JButton jbt_BigBlock;
    private JButton jbt_CB_Version;
    private JButton jbt_CPU_KEY;
    private JButton jbt_Comment;
    private JButton jbt_Console_ID;
    private JButton jbt_Console_Type;
    private JButton jbt_DVD_KEY;
    private JButton jbt_Dash_Version_Hack;
    private JButton jbt_Dash_Version_Now;
    private JButton jbt_Drive_Type;
    private JButton jbt_DualNand;
    private JButton jbt_Email;
    private JButton jbt_FCRT;
    private JButton jbt_First_Name;
    private JButton jbt_Flash_Drive;
    private JButton jbt_Flash_Drive_Type;
    private JButton jbt_Hack;
    private JButton jbt_LDV;
    private JButton jbt_Last_Name;
    private JButton jbt_MFR_Date;
    private JButton jbt_ModChip;
    private JButton jbt_OSIG;
    private JButton jbt_Pseudo;
    private JButton jbt_Region;
    private JButton jbt_Serial;
    private JButton jbt_MailCustomer;
    private JButton jbt_MailPassWord;
    private JButton jbt_Subject;
    private JButton jbt_MailArea;
    private JButton jbt_MailTechnician;
    private JPanel jp_BackgroundLangDisplay;
    private JPanel jp_ComboBox;
    private JPanel jp_LabelColor;
    private JPanel jp_TextFieldColor;
    private JPanel jp_MailAppSettings;
    public JScrollPane jsp_panel1;
    private JLabel l_Address;
    private JLabel l_BadBlock;
    private JLabel l_Base;
    private JLabel l_BigBlock;
    private JLabel l_CB_Version;
    private JLabel l_CPU_KEY;
    private JLabel l_Comment;
    private JLabel l_Console_ID;
    private JLabel l_Console_Type;
    private JLabel l_Customer;
    private JLabel l_CustomersList;
    private JLabel l_DVD_KEY;
    private JLabel l_Dash_Version_Hack;
    private JLabel l_Dash_Version_Now;
    private JLabel l_Display;
    private JLabel l_DualNand;
    private JLabel l_EditBody;
    private JLabel l_Email;
    private JLabel l_FCRT;
    private JLabel l_First_Name;
    private JLabel l_FlashDrive;
    private JLabel l_Hack;
    private JLabel l_LDV;
    private JLabel l_Mail;
    private JLabel l_Last_Name;
    private JLabel l_MFR_Date;
    private JLabel l_ModChip;
    private JLabel l_OSIG;
    private JLabel l_Pseudo;
    private JLabel l_Region;
    private JLabel l_SaveBodyXboxData;
    private JLabel l_Serial;
    private JLabel l_WarningMessage;
    private JLabel l_MailCustomer;
    private JLabel l_MailPassWord;
    private JLabel l_Subject;
    private JLabel l_Attachment;
    private JLabel l_SendMail;
    private JLabel l_MailTechnician;
    private JLabel l_SMTP_PORT;
    private JLabel l_SMTP_ADDRESS;
    private JLabel l_AppPassword;
    private JLabel l_EmailTechnician;
    private JLabel l_EmailPassWord;
    private JLabel l_Options;
    private JLabel lcb_Dash_Version_Hack;
    private JLabel lcb_Drive_Type;
    private JLabel lcb_DualNand;
    private JLabel lcb_Flash_Drive_Type;
    private JLabel lcb_Hack;
    private JLabel lcb_ModChip;
    private JLabel lf_Address;
    private JLabel lf_BadBlock;
    private JLabel lf_BigBlock;
    private JLabel lf_CB_Version;
    private JLabel lf_CPU_KEY;
    private JLabel lf_Comment;
    private JLabel lf_Console_ID;
    private JLabel lf_Console_Type;
    private JLabel lf_DVD_KEY;
    private JLabel lf_Dash_Version_Hack;
    private JLabel lf_Dash_Version_Now;
    private JLabel lf_Drive_Type;
    private JLabel lf_DualNand;
    private JLabel lf_Email;
    private JLabel lf_FCRT;
    private JLabel lf_First_Name;
    private JLabel lf_Flash_Drive;
    private JLabel lf_Flash_Drive_Type;
    private JLabel lf_Hack;
    private JLabel lf_LDV;
    private JLabel lf_Last_Name;
    private JLabel lf_MFR_Date;
    private JLabel lf_ModChip;
    private JLabel lf_OSIG;
    private JLabel lf_Pseudo;
    private JLabel lf_Region;
    private JLabel lf_Serial;
    private JLabel lf_MailCustomer;
    private JLabel lf_MailPassWord;
    private JLabel lf_Subject;
    private JLabel lf_MailArea;
    private JLabel lf_MailTechnician;
    
    public static JTextField t_Address;
    public static JTextField t_BadBlock;
    public static JTextField t_BigBlock;
    public static JTextField t_CB_Version;
    public static JTextField t_CPU_KEY;
    public static JTextField t_Comment;
    public static JTextField t_Console_ID;
    public static JTextField t_Console_Type;
    public static JTextField t_CustomersList;
    public static JTextField t_DVD_KEY;
    public static JTextField t_Dash_Version_Hack;
    public static JTextField t_Dash_Version_Now;
    public static JTextField t_DualNand;
    public static JTextField t_Email;
    public static JTextField t_FCRT;
    public static JTextField t_First_Name;
    public static JTextField t_FlashDrive;
    public static JTextField t_Hack;
    public static JTextField t_LDV;
    public static JTextField t_Last_Name;
    public static JTextField t_MFR_Date;
    public static JTextField t_ModChip;
    public static JTextField t_OSIG;
    public static JTextField t_Pseudo;
    public static JTextField t_Region;
    public static JTextField t_SaveBodyXboxData;
    public static JTextField t_Serial;
    public static JTextField t_WarningMessage;
    public static JTextField t_MailCustomer;
    public static JTextField t_MailPassWord;
    public static JTextField t_Subject;
    public static JTextField t_Attachment;
    public static JTextField t_SendMail;
    public static JTextField t_MailTechnician;
    public static JTextField t_SMTP_PORT;
    public static JTextField t_SMTP_ADDRESS;   
    public static JTextField t_EmailTechnician;        
    public static JTextField tcb_Dash_Version_Hack;
    public static JTextField tcb_Drive_Type;
    public static JTextField tcb_DualNand;
    public static JTextField tcb_Flash_Drive_Type;
    public static JTextField tcb_Hack;
    public static JTextField tcb_ModChip;
    public static JTextField tf_Address;
    public static JTextField tf_BadBlock;
    public static JTextField tf_BigBlock;
    public static JTextField tf_CB_Version;
    public static JTextField tf_CPU_KEY;
    public static JTextField tf_Comment;
    public static JTextField tf_Console_ID;
    public static JTextField tf_Console_Type;
    public static JTextField tf_DVD_KEY;
    public static JTextField tf_Dash_Version_Hack;
    public static JTextField tf_Dash_Version_Now;
    public static JTextField tf_Drive_Type;
    public static JTextField tf_DualNand;
    public static JTextField tf_Email;
    public static JTextField tf_FCRT;
    public static JTextField tf_First_Name;
    public static JTextField tf_Flash_Drive;
    public static JTextField tf_Flash_Drive_Type;
    public static JTextField tf_Hack;
    public static JTextField tf_LDV;
    public static JTextField tf_Last_Name;
    public static JTextField tf_MFR_Date;
    public static JTextField tf_ModChip;
    public static JTextField tf_OSIG;
    public static JTextField tf_Pseudo;
    public static JTextField tf_Region;
    public static JTextField tf_Serial;
    public static JTextField tf_MailCustomer;
    public static JTextField tf_MailPassWord;
    public static JTextField tf_Subject;
    public static JTextField tf_MailArea;
    public static JTextField tf_MailTechnician;
    public static JPasswordField t_AppPassword;
    public static JPasswordField t_EmailPassWord;
    public static String jbl_t_All_color;
    public static String jbt_tf_All_color;
    JFileChooser fc;
    public static String CustomersXML;
    public static int progress;
    public static String chooseQueries;
    BackgroundImage jPanel;
    Date pressedTime;
    long timeClicked;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void initComponents() throws IOException, URISyntaxException {

        CB_Base = new JComboBox<>();
        CB_Customer = new JComboBox<>();
        CB_Display = new JComboBox<>();
        CB_EditBodyXbox = new JComboBox<>();
        CB_Mail = new JComboBox<>();
        CB_Options = new JComboBox<>();
        jbl_Last_Name = new JButton();
        jb_Reset = new JButton();
        jb_Save = new JButton();
        jbl_t_All = new JButton();
        jbt_tf_All = new JButton();
        jbl_Address = new JButton();
        jbl_BadBlock = new JButton();
        jbl_BigBlock = new JButton();
        jbl_CB_Version = new JButton();
        jbl_CPU_KEY = new JButton();
        jbl_Comment = new JButton();
        jbl_Console_ID = new JButton();
        jbl_Console_Type = new JButton();
        jbl_CustomersList = new JButton();
        jbl_DVD_KEY = new JButton();
        jbl_Dash_Version_Hack = new JButton();
        jbl_Dash_Version_Now = new JButton();
        jbl_DualNand = new JButton();
        jbl_Email = new JButton();
        jbl_FCRT = new JButton();
        jbl_First_Name = new JButton();
        jbl_FlashDrive = new JButton();
        jbl_Hack = new JButton();
        jbl_LDV = new JButton();
        jbl_MFR_Date = new JButton();
        jbl_ModChip = new JButton();
        jbl_OSIG = new JButton();
        jbl_Pseudo = new JButton();
        jbl_Region = new JButton();
        jbl_SaveBodyXboxData = new JButton();
        jbl_Serial = new JButton();
        jbl_WarningMessage = new JButton();   
        jbl_MailCustomer = new JButton();
        jbl_MailPassWord = new JButton();
        jbl_Subject = new JButton();
        jbl_Attachment = new JButton();
        jbl_SendMail = new JButton();
        jbl_MailTechnician = new JButton();    
        jbt_Address = new JButton();
        jbt_BadBlock = new JButton();
        jbt_BigBlock = new JButton();
        jbt_CB_Version = new JButton();
        jbt_CPU_KEY = new JButton();
        jbt_Comment = new JButton();
        jbt_Console_ID = new JButton();
        jbt_Console_Type = new JButton();
        jbt_DVD_KEY = new JButton();
        jbt_Dash_Version_Hack = new JButton();
        jbt_Dash_Version_Now = new JButton();
        jbt_Drive_Type = new JButton();
        jbt_DualNand = new JButton();
        jbt_Email = new JButton();
        jbt_FCRT = new JButton();
        jbt_First_Name = new JButton();
        jbt_Flash_Drive = new JButton();
        jbt_Flash_Drive_Type = new JButton();
        jbt_Hack = new JButton();
        jbt_LDV = new JButton();
        jbt_Last_Name = new JButton();
        jbt_MFR_Date = new JButton();
        jbt_ModChip = new JButton();
        jbt_OSIG = new JButton();
        jbt_Pseudo = new JButton();
        jbt_Region = new JButton();
        jbt_Serial = new JButton();
        jbt_MailCustomer = new JButton();
        jbt_MailPassWord = new JButton();
        jbt_Subject = new JButton();
        jbt_MailArea = new JButton();
        jbt_MailTechnician = new JButton();   
        jp_BackgroundLangDisplay = new JPanel();
        jp_ComboBox = new JPanel();
        jp_LabelColor = new JPanel();
        jp_TextFieldColor = new JPanel();
        jp_MailAppSettings = new JPanel();
        jsp_panel1 = new JScrollPane();
        l_Address = new JLabel();
        l_BadBlock = new JLabel();
        l_Base = new JLabel();
        l_BigBlock = new JLabel();
        l_CB_Version = new JLabel();
        l_CPU_KEY = new JLabel();
        l_Comment = new JLabel();
        l_Console_ID = new JLabel();
        l_Console_Type = new JLabel();
        l_Customer = new JLabel();
        l_CustomersList = new JLabel();
        l_DVD_KEY = new JLabel();
        l_Dash_Version_Hack = new JLabel();
        l_Dash_Version_Now = new JLabel();
        l_Display = new JLabel();
        l_DualNand = new JLabel();
        l_EditBody = new JLabel();
        l_Email = new JLabel();
        l_FCRT = new JLabel();
        l_First_Name = new JLabel();
        l_FlashDrive = new JLabel();
        l_Hack = new JLabel();
        l_LDV = new JLabel();
        l_Mail = new JLabel();
        l_Last_Name = new JLabel();
        l_MFR_Date = new JLabel();
        l_ModChip = new JLabel();
        l_OSIG = new JLabel();
        l_Pseudo = new JLabel();
        l_Region = new JLabel();
        l_SaveBodyXboxData = new JLabel();
        l_Serial = new JLabel();
        l_WarningMessage = new JLabel();
        l_MailCustomer = new JLabel();
        l_MailPassWord = new JLabel();
        l_Subject = new JLabel();
        l_Attachment = new JLabel();
        l_SendMail = new JLabel();
        l_MailTechnician = new JLabel();
        l_SMTP_PORT = new JLabel();
        l_SMTP_ADDRESS = new JLabel();
        l_AppPassword = new JLabel();
        l_EmailTechnician = new JLabel();
        l_EmailPassWord = new JLabel();
        l_Options = new JLabel();
        lcb_Dash_Version_Hack = new JLabel();
        lcb_Drive_Type = new JLabel();
        lcb_DualNand = new JLabel();
        lcb_Flash_Drive_Type = new JLabel();
        lcb_Hack = new JLabel();
        lcb_ModChip = new JLabel();
        lf_Address = new JLabel();
        lf_BadBlock = new JLabel();
        lf_BigBlock = new JLabel();
        lf_CB_Version = new JLabel();
        lf_CPU_KEY = new JLabel();
        lf_Comment = new JLabel();
        lf_Console_ID = new JLabel();
        lf_Console_Type = new JLabel();
        lf_DVD_KEY = new JLabel();
        lf_Dash_Version_Hack = new JLabel();
        lf_Dash_Version_Now = new JLabel();
        lf_Drive_Type = new JLabel();
        lf_DualNand = new JLabel();
        lf_Email = new JLabel();
        lf_FCRT = new JLabel();
        lf_First_Name = new JLabel();
        lf_Flash_Drive = new JLabel();
        lf_Flash_Drive_Type = new JLabel();
        lf_Hack = new JLabel();
        lf_LDV = new JLabel();
        lf_Last_Name = new JLabel();
        lf_MFR_Date = new JLabel();
        lf_ModChip = new JLabel();
        lf_OSIG = new JLabel();
        lf_Pseudo = new JLabel();
        lf_Region = new JLabel();
        lf_Serial = new JLabel();
        lf_MailCustomer = new JLabel();
        lf_MailPassWord = new JLabel();
        lf_Subject = new JLabel();
        lf_MailArea = new JLabel();
        lf_MailTechnician = new JLabel();

        t_Address = new JTextField();
        t_BadBlock = new JTextField();
        t_BigBlock = new JTextField();
        t_CB_Version = new JTextField();
        t_CPU_KEY = new JTextField();
        t_Comment = new JTextField();
        t_Console_ID = new JTextField();
        t_Console_Type = new JTextField();
        t_CustomersList = new JTextField();
        t_DVD_KEY = new JTextField();
        t_Dash_Version_Hack = new JTextField();
        t_Dash_Version_Now = new JTextField();
        t_DualNand = new JTextField();
        t_Email = new JTextField();
        t_FCRT = new JTextField();
        t_First_Name = new JTextField();
        t_FlashDrive = new JTextField();
        t_Hack = new JTextField();
        t_LDV = new JTextField();
        t_Last_Name = new JTextField();
        t_MFR_Date = new JTextField();
        t_ModChip = new JTextField();
        t_OSIG = new JTextField();
        t_Pseudo = new JTextField();
        t_Region = new JTextField();
        t_SaveBodyXboxData = new JTextField();
        t_Serial = new JTextField();
        t_WarningMessage = new JTextField();
        t_MailCustomer = new JTextField();
        t_MailPassWord = new JTextField();
        t_Subject = new JTextField();
        t_Attachment = new JTextField();
        t_SendMail = new JTextField();
        t_MailTechnician = new JTextField();
        t_SMTP_PORT = new JTextField();
        t_SMTP_ADDRESS = new JTextField();   
        t_EmailTechnician = new JTextField();        
        tcb_Dash_Version_Hack = new JTextField();
        tcb_Drive_Type = new JTextField();
        tcb_DualNand = new JTextField();
        tcb_Flash_Drive_Type = new JTextField();
        tcb_Hack = new JTextField();
        tcb_ModChip = new JTextField();
        tf_Address = new JTextField();
        tf_BadBlock = new JTextField();
        tf_BigBlock = new JTextField();
        tf_CB_Version = new JTextField();
        tf_CPU_KEY = new JTextField();
        tf_Comment = new JTextField();
        tf_Console_ID = new JTextField();
        tf_Console_Type = new JTextField();
        tf_DVD_KEY = new JTextField();
        tf_Dash_Version_Hack = new JTextField();
        tf_Dash_Version_Now = new JTextField();
        tf_Drive_Type = new JTextField();
        tf_DualNand = new JTextField();
        tf_Email = new JTextField();
        tf_FCRT = new JTextField();
        tf_First_Name = new JTextField();
        tf_Flash_Drive = new JTextField();
        tf_Flash_Drive_Type = new JTextField();
        tf_Hack = new JTextField();
        tf_LDV = new JTextField();
        tf_Last_Name = new JTextField();
        tf_MFR_Date = new JTextField();
        tf_ModChip = new JTextField();
        tf_OSIG = new JTextField();
        tf_Pseudo = new JTextField();
        tf_Region = new JTextField();
        tf_Serial = new JTextField();
        tf_MailCustomer = new JTextField();
        tf_MailPassWord = new JTextField();
        tf_Subject = new JTextField();
        tf_MailArea = new JTextField();
        tf_MailTechnician = new JTextField();
        t_AppPassword = new JPasswordField();
        t_EmailPassWord = new JPasswordField();
        
        CodeSource codeSource = Main.class.getProtectionDomain().getCodeSource();
        File jarFile = new File(codeSource.getLocation().toURI().getPath());
        String jarDir = jarFile.getParentFile().getPath();
        
        File f;
        if(OSValidator.IS_UNIX){
            f = new File(jarDir + "/images/options_linux.png");
        }else{
            f = new File("images/options.png");
        }

        centerTextJTextfield();

        l_Address.setToolTipText("Color For Address Label");
        l_BadBlock.setToolTipText("Color For BadBlock Label");
        l_Base.setToolTipText("BackGround For Base Panel");
        l_BigBlock.setToolTipText("Color For BigBlock Label");
        l_CB_Version.setToolTipText("Color For CB Version Label");
        l_CPU_KEY.setToolTipText("Color For CPU KEY Label");
        l_Comment.setToolTipText("Color For Comment Label");
        l_Console_ID.setToolTipText("Color For Console ID Label");
        l_Console_Type.setToolTipText("Color For Console Type Label");
        l_Customer.setToolTipText("BackGround For Customer Panel");
        l_CustomersList.setToolTipText("Color For CustomersList Label");
        l_DVD_KEY.setToolTipText("Color For DVD KEY Label");
        l_Dash_Version_Hack.setToolTipText("Color For Dash Version Hack Label");
        l_Dash_Version_Now.setToolTipText("Color For Dash Version Now Label");
        l_Display.setToolTipText("Choose Your Display");
        l_DualNand.setToolTipText("Color For DualNand Label");
        l_EditBody.setToolTipText("BackGround For EditBodyXboxData Panel");
        l_Email.setToolTipText("Color For Email Label");
        l_FCRT.setToolTipText("Color For FCRT Label");
        l_First_Name.setToolTipText("Color For First Name Label");
        l_FlashDrive.setToolTipText("Color For Flash/Drive Label");
        l_Hack.setToolTipText("Color For Hack Label");
        l_LDV.setToolTipText("Color For LDV Label");
        l_Mail.setToolTipText("BackGround For Mail Panel");
        l_Last_Name.setToolTipText("Color For Last Name Label");
        l_MFR_Date.setToolTipText("Color For MFR_Date Label");
        l_ModChip.setToolTipText("Color For ModChip Label");
        l_OSIG.setToolTipText("Color For OSIG Label");
        l_Pseudo.setToolTipText("Color For Pseudo Label");
        l_Region.setToolTipText("Color For Region Label");
        l_Serial.setToolTipText("Color For Serial Label");
        l_WarningMessage.setToolTipText("Color For WarningMessage Label");
        l_Subject.setToolTipText("Color For Subject Label");
        l_MailCustomer.setToolTipText("Color For Customer Mail Label");
        l_MailPassWord.setToolTipText("Color For Technicien PassWord Label");
        l_Attachment.setToolTipText("Color For Attachment Label");
        l_SendMail.setToolTipText("Color For Button Send Mail");
        l_MailTechnician.setToolTipText("Color For Technician Mail Label");
        l_EmailPassWord.setToolTipText("Technician Mail PassWord");
        lcb_Dash_Version_Hack.setToolTipText("Dash Version Hack ComboBox With Your Data   Example:  ,Data1,Data2,Data3");
        lcb_Drive_Type.setToolTipText("Drive Type ComboBox With Your Data   Example:  ,Data1,Data2,Data3");
        lcb_DualNand.setToolTipText("DualNand ComboBox With Your Data   Example:  ,Data1,Data2,Data3");
        lcb_Flash_Drive_Type.setToolTipText("Flash Drive type ComboBox With Your Data   Example:  ,Data1,Data2,Data3");
        lcb_Hack.setToolTipText("Hack ComboBox With Your Data   Example:  ,Data1,Data2,Data3");
        lcb_ModChip.setToolTipText("ModChip ComboBox With Your Data   Example:  ,Data1,Data2,Data3");
        lf_Address.setToolTipText("Color For TextField Address");
        lf_BadBlock.setToolTipText("Color For TextField BadBlock");
        lf_BigBlock.setToolTipText("Color For TextField BigBlock");
        lf_CB_Version.setToolTipText("Color For TextField CB_Version");
        lf_CPU_KEY.setToolTipText("Color For TextField CPU_KEY");
        lf_Comment.setToolTipText("Color For TextField Comment");
        lf_Console_ID.setToolTipText("Color For TextField Console_ID");
        lf_Console_Type.setToolTipText("Color For TextField Console_Type");
        lf_DVD_KEY.setToolTipText("Color For TextField DVD KEY");
        lf_Dash_Version_Hack.setToolTipText("Color For TextField Dash Version Hack");
        lf_Dash_Version_Now.setToolTipText("Color For TextField Dash Version Now");
        lf_Drive_Type.setToolTipText("Color For TextField Drive Type");
        lf_DualNand.setToolTipText("Color For TextField DualNand");
        lf_Email.setToolTipText("Color For TextField Email");
        lf_FCRT.setToolTipText("Color For TextField FCRT");
        lf_First_Name.setToolTipText("Color For TextField First Name");
        lf_Flash_Drive.setToolTipText("Color For TextField Flash Drive");
        lf_Flash_Drive_Type.setToolTipText("Color For TextField Flash Drive Type");
        lf_Hack.setToolTipText("Color For TextField Hack");
        lf_LDV.setToolTipText("Color For TextField LDV");
        lf_Last_Name.setToolTipText("Color For TextField Last Name");
        lf_MFR_Date.setToolTipText("Color For TextField MFR Date");
        lf_ModChip.setToolTipText("Color For TextField ModChip");
        lf_OSIG.setToolTipText("Color For TextField OSIG");
        lf_Pseudo.setToolTipText("Color For TextField Pseudo");
        lf_Region.setToolTipText("Color For TextField Region");
        lf_Serial.setToolTipText("Color For TextField Serial");
        lf_MailCustomer.setToolTipText("Color For TextField Customer Mail");
        lf_MailPassWord.setToolTipText("Color For TextField Technician PassWord");
        lf_Subject.setToolTipText("Color For TextField Subject");
        lf_MailArea.setToolTipText("Color For TextField Mail Area");
        lf_MailTechnician.setToolTipText("Color For TextField Technician Mail");
        l_SMTP_PORT.setToolTipText("Port for SMTP");
        l_SMTP_ADDRESS.setToolTipText("Address for SMTP");
        l_AppPassword.setToolTipText("App Password");
        l_Options.setToolTipText("BackGround For Options Panel");
        l_EmailPassWord.setToolTipText("Mail PassWord");
        l_EmailTechnician.setToolTipText("Technician Mail");

        jp_LabelColor.setBorder(BorderFactory.createTitledBorder("Label Color"));
        
        l_CustomersList.setText("CustomersList");

        l_DVD_KEY.setText("DVD KEY");

        l_Dash_Version_Now.setText("Dash Version (Now)");

        l_Dash_Version_Hack.setText("Dash Version (Hack)");

        l_Console_Type.setText("Console Type");

        l_ModChip.setText("ModChip");

        l_DualNand.setText("DualNand");

        l_Hack.setText("Hack");

        l_CB_Version.setText("CB_Version");

        l_MFR_Date.setText("MFR Date");

        l_Console_ID.setText("Console ID");

        l_Serial.setText("Serial");

        l_Region.setText("Region");

        l_OSIG.setText("OSIG");

        l_BigBlock.setText("BigBlock (BB)");

        t_CustomersList.setEditable(false);
        t_CustomersList.setEnabled(false);

        t_DVD_KEY.setEditable(false);
        t_DVD_KEY.setEnabled(false);

        t_Dash_Version_Now.setEditable(false);
        t_Dash_Version_Now.setEnabled(false);

        t_Dash_Version_Hack.setEditable(false);
        t_Dash_Version_Hack.setEnabled(false);

        t_Console_Type.setEditable(false);
        t_Console_Type.setEnabled(false);

        t_ModChip.setEditable(false);
        t_ModChip.setEnabled(false);

        t_DualNand.setEditable(false);
        t_DualNand.setEnabled(false);

        t_Hack.setEditable(false);
        t_Hack.setEnabled(false);

        t_CB_Version.setEditable(false);
        t_CB_Version.setEnabled(false);

        t_MFR_Date.setEditable(false);
        t_MFR_Date.setEnabled(false);

        t_Console_ID.setEditable(false);
        t_Console_ID.setEnabled(false);

        t_Serial.setEditable(false);
        t_Serial.setEnabled(false);

        t_Region.setEditable(false);
        t_Region.setEnabled(false);

        t_OSIG.setEditable(false);
        t_OSIG.setEnabled(false);

        t_BigBlock.setEditable(false);
        t_BigBlock.setEnabled(false);

        jbl_CustomersList.setText("Color");
        jbl_CustomersList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_CustomersListMousePressed(evt);
            }           
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_CustomersListMouseReleased(evt);
            }
        });

        jbl_DVD_KEY.setText("Color");
        jbl_DVD_KEY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_DVD_KEYMousePressed(evt);
            }           
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_DVD_KEYMouseReleased(evt);
            }
        });

        jbl_Dash_Version_Now.setText("Color");
        jbl_Dash_Version_Now.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_Dash_Version_NowMousePressed(evt);
            }           
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_Dash_Version_NowMouseReleased(evt);
            }
        });

        jbl_Dash_Version_Hack.setText("Color");
        jbl_Dash_Version_Hack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_Dash_Version_HackMousePressed(evt);
            }           
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_Dash_Version_HackMouseReleased(evt);
            }
        });

        jbl_Console_Type.setText("Color");
        jbl_Console_Type.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_Console_TypeMousePressed(evt);
            }           
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_Console_TypeMouseReleased(evt);
            }
        });

        jbl_ModChip.setText("Color");
        jbl_ModChip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_ModChipMousePressed(evt);
            }           
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_ModChipMouseReleased(evt);
            }
        });

        jbl_DualNand.setText("Color");
        jbl_DualNand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_DualNandMousePressed(evt);
            }           
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_DualNandMouseReleased(evt);
            }
        });

        jbl_Hack.setText("Color");
        jbl_Hack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_HackMousePressed(evt);
            }           
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_HackMouseReleased(evt);
            }
        });

        jbl_CB_Version.setText("Color");
        jbl_CB_Version.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_CB_VersionMousePressed(evt);
            }           
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_CB_VersionMouseReleased(evt);
            }
        });

        jbl_MFR_Date.setText("Color");
        jbl_MFR_Date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_MFR_DateMousePressed(evt);
            }           
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_MFR_DateMouseReleased(evt);
            }
        });

        jbl_Console_ID.setText("Color");
        jbl_Console_ID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_Console_IDMousePressed(evt);
            }           
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_Console_IDMouseReleased(evt);
            }
        });

        jbl_Serial.setText("Color");
        jbl_Serial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_SerialMousePressed(evt);
            }           
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_SerialMouseReleased(evt);
            }
        });

        jbl_Region.setText("Color");
        jbl_Region.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_RegionMousePressed(evt);
            }           
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_RegionMouseReleased(evt);
            }
        });

        jbl_OSIG.setText("Color");
        jbl_OSIG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_OSIGMousePressed(evt);
            }           
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_OSIGMouseReleased(evt);
            }
        });

        jbl_BigBlock.setText("Color");
        jbl_BigBlock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_BigBlockMousePressed(evt);
            }           
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_BigBlockMouseReleased(evt);
            }
        });

        l_SaveBodyXboxData.setText("Save Body Data");

        t_SaveBodyXboxData.setEditable(false);
        t_SaveBodyXboxData.setEnabled(false);
        
        jbl_SaveBodyXboxData.setText("Color");
        jbl_SaveBodyXboxData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_SaveBodyXboxDataMousePressed(evt);
            }           
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_SaveBodyXboxDataMouseReleased(evt);
            }
        });

        l_LDV.setText("LDV");

        t_LDV.setEditable(false);
        t_LDV.setEnabled(false);

        jbl_LDV.setText("Color");
        jbl_LDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_LDVMousePressed(evt);
            }           
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_LDVMouseReleased(evt);
            }
        });

        l_FCRT.setText("FCRT");

        l_FlashDrive.setText("Flash/Drive");

        l_Comment.setText("Comment");

        l_First_Name.setText("First Name");

        l_Last_Name.setText("Last Name");

        t_Last_Name.setEditable(false);
        t_Last_Name.setEnabled(false);

        t_First_Name.setEditable(false);
        t_First_Name.setEnabled(false);

        t_Comment.setEditable(false);
        t_Comment.setEnabled(false);

        t_FlashDrive.setEditable(false);
        t_FlashDrive.setEnabled(false);

        t_FCRT.setEditable(false);
        t_FCRT.setEnabled(false);

        jbl_FCRT.setText("Color");
        jbl_FCRT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_FCRTMousePressed(evt);
            }           
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_FCRTMouseReleased(evt);
            }
        });

        jbl_FlashDrive.setText("Color");
        jbl_FlashDrive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_FlashDriveMousePressed(evt);
            }           
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_FlashDriveMouseReleased(evt);
            }
        });

        jbl_Comment.setText("Color");
        jbl_Comment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_CommentMousePressed(evt);
            }           
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_CommentMouseReleased(evt);
            }
        });

        jbl_First_Name.setText("Color");
        jbl_First_Name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_First_NameMousePressed(evt);
            }           
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_First_NameMouseReleased(evt);
            }
        });

        jbl_Last_Name.setText("Color");
        jbl_Last_Name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_Last_NameMousePressed(evt);
            }           
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_Last_NameMouseReleased(evt);
            }
        });

        l_Pseudo.setText("Pseudo");

        l_Email.setText("E-Mail");

        l_Address.setText("Address");

        t_Address.setEditable(false);
        t_Address.setEnabled(false);

        t_Email.setEditable(false);
        t_Email.setEnabled(false);

        t_Pseudo.setEditable(false);
        t_Pseudo.setEnabled(false);

        jbl_Pseudo.setText("Color");
        jbl_Pseudo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_PseudoMousePressed(evt);
            }           
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_PseudoMouseReleased(evt);
            }
        });

        jbl_Email.setText("Color");
        jbl_Email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_EmailMousePressed(evt);
            }           
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_EmailMouseReleased(evt);
            }
        });

        jbl_Address.setText("Color");
        jbl_Address.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_AddressMousePressed(evt);
            }           
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_AddressMouseReleased(evt);
            }
        });

        l_BadBlock.setText("BadBlock (BB)");

        l_CPU_KEY.setText("CPU KEY");

        t_BadBlock.setEditable(false);
        t_BadBlock.setEnabled(false);

        t_CPU_KEY.setEditable(false);
        t_CPU_KEY.setEnabled(false);

        jbl_BadBlock.setText("Color");
        jbl_BadBlock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_BadBlockMousePressed(evt);
            }           
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_BadBlockMouseReleased(evt);
            }
        });

        jbl_CPU_KEY.setText("Color");
        jbl_CPU_KEY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_CPU_KEYMousePressed(evt);
            }           
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_CPU_KEYMouseReleased(evt);
            }
        });

        jbl_t_All.setText("All Color");        
        jbl_t_All.addMouseListener(new java.awt.event.MouseAdapter() {           
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_t_AllMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_t_AllMouseReleased(evt);
            }
        });
        
        l_WarningMessage.setText("Warning Message");
        t_WarningMessage.setEditable(false);
        t_WarningMessage.setEnabled(false);
        jbl_WarningMessage.setText("Color");
        jbl_WarningMessage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_WarningMessageMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_WarningMessageMouseReleased(evt);
            }
        });
   
        l_MailCustomer.setText("Mail Customer");
        t_MailCustomer.setEditable(false);
        t_MailCustomer.setEnabled(false);
        jbl_MailCustomer.setText("Color");
        jbl_MailCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_MailCustomerMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_MailCustomerMouseReleased(evt);
            }
        });
        
        l_MailPassWord.setText("Mail PassWord");
        t_MailPassWord.setEditable(false);
        t_MailPassWord.setEnabled(false);
        jbl_MailPassWord.setText("Color");
        jbl_MailPassWord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_MailPassWordMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_MailPassWordMouseReleased(evt);
            }
        });
        
        l_Attachment.setText("Mail Attachement");
        t_Attachment.setEditable(false);
        t_Attachment.setEnabled(false);
        jbl_Attachment.setText("Color");
        jbl_Attachment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_AttachmentMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_AttachmentMouseReleased(evt);
            }
        });
        
        l_SendMail.setText("Send Mail");
        t_SendMail.setEditable(false);
        t_SendMail.setEnabled(false);
        jbl_SendMail.setText("Color");
        jbl_SendMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_SendMailMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_SendMailMouseReleased(evt);
            }
        });
        
        l_Subject.setText("Mail Subject");
        t_Subject.setEditable(false);
        t_Subject.setEnabled(false);
        jbl_Subject.setText("Color");
        jbl_Subject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_SubjectMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_SubjectMouseReleased(evt);
            }
        });

        l_MailTechnician.setText("Mail Technician");
        t_MailTechnician.setEditable(false);
        t_MailTechnician.setEnabled(false);
        jbl_MailTechnician.setText("Color");
        jbl_MailTechnician.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbl_MailTechnicianMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbl_MailTechnicianMouseReleased(evt);
            }
        });
        
        GroupLayout jp_LabelColorLayout = new GroupLayout(jp_LabelColor);
        jp_LabelColor.setLayout(jp_LabelColorLayout);
        jp_LabelColorLayout.setHorizontalGroup(
            jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jp_LabelColorLayout.createSequentialGroup()
                    .addContainerGap()
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(l_CustomersList, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(l_CPU_KEY)
                                .addComponent(l_DVD_KEY)
                                .addComponent(l_Dash_Version_Now)
                                .addComponent(l_Dash_Version_Hack)
                                .addComponent(l_Console_Type)
                                .addComponent(l_ModChip)
                                .addComponent(l_DualNand)
                                .addComponent(l_Hack)
                                .addComponent(l_CB_Version)
                                .addComponent(l_MFR_Date)
                                .addComponent(l_Console_ID)
                                .addComponent(l_Serial)
                                .addComponent(l_Region)
                                .addComponent(l_OSIG)
                                .addComponent(l_BigBlock)
                                .addComponent(l_BadBlock))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(t_CustomersList, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(t_CPU_KEY)
                                    .addComponent(t_DVD_KEY)
                                    .addComponent(t_Dash_Version_Now)
                                    .addComponent(t_Dash_Version_Hack)
                                    .addComponent(t_Console_Type)
                                    .addComponent(t_ModChip)
                                    .addComponent(t_DualNand)
                                    .addComponent(t_Hack)
                                    .addComponent(t_CB_Version)
                                    .addComponent(t_MFR_Date)
                                    .addComponent(t_Console_ID)
                                    .addComponent(t_Serial)
                                    .addComponent(t_Region)
                                    .addComponent(t_OSIG)
                                    .addComponent(t_BigBlock)
                                    .addComponent(t_BadBlock))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jbl_CustomersList)
                                    .addComponent(jbl_CPU_KEY)
                                    .addComponent(jbl_DVD_KEY)
                                    .addComponent(jbl_Dash_Version_Now)
                                    .addComponent(jbl_Dash_Version_Hack)
                                    .addComponent(jbl_Console_Type)
                                    .addComponent(jbl_ModChip)
                                    .addComponent(jbl_DualNand)
                                    .addComponent(jbl_Hack)
                                    .addComponent(jbl_CB_Version)
                                    .addComponent(jbl_MFR_Date)
                                    .addComponent(jbl_Console_ID)
                                    .addComponent(jbl_Serial)
                                    .addComponent(jbl_Region)
                                    .addComponent(jbl_OSIG)
                                    .addComponent(jbl_BigBlock)
                                    .addComponent(jbl_BadBlock))
                            .addGap(18, 18, 18)                               
                                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false) 
                                            .addComponent(l_LDV)
                                            .addComponent(l_FCRT)
                                            .addComponent(l_FlashDrive, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                            .addComponent(l_Comment)
                                            .addComponent(l_First_Name)
                                            .addComponent(l_Last_Name)
                                            .addComponent(l_Pseudo)
                                            .addComponent(l_Email)
                                            .addComponent(l_Address)
                                            .addComponent(l_SaveBodyXboxData)
                                            .addComponent(l_WarningMessage)
                                            .addComponent(l_MailTechnician)
                                            .addComponent(l_MailPassWord)
                                            .addComponent(l_MailCustomer)
                                            .addComponent(l_Subject)
                                            .addComponent(l_Attachment)
                                            .addComponent(l_SendMail))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jp_LabelColorLayout.createSequentialGroup()
                                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(t_LDV)
                                            .addComponent(t_FCRT)
                                            .addComponent(t_FlashDrive, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                            .addComponent(t_Comment)
                                            .addComponent(t_First_Name)
                                            .addComponent(t_Last_Name)
                                            .addComponent(t_Pseudo)
                                            .addComponent(t_Email)
                                            .addComponent(t_Address)
                                            .addComponent(t_SaveBodyXboxData)
                                            .addComponent(t_WarningMessage)
                                            .addComponent(t_MailTechnician)
                                            .addComponent(t_MailPassWord)
                                            .addComponent(t_MailCustomer)
                                            .addComponent(t_Subject)
                                            .addComponent(t_Attachment)
                                            .addComponent(t_SendMail))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)  
                                    .addComponent(jbl_LDV)
                                    .addComponent(jbl_FCRT)
                                    .addComponent(jbl_FlashDrive)
                                    .addComponent(jbl_Comment)
                                    .addComponent(jbl_First_Name)
                                    .addComponent(jbl_Last_Name)
                                    .addComponent(jbl_Pseudo)
                                    .addComponent(jbl_Email)
                                    .addComponent(jbl_Address)
                                    .addComponent(jbl_SaveBodyXboxData)
                                    .addComponent(jbl_WarningMessage)
                                    .addComponent(jbl_MailTechnician)
                                    .addComponent(jbl_MailPassWord)
                                    .addComponent(jbl_MailCustomer)
                                    .addComponent(jbl_Subject)
                                    .addComponent(jbl_Attachment)
                                    .addComponent(jbl_SendMail)))
                                    .addComponent(jbl_t_All, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addContainerGap(0, Short.MAX_VALUE))
        );
        jp_LabelColorLayout.setVerticalGroup(
            jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jp_LabelColorLayout.createSequentialGroup()
                .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jp_LabelColorLayout.createSequentialGroup()
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(t_CustomersList, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_CustomersList, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_CustomersList))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_CPU_KEY)
                            .addComponent(t_CPU_KEY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_CPU_KEY))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_DVD_KEY)
                            .addComponent(t_DVD_KEY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_DVD_KEY))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_Dash_Version_Now)
                            .addComponent(t_Dash_Version_Now, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_Dash_Version_Now))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_Dash_Version_Hack)
                            .addComponent(t_Dash_Version_Hack, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_Dash_Version_Hack))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_Console_Type)
                            .addComponent(t_Console_Type, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_Console_Type))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_ModChip)
                            .addComponent(t_ModChip, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_ModChip))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_DualNand)
                            .addComponent(t_DualNand, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_DualNand))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_Hack)
                            .addComponent(t_Hack, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_Hack))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_CB_Version)
                            .addComponent(t_CB_Version, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_CB_Version))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_MFR_Date)
                            .addComponent(t_MFR_Date, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_MFR_Date))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_Console_ID)
                            .addComponent(t_Console_ID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_Console_ID))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_Serial)
                            .addComponent(t_Serial, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_Serial))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_Region)
                            .addComponent(t_Region, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_Region))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_OSIG)
                            .addComponent(t_OSIG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_OSIG))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_BigBlock)
                            .addComponent(t_BigBlock, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_BigBlock))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_BadBlock)
                            .addComponent(t_BadBlock, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_BadBlock)))
                    .addGroup(jp_LabelColorLayout.createSequentialGroup()  
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_LDV)
                            .addComponent(t_LDV, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_LDV))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_FCRT)
                            .addComponent(t_FCRT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_FCRT))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_FlashDrive)
                            .addComponent(t_FlashDrive, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_FlashDrive))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_Comment)
                            .addComponent(t_Comment, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_Comment))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_First_Name)
                            .addComponent(t_First_Name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_First_Name))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_Last_Name)
                            .addComponent(t_Last_Name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_Last_Name))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_Pseudo)
                            .addComponent(t_Pseudo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_Pseudo))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_Email)
                            .addComponent(t_Email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_Email))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_Address)
                            .addComponent(t_Address, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_Address))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(t_SaveBodyXboxData, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_SaveBodyXboxData, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_SaveBodyXboxData))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_WarningMessage)
                            .addComponent(t_WarningMessage, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_WarningMessage))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_MailTechnician)
                            .addComponent(t_MailTechnician, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_MailTechnician))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_MailPassWord)
                            .addComponent(t_MailPassWord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_MailPassWord))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_MailCustomer)
                            .addComponent(t_MailCustomer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_MailCustomer))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_Subject)
                            .addComponent(t_Subject, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_Subject))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_Attachment)
                            .addComponent(t_Attachment, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_Attachment))
                        .addGroup(jp_LabelColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_SendMail)
                            .addComponent(t_SendMail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbl_SendMail))                       
                            .addComponent(jbl_t_All)))
                .addContainerGap())
        );

        jp_MailAppSettings.setBorder(BorderFactory.createTitledBorder("Mail"));
             
        l_SMTP_PORT.setText("PORT");

        t_SMTP_PORT.setText("");

        l_SMTP_ADDRESS.setText("SMTP");

        t_SMTP_ADDRESS.setText("");

        l_EmailTechnician.setText("Tech Email");

        t_EmailTechnician.setText("");
        
        l_EmailPassWord.setText("PassWord");
                
        t_EmailPassWord.setText("");

        int gap;
        int gap2;
        if(OSValidator.IS_UNIX){            
             gap = 67;
             gap2 = 69;
        }else{
            gap = 54;
            gap2 = 54;
        }
        
        GroupLayout jp_MailAppSettingsLayout = new GroupLayout(jp_MailAppSettings);
        jp_MailAppSettings.setLayout(jp_MailAppSettingsLayout);
        jp_MailAppSettingsLayout.setHorizontalGroup(
            jp_MailAppSettingsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jp_MailAppSettingsLayout.createSequentialGroup()
                .addGap(gap, gap, gap)
                .addGroup(jp_MailAppSettingsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jp_MailAppSettingsLayout.createSequentialGroup()                       
                            .addComponent(l_EmailTechnician, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(t_EmailTechnician, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE) 
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(l_SMTP_ADDRESS, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)            
                            .addComponent(t_SMTP_ADDRESS, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
                        .addGroup(jp_MailAppSettingsLayout.createSequentialGroup()                       
                            .addComponent(l_EmailPassWord, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(t_EmailPassWord, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(l_SMTP_PORT, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)            
                            .addComponent(t_SMTP_PORT, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))            
                .addContainerGap(gap2, Short.MAX_VALUE))
        );
        jp_MailAppSettingsLayout.setVerticalGroup(
            jp_MailAppSettingsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jp_MailAppSettingsLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jp_MailAppSettingsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(l_EmailTechnician)
                    .addComponent(t_EmailTechnician, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_SMTP_ADDRESS)
                    .addComponent(t_SMTP_ADDRESS, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jp_MailAppSettingsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(t_EmailPassWord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_EmailPassWord)
                    .addComponent(t_SMTP_PORT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_SMTP_PORT))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        jp_TextFieldColor.setBorder(BorderFactory.createTitledBorder("TextField Color"));
        
        lf_CPU_KEY.setText("CPU KEY");

        lf_DVD_KEY.setText("DVD KEY");

        lf_Dash_Version_Now.setText("Dash Version (Now)");

        lf_Dash_Version_Hack.setText("Dash Version (Hack)");

        lf_Console_Type.setText("Console Type");

        lf_ModChip.setText("ModChip");

        lf_DualNand.setText("DualNand");

        lf_Hack.setText("Hack");

        lf_CB_Version.setText("CB_Version");

        lf_MFR_Date.setText("MFR Date");

        lf_Console_ID.setText("Console ID");

        lf_Serial.setText("Serial");

        lf_Region.setText("Region");

        lf_OSIG.setText("OSIG");

        tf_OSIG.setEditable(false);
        tf_OSIG.setEnabled(false);

        tf_Region.setEditable(false);
        tf_Region.setEnabled(false);

        tf_Serial.setEditable(false);
        tf_Serial.setEnabled(false);

        tf_Console_ID.setEditable(false);
        tf_Console_ID.setEnabled(false);

        tf_MFR_Date.setEditable(false);
        tf_MFR_Date.setEnabled(false);

        tf_CB_Version.setEditable(false);
        tf_CB_Version.setEnabled(false);

        tf_Hack.setEditable(false);
        tf_Hack.setEnabled(false);

        tf_DualNand.setEditable(false);
        tf_DualNand.setEnabled(false);

        tf_ModChip.setEditable(false);
        tf_ModChip.setEnabled(false);

        tf_Console_Type.setEditable(false);
        tf_Console_Type.setEnabled(false);

        tf_Dash_Version_Hack.setEditable(false);
        tf_Dash_Version_Hack.setEnabled(false);

        tf_Dash_Version_Now.setEditable(false);
        tf_Dash_Version_Now.setEnabled(false);

        tf_DVD_KEY.setEditable(false);
        tf_DVD_KEY.setEnabled(false);

        tf_CPU_KEY.setEditable(false);
        tf_CPU_KEY.setEnabled(false);
        
        jbt_CPU_KEY.setText("Color");
        jbt_CPU_KEY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_CPU_KEYMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_CPU_KEYMouseReleased(evt);
            }
        });

        jbt_DVD_KEY.setText("Color");
        jbt_DVD_KEY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_DVD_KEYMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_DVD_KEYMouseReleased(evt);
            }
        });

        jbt_Dash_Version_Now.setText("Color");
        jbt_Dash_Version_Now.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_Dash_Version_NowMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_Dash_Version_NowMouseReleased(evt);
            }
        });

        jbt_Dash_Version_Hack.setText("Color");
        jbt_Dash_Version_Hack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_Dash_Version_HackMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_Dash_Version_HackMouseReleased(evt);
            }
        });

        jbt_Console_Type.setText("Color");
        jbt_Console_Type.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_Console_TypeMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_Console_TypeMouseReleased(evt);
            }
        });

        jbt_ModChip.setText("Color");
        jbt_ModChip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_ModChipMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_ModChipMouseReleased(evt);
            }
        });

        jbt_DualNand.setText("Color");
        jbt_DualNand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_DualNandMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_DualNandMouseReleased(evt);
            }
        });

        jbt_Hack.setText("Color");
        jbt_Hack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_HackMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_HackMouseReleased(evt);
            }
        });

        jbt_CB_Version.setText("Color");
        jbt_CB_Version.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_CB_VersionMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_CB_VersionMouseReleased(evt);
            }
        });

        jbt_MFR_Date.setText("Color");
        jbt_MFR_Date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_MFR_DateMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_MFR_DateMouseReleased(evt);
            }
        });

        jbt_Console_ID.setText("Color");
        jbt_Console_ID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_Console_IDMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_Console_IDMouseReleased(evt);
            }
        });

        jbt_Serial.setText("Color");
        jbt_Serial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_SerialMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_SerialMouseReleased(evt);
            }
        });

        jbt_Region.setText("Color");
        jbt_Region.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_RegionMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_RegionMouseReleased(evt);
            }
        });

        jbt_OSIG.setText("Color");
        jbt_OSIG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_OSIGMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_OSIGMouseReleased(evt);
            }
        });

        lf_Drive_Type.setText("Drive Type");
        
        lf_Flash_Drive_Type.setText("Flash Drive Type");
        
        lf_Flash_Drive.setText("Flash Drive");

        lf_Address.setText("Address");

        lf_Email.setText("E-Mail");

        lf_Pseudo.setText("Pseudo");

        lf_Last_Name.setText("Last Name");

        lf_First_Name.setText("First Name");

        lf_Comment.setText("Comment");

        lf_FCRT.setText("FCRT");

        lf_LDV.setText("LDV");

        lf_BadBlock.setText("BadBlock (BB)");

        lf_BigBlock.setText("BigBlock (BB)");

        tf_BigBlock.setEditable(false);
        tf_BigBlock.setEnabled(false);
        
        jbt_BigBlock.setText("Color");
        jbt_BigBlock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_BigBlockMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_BigBlockMouseReleased(evt);
            }
        });

        tf_BadBlock.setEditable(false);
        tf_BadBlock.setEnabled(false);

        tf_LDV.setEditable(false);
        tf_LDV.setEnabled(false);

        tf_FCRT.setEditable(false);
        tf_FCRT.setEnabled(false);

        tf_Comment.setEditable(false);
        tf_Comment.setEnabled(false);

        tf_First_Name.setEditable(false);
        tf_First_Name.setEnabled(false);

        tf_Last_Name.setEditable(false);
        tf_Last_Name.setEnabled(false);

        tf_Pseudo.setEditable(false);
        tf_Pseudo.setEnabled(false);

        tf_Email.setEditable(false);
        tf_Email.setEnabled(false);

        tf_Address.setEditable(false);
        tf_Address.setEnabled(false);

        tf_Flash_Drive.setEditable(false);
        tf_Flash_Drive.setEnabled(false);

        tf_Flash_Drive_Type.setEditable(false);
        tf_Flash_Drive_Type.setEnabled(false);

        tf_Drive_Type.setEditable(false);
        tf_Drive_Type.setEnabled(false);
        
        jbt_tf_All.setText("All Color");
        jbt_tf_All.addMouseListener(new java.awt.event.MouseAdapter() {           
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_tf_AllMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_tf_AllMouseReleased(evt);
            }
        });

        jbt_Drive_Type.setText("Color");
        jbt_Drive_Type.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_Drive_TypeMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_Drive_TypeMouseReleased(evt);
            }
        });

        jbt_Flash_Drive_Type.setText("Color");
        jbt_Flash_Drive_Type.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_Flash_Drive_TypeMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_Flash_Drive_TypeMouseReleased(evt);
            }
        });

        jbt_Flash_Drive.setText("Color");
        jbt_Flash_Drive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_Flash_DriveMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_Flash_DriveMouseReleased(evt);
            }
        });

        jbt_Address.setText("Color");
        jbt_Address.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_AddressMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_AddressMouseReleased(evt);
            }
        });

        jbt_Email.setText("Color");
        jbt_Email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_EmailMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_EmailMouseReleased(evt);
            }
        });

        jbt_Pseudo.setText("Color");
        jbt_Pseudo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_PseudoMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_PseudoMouseReleased(evt);
            }
        });

        jbt_Last_Name.setText("Color");
        jbt_Last_Name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_Last_NameMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_Last_NameMouseReleased(evt);
            }
        });

        jbt_First_Name.setText("Color");
        jbt_First_Name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_First_NameMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_First_NameMouseReleased(evt);
            }
        });

        jbt_Comment.setText("Color");
        jbt_Comment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_CommentMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_CommentMouseReleased(evt);
            }
        });

        jbt_FCRT.setText("Color");
        jbt_FCRT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_FCRTMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_FCRTMouseReleased(evt);
            }
        });

        jbt_LDV.setText("Color");
        jbt_LDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_LDVMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_LDVMouseReleased(evt);
            }
        });

        jbt_BadBlock.setText("Color");
        jbt_BadBlock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_BadBlockMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_BadBlockMouseReleased(evt);
            }
        });

        lf_MailCustomer.setText("Mail Customer");
        tf_MailCustomer.setEditable(false);
        tf_MailCustomer.setEnabled(false);
        jbt_MailCustomer.setText("Color");
        jbt_MailCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_MailCustomerMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_MailCustomerMouseReleased(evt);
            }
        });
        
        lf_MailPassWord.setText("Mail PassWord");
        tf_MailPassWord.setEditable(false);
        tf_MailPassWord.setEnabled(false);
        jbt_MailPassWord.setText("Color");
        jbt_MailPassWord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_MailPassWordMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_MailPassWordMouseReleased(evt);
            }
        });
        
        lf_MailArea.setText("Mail Area");
        tf_MailArea.setEditable(false);
        tf_MailArea.setEnabled(false);
        jbt_MailArea.setText("Color");
        jbt_MailArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_MailAreaMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_MailAreaMouseReleased(evt);
            }
        });
        
        lf_Subject.setText("Mail Subject");
        tf_Subject.setEditable(false);
        tf_Subject.setEnabled(false);
        jbt_Subject.setText("Color");
        jbt_Subject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_SubjectMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_SubjectMouseReleased(evt);
            }
        });
        
        lf_MailTechnician.setText("Mail Technician");
        tf_MailTechnician.setEditable(false);
        tf_MailTechnician.setEnabled(false);
        jbt_MailTechnician.setText("Color");
        jbt_MailTechnician.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_MailTechnicianMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbt_MailTechnicianMouseReleased(evt);
            }
        });
        
        GroupLayout jp_TextFieldColorLayout = new GroupLayout(jp_TextFieldColor);
        jp_TextFieldColor.setLayout(jp_TextFieldColorLayout);
        jp_TextFieldColorLayout.setHorizontalGroup(
            jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jp_TextFieldColorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(lf_CPU_KEY, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lf_DVD_KEY)
                    .addComponent(lf_Dash_Version_Now)
                    .addComponent(lf_Dash_Version_Hack)
                    .addComponent(lf_Console_Type)
                    .addComponent(lf_ModChip)
                    .addComponent(lf_DualNand)
                    .addComponent(lf_Hack)
                    .addComponent(lf_CB_Version)
                    .addComponent(lf_MFR_Date)
                    .addComponent(lf_Console_ID)
                    .addComponent(lf_Serial)
                    .addComponent(lf_Region)
                    .addComponent(lf_OSIG)
                    .addComponent(lf_BigBlock)
                    .addComponent(lf_BadBlock))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_CPU_KEY, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(tf_DVD_KEY)
                    .addComponent(tf_Dash_Version_Now)
                    .addComponent(tf_Dash_Version_Hack)
                    .addComponent(tf_Console_Type)
                    .addComponent(tf_ModChip)
                    .addComponent(tf_DualNand)
                    .addComponent(tf_Hack)
                    .addComponent(tf_CB_Version)
                    .addComponent(tf_MFR_Date)
                    .addComponent(tf_Console_ID)
                    .addComponent(tf_Serial)
                    .addComponent(tf_Region)
                    .addComponent(tf_OSIG)
                    .addComponent(tf_BigBlock)
                    .addComponent(tf_BadBlock))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jbt_CPU_KEY)
                    .addComponent(jbt_DVD_KEY)
                    .addComponent(jbt_Dash_Version_Now)
                    .addComponent(jbt_Dash_Version_Hack)
                    .addComponent(jbt_Console_Type)
                    .addComponent(jbt_ModChip)
                    .addComponent(jbt_DualNand)
                    .addComponent(jbt_Hack)
                    .addComponent(jbt_CB_Version)
                    .addComponent(jbt_MFR_Date)
                    .addComponent(jbt_Console_ID)
                    .addComponent(jbt_Serial)
                    .addComponent(jbt_Region)
                    .addComponent(jbt_OSIG)
                    .addComponent(jbt_BigBlock)
                    .addComponent(jbt_BadBlock))
                .addGap(18, 18, 18)
                .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false) 
                    .addComponent(lf_LDV, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(lf_FCRT)
                    .addComponent(lf_Comment)
                    .addComponent(lf_First_Name)
                    .addComponent(lf_Last_Name)
                    .addComponent(lf_Pseudo)
                    .addComponent(lf_Email)
                    .addComponent(lf_Address)
                    .addComponent(lf_Flash_Drive)
                    .addComponent(lf_Flash_Drive_Type)
                    .addComponent(lf_Drive_Type)
                    .addComponent(lf_MailTechnician)
                    .addComponent(lf_MailPassWord)
                    .addComponent(lf_MailCustomer)
                    .addComponent(lf_Subject)
                    .addComponent(lf_MailArea))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                .addGroup(jp_TextFieldColorLayout.createSequentialGroup()
                .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_LDV, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_FCRT)
                    .addComponent(tf_Comment)
                    .addComponent(tf_First_Name)
                    .addComponent(tf_Last_Name)    
                    .addComponent(tf_Pseudo)
                    .addComponent(tf_Email)
                    .addComponent(tf_Address)    
                    .addComponent(tf_Flash_Drive)    
                    .addComponent(tf_Flash_Drive_Type)    
                    .addComponent(tf_Drive_Type)
                    .addComponent(tf_MailTechnician)
                    .addComponent(tf_MailPassWord)
                    .addComponent(tf_MailCustomer)
                    .addComponent(tf_Subject)
                    .addComponent(tf_MailArea))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jbt_LDV)
                    .addComponent(jbt_FCRT)
                    .addComponent(jbt_Comment)
                    .addComponent(jbt_First_Name)
                    .addComponent(jbt_Last_Name)
                    .addComponent(jbt_Pseudo)
                    .addComponent(jbt_Email)
                    .addComponent(jbt_Address)
                    .addComponent(jbt_Flash_Drive)
                    .addComponent(jbt_Flash_Drive_Type)
                    .addComponent(jbt_Drive_Type)
                    .addComponent(jbt_MailTechnician)
                    .addComponent(jbt_MailPassWord)
                    .addComponent(jbt_MailCustomer)
                    .addComponent(jbt_Subject)
                    .addComponent(jbt_MailArea)))
                    .addComponent(jbt_tf_All, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(0, Short.MAX_VALUE))
        );
        jp_TextFieldColorLayout.setVerticalGroup(
            jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jp_TextFieldColorLayout.createSequentialGroup()
                .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jp_TextFieldColorLayout.createSequentialGroup()
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_CPU_KEY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lf_CPU_KEY, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_CPU_KEY))
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lf_DVD_KEY)
                            .addComponent(tf_DVD_KEY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_DVD_KEY))
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lf_Dash_Version_Now)
                            .addComponent(tf_Dash_Version_Now, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_Dash_Version_Now))
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lf_Dash_Version_Hack)
                            .addComponent(tf_Dash_Version_Hack, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_Dash_Version_Hack))
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lf_Console_Type)
                            .addComponent(tf_Console_Type, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_Console_Type))
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lf_ModChip)
                            .addComponent(tf_ModChip, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_ModChip))
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lf_DualNand)
                            .addComponent(tf_DualNand, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_DualNand))
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lf_Hack)
                            .addComponent(tf_Hack, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_Hack))
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lf_CB_Version)
                            .addComponent(tf_CB_Version, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_CB_Version))
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lf_MFR_Date)
                            .addComponent(tf_MFR_Date, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_MFR_Date))
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lf_Console_ID)
                            .addComponent(tf_Console_ID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_Console_ID))
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lf_Serial)
                            .addComponent(tf_Serial, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_Serial))
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lf_Region)
                            .addComponent(tf_Region, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_Region))
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lf_OSIG)
                            .addComponent(tf_OSIG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_OSIG))
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lf_BigBlock)
                            .addComponent(tf_BigBlock, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)                           
                            .addComponent(jbt_BigBlock))
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lf_BadBlock)
                            .addComponent(tf_BadBlock, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_BadBlock)))
                        .addGroup(jp_TextFieldColorLayout.createSequentialGroup()
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lf_LDV, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_LDV, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_LDV))
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lf_FCRT)
                            .addComponent(tf_FCRT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_FCRT))
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lf_Flash_Drive)
                            .addComponent(tf_Flash_Drive, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_Flash_Drive))
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lf_Flash_Drive_Type)
                            .addComponent(tf_Flash_Drive_Type, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_Flash_Drive_Type))
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lf_Drive_Type)
                            .addComponent(tf_Drive_Type, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_Drive_Type))
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lf_Comment)
                            .addComponent(tf_Comment, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_Comment))
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lf_First_Name)
                            .addComponent(tf_First_Name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_First_Name))
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lf_Last_Name)
                            .addComponent(tf_Last_Name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_Last_Name))
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lf_Pseudo)
                            .addComponent(tf_Pseudo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_Pseudo))
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lf_Email)
                            .addComponent(tf_Email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_Email))
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lf_Address)
                            .addComponent(tf_Address, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_Address))
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lf_MailTechnician)
                            .addComponent(tf_MailTechnician, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_MailTechnician))
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lf_MailPassWord)
                            .addComponent(tf_MailPassWord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_MailPassWord))
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lf_MailCustomer)
                            .addComponent(tf_MailCustomer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_MailCustomer))
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lf_Subject)
                            .addComponent(tf_Subject, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_Subject))
                        .addGroup(jp_TextFieldColorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lf_MailArea)
                            .addComponent(tf_MailArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_MailArea))
                            .addComponent(jbt_tf_All)))
                .addContainerGap())
        );

        jp_BackgroundLangDisplay.setBorder(BorderFactory.createTitledBorder("Background - Display - AppPassWord"));
             
        l_Base.setText("Base");

        l_EditBody.setText("Edit X-Body");

        l_Customer.setText("Customer");
        
        l_Options.setText("Options");
        
        l_AppPassword.setText("AppPassWord");

        t_AppPassword.setText("");

        CB_Base.setModel(new DefaultComboBoxModel<String>(new String[] { "", "YES" }));

        CB_EditBodyXbox.setModel(new DefaultComboBoxModel<String>(new String[] { "", "YES" }));

        CB_Customer.setModel(new DefaultComboBoxModel<String>(new String[] { "", "YES" }));

        l_Mail.setText("Mail");

        l_Display.setText("Display");

        CB_Mail.setModel(new DefaultComboBoxModel<String>(new String[] { "", "YES" }));
        
        CB_Options.setModel(new DefaultComboBoxModel<String>(new String[] { "", "YES" }));

        CB_Display.setModel(new DefaultComboBoxModel<String>(new String[] { "", "ENABLE" }));

        int t_AppPassword_hor;
        int l_Options_hor;
        if(OSValidator.IS_UNIX){            
             t_AppPassword_hor = 172;
             l_Options_hor = 48;
        }else{
            t_AppPassword_hor = 160;
            l_Options_hor = 46;
        }
        
        GroupLayout jp_BackgroundLangDisplayLayout = new GroupLayout(jp_BackgroundLangDisplay);
        jp_BackgroundLangDisplay.setLayout(jp_BackgroundLangDisplayLayout);
        jp_BackgroundLangDisplayLayout.setHorizontalGroup(
            jp_BackgroundLangDisplayLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jp_BackgroundLangDisplayLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jp_BackgroundLangDisplayLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
            .addGroup(jp_BackgroundLangDisplayLayout.createSequentialGroup()
                .addContainerGap()               
                .addGroup(jp_BackgroundLangDisplayLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(l_Base, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l_Customer, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_BackgroundLangDisplayLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(CB_Customer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_Base, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jp_BackgroundLangDisplayLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(l_EditBody, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l_Options, GroupLayout.PREFERRED_SIZE, l_Options_hor, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_BackgroundLangDisplayLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(jp_BackgroundLangDisplayLayout.createSequentialGroup()
                        .addComponent(CB_EditBodyXbox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(l_Mail, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jp_BackgroundLangDisplayLayout.createSequentialGroup()                         
                          .addComponent(CB_Options, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(l_Display, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_BackgroundLangDisplayLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                      .addComponent(CB_Display, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CB_Mail, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))                  
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))               
                .addGroup(GroupLayout.Alignment.LEADING,jp_BackgroundLangDisplayLayout.createSequentialGroup()
                .addComponent(l_AppPassword, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(t_AppPassword, GroupLayout.PREFERRED_SIZE, t_AppPassword_hor, GroupLayout.PREFERRED_SIZE)                
                .addGap(0, 0, 0))))
        );
        jp_BackgroundLangDisplayLayout.setVerticalGroup(
            jp_BackgroundLangDisplayLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jp_BackgroundLangDisplayLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jp_BackgroundLangDisplayLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(jp_BackgroundLangDisplayLayout.createSequentialGroup()
                        .addGroup(jp_BackgroundLangDisplayLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_EditBody)
                            .addComponent(CB_EditBodyXbox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_Mail)
                            .addComponent(CB_Mail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp_BackgroundLangDisplayLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_Options)
                            .addComponent(CB_Options, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_Display)  
                            .addComponent(CB_Display, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(GroupLayout.Alignment.LEADING, jp_BackgroundLangDisplayLayout.createSequentialGroup()
                        .addGroup(jp_BackgroundLangDisplayLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l_Base)
                            .addComponent(CB_Base, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp_BackgroundLangDisplayLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                              .addComponent(l_Customer)
                              .addComponent(CB_Customer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                    .addGap(10, 10, 10)
                    .addGroup(jp_BackgroundLangDisplayLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(l_AppPassword)
                    .addComponent(t_AppPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        jp_ComboBox.setBorder(BorderFactory.createTitledBorder("ComboBox"));
        
        lcb_Dash_Version_Hack.setText("Dash Version Hack");
        tcb_Dash_Version_Hack.setMaximumSize(new java.awt.Dimension(460, 20));

        lcb_ModChip.setText("ModChip");
        tcb_ModChip.setMaximumSize(new java.awt.Dimension(460, 20));

        lcb_DualNand.setText("DualNand");
        tcb_DualNand.setMaximumSize(new java.awt.Dimension(460, 20));

        lcb_Hack.setText("Hack");
        tcb_Hack.setMaximumSize(new java.awt.Dimension(460, 20));

        lcb_Drive_Type.setText("Drive Type");
        tcb_Drive_Type.setMaximumSize(new java.awt.Dimension(460, 20));

        lcb_Flash_Drive_Type.setText("Flash Drive type");
        tcb_Flash_Drive_Type.setMaximumSize(new java.awt.Dimension(460, 20));
        
        GroupLayout jp_ComboBoxLayout = new GroupLayout(jp_ComboBox);
        jp_ComboBox.setLayout(jp_ComboBoxLayout);
        jp_ComboBoxLayout.setHorizontalGroup(
            jp_ComboBoxLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jp_ComboBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_ComboBoxLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(lcb_DualNand, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lcb_ModChip, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lcb_Dash_Version_Hack, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_ComboBoxLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(tcb_ModChip)
                    .addComponent(tcb_DualNand)
                    .addComponent(tcb_Dash_Version_Hack))
                .addGap(18, 18, 18)
                .addGroup(jp_ComboBoxLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(lcb_Flash_Drive_Type, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lcb_Drive_Type, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lcb_Hack, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_ComboBoxLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(tcb_Drive_Type)
                    .addComponent(tcb_Hack)
                    .addComponent(tcb_Flash_Drive_Type))
                .addContainerGap())
        );
        jp_ComboBoxLayout.setVerticalGroup(
            jp_ComboBoxLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jp_ComboBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_ComboBoxLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lcb_Dash_Version_Hack)
                    .addComponent(tcb_Dash_Version_Hack, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lcb_Hack)
                    .addComponent(tcb_Hack, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGroup(jp_ComboBoxLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lcb_ModChip)
                    .addComponent(tcb_ModChip, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lcb_Drive_Type)
                    .addComponent(tcb_Drive_Type, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGroup(jp_ComboBoxLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lcb_DualNand)
                    .addComponent(tcb_DualNand, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lcb_Flash_Drive_Type)
                    .addComponent(tcb_Flash_Drive_Type, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jb_Save.setToolTipText("Click For Save And Long Press For XML-To-BDD");
        jbl_t_All.setToolTipText("Click For Reset And Long Press For Color Palette. Valid For All Color Options");
        jbt_tf_All.setToolTipText("Click For Reset And Long Press For Color Palette. Valid For All Color Options");
        jb_Reset.setToolTipText("Reset All Options");
        
        jb_Save.setIcon(new ImageIcon(getClass().getResource("/images/savebodyxboxdata.png")));
        jb_Reset.setIcon(new ImageIcon(getClass().getResource("/images/reset.png")));

        jb_Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jb_SaveMousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                try {
                    jb_SaveMouseReleased(evt);
                } catch (IOException ex) {
                    Logger.getLogger(OptionsForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(OptionsForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        jb_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ResetActionPerformed(evt);
            }
        });
        
        if ("YES".equals(SQLiteQueries.ImageOptions) && f.exists() && f.canRead()) {
            BufferedImage image = ImageIO.read(f);
            jp_ComboBox.setOpaque(false);
            jp_BackgroundLangDisplay.setOpaque(false);
            jp_LabelColor.setOpaque(false);
            jp_TextFieldColor.setOpaque(false);
            jp_MailAppSettings.setOpaque(false);
            jp_ComboBox.setBackground(new Color(0,0,0,20));            
            jp_BackgroundLangDisplay.setBackground(new Color(0,0,0,20));
            jp_LabelColor.setBackground(new Color(0,0,0,20));
            jp_TextFieldColor.setBackground(new Color(0,0,0,20));
            jp_MailAppSettings.setBackground(new Color(0,0,0,20));
            jPanel = new BackgroundImage(image);          
        }else{
            jPanel = new BackgroundImage();
        }
        
        GroupLayout jPanellayout = new GroupLayout(jPanel);
        jPanel.setLayout(jPanellayout);
        jPanellayout.setHorizontalGroup(
            jPanellayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanellayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanellayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jp_ComboBox, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanellayout.createSequentialGroup()
                            .addGroup(jPanellayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jp_LabelColor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jp_MailAppSettings, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))                       
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanellayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanellayout.createSequentialGroup()
                                .addComponent(jp_TextFieldColor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanellayout.createSequentialGroup()
                                .addComponent(jp_BackgroundLangDisplay, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGap(30, 30, 30)
                                .addGroup(jPanellayout.createParallelGroup(GroupLayout.Alignment.LEADING)                                  
                                    .addComponent(jb_Save, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb_Reset, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, 0))
        );
        jPanellayout.setVerticalGroup(
            jPanellayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanellayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanellayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanellayout.createSequentialGroup()
                    .addComponent(jp_LabelColor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanellayout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jp_MailAppSettings, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanellayout.createSequentialGroup()
                        .addComponent(jp_TextFieldColor, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanellayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanellayout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jp_BackgroundLangDisplay, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanellayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jb_Save, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jb_Reset, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)))))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_ComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, 0))
        );
        
        jsp_panel1.setViewportView(jPanel);
        
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jsp_panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jsp_panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }                
    
    private void jb_SaveMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jb_SaveMouseReleased(java.awt.event.MouseEvent evt) throws IOException, SQLException { 
        timeClicked = new Date().getTime() - pressedTime.getTime();
            if (timeClicked > 1000) {
                fc = new JFileChooser();
                FileNameExtensionFilter xml_filter = new FileNameExtensionFilter("Accept customers.xml files only", "xml");
                fc.setDialogTitle("Choose Your XML File");
                fc.setAcceptAllFileFilterUsed(false);
                fc.addChoosableFileFilter(xml_filter);
                int returnVal = fc.showOpenDialog(TabbedPane.frame);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                File DirXML = fc.getSelectedFile();
                CustomersXML = DirXML.toString();
                new TaskForQueries().execute();           
                } 
            }else if(timeClicked < 1000){
                int p = JOptionPane.showConfirmDialog(TabbedPane.frame, "Are Your Sure You Want To Save Your Configuration", "Confirmation",JOptionPane.OK_CANCEL_OPTION);
                if(p == 0){
                    chooseQueries = "settings";
                    new TaskForQueries().execute();                                         
                }
            }
    }                                       
    
    private void jb_ResetActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Reset();
    }
    
    private void jbl_t_AllMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    
    private void jbl_t_AllMouseReleased(java.awt.event.MouseEvent evt) {        
        
        timeClicked = new Date().getTime() - pressedTime.getTime();
            if (timeClicked > 1000) {
                Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
                if (background != null) {
                    t_Address.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_BadBlock.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_BigBlock.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_CB_Version.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_CPU_KEY.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_Comment.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_Console_ID.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_Console_Type.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_CustomersList.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_DVD_KEY.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_Dash_Version_Hack.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_Dash_Version_Now.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_DualNand.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_Email.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_FCRT.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_First_Name.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_FlashDrive.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_Hack.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_LDV.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_Last_Name.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_MFR_Date.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_ModChip.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_OSIG.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_Pseudo.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_Region.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_SaveBodyXboxData.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_Serial.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_WarningMessage.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_MailCustomer.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_MailPassWord.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_Attachment.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_SendMail.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_Subject.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    t_MailTechnician.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                    jbl_t_All_color = (background.getRed() + "," + background.getGreen() + "," + background.getBlue());

                    jbl_Last_Name.setBackground(jb_Reset.getBackground());
                    jbl_Address.setBackground(jb_Reset.getBackground());
                    jbl_BadBlock.setBackground(jb_Reset.getBackground());
                    jbl_BigBlock.setBackground(jb_Reset.getBackground());
                    jbl_CB_Version.setBackground(jb_Reset.getBackground());
                    jbl_CPU_KEY.setBackground(jb_Reset.getBackground());
                    jbl_Comment.setBackground(jb_Reset.getBackground());
                    jbl_Console_ID.setBackground(jb_Reset.getBackground());
                    jbl_Console_Type.setBackground(jb_Reset.getBackground());
                    jbl_CustomersList.setBackground(jb_Reset.getBackground());
                    jbl_DVD_KEY.setBackground(jb_Reset.getBackground());
                    jbl_Dash_Version_Hack.setBackground(jb_Reset.getBackground());
                    jbl_Dash_Version_Now.setBackground(jb_Reset.getBackground());
                    jbl_DualNand.setBackground(jb_Reset.getBackground());
                    jbl_Email.setBackground(jb_Reset.getBackground());
                    jbl_FCRT.setBackground(jb_Reset.getBackground());
                    jbl_First_Name.setBackground(jb_Reset.getBackground());
                    jbl_FlashDrive.setBackground(jb_Reset.getBackground());
                    jbl_Hack.setBackground(jb_Reset.getBackground());
                    jbl_LDV.setBackground(jb_Reset.getBackground());
                    jbl_MFR_Date.setBackground(jb_Reset.getBackground());
                    jbl_ModChip.setBackground(jb_Reset.getBackground());
                    jbl_OSIG.setBackground(jb_Reset.getBackground());
                    jbl_Pseudo.setBackground(jb_Reset.getBackground());
                    jbl_Region.setBackground(jb_Reset.getBackground());
                    jbl_SaveBodyXboxData.setBackground(jb_Reset.getBackground());
                    jbl_Serial.setBackground(jb_Reset.getBackground());
                    jbl_WarningMessage.setBackground(jb_Reset.getBackground());
                    jbl_MailCustomer.setBackground(jb_Reset.getBackground());
                    jbl_MailPassWord.setBackground(jb_Reset.getBackground());
                    jbl_Attachment.setBackground(jb_Reset.getBackground());
                    jbl_SendMail.setBackground(jb_Reset.getBackground());
                    jbl_Subject.setBackground(jb_Reset.getBackground());
                    jbl_MailTechnician.setBackground(jb_Reset.getBackground());                   
                    jbl_t_All.setBackground(background);
                }
            }else if(timeClicked < 1000){
                jbl_CustomersList.setBackground(jb_Reset.getBackground());
                jbl_CPU_KEY.setBackground(jb_Reset.getBackground());
                jbl_DVD_KEY.setBackground(jb_Reset.getBackground());
                jbl_Dash_Version_Now.setBackground(jb_Reset.getBackground());
                jbl_Dash_Version_Hack.setBackground(jb_Reset.getBackground());
                jbl_Console_Type.setBackground(jb_Reset.getBackground());
                jbl_ModChip.setBackground(jb_Reset.getBackground());
                jbl_DualNand.setBackground(jb_Reset.getBackground());
                jbl_Hack.setBackground(jb_Reset.getBackground());
                jbl_CB_Version.setBackground(jb_Reset.getBackground());
                jbl_MFR_Date.setBackground(jb_Reset.getBackground());
                jbl_Console_ID.setBackground(jb_Reset.getBackground());
                jbl_Serial.setBackground(jb_Reset.getBackground());
                jbl_Region.setBackground(jb_Reset.getBackground());
                jbl_OSIG.setBackground(jb_Reset.getBackground());
                jbl_BigBlock.setBackground(jb_Reset.getBackground());
                jbl_BadBlock.setBackground(jb_Reset.getBackground());
                jbl_LDV.setBackground(jb_Reset.getBackground());
                jbl_FCRT.setBackground(jb_Reset.getBackground());
                jbl_FlashDrive.setBackground(jb_Reset.getBackground());
                jbl_Comment.setBackground(jb_Reset.getBackground());
                jbl_First_Name.setBackground(jb_Reset.getBackground());
                jbl_Last_Name.setBackground(jb_Reset.getBackground());
                jbl_Pseudo.setBackground(jb_Reset.getBackground());
                jbl_Email.setBackground(jb_Reset.getBackground());
                jbl_Address.setBackground(jb_Reset.getBackground());
                jbl_SaveBodyXboxData.setBackground(jb_Reset.getBackground());
                jbl_WarningMessage.setBackground(jb_Reset.getBackground());
                jbl_MailTechnician.setBackground(jb_Reset.getBackground());
                jbl_MailPassWord.setBackground(jb_Reset.getBackground());
                jbl_MailCustomer.setBackground(jb_Reset.getBackground());
                jbl_Subject.setBackground(jb_Reset.getBackground());
                jbl_Attachment.setBackground(jb_Reset.getBackground());
                jbl_SendMail.setBackground(jb_Reset.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                t_Address.setText("");
                t_BadBlock.setText("");
                t_BigBlock.setText("");
                t_CB_Version.setText("");
                t_CPU_KEY.setText("");
                t_Comment.setText("");
                t_Console_ID.setText("");
                t_Console_Type.setText("");
                t_CustomersList.setText("");
                t_DVD_KEY.setText("");
                t_Dash_Version_Hack.setText("");
                t_Dash_Version_Now.setText("");
                t_DualNand.setText("");
                t_Email.setText("");
                t_FCRT.setText("");
                t_First_Name.setText("");
                t_FlashDrive.setText("");
                t_Hack.setText("");
                t_LDV.setText("");
                t_Last_Name.setText("");
                t_MFR_Date.setText("");
                t_ModChip.setText("");
                t_OSIG.setText("");
                t_Pseudo.setText("");
                t_Region.setText("");
                t_SaveBodyXboxData.setText("");
                t_Serial.setText("");
                t_WarningMessage.setText("");
                t_Subject.setText("");
                t_MailCustomer.setText("");
                t_MailPassWord.setText("");
                t_Attachment.setText("");
                t_SendMail.setText("");
                t_MailTechnician.setText("");
                jbl_t_All_color = "";
            }
            
        
    }  
    
    private void jbt_tf_AllMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    
    private void jbt_tf_AllMouseReleased(java.awt.event.MouseEvent evt) { 
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {           
            Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
            if (background != null) {
                tf_Address.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                tf_BadBlock.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                tf_BigBlock.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                tf_CB_Version.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                tf_CPU_KEY.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                tf_Comment.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                tf_Console_ID.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                tf_Console_Type.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                tf_DVD_KEY.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                tf_Dash_Version_Hack.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                tf_Dash_Version_Now.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                tf_Drive_Type.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                tf_DualNand.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                tf_Email.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                tf_FCRT.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                tf_First_Name.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                tf_Flash_Drive.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                tf_Flash_Drive_Type.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                tf_Hack.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                tf_LDV.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                tf_Last_Name.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                tf_MFR_Date.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                tf_ModChip.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                tf_OSIG.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                tf_Pseudo.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                tf_Region.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                tf_Serial.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                tf_MailCustomer.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                tf_MailPassWord.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                tf_MailArea.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                tf_Subject.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                tf_MailTechnician.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
                jbt_tf_All_color = (background.getRed() + "," + background.getGreen() + "," + background.getBlue());

                jbt_Address.setBackground(jb_Reset.getBackground());
                jbt_BadBlock.setBackground(jb_Reset.getBackground());
                jbt_BigBlock.setBackground(jb_Reset.getBackground());
                jbt_CB_Version.setBackground(jb_Reset.getBackground());
                jbt_CPU_KEY.setBackground(jb_Reset.getBackground());
                jbt_Comment.setBackground(jb_Reset.getBackground());
                jbt_Console_ID.setBackground(jb_Reset.getBackground());
                jbt_Console_Type.setBackground(jb_Reset.getBackground());
                jbt_DVD_KEY.setBackground(jb_Reset.getBackground());
                jbt_Dash_Version_Hack.setBackground(jb_Reset.getBackground());
                jbt_Dash_Version_Now.setBackground(jb_Reset.getBackground());
                jbt_Drive_Type.setBackground(jb_Reset.getBackground());
                jbt_DualNand.setBackground(jb_Reset.getBackground());
                jbt_Email.setBackground(jb_Reset.getBackground());
                jbt_FCRT.setBackground(jb_Reset.getBackground());
                jbt_First_Name.setBackground(jb_Reset.getBackground());
                jbt_Flash_Drive.setBackground(jb_Reset.getBackground());
                jbt_Flash_Drive_Type.setBackground(jb_Reset.getBackground());
                jbt_Hack.setBackground(jb_Reset.getBackground());
                jbt_LDV.setBackground(jb_Reset.getBackground());
                jbt_Last_Name.setBackground(jb_Reset.getBackground());
                jbt_MFR_Date.setBackground(jb_Reset.getBackground());
                jbt_ModChip.setBackground(jb_Reset.getBackground());
                jbt_OSIG.setBackground(jb_Reset.getBackground());
                jbt_Pseudo.setBackground(jb_Reset.getBackground());
                jbt_Region.setBackground(jb_Reset.getBackground());
                jbt_Serial.setBackground(jb_Reset.getBackground());
                jbt_MailCustomer.setBackground(jb_Reset.getBackground());
                jbt_MailPassWord.setBackground(jb_Reset.getBackground());
                jbt_MailArea.setBackground(jb_Reset.getBackground());
                jbt_Subject.setBackground(jb_Reset.getBackground());
                jbt_MailTechnician.setBackground(jb_Reset.getBackground());                   
                jbt_tf_All.setBackground(background);
            } 
        }else if(timeClicked < 1000){
            jbt_CPU_KEY.setBackground(jb_Reset.getBackground());
            jbt_DVD_KEY.setBackground(jb_Reset.getBackground());
            jbt_Dash_Version_Now.setBackground(jb_Reset.getBackground());
            jbt_Dash_Version_Hack.setBackground(jb_Reset.getBackground());
            jbt_Console_Type.setBackground(jb_Reset.getBackground());
            jbt_ModChip.setBackground(jb_Reset.getBackground());
            jbt_DualNand.setBackground(jb_Reset.getBackground());
            jbt_Hack.setBackground(jb_Reset.getBackground());
            jbt_CB_Version.setBackground(jb_Reset.getBackground());
            jbt_MFR_Date.setBackground(jb_Reset.getBackground());
            jbt_Console_ID.setBackground(jb_Reset.getBackground());
            jbt_Serial.setBackground(jb_Reset.getBackground());
            jbt_Region.setBackground(jb_Reset.getBackground());
            jbt_OSIG.setBackground(jb_Reset.getBackground());
            jbt_BigBlock.setBackground(jb_Reset.getBackground());
            jbt_BadBlock.setBackground(jb_Reset.getBackground());
            jbt_LDV.setBackground(jb_Reset.getBackground());
            jbt_FCRT.setBackground(jb_Reset.getBackground());
            jbt_Flash_Drive.setBackground(jb_Reset.getBackground());
            jbt_Flash_Drive_Type.setBackground(jb_Reset.getBackground());
            jbt_Drive_Type.setBackground(jb_Reset.getBackground());
            jbt_Comment.setBackground(jb_Reset.getBackground());
            jbt_First_Name.setBackground(jb_Reset.getBackground());
            jbt_Last_Name.setBackground(jb_Reset.getBackground());
            jbt_Pseudo.setBackground(jb_Reset.getBackground());
            jbt_Email.setBackground(jb_Reset.getBackground());
            jbt_Address.setBackground(jb_Reset.getBackground());
            jbt_MailTechnician.setBackground(jb_Reset.getBackground());
            jbt_MailPassWord.setBackground(jb_Reset.getBackground());		
            jbt_MailCustomer.setBackground(jb_Reset.getBackground());       
            jbt_Subject.setBackground(jb_Reset.getBackground());
            jbt_MailArea.setBackground(jb_Reset.getBackground());             
            jbt_tf_All.setBackground(jb_Reset.getBackground());
            tf_Address.setText("");
            tf_BadBlock.setText("");
            tf_BigBlock.setText("");
            tf_CB_Version.setText("");
            tf_CPU_KEY.setText("");
            tf_Comment.setText("");
            tf_Console_ID.setText("");
            tf_Console_Type.setText("");
            tf_DVD_KEY.setText("");
            tf_Dash_Version_Hack.setText("");
            tf_Dash_Version_Now.setText("");
            tf_Drive_Type.setText("");
            tf_DualNand.setText("");
            tf_Email.setText("");
            tf_FCRT.setText("");
            tf_First_Name.setText("");
            tf_Flash_Drive.setText("");
            tf_Flash_Drive_Type.setText("");
            tf_Hack.setText("");
            tf_LDV.setText("");
            tf_Last_Name.setText("");
            tf_MFR_Date.setText("");
            tf_ModChip.setText("");
            tf_OSIG.setText("");
            tf_Pseudo.setText("");
            tf_Region.setText("");
            tf_Serial.setText("");
            tf_MailCustomer.setText("");
            tf_MailPassWord.setText("");
            tf_Subject.setText("");
            tf_MailArea.setText("");
            tf_MailTechnician.setText("");
            jbt_tf_All_color = "";
        }
    } 
    
    private void jbl_CustomersListMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }    
    private void jbl_CustomersListMouseReleased(java.awt.event.MouseEvent evt) { 
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {    
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_CustomersList.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_CustomersList.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){ SetGroupColorLabel(); }       
        }else if(timeClicked < 1000){
            t_CustomersList.setText("");
            jbl_CustomersList.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }                                             
    
    private void jbl_CPU_KEYMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_CPU_KEYMouseReleased(java.awt.event.MouseEvent evt) {
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {   
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_CPU_KEY.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_CPU_KEY.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){ SetGroupColorLabel(); }       
        }else if(timeClicked < 1000){
            t_CPU_KEY.setText("");
            jbl_CPU_KEY.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }                                           

    private void jbl_DVD_KEYMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_DVD_KEYMouseReleased(java.awt.event.MouseEvent evt) { 
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {   
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_DVD_KEY.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_DVD_KEY.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  }       
        }else if(timeClicked < 1000){
            t_DVD_KEY.setText("");
            jbl_DVD_KEY.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }                                           

    private void jbl_Dash_Version_NowMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_Dash_Version_NowMouseReleased(java.awt.event.MouseEvent evt) {  
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {   
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_Dash_Version_Now.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_Dash_Version_Now.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  }
        }else if(timeClicked < 1000){
            t_Dash_Version_Now.setText("");
            jbl_Dash_Version_Now.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }                                                    

    private void jbl_Dash_Version_HackMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_Dash_Version_HackMouseReleased(java.awt.event.MouseEvent evt) { 
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {   
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_Dash_Version_Hack.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_Dash_Version_Hack.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  }
        }else if(timeClicked < 1000){
            t_Dash_Version_Hack.setText("");
            jbl_Dash_Version_Hack.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }                                                     

    private void jbl_Console_TypeMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_Console_TypeMouseReleased(java.awt.event.MouseEvent evt) {  
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {  
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_Console_Type.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_Console_Type.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  }
        }else if(timeClicked < 1000){
            t_Console_Type.setText("");
            jbl_Console_Type.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }                                                

    private void jbl_ModChipMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_ModChipMouseReleased(java.awt.event.MouseEvent evt) {  
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {  
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_ModChip.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_ModChip.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  }
        }else if(timeClicked < 1000){
            t_ModChip.setText("");
            jbl_ModChip.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }                                           

    private void jbl_DualNandMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_DualNandMouseReleased(java.awt.event.MouseEvent evt) {   
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {  
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_DualNand.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_DualNand.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  }
        }else if(timeClicked < 1000){
            t_DualNand.setText("");
            jbl_DualNand.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }                                            

    private void jbl_HackMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_HackMouseReleased(java.awt.event.MouseEvent evt) {  
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_Hack.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_Hack.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  }
        }else if(timeClicked < 1000){
            t_Hack.setText("");
            jbl_Hack.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }                                        

    private void jbl_CB_VersionMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_CB_VersionMouseReleased(java.awt.event.MouseEvent evt) {  
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_CB_Version.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_CB_Version.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  }
        }else if(timeClicked < 1000){
            t_CB_Version.setText("");
            jbl_CB_Version.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }                                              

    private void jbl_MFR_DateMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_MFR_DateMouseReleased(java.awt.event.MouseEvent evt) { 
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_MFR_Date.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_MFR_Date.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  }
        }else if(timeClicked < 1000){
            t_MFR_Date.setText("");
            jbl_MFR_Date.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }                                            

    private void jbl_Console_IDMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_Console_IDMouseReleased(java.awt.event.MouseEvent evt) { 
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_Console_ID.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_Console_ID.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  }
        }else if(timeClicked < 1000){
            t_Console_ID.setText("");
            jbl_Console_ID.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }                                              

    private void jbl_SerialMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_SerialMouseReleased(java.awt.event.MouseEvent evt) {  
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_Serial.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_Serial.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  }
        }else if(timeClicked < 1000){
            t_Serial.setText("");
            jbl_Serial.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }                                          

    private void jbl_RegionMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_RegionMouseReleased(java.awt.event.MouseEvent evt) {
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_Region.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_Region.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  }
        }else if(timeClicked < 1000){
            t_Region.setText("");
            jbl_Region.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }                                          

    private void jbl_OSIGMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_OSIGMouseReleased(java.awt.event.MouseEvent evt) { 
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_OSIG.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_OSIG.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  }
        }else if(timeClicked < 1000){
            t_OSIG.setText("");
            jbl_OSIG.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }                                        

    private void jbl_BigBlockMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_BigBlockMouseReleased(java.awt.event.MouseEvent evt) {  
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_BigBlock.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_BigBlock.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  }
        }else if(timeClicked < 1000){
            t_BigBlock.setText("");
            jbl_BigBlock.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }                                            

    private void jbl_BadBlockMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_BadBlockMouseReleased(java.awt.event.MouseEvent evt) {  
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_BadBlock.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_BadBlock.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  }
        }else if(timeClicked < 1000){
            t_BadBlock.setText("");
            jbl_BadBlock.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }                                            

    private void jbl_LDVMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_LDVMouseReleased(java.awt.event.MouseEvent evt) {  
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_LDV.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_LDV.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  }
        }else if(timeClicked < 1000){
            t_LDV.setText("");
            jbl_LDV.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }                                       

    private void jbl_FCRTMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_FCRTMouseReleased(java.awt.event.MouseEvent evt) {
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_FCRT.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_FCRT.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  }
        }else if(timeClicked < 1000){
            t_FCRT.setText("");
            jbl_FCRT.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }                                        

    private void jbl_FlashDriveMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_FlashDriveMouseReleased(java.awt.event.MouseEvent evt) { 
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_FlashDrive.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_FlashDrive.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  }
        }else if(timeClicked < 1000){
            t_FlashDrive.setText("");
            jbl_FlashDrive.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }                                              

    private void jbl_CommentMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_CommentMouseReleased(java.awt.event.MouseEvent evt) {  
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_Comment.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_Comment.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  }
        }else if(timeClicked < 1000){
            t_Comment.setText("");
            jbl_Comment.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }                                           

    private void jbl_First_NameMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_First_NameMouseReleased(java.awt.event.MouseEvent evt) { 
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_First_Name.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_First_Name.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  }
        }else if(timeClicked < 1000){
            t_First_Name.setText("");
            jbl_First_Name.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }                                              

    private void jbl_Last_NameMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_Last_NameMouseReleased(java.awt.event.MouseEvent evt) {   
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_Last_Name.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_Last_Name.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  }
        }else if(timeClicked < 1000){
            t_Last_Name.setText("");
            jbl_Last_Name.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }                                         

    private void jbl_PseudoMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_PseudoMouseReleased(java.awt.event.MouseEvent evt) {  
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_Pseudo.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_Pseudo.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  }
        }else if(timeClicked < 1000){
            t_Pseudo.setText("");
            jbl_Pseudo.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }                                          

    private void jbl_EmailMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_EmailMouseReleased(java.awt.event.MouseEvent evt) {   
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_Email.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_Email.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  }
        }else if(timeClicked < 1000){
            t_Email.setText("");
            jbl_Email.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }                                         

    private void jbl_AddressMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_AddressMouseReleased(java.awt.event.MouseEvent evt) {  
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_Address.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_Address.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  }
        }else if(timeClicked < 1000){
            t_Address.setText("");
            jbl_Address.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }                                                                                 

    private void jbl_SaveBodyXboxDataMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_SaveBodyXboxDataMouseReleased(java.awt.event.MouseEvent evt) { 
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_SaveBodyXboxData.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_SaveBodyXboxData.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  }
        }else if(timeClicked < 1000){
            t_SaveBodyXboxData.setText("");
            jbl_SaveBodyXboxData.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }                                                                                             

    private void jbl_WarningMessageMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_WarningMessageMouseReleased(java.awt.event.MouseEvent evt) { 
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_WarningMessage.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_WarningMessage.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  }
        }else if(timeClicked < 1000){
            t_WarningMessage.setText("");
            jbl_WarningMessage.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }                                                                                         

    private void jbl_MailCustomerMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_MailCustomerMouseReleased(java.awt.event.MouseEvent evt) { 
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_MailCustomer.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_MailCustomer.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  } 
        }else if(timeClicked < 1000){
            t_MailCustomer.setText("");
            jbl_MailCustomer.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }  
    
    private void jbl_MailPassWordMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_MailPassWordMouseReleased(java.awt.event.MouseEvent evt) {
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_MailPassWord.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_MailPassWord.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  }  
        }else if(timeClicked < 1000){
            t_MailPassWord.setText("");
            jbl_MailPassWord.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }    
    
    private void jbl_AttachmentMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_AttachmentMouseReleased(java.awt.event.MouseEvent evt) { 
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_Attachment.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_Attachment.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  }  
        }else if(timeClicked < 1000){
            t_Attachment.setText("");
            jbl_Attachment.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }    
  
    private void jbl_SendMailMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_SendMailMouseReleased(java.awt.event.MouseEvent evt) {  
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_SendMail.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_SendMail.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  } 
        }else if(timeClicked < 1000){
            t_SendMail.setText("");
            jbl_SendMail.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }    
    
    private void jbl_SubjectMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_SubjectMouseReleased(java.awt.event.MouseEvent evt) {   
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_Subject.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_Subject.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  }  
        }else if(timeClicked < 1000){
            t_Subject.setText("");
            jbl_Subject.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    }    
    
    private void jbl_MailTechnicianMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbl_MailTechnicianMouseReleased(java.awt.event.MouseEvent evt) {  
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            t_MailTechnician.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbl_MailTechnician.setBackground(background);
        }
        if(ReturnGroupColorLabel() == true){  SetGroupColorLabel();  } 
        }else if(timeClicked < 1000){
            t_MailTechnician.setText("");
            jbl_MailTechnician.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetLabel() == true){ SetGroupColorResetLabel(); } 
        }
    } 
 
    private void jbt_CPU_KEYMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_CPU_KEYMouseReleased(java.awt.event.MouseEvent evt) { 
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            tf_CPU_KEY.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_CPU_KEY.setBackground(background);                   
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField(); }
        }else if(timeClicked < 1000){
            tf_CPU_KEY.setText("");
            jbt_CPU_KEY.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    }                                           

    private void jbt_DVD_KEYMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_DVD_KEYMouseReleased(java.awt.event.MouseEvent evt) { 
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            tf_DVD_KEY.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_DVD_KEY.setBackground(background);
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField();  }
        }else if(timeClicked < 1000){
            tf_DVD_KEY.setText("");
            jbt_DVD_KEY.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    }                                           

    private void jbt_Dash_Version_NowMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_Dash_Version_NowMouseReleased(java.awt.event.MouseEvent evt) {  
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            tf_Dash_Version_Now.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_Dash_Version_Now.setBackground(background);
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField();  }
        }else if(timeClicked < 1000){
            tf_Dash_Version_Now.setText("");
            jbt_Dash_Version_Now.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    }                                                    

    private void jbt_Dash_Version_HackMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_Dash_Version_HackMouseReleased(java.awt.event.MouseEvent evt) { 
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            tf_Dash_Version_Hack.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_Dash_Version_Hack.setBackground(background);
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField();  }
        }else if(timeClicked < 1000){
            tf_Dash_Version_Hack.setText("");
            jbt_Dash_Version_Hack.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    }                                                     

    private void jbt_Console_TypeMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_Console_TypeMouseReleased(java.awt.event.MouseEvent evt) { 
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            tf_Console_Type.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_Console_Type.setBackground(background);
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField();  }
        }else if(timeClicked < 1000){
            tf_Console_Type.setText("");
            jbt_Console_Type.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    }                                                

    private void jbt_ModChipMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_ModChipMouseReleased(java.awt.event.MouseEvent evt) {  
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            tf_ModChip.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_ModChip.setBackground(background);
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField();  }
        }else if(timeClicked < 1000){
            tf_ModChip.setText("");
            jbt_ModChip.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    }                                           

    private void jbt_DualNandMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_DualNandMouseReleased(java.awt.event.MouseEvent evt) {  
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame,"JColorChooser Sample", null);
        if (background != null) {
            tf_DualNand.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_DualNand.setBackground(background);
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField();  }
        }else if(timeClicked < 1000){
            tf_DualNand.setText("");
            jbt_DualNand.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    }                                            

    private void jbt_HackMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_HackMouseReleased(java.awt.event.MouseEvent evt) { 
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            tf_Hack.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_Hack.setBackground(background);
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField();  }
        }else if(timeClicked < 1000){
            tf_Hack.setText("");
            jbt_Hack.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    }                                        

    private void jbt_CB_VersionMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_CB_VersionMouseReleased(java.awt.event.MouseEvent evt) { 
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame,"JColorChooser Sample", null);
        if (background != null) {
            tf_CB_Version.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_CB_Version.setBackground(background);
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField();  }
        }else if(timeClicked < 1000){
            tf_CB_Version.setText("");
            jbt_CB_Version.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    }                                              

    private void jbt_MFR_DateMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_MFR_DateMouseReleased(java.awt.event.MouseEvent evt) {   
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            tf_MFR_Date.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_MFR_Date.setBackground(background);
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField();  }
        }else if(timeClicked < 1000){
            tf_MFR_Date.setText("");
            jbt_MFR_Date.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    }                                            

    private void jbt_Console_IDMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_Console_IDMouseReleased(java.awt.event.MouseEvent evt) { 
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            tf_Console_ID.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_Console_ID.setBackground(background);
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField();  }
        }else if(timeClicked < 1000){
            tf_Console_ID.setText("");
            jbt_Console_ID.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    }                                              

    private void jbt_SerialMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_SerialMouseReleased(java.awt.event.MouseEvent evt) { 
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            tf_Serial.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_Serial.setBackground(background);
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField();  }
        }else if(timeClicked < 1000){
            tf_Serial.setText("");
            jbt_Serial.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    }                                          

    private void jbt_RegionMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_RegionMouseReleased(java.awt.event.MouseEvent evt) {  
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            tf_Region.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_Region.setBackground(background);
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField();  }
        }else if(timeClicked < 1000){
            tf_Region.setText("");
            jbt_Region.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    }                                          

    private void jbt_OSIGMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_OSIGMouseReleased(java.awt.event.MouseEvent evt) {  
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            tf_OSIG.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_OSIG.setBackground(background);
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField();  }
        }else if(timeClicked < 1000){
            tf_OSIG.setText("");
            jbt_OSIG.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    }                                        

    private void jbt_BigBlockMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_BigBlockMouseReleased(java.awt.event.MouseEvent evt) {   
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            tf_BigBlock.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_BigBlock.setBackground(background);
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField();  }
        }else if(timeClicked < 1000){
            tf_BigBlock.setText("");
            jbt_BigBlock.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    }                                            

    private void jbt_BadBlockMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_BadBlockMouseReleased(java.awt.event.MouseEvent evt) {  
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            tf_BadBlock.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_BadBlock.setBackground(background);
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField();  }
        }else if(timeClicked < 1000){
            tf_BadBlock.setText("");
            jbt_BadBlock.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    }                                            

    private void jbt_LDVMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_LDVMouseReleased(java.awt.event.MouseEvent evt) {       
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            tf_LDV.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_LDV.setBackground(background);
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField();  }
        }else if(timeClicked < 1000){
            tf_LDV.setText("");
            jbt_LDV.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    }                                       

    private void jbt_FCRTMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_FCRTMouseReleased(java.awt.event.MouseEvent evt) {  
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            tf_FCRT.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_FCRT.setBackground(background);
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField();  }
        }else if(timeClicked < 1000){
            tf_FCRT.setText("");
            jbt_FCRT.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    }                                        

    private void jbt_CommentMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_CommentMouseReleased(java.awt.event.MouseEvent evt) { 
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            tf_Comment.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_Comment.setBackground(background);
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField();  }
        }else if(timeClicked < 1000){
            tf_Comment.setText("");
            jbt_Comment.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    }                                           

    private void jbt_First_NameMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_First_NameMouseReleased(java.awt.event.MouseEvent evt) {  
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            tf_First_Name.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_First_Name.setBackground(background);
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField();  }
        }else if(timeClicked < 1000){
            tf_First_Name.setText("");
            jbt_First_Name.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    }                                              

    private void jbt_Last_NameMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_Last_NameMouseReleased(java.awt.event.MouseEvent evt) {
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            tf_Last_Name.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_Last_Name.setBackground(background);
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField();  }
        }else if(timeClicked < 1000){
            tf_Last_Name.setText("");
            jbt_Last_Name.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    }                                             

    private void jbt_PseudoMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_PseudoMouseReleased(java.awt.event.MouseEvent evt) {  
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            tf_Pseudo.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_Pseudo.setBackground(background);
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField();  }
        }else if(timeClicked < 1000){
            tf_Pseudo.setText("");
            jbt_Pseudo.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    }                                          

    private void jbt_EmailMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_EmailMouseReleased(java.awt.event.MouseEvent evt) { 
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            tf_Email.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_Email.setBackground(background);
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField();  }
        }else if(timeClicked < 1000){
            tf_Email.setText("");
            jbt_Email.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    }                                         

    private void jbt_AddressMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_AddressMouseReleased(java.awt.event.MouseEvent evt) { 
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            tf_Address.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_Address.setBackground(background);
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField();  }
        }else if(timeClicked < 1000){
            tf_Address.setText("");
            jbt_Address.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    }                                           

    private void jbt_Flash_DriveMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_Flash_DriveMouseReleased(java.awt.event.MouseEvent evt) {
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            tf_Flash_Drive.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_Flash_Drive.setBackground(background);
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField();  }
        }else if(timeClicked < 1000){
            tf_Flash_Drive.setText("");
            jbt_Flash_Drive.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    }                                               

    private void jbt_Flash_Drive_TypeMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_Flash_Drive_TypeMouseReleased(java.awt.event.MouseEvent evt) {
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            tf_Flash_Drive_Type.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_Flash_Drive_Type.setBackground(background);
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField();  }
        }else if(timeClicked < 1000){
            tf_Flash_Drive_Type.setText("");
            jbt_Flash_Drive_Type.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    }                                                    

    private void jbt_Drive_TypeMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_Drive_TypeMouseReleased(java.awt.event.MouseEvent evt) {
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            tf_Drive_Type.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_Drive_Type.setBackground(background);
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField();  } 
        }else if(timeClicked < 1000){
            tf_Drive_Type.setText("");
            jbt_Drive_Type.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    }                                                
    
    private void jbt_MailCustomerMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_MailCustomerMouseReleased(java.awt.event.MouseEvent evt) {
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            tf_MailCustomer.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_MailCustomer.setBackground(background);
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField();  }  
        }else if(timeClicked < 1000){
            tf_MailCustomer.setText("");
            jbt_MailCustomer.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    }  
    
    private void jbt_MailPassWordMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_MailPassWordMouseReleased(java.awt.event.MouseEvent evt) { 
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            tf_MailPassWord.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_MailPassWord.setBackground(background);
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField();  } 
        }else if(timeClicked < 1000){
            tf_MailPassWord.setText("");
            jbt_MailPassWord.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    }    

    private void jbt_MailAreaMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_MailAreaMouseReleased(java.awt.event.MouseEvent evt) {  
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            tf_MailArea.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_MailArea.setBackground(background);
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField();  }
        }else if(timeClicked < 1000){
            tf_MailArea.setText("");
            jbt_MailArea.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    }    
    
    private void jbt_SubjectMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_SubjectMouseReleased(java.awt.event.MouseEvent evt) { 
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            tf_Subject.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_Subject.setBackground(background);
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField();  } 
        }else if(timeClicked < 1000){
            tf_Subject.setText("");
            jbt_Subject.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    }
    
    private void jbt_MailTechnicianMousePressed(java.awt.event.MouseEvent evt) {         
        pressedTime = new Date();
    }
    private void jbt_MailTechnicianMouseReleased(java.awt.event.MouseEvent evt) { 
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked > 1000) {
        Color background = JColorChooser.showDialog(TabbedPane.frame, "JColorChooser Sample", null);
        if (background != null) {
            tf_MailTechnician.setText(background.getRed() + "," + background.getGreen() + "," + background.getBlue());
            jbt_MailTechnician.setBackground(background);
        }
        if(ReturnGroupColorTextField() == true){  SetGroupColorTextField();  }
        }else if(timeClicked < 1000){
            tf_MailTechnician.setText("");
            jbt_MailTechnician.setBackground(jb_Reset.getBackground());
            if(ReturnGroupColorResetTextField() == true){  SetGroupColorResetTextField(); }
        }
    } 
  
    private boolean ReturnGroupColorResetLabel(){
        
        return  t_Address.getText().isEmpty()||
                t_BadBlock.getText().isEmpty()||
                t_BigBlock.getText().isEmpty()||
                t_CB_Version.getText().isEmpty()||
                t_CPU_KEY.getText().isEmpty()||
                t_Comment.getText().isEmpty()||
                t_Console_ID.getText().isEmpty()||
                t_Console_Type.getText().isEmpty()||
                t_CustomersList.getText().isEmpty()||
                t_DVD_KEY.getText().isEmpty()||
                t_Dash_Version_Hack.getText().isEmpty()||
                t_Dash_Version_Now.getText().isEmpty()||
                t_DualNand.getText().isEmpty()||
                t_Email.getText().isEmpty()||
                t_FCRT.getText().isEmpty()||
                t_First_Name.getText().isEmpty()||
                t_FlashDrive.getText().isEmpty()||
                t_Hack.getText().isEmpty()||
                t_LDV.getText().isEmpty()||
                t_Last_Name.getText().isEmpty()||
                t_MFR_Date.getText().isEmpty()||
                t_ModChip.getText().isEmpty()||
                t_OSIG.getText().isEmpty()||
                t_Pseudo.getText().isEmpty()||
                t_Region.getText().isEmpty()||
                t_SaveBodyXboxData.getText().isEmpty()||
                t_Serial.getText().isEmpty()||
                t_WarningMessage.getText().isEmpty()||
                t_Subject.getText().isEmpty()||
                t_MailCustomer.getText().isEmpty()||
                t_MailPassWord.getText().isEmpty()||
                t_Attachment.getText().isEmpty()||
                t_SendMail.getText().isEmpty()||
                t_MailTechnician.getText().isEmpty();
    }
    
    private boolean ReturnGroupColorResetTextField(){
        
        return  tf_Address.getText().isEmpty()||
                tf_BadBlock.getText().isEmpty()||
                tf_BigBlock.getText().isEmpty()||
                tf_CB_Version.getText().isEmpty()||
                tf_CPU_KEY.getText().isEmpty()||
                tf_Comment.getText().isEmpty()||
                tf_Console_ID.getText().isEmpty()||
                tf_Console_Type.getText().isEmpty()||
                tf_DVD_KEY.getText().isEmpty()||
                tf_Dash_Version_Hack.getText().isEmpty()||
                tf_Dash_Version_Now.getText().isEmpty()||
                tf_Drive_Type.getText().isEmpty()||
                tf_DualNand.getText().isEmpty()||
                tf_Email.getText().isEmpty()||
                tf_FCRT.getText().isEmpty()||
                tf_First_Name.getText().isEmpty()||
                tf_Flash_Drive.getText().isEmpty()||
                tf_Flash_Drive_Type.getText().isEmpty()||
                tf_Hack.getText().isEmpty()||
                tf_LDV.getText().isEmpty()||
                tf_Last_Name.getText().isEmpty()||
                tf_MFR_Date.getText().isEmpty()||
                tf_ModChip.getText().isEmpty()||
                tf_OSIG.getText().isEmpty()||
                tf_Pseudo.getText().isEmpty()||
                tf_Region.getText().isEmpty()||
                tf_Serial.getText().isEmpty()||
                tf_MailCustomer.getText().isEmpty()||
                tf_MailPassWord.getText().isEmpty()||
                tf_Subject.getText().isEmpty()||
                tf_MailArea.getText().isEmpty()||
                tf_MailTechnician.getText().isEmpty();  
    }
    
    private void SetGroupColorResetLabel(){
        if(!jbl_t_All_color.isEmpty()){
            if(t_CustomersList.getText().isEmpty()){
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());                             
                jbl_t_All_color = "";               
            }else if(t_CPU_KEY.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_DVD_KEY.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_Dash_Version_Now.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_Dash_Version_Hack.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_Console_Type.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_ModChip.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_DualNand.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_Hack.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_CB_Version.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_MFR_Date.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_Console_ID.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_Serial.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_Region.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_OSIG.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_BigBlock.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_BadBlock.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_LDV.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_FCRT.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_FlashDrive.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_Comment.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_First_Name.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_Last_Name.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_Pseudo.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_Email.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_Address.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_SaveBodyXboxData.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_WarningMessage.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_MailTechnician.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_MailPassWord.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_MailCustomer.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_Subject.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_Attachment.getText().isEmpty()){                
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(t_SendMail.getText().isEmpty()){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }            
        }
    }
    
    private void SetGroupColorResetTextField(){
        if(!jbt_tf_All_color.isEmpty()){           
            if(tf_CPU_KEY.getText().isEmpty()){               
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";                
            }else if(tf_DVD_KEY.getText().isEmpty()){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(tf_Dash_Version_Now.getText().isEmpty()){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(tf_Dash_Version_Hack.getText().isEmpty()){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(tf_Console_Type.getText().isEmpty()){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(tf_ModChip.getText().isEmpty()){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(tf_DualNand.getText().isEmpty()){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(tf_Hack.getText().isEmpty()){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(tf_CB_Version.getText().isEmpty()){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(tf_MFR_Date.getText().isEmpty()){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(tf_Console_ID.getText().isEmpty()){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(tf_Serial.getText().isEmpty()){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(tf_Region.getText().isEmpty()){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(tf_OSIG.getText().isEmpty()){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(tf_BigBlock.getText().isEmpty()){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(tf_BadBlock.getText().isEmpty()){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(tf_LDV.getText().isEmpty()){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(tf_FCRT.getText().isEmpty()){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(tf_Flash_Drive.getText().isEmpty()){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(tf_Flash_Drive_Type.getText().isEmpty()){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(tf_Drive_Type.getText().isEmpty()){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(tf_Comment.getText().isEmpty()){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(tf_First_Name.getText().isEmpty()){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(tf_Last_Name.getText().isEmpty()){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(tf_Pseudo.getText().isEmpty()){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(tf_Email.getText().isEmpty()){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(tf_Address.getText().isEmpty()){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(tf_MailTechnician.getText().isEmpty()){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(tf_MailPassWord.getText().isEmpty()){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(tf_MailCustomer.getText().isEmpty()){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(tf_Subject.getText().isEmpty()){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(tf_MailArea.getText().isEmpty()){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }           
        }
    }
    
    private boolean ReturnGroupColorLabel(){
        
        return  !jbl_Address.getBackground().equals(jb_Reset.getBackground())||
                !jbl_BadBlock.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_BigBlock.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_CB_Version.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_CPU_KEY.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_Comment.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_Console_ID.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_Console_Type.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_CustomersList.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_DVD_KEY.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_Dash_Version_Hack.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_Dash_Version_Now.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_DualNand.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_Email.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_FCRT.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_First_Name.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_Last_Name.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_FlashDrive.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_Hack.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_LDV.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_MFR_Date.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_ModChip.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_OSIG.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_Pseudo.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_Region.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_SaveBodyXboxData.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_Serial.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_WarningMessage.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_Subject.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_MailCustomer.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_MailPassWord.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_Attachment.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_SendMail.getBackground().equals(jb_Reset.getBackground()) ||
                !jbl_MailTechnician.getBackground().equals(jb_Reset.getBackground());
    }
    
    private boolean ReturnGroupColorTextField(){
        
        return  !jbt_Address.getBackground().equals(jb_Reset.getBackground())||
                !jbt_BadBlock.getBackground().equals(jb_Reset.getBackground()) ||
                !jbt_BigBlock.getBackground().equals(jb_Reset.getBackground()) ||
                !jbt_CB_Version.getBackground().equals(jb_Reset.getBackground()) ||
                !jbt_CPU_KEY.getBackground().equals(jb_Reset.getBackground()) ||
                !jbt_Comment.getBackground().equals(jb_Reset.getBackground()) ||
                !jbt_Console_ID.getBackground().equals(jb_Reset.getBackground()) ||
                !jbt_Console_Type.getBackground().equals(jb_Reset.getBackground()) ||
                !jbt_DVD_KEY.getBackground().equals(jb_Reset.getBackground()) ||
                !jbt_Dash_Version_Hack.getBackground().equals(jb_Reset.getBackground()) ||
                !jbt_Dash_Version_Now.getBackground().equals(jb_Reset.getBackground()) ||
                !jbt_DualNand.getBackground().equals(jb_Reset.getBackground()) ||
                !jbt_Email.getBackground().equals(jb_Reset.getBackground()) ||
                !jbt_FCRT.getBackground().equals(jb_Reset.getBackground()) ||
                !jbt_First_Name.getBackground().equals(jb_Reset.getBackground()) ||
                !jbt_Last_Name.getBackground().equals(jb_Reset.getBackground()) ||
                !jbt_Flash_Drive.getBackground().equals(jb_Reset.getBackground()) ||
                !jbt_Flash_Drive_Type.getBackground().equals(jb_Reset.getBackground()) ||
                !jbt_Drive_Type.getBackground().equals(jb_Reset.getBackground()) ||
                !jbt_Hack.getBackground().equals(jb_Reset.getBackground()) ||
                !jbt_LDV.getBackground().equals(jb_Reset.getBackground()) ||
                !jbt_MFR_Date.getBackground().equals(jb_Reset.getBackground()) ||
                !jbt_ModChip.getBackground().equals(jb_Reset.getBackground()) ||
                !jbt_OSIG.getBackground().equals(jb_Reset.getBackground()) ||
                !jbt_Pseudo.getBackground().equals(jb_Reset.getBackground()) ||
                !jbt_Region.getBackground().equals(jb_Reset.getBackground()) ||
                !jbt_Serial.getBackground().equals(jb_Reset.getBackground()) ||
                !jbt_MailCustomer.getBackground().equals(jb_Reset.getBackground()) ||
                !jbt_MailPassWord.getBackground().equals(jb_Reset.getBackground()) ||
                !jbt_Subject.getBackground().equals(jb_Reset.getBackground()) ||
                !jbt_MailArea.getBackground().equals(jb_Reset.getBackground()) ||
                !jbt_MailTechnician.getBackground().equals(jb_Reset.getBackground());  
    }

    private void SetGroupColorLabel(){
        if(!jbl_t_All_color.isEmpty()){
            if(!jbl_CustomersList.getBackground().equals(jb_Reset.getBackground()) && !jbl_CustomersList.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground().getRGB()))){
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());                             
                jbl_t_All_color = "";               
            }else if(!jbl_CPU_KEY.getBackground().equals(jb_Reset.getBackground()) && !jbl_CPU_KEY.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_DVD_KEY.getBackground().equals(jb_Reset.getBackground()) && !jbl_DVD_KEY.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_Dash_Version_Now.getBackground().equals(jb_Reset.getBackground()) && !jbl_Dash_Version_Now.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_Dash_Version_Hack.getBackground().equals(jb_Reset.getBackground()) && !jbl_Dash_Version_Hack.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_Console_Type.getBackground().equals(jb_Reset.getBackground()) && !jbl_Console_Type.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_ModChip.getBackground().equals(jb_Reset.getBackground()) && !jbl_ModChip.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_DualNand.getBackground().equals(jb_Reset.getBackground()) && !jbl_DualNand.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_Hack.getBackground().equals(jb_Reset.getBackground()) && !jbl_Hack.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_CB_Version.getBackground().equals(jb_Reset.getBackground()) && !jbl_CB_Version.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_MFR_Date.getBackground().equals(jb_Reset.getBackground()) && !jbl_MFR_Date.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_Console_ID.getBackground().equals(jb_Reset.getBackground()) && !jbl_Console_ID.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_Serial.getBackground().equals(jb_Reset.getBackground()) && !jbl_Serial.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_Region.getBackground().equals(jb_Reset.getBackground()) && !jbl_Region.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_OSIG.getBackground().equals(jb_Reset.getBackground()) && !jbl_OSIG.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_BigBlock.getBackground().equals(jb_Reset.getBackground()) && !jbl_BigBlock.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_BadBlock.getBackground().equals(jb_Reset.getBackground()) && !jbl_BadBlock.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_LDV.getBackground().equals(jb_Reset.getBackground()) && !jbl_LDV.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_FCRT.getBackground().equals(jb_Reset.getBackground()) && !jbl_FCRT.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_FlashDrive.getBackground().equals(jb_Reset.getBackground()) && !jbl_FlashDrive.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_Comment.getBackground().equals(jb_Reset.getBackground()) && !jbl_Comment.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_First_Name.getBackground().equals(jb_Reset.getBackground()) && !jbl_First_Name.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_Last_Name.getBackground().equals(jb_Reset.getBackground()) && !jbl_Last_Name.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_Pseudo.getBackground().equals(jb_Reset.getBackground()) && !jbl_Pseudo.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_Email.getBackground().equals(jb_Reset.getBackground()) && !jbl_Email.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_Address.getBackground().equals(jb_Reset.getBackground()) && !jbl_Address.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_SaveBodyXboxData.getBackground().equals(jb_Reset.getBackground()) && !jbl_SaveBodyXboxData.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_WarningMessage.getBackground().equals(jb_Reset.getBackground()) && !jbl_WarningMessage.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_MailTechnician.getBackground().equals(jb_Reset.getBackground()) && !jbl_MailTechnician.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_MailPassWord.getBackground().equals(jb_Reset.getBackground()) && !jbl_MailPassWord.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_MailCustomer.getBackground().equals(jb_Reset.getBackground()) && !jbl_MailCustomer.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_Subject.getBackground().equals(jb_Reset.getBackground()) && !jbl_Subject.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_Attachment.getBackground().equals(jb_Reset.getBackground()) && !jbl_Attachment.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){                
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_SendMail.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }else if(!jbl_SendMail.getBackground().equals(jb_Reset.getBackground()) && !jbl_SendMail.getBackground().equals(!jbl_t_All.getBackground().equals(jb_Reset.getBackground()))){
                jbl_CustomersList.setBackground(jbl_t_All.getBackground());
                jbl_CPU_KEY.setBackground(jbl_t_All.getBackground());
                jbl_DVD_KEY.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Now.setBackground(jbl_t_All.getBackground());
                jbl_Dash_Version_Hack.setBackground(jbl_t_All.getBackground());
                jbl_Console_Type.setBackground(jbl_t_All.getBackground());
                jbl_ModChip.setBackground(jbl_t_All.getBackground());
                jbl_DualNand.setBackground(jbl_t_All.getBackground());
                jbl_Hack.setBackground(jbl_t_All.getBackground());
                jbl_CB_Version.setBackground(jbl_t_All.getBackground());
                jbl_MFR_Date.setBackground(jbl_t_All.getBackground());
                jbl_Console_ID.setBackground(jbl_t_All.getBackground());
                jbl_Serial.setBackground(jbl_t_All.getBackground());
                jbl_Region.setBackground(jbl_t_All.getBackground());
                jbl_OSIG.setBackground(jbl_t_All.getBackground());
                jbl_BigBlock.setBackground(jbl_t_All.getBackground());
                jbl_BadBlock.setBackground(jbl_t_All.getBackground());
                jbl_LDV.setBackground(jbl_t_All.getBackground());
                jbl_FCRT.setBackground(jbl_t_All.getBackground());
                jbl_FlashDrive.setBackground(jbl_t_All.getBackground());
                jbl_Comment.setBackground(jbl_t_All.getBackground());
                jbl_First_Name.setBackground(jbl_t_All.getBackground());
                jbl_Last_Name.setBackground(jbl_t_All.getBackground());
                jbl_Pseudo.setBackground(jbl_t_All.getBackground());
                jbl_Email.setBackground(jbl_t_All.getBackground());
                jbl_Address.setBackground(jbl_t_All.getBackground());
                jbl_SaveBodyXboxData.setBackground(jbl_t_All.getBackground());
                jbl_WarningMessage.setBackground(jbl_t_All.getBackground());
                jbl_MailTechnician.setBackground(jbl_t_All.getBackground());
                jbl_MailPassWord.setBackground(jbl_t_All.getBackground());
                jbl_MailCustomer.setBackground(jbl_t_All.getBackground());
                jbl_Subject.setBackground(jbl_t_All.getBackground());
                jbl_Attachment.setBackground(jbl_t_All.getBackground());
                jbl_t_All.setBackground(jb_Reset.getBackground());
                jbl_t_All_color = "";
            }            
        }
    }
    
    private void SetGroupColorTextField(){
        if(!jbt_tf_All_color.isEmpty()){           
            if(!jbt_CPU_KEY.getBackground().equals(jb_Reset.getBackground()) && !jbt_CPU_KEY.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){               
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";                
            }else if(!jbt_DVD_KEY.getBackground().equals(jb_Reset.getBackground()) && !jbt_DVD_KEY.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(!jbt_Dash_Version_Now.getBackground().equals(jb_Reset.getBackground()) && !jbt_Dash_Version_Now.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(!jbt_Dash_Version_Hack.getBackground().equals(jb_Reset.getBackground()) && !jbt_Dash_Version_Hack.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(!jbt_Console_Type.getBackground().equals(jb_Reset.getBackground()) && !jbt_Console_Type.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(!jbt_ModChip.getBackground().equals(jb_Reset.getBackground()) && !jbt_ModChip.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(!jbt_DualNand.getBackground().equals(jb_Reset.getBackground()) && !jbt_DualNand.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(!jbt_Hack.getBackground().equals(jb_Reset.getBackground()) && !jbt_Hack.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(!jbt_CB_Version.getBackground().equals(jb_Reset.getBackground()) && !jbt_CB_Version.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(!jbt_MFR_Date.getBackground().equals(jb_Reset.getBackground()) && !jbt_MFR_Date.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(!jbt_Console_ID.getBackground().equals(jb_Reset.getBackground()) && !jbt_Console_ID.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(!jbt_Serial.getBackground().equals(jb_Reset.getBackground()) && !jbt_Serial.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(!jbt_Region.getBackground().equals(jb_Reset.getBackground()) && !jbt_Region.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(!jbt_OSIG.getBackground().equals(jb_Reset.getBackground()) && !jbt_OSIG.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(!jbt_BigBlock.getBackground().equals(jb_Reset.getBackground()) && !jbt_BigBlock.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(!jbt_BadBlock.getBackground().equals(jb_Reset.getBackground()) && !jbt_BadBlock.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(!jbt_LDV.getBackground().equals(jb_Reset.getBackground()) && !jbt_LDV.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(!jbt_FCRT.getBackground().equals(jb_Reset.getBackground()) && !jbt_FCRT.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(!jbt_Flash_Drive.getBackground().equals(jb_Reset.getBackground()) && !jbt_Flash_Drive.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(!jbt_Flash_Drive_Type.getBackground().equals(jb_Reset.getBackground()) && !jbt_Flash_Drive_Type.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(!jbt_Drive_Type.getBackground().equals(jb_Reset.getBackground()) && !jbt_Drive_Type.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(!jbt_Comment.getBackground().equals(jb_Reset.getBackground()) && !jbt_Comment.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(!jbt_First_Name.getBackground().equals(jb_Reset.getBackground()) && !jbt_First_Name.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(!jbt_Last_Name.getBackground().equals(jb_Reset.getBackground()) && !jbt_Last_Name.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(!jbt_Pseudo.getBackground().equals(jb_Reset.getBackground()) && !jbt_Pseudo.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(!jbt_Email.getBackground().equals(jb_Reset.getBackground()) && !jbt_Email.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(!jbt_Address.getBackground().equals(jb_Reset.getBackground()) && !jbt_Address.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(!jbt_MailTechnician.getBackground().equals(jb_Reset.getBackground()) && !jbt_MailTechnician.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(!jbt_MailPassWord.getBackground().equals(jb_Reset.getBackground()) && !jbt_MailPassWord.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(!jbt_MailCustomer.getBackground().equals(jb_Reset.getBackground()) && !jbt_MailCustomer.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(!jbt_Subject.getBackground().equals(jb_Reset.getBackground()) && !jbt_Subject.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_MailArea.setBackground(jbt_tf_All.getBackground());             
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }else if(!jbt_MailArea.getBackground().equals(jb_Reset.getBackground()) && !jbt_MailArea.getBackground().equals(!jbt_tf_All.getBackground().equals(jb_Reset.getBackground()))){
                jbt_CPU_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_DVD_KEY.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Now.setBackground(jbt_tf_All.getBackground());
                jbt_Dash_Version_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_Console_Type.setBackground(jbt_tf_All.getBackground());
                jbt_ModChip.setBackground(jbt_tf_All.getBackground());
                jbt_DualNand.setBackground(jbt_tf_All.getBackground());
                jbt_Hack.setBackground(jbt_tf_All.getBackground());
                jbt_CB_Version.setBackground(jbt_tf_All.getBackground());
                jbt_MFR_Date.setBackground(jbt_tf_All.getBackground());
                jbt_Console_ID.setBackground(jbt_tf_All.getBackground());
                jbt_Serial.setBackground(jbt_tf_All.getBackground());
                jbt_Region.setBackground(jbt_tf_All.getBackground());
                jbt_OSIG.setBackground(jbt_tf_All.getBackground());
                jbt_BigBlock.setBackground(jbt_tf_All.getBackground());
                jbt_BadBlock.setBackground(jbt_tf_All.getBackground());
                jbt_LDV.setBackground(jbt_tf_All.getBackground());
                jbt_FCRT.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive.setBackground(jbt_tf_All.getBackground());
                jbt_Flash_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Drive_Type.setBackground(jbt_tf_All.getBackground());
                jbt_Comment.setBackground(jbt_tf_All.getBackground());
                jbt_First_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Last_Name.setBackground(jbt_tf_All.getBackground());
                jbt_Pseudo.setBackground(jbt_tf_All.getBackground());
                jbt_Email.setBackground(jbt_tf_All.getBackground());
                jbt_Address.setBackground(jbt_tf_All.getBackground());
                jbt_MailTechnician.setBackground(jbt_tf_All.getBackground());
                jbt_MailPassWord.setBackground(jbt_tf_All.getBackground());		
                jbt_MailCustomer.setBackground(jbt_tf_All.getBackground());       
                jbt_Subject.setBackground(jbt_tf_All.getBackground());
                jbt_tf_All.setBackground(jb_Reset.getBackground());
                jbt_tf_All_color = "";
            }           
        }
    }
    
    private void Reset(){
        
        CB_Base.setSelectedIndex(0);
        CB_Customer.setSelectedIndex(0);
        CB_Display.setSelectedIndex(0);
        CB_EditBodyXbox.setSelectedIndex(0);
        CB_Mail.setSelectedIndex(0);
        CB_Options.setSelectedIndex(0);
        jbl_CustomersList.setBackground(jb_Reset.getBackground());
	jbl_CPU_KEY.setBackground(jb_Reset.getBackground());
	jbl_DVD_KEY.setBackground(jb_Reset.getBackground());
	jbl_Dash_Version_Now.setBackground(jb_Reset.getBackground());
	jbl_Dash_Version_Hack.setBackground(jb_Reset.getBackground());
	jbl_Console_Type.setBackground(jb_Reset.getBackground());
	jbl_ModChip.setBackground(jb_Reset.getBackground());
	jbl_DualNand.setBackground(jb_Reset.getBackground());
	jbl_Hack.setBackground(jb_Reset.getBackground());
	jbl_CB_Version.setBackground(jb_Reset.getBackground());
	jbl_MFR_Date.setBackground(jb_Reset.getBackground());
	jbl_Console_ID.setBackground(jb_Reset.getBackground());
	jbl_Serial.setBackground(jb_Reset.getBackground());
	jbl_Region.setBackground(jb_Reset.getBackground());
	jbl_OSIG.setBackground(jb_Reset.getBackground());
	jbl_BigBlock.setBackground(jb_Reset.getBackground());
	jbl_BadBlock.setBackground(jb_Reset.getBackground());
	jbl_LDV.setBackground(jb_Reset.getBackground());
	jbl_FCRT.setBackground(jb_Reset.getBackground());
	jbl_FlashDrive.setBackground(jb_Reset.getBackground());
	jbl_Comment.setBackground(jb_Reset.getBackground());
	jbl_First_Name.setBackground(jb_Reset.getBackground());
	jbl_Last_Name.setBackground(jb_Reset.getBackground());
	jbl_Pseudo.setBackground(jb_Reset.getBackground());
	jbl_Email.setBackground(jb_Reset.getBackground());
        jbl_Address.setBackground(jb_Reset.getBackground());
	jbl_SaveBodyXboxData.setBackground(jb_Reset.getBackground());
	jbl_WarningMessage.setBackground(jb_Reset.getBackground());
	jbl_MailTechnician.setBackground(jb_Reset.getBackground());
	jbl_MailPassWord.setBackground(jb_Reset.getBackground());
	jbl_MailCustomer.setBackground(jb_Reset.getBackground());
	jbl_Subject.setBackground(jb_Reset.getBackground());
	jbl_Attachment.setBackground(jb_Reset.getBackground());
	jbl_SendMail.setBackground(jb_Reset.getBackground());
        jbl_t_All.setBackground(jb_Reset.getBackground());
        jbt_CPU_KEY.setBackground(jb_Reset.getBackground());
	jbt_DVD_KEY.setBackground(jb_Reset.getBackground());
	jbt_Dash_Version_Now.setBackground(jb_Reset.getBackground());
	jbt_Dash_Version_Hack.setBackground(jb_Reset.getBackground());
	jbt_Console_Type.setBackground(jb_Reset.getBackground());
	jbt_ModChip.setBackground(jb_Reset.getBackground());
	jbt_DualNand.setBackground(jb_Reset.getBackground());
	jbt_Hack.setBackground(jb_Reset.getBackground());
	jbt_CB_Version.setBackground(jb_Reset.getBackground());
	jbt_MFR_Date.setBackground(jb_Reset.getBackground());
	jbt_Console_ID.setBackground(jb_Reset.getBackground());
	jbt_Serial.setBackground(jb_Reset.getBackground());
	jbt_Region.setBackground(jb_Reset.getBackground());
	jbt_OSIG.setBackground(jb_Reset.getBackground());
	jbt_BigBlock.setBackground(jb_Reset.getBackground());
	jbt_BadBlock.setBackground(jb_Reset.getBackground());
	jbt_LDV.setBackground(jb_Reset.getBackground());
	jbt_FCRT.setBackground(jb_Reset.getBackground());
	jbt_Flash_Drive.setBackground(jb_Reset.getBackground());
	jbt_Flash_Drive_Type.setBackground(jb_Reset.getBackground());
	jbt_Drive_Type.setBackground(jb_Reset.getBackground());
	jbt_Comment.setBackground(jb_Reset.getBackground());
	jbt_First_Name.setBackground(jb_Reset.getBackground());
	jbt_Last_Name.setBackground(jb_Reset.getBackground());
	jbt_Pseudo.setBackground(jb_Reset.getBackground());
	jbt_Email.setBackground(jb_Reset.getBackground());
	jbt_Address.setBackground(jb_Reset.getBackground());
	jbt_MailTechnician.setBackground(jb_Reset.getBackground());
	jbt_MailPassWord.setBackground(jb_Reset.getBackground());		
        jbt_MailCustomer.setBackground(jb_Reset.getBackground());       
        jbt_Subject.setBackground(jb_Reset.getBackground());
        jbt_MailArea.setBackground(jb_Reset.getBackground());             
        jbt_tf_All.setBackground(jb_Reset.getBackground());
        t_CustomersList.setText("");
        t_CPU_KEY.setText("");
        t_DVD_KEY.setText("");
        t_Dash_Version_Now.setText("");
        t_Dash_Version_Hack.setText("");
        t_Console_Type.setText("");
        t_ModChip.setText("");
        t_DualNand.setText("");
        t_Hack.setText("");
        t_CB_Version.setText("");
        t_MFR_Date.setText("");
        t_Console_ID.setText("");
        t_Serial.setText("");
        t_Region.setText("");
        t_OSIG.setText("");
        t_BigBlock.setText("");
        t_BadBlock.setText("");
        t_LDV.setText("");
        t_FCRT.setText("");
        t_FlashDrive.setText("");
        t_Comment.setText("");
        t_First_Name.setText("");
        t_Last_Name.setText("");
        t_Pseudo.setText("");
        t_Email.setText("");
        t_Address.setText("");
        t_SaveBodyXboxData.setText("");
        t_WarningMessage.setText("");
        t_MailTechnician.setText("");
        t_MailPassWord.setText("");
        t_MailCustomer.setText("");
        t_Subject.setText("");
        t_Attachment.setText("");
        t_SendMail.setText("");
        tcb_Dash_Version_Hack.setText("");
        tcb_Drive_Type.setText("");
        tcb_DualNand.setText("");
        tcb_Flash_Drive_Type.setText("");
        tcb_Hack.setText("");
        tcb_ModChip.setText("");
        tf_CPU_KEY.setText("");
        tf_DVD_KEY.setText("");
        tf_Dash_Version_Now.setText("");
        tf_Dash_Version_Hack.setText("");
        tf_Console_Type.setText("");
        tf_ModChip.setText("");
        tf_DualNand.setText("");
        tf_Hack.setText("");
        tf_CB_Version.setText("");
        tf_MFR_Date.setText("");
        tf_Console_ID.setText("");
        tf_Serial.setText("");
        tf_Region.setText("");
        tf_OSIG.setText("");
        tf_BigBlock.setText("");
        tf_BadBlock.setText("");
        tf_LDV.setText("");
        tf_FCRT.setText("");
        tf_Flash_Drive.setText("");
        tf_Flash_Drive_Type.setText("");
        tf_Drive_Type.setText("");
        tf_Comment.setText("");
        tf_First_Name.setText("");
        tf_Last_Name.setText("");
        tf_Pseudo.setText("");
        tf_Email.setText("");
        tf_Address.setText("");
        tf_MailTechnician.setText("");
        tf_MailPassWord.setText("");
        tf_MailCustomer.setText("");
        tf_Subject.setText("");
        tf_MailArea.setText("");
        t_SMTP_PORT.setText("");
        t_SMTP_ADDRESS.setText("");
        t_AppPassword.setText("");
        t_EmailTechnician.setText("");
        t_EmailPassWord.setText("");
        jbl_t_All_color = "";
        jbt_tf_All_color = "";
    }

    private void centerTextJTextfield(){
        
        t_Address.setHorizontalAlignment(JTextField.CENTER);
        t_BadBlock.setHorizontalAlignment(JTextField.CENTER);
        t_BigBlock.setHorizontalAlignment(JTextField.CENTER);
        t_CB_Version.setHorizontalAlignment(JTextField.CENTER);
        t_CPU_KEY.setHorizontalAlignment(JTextField.CENTER);
        t_Comment.setHorizontalAlignment(JTextField.CENTER);
        t_Console_ID.setHorizontalAlignment(JTextField.CENTER);
        t_Console_Type.setHorizontalAlignment(JTextField.CENTER);
        t_CustomersList.setHorizontalAlignment(JTextField.CENTER);
        t_DVD_KEY.setHorizontalAlignment(JTextField.CENTER);
        t_Dash_Version_Hack.setHorizontalAlignment(JTextField.CENTER);
        t_Dash_Version_Now.setHorizontalAlignment(JTextField.CENTER);
        t_DualNand.setHorizontalAlignment(JTextField.CENTER);
        t_Email.setHorizontalAlignment(JTextField.CENTER);
        t_FCRT.setHorizontalAlignment(JTextField.CENTER);
        t_First_Name.setHorizontalAlignment(JTextField.CENTER);
        t_FlashDrive.setHorizontalAlignment(JTextField.CENTER);
        t_Hack.setHorizontalAlignment(JTextField.CENTER);
        t_LDV.setHorizontalAlignment(JTextField.CENTER);
        t_Last_Name.setHorizontalAlignment(JTextField.CENTER);
        t_MFR_Date.setHorizontalAlignment(JTextField.CENTER);
        t_ModChip.setHorizontalAlignment(JTextField.CENTER);
        t_OSIG.setHorizontalAlignment(JTextField.CENTER);
        t_Pseudo.setHorizontalAlignment(JTextField.CENTER);
        t_Region.setHorizontalAlignment(JTextField.CENTER);
        t_SaveBodyXboxData.setHorizontalAlignment(JTextField.CENTER);
        t_Serial.setHorizontalAlignment(JTextField.CENTER);
        t_WarningMessage.setHorizontalAlignment(JTextField.CENTER);
        t_Subject.setHorizontalAlignment(JTextField.CENTER);
        t_MailCustomer.setHorizontalAlignment(JTextField.CENTER);
        t_MailPassWord.setHorizontalAlignment(JTextField.CENTER);
        t_Attachment.setHorizontalAlignment(JTextField.CENTER);
        t_SendMail.setHorizontalAlignment(JTextField.CENTER);
        t_MailTechnician.setHorizontalAlignment(JTextField.CENTER);   
        tf_Address.setHorizontalAlignment(JTextField.CENTER);
        tf_BadBlock.setHorizontalAlignment(JTextField.CENTER);
        tf_BigBlock.setHorizontalAlignment(JTextField.CENTER);
        tf_CB_Version.setHorizontalAlignment(JTextField.CENTER);
        tf_CPU_KEY.setHorizontalAlignment(JTextField.CENTER);
        tf_Comment.setHorizontalAlignment(JTextField.CENTER);
        tf_Console_ID.setHorizontalAlignment(JTextField.CENTER);
        tf_Console_Type.setHorizontalAlignment(JTextField.CENTER);
        tf_DVD_KEY.setHorizontalAlignment(JTextField.CENTER);
        tf_Dash_Version_Hack.setHorizontalAlignment(JTextField.CENTER);
        tf_Dash_Version_Now.setHorizontalAlignment(JTextField.CENTER);
        tf_Drive_Type.setHorizontalAlignment(JTextField.CENTER);
        tf_DualNand.setHorizontalAlignment(JTextField.CENTER);
        tf_Email.setHorizontalAlignment(JTextField.CENTER);
        tf_FCRT.setHorizontalAlignment(JTextField.CENTER);
        tf_First_Name.setHorizontalAlignment(JTextField.CENTER);
        tf_Flash_Drive.setHorizontalAlignment(JTextField.CENTER);
        tf_Flash_Drive_Type.setHorizontalAlignment(JTextField.CENTER);
        tf_Hack.setHorizontalAlignment(JTextField.CENTER);
        tf_LDV.setHorizontalAlignment(JTextField.CENTER);
        tf_Last_Name.setHorizontalAlignment(JTextField.CENTER);
        tf_MFR_Date.setHorizontalAlignment(JTextField.CENTER);
        tf_ModChip.setHorizontalAlignment(JTextField.CENTER);
        tf_OSIG.setHorizontalAlignment(JTextField.CENTER);
        tf_Pseudo.setHorizontalAlignment(JTextField.CENTER);
        tf_Region.setHorizontalAlignment(JTextField.CENTER);
        tf_Serial.setHorizontalAlignment(JTextField.CENTER);
        tf_MailCustomer.setHorizontalAlignment(JTextField.CENTER);
        tf_MailPassWord.setHorizontalAlignment(JTextField.CENTER);
        tf_Subject.setHorizontalAlignment(JTextField.CENTER);
        tf_MailArea.setHorizontalAlignment(JTextField.CENTER);
        tf_MailTechnician.setHorizontalAlignment(JTextField.CENTER);
        t_SMTP_PORT.setHorizontalAlignment(JTextField.CENTER);
        t_SMTP_ADDRESS.setHorizontalAlignment(JTextField.CENTER);
        t_AppPassword.setHorizontalAlignment(JPasswordField.CENTER);
        t_EmailTechnician.setHorizontalAlignment(JTextField.CENTER);
        t_EmailPassWord.setHorizontalAlignment(JPasswordField.CENTER);        
    }
    
    private int StringToInt(String STR) {
        int str = Integer.parseInt(STR);
        return str;
    }
    
    private void GetColorTextLabel(){
        if(!"".equals(SQLiteQueries.jb_t_AllColor) && SQLiteQueries.jb_t_AllColor != null){
            t_Address.setText(SQLiteQueries.jb_t_AllColor);
            t_BadBlock.setText(SQLiteQueries.jb_t_AllColor);
            t_BigBlock.setText(SQLiteQueries.jb_t_AllColor);
            t_CB_Version.setText(SQLiteQueries.jb_t_AllColor);
            t_CPU_KEY.setText(SQLiteQueries.jb_t_AllColor);
            t_Comment.setText(SQLiteQueries.jb_t_AllColor);
            t_Console_ID.setText(SQLiteQueries.jb_t_AllColor);
            t_Console_Type.setText(SQLiteQueries.jb_t_AllColor);
            t_CustomersList.setText(SQLiteQueries.jb_t_AllColor);
            t_DVD_KEY.setText(SQLiteQueries.jb_t_AllColor);
            t_Dash_Version_Hack.setText(SQLiteQueries.jb_t_AllColor);
            t_Dash_Version_Now.setText(SQLiteQueries.jb_t_AllColor);
            t_DualNand.setText(SQLiteQueries.jb_t_AllColor);
            t_Email.setText(SQLiteQueries.jb_t_AllColor);
            t_FCRT.setText(SQLiteQueries.jb_t_AllColor);
            t_First_Name.setText(SQLiteQueries.jb_t_AllColor);
            t_FlashDrive.setText(SQLiteQueries.jb_t_AllColor);
            t_Hack.setText(SQLiteQueries.jb_t_AllColor);
            t_LDV.setText(SQLiteQueries.jb_t_AllColor);
            t_Last_Name.setText(SQLiteQueries.jb_t_AllColor);
            t_MFR_Date.setText(SQLiteQueries.jb_t_AllColor);
            t_ModChip.setText(SQLiteQueries.jb_t_AllColor);
            t_OSIG.setText(SQLiteQueries.jb_t_AllColor);
            t_Pseudo.setText(SQLiteQueries.jb_t_AllColor);
            t_Region.setText(SQLiteQueries.jb_t_AllColor);
            t_SaveBodyXboxData.setText(SQLiteQueries.jb_t_AllColor);
            t_Serial.setText(SQLiteQueries.jb_t_AllColor);
            t_WarningMessage.setText(SQLiteQueries.jb_t_AllColor);
            t_Subject.setText(SQLiteQueries.jb_t_AllColor);
            t_MailCustomer.setText(SQLiteQueries.jb_t_AllColor);
            t_MailPassWord.setText(SQLiteQueries.jb_t_AllColor);
            t_Attachment.setText(SQLiteQueries.jb_t_AllColor);
            t_SendMail.setText(SQLiteQueries.jb_t_AllColor);
            t_MailTechnician.setText(SQLiteQueries.jb_t_AllColor);
            int R;
            int G;
            int B;
            String s = SQLiteQueries.jb_t_AllColor;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_t_All.setBackground(new Color(R, G, B));
        }else{        
            if(SQLiteQueries.CustomersList != null && !"".equals(SQLiteQueries.CustomersList)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.CustomersList;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_CustomersList.setBackground(new Color(R, G, B));
            t_CustomersList.setText(s);
            }if(SQLiteQueries.LastName != null && !"".equals(SQLiteQueries.LastName)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.LastName;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_Last_Name.setBackground(new Color(R, G, B));
            t_Last_Name.setText(s);
            }if(SQLiteQueries.FirstName != null && !"".equals(SQLiteQueries.FirstName)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.FirstName;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_First_Name.setBackground(new Color(R, G, B));
            t_First_Name.setText(s);
            }if(SQLiteQueries.pseudo != null && !"".equals(SQLiteQueries.pseudo)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.pseudo;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_Pseudo.setBackground(new Color(R, G, B));
            t_Pseudo.setText(s);
            }if(SQLiteQueries.email != null && !"".equals(SQLiteQueries.email)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.email;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_Email.setBackground(new Color(R, G, B));
            t_Email.setText(s);
            }if(SQLiteQueries.address != null && !"".equals(SQLiteQueries.address)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.address;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_Address.setBackground(new Color(R, G, B));
            t_Address.setText(s);
            }if(SQLiteQueries.CPU_KEY != null && !"".equals(SQLiteQueries.CPU_KEY)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.CPU_KEY;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_CPU_KEY.setBackground(new Color(R, G, B));
            t_CPU_KEY.setText(s);
            }if(SQLiteQueries.DVD_KEY != null && !"".equals(SQLiteQueries.DVD_KEY)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.DVD_KEY;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_DVD_KEY.setBackground(new Color(R, G, B));
            t_DVD_KEY.setText(s);
            }if(SQLiteQueries.Dash_Version_Now != null && !"".equals(SQLiteQueries.Dash_Version_Now)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.Dash_Version_Now;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_Dash_Version_Now.setBackground(new Color(R, G, B));
            t_Dash_Version_Now.setText(s);
            }if(SQLiteQueries.Dash_Version_Hack != null && !"".equals(SQLiteQueries.Dash_Version_Hack)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.Dash_Version_Hack;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_Dash_Version_Hack.setBackground(new Color(R, G, B));
            t_Dash_Version_Hack.setText(s);
            }if(SQLiteQueries.Console_Type != null && !"".equals(SQLiteQueries.Console_Type)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.Console_Type;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_Console_Type.setBackground(new Color(R, G, B));
            t_Console_Type.setText(s);
            }if(SQLiteQueries.ModChip != null && !"".equals(SQLiteQueries.ModChip)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.ModChip;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_ModChip.setBackground(new Color(R, G, B));
            t_ModChip.setText(s);
            }if(SQLiteQueries.DualNand != null && !"".equals(SQLiteQueries.DualNand)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.DualNand;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_DualNand.setBackground(new Color(R, G, B));
            t_DualNand.setText(s);
            }if(SQLiteQueries.Hack != null && !"".equals(SQLiteQueries.Hack)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.Hack;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_Hack.setBackground(new Color(R, G, B));
            t_Hack.setText(s);
            }if(SQLiteQueries.CB_Version != null && !"".equals(SQLiteQueries.CB_Version)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.CB_Version;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_CB_Version.setBackground(new Color(R, G, B));
            t_CB_Version.setText(s);
            }if(SQLiteQueries.MFR_Date != null && !"".equals(SQLiteQueries.MFR_Date)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.MFR_Date;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_MFR_Date.setBackground(new Color(R, G, B));
            t_MFR_Date.setText(s);
            }if(SQLiteQueries.Console_ID != null && !"".equals(SQLiteQueries.Console_ID)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.Console_ID;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_Console_ID.setBackground(new Color(R, G, B));
            t_Console_ID.setText(s);
            }if(SQLiteQueries.Serial != null && !"".equals(SQLiteQueries.Serial)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.Serial;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_Serial.setBackground(new Color(R, G, B));
            t_Serial.setText(s);
            }if(SQLiteQueries.Region != null && !"".equals(SQLiteQueries.Region)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.Region;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_Region.setBackground(new Color(R, G, B));
            t_Region.setText(s);
            }if(SQLiteQueries.OSIG != null && !"".equals(SQLiteQueries.OSIG)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.OSIG;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_OSIG.setBackground(new Color(R, G, B));
            t_OSIG.setText(s);
            }if(SQLiteQueries.BigBlock_BB != null && !"".equals(SQLiteQueries.BigBlock_BB)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.BigBlock_BB;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_BigBlock.setBackground(new Color(R, G, B));
            t_BigBlock.setText(s);
            }if(SQLiteQueries.BadBlock_BB != null && !"".equals(SQLiteQueries.BadBlock_BB)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.BadBlock_BB;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_BadBlock.setBackground(new Color(R, G, B));
            t_BadBlock.setText(s);
            }if(SQLiteQueries.LDV != null && !"".equals(SQLiteQueries.LDV)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.LDV;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_LDV.setBackground(new Color(R, G, B));
            t_LDV.setText(s);
            }if(SQLiteQueries.FCRT != null && !"".equals(SQLiteQueries.FCRT)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.FCRT;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_FCRT.setBackground(new Color(R, G, B));
            t_FCRT.setText(s);
            }if(SQLiteQueries.Flash_Drive != null && !"".equals(SQLiteQueries.Flash_Drive)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.Flash_Drive;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_FlashDrive.setBackground(new Color(R, G, B));
            t_FlashDrive.setText(s);
            }if(SQLiteQueries.Comment != null && !"".equals(SQLiteQueries.Comment)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.Comment;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_Comment.setBackground(new Color(R, G, B));
            t_Comment.setText(s);
            }if(SQLiteQueries.jb_SaveBodyXboxData != null && !"".equals(SQLiteQueries.jb_SaveBodyXboxData)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.jb_SaveBodyXboxData;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_SaveBodyXboxData.setBackground(new Color(R, G, B));
            t_SaveBodyXboxData.setText(s);
            }if(SQLiteQueries.l_WarningMessage != null && !"".equals(SQLiteQueries.l_WarningMessage)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.l_WarningMessage;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_WarningMessage.setBackground(new Color(R, G, B));
            t_WarningMessage.setText(s);
            }if(SQLiteQueries.MailCustomer != null && !"".equals(SQLiteQueries.MailCustomer)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.MailCustomer;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_MailCustomer.setBackground(new Color(R, G, B));
            t_MailCustomer.setText(s);
            }if(SQLiteQueries.jb_Attachment != null && !"".equals(SQLiteQueries.jb_Attachment)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.jb_Attachment;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_Attachment.setBackground(new Color(R, G, B));
            t_Attachment.setText(s);
            }if(SQLiteQueries.Subject != null && !"".equals(SQLiteQueries.Subject)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.Subject;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_Subject.setBackground(new Color(R, G, B));
            t_Subject.setText(s);
            }if(SQLiteQueries.MailPassWord != null && !"".equals(SQLiteQueries.MailPassWord)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.MailPassWord;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_MailPassWord.setBackground(new Color(R, G, B));
            t_MailPassWord.setText(s);
            }if(SQLiteQueries.MailTechnician != null && !"".equals(SQLiteQueries.MailTechnician)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.MailTechnician;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_MailTechnician.setBackground(new Color(R, G, B));
            t_MailTechnician.setText(s);
            }if(SQLiteQueries.jb_SendMail != null && !"".equals(SQLiteQueries.jb_SendMail)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.jb_SendMail;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbl_SendMail.setBackground(new Color(R, G, B));
            t_SendMail.setText(s);
            }
        }
    }
    
    private void GetColorTextTextField() {
        if(!"".equals(SQLiteQueries.jb_tf_AllColor) && SQLiteQueries.jb_tf_AllColor != null){
            tf_Address.setText(SQLiteQueries.jb_tf_AllColor);
            tf_BadBlock.setText(SQLiteQueries.jb_tf_AllColor);
            tf_BigBlock.setText(SQLiteQueries.jb_tf_AllColor);
            tf_CB_Version.setText(SQLiteQueries.jb_tf_AllColor);
            tf_CPU_KEY.setText(SQLiteQueries.jb_tf_AllColor);
            tf_Comment.setText(SQLiteQueries.jb_tf_AllColor);
            tf_Console_ID.setText(SQLiteQueries.jb_tf_AllColor);
            tf_Console_Type.setText(SQLiteQueries.jb_tf_AllColor);
            tf_DVD_KEY.setText(SQLiteQueries.jb_tf_AllColor);
            tf_Dash_Version_Hack.setText(SQLiteQueries.jb_tf_AllColor);
            tf_Dash_Version_Now.setText(SQLiteQueries.jb_tf_AllColor);
            tf_Drive_Type.setText(SQLiteQueries.jb_tf_AllColor);
            tf_DualNand.setText(SQLiteQueries.jb_tf_AllColor);
            tf_Email.setText(SQLiteQueries.jb_tf_AllColor);
            tf_FCRT.setText(SQLiteQueries.jb_tf_AllColor);
            tf_First_Name.setText(SQLiteQueries.jb_tf_AllColor);
            tf_Flash_Drive.setText(SQLiteQueries.jb_tf_AllColor);
            tf_Flash_Drive_Type.setText(SQLiteQueries.jb_tf_AllColor);
            tf_Hack.setText(SQLiteQueries.jb_tf_AllColor);
            tf_LDV.setText(SQLiteQueries.jb_tf_AllColor);
            tf_Last_Name.setText(SQLiteQueries.jb_tf_AllColor);
            tf_MFR_Date.setText(SQLiteQueries.jb_tf_AllColor);
            tf_ModChip.setText(SQLiteQueries.jb_tf_AllColor);
            tf_OSIG.setText(SQLiteQueries.jb_tf_AllColor);
            tf_Pseudo.setText(SQLiteQueries.jb_tf_AllColor);
            tf_Region.setText(SQLiteQueries.jb_tf_AllColor);
            tf_Serial.setText(SQLiteQueries.jb_tf_AllColor);
            tf_MailCustomer.setText(SQLiteQueries.jb_tf_AllColor);
            tf_MailPassWord.setText(SQLiteQueries.jb_tf_AllColor);
            tf_Subject.setText(SQLiteQueries.jb_tf_AllColor);
            tf_MailArea.setText(SQLiteQueries.jb_tf_AllColor);
            tf_MailTechnician.setText(SQLiteQueries.jb_tf_AllColor);
            int R;
            int G;
            int B;
            String s = SQLiteQueries.jb_tf_AllColor;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_tf_All.setBackground(new Color(R, G, B));
        }else{
            if(SQLiteQueries.t_LastName != null && !"".equals(SQLiteQueries.t_LastName)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.t_LastName;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_Last_Name.setBackground(new Color(R, G, B));
            tf_Last_Name.setText(s);
            }if(SQLiteQueries.t_FirstName != null && !"".equals(SQLiteQueries.t_FirstName)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.t_FirstName;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_First_Name.setBackground(new Color(R, G, B));
            tf_First_Name.setText(s);
            }if(SQLiteQueries.t_pseudo != null && !"".equals(SQLiteQueries.t_pseudo)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.t_pseudo;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_Pseudo.setBackground(new Color(R, G, B));
            tf_Pseudo.setText(s);
            }if(SQLiteQueries.t_email != null && !"".equals(SQLiteQueries.t_email)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.t_email;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_Email.setBackground(new Color(R, G, B));
            tf_Email.setText(s);
            }if(SQLiteQueries.t_address != null && !"".equals(SQLiteQueries.t_address)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.t_address;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_Address.setBackground(new Color(R, G, B));
            tf_Address.setText(s);
            }if(SQLiteQueries.t_CPU_KEY != null && !"".equals(SQLiteQueries.t_CPU_KEY)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.t_CPU_KEY;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_CPU_KEY.setBackground(new Color(R, G, B));
            tf_CPU_KEY.setText(s);
            }if(SQLiteQueries.t_DVD_KEY != null && !"".equals(SQLiteQueries.t_DVD_KEY)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.t_DVD_KEY;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_DVD_KEY.setBackground(new Color(R, G, B));
            tf_DVD_KEY.setText(s);
            }if(SQLiteQueries.t_Dash_Version_Now != null && !"".equals(SQLiteQueries.t_Dash_Version_Now)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.t_Dash_Version_Now;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_Dash_Version_Now.setBackground(new Color(R, G, B));
            tf_Dash_Version_Now.setText(s);
            }if(SQLiteQueries.t_Dash_Version_Hack != null && !"".equals(SQLiteQueries.t_Dash_Version_Hack)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.t_Dash_Version_Hack;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_Dash_Version_Hack.setBackground(new Color(R, G, B));
            tf_Dash_Version_Hack.setText(s);
            }if(SQLiteQueries.t_Console_Type != null && !"".equals(SQLiteQueries.t_Console_Type)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.t_Console_Type;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_Console_Type.setBackground(new Color(R, G, B));
            tf_Console_Type.setText(s);
            }if(SQLiteQueries.t_ModChip != null && !"".equals(SQLiteQueries.t_ModChip)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.t_ModChip;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_ModChip.setBackground(new Color(R, G, B));
            tf_ModChip.setText(s);
            }if(SQLiteQueries.t_DualNand != null && !"".equals(SQLiteQueries.t_DualNand)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.t_DualNand;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_DualNand.setBackground(new Color(R, G, B));
            tf_DualNand.setText(s);
            }if(SQLiteQueries.t_Hack != null && !"".equals(SQLiteQueries.t_Hack)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.t_Hack;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_Hack.setBackground(new Color(R, G, B));
            tf_Hack.setText(s);
            }if(SQLiteQueries.t_CB_Version != null && !"".equals(SQLiteQueries.t_CB_Version)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.t_CB_Version;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_CB_Version.setBackground(new Color(R, G, B));
            tf_CB_Version.setText(s);
            }if(SQLiteQueries.t_MFR_Date != null && !"".equals(SQLiteQueries.t_MFR_Date)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.t_MFR_Date;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_MFR_Date.setBackground(new Color(R, G, B));
            tf_MFR_Date.setText(s);
            }if(SQLiteQueries.t_Console_ID != null && !"".equals(SQLiteQueries.t_Console_ID)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.t_Console_ID;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_Console_ID.setBackground(new Color(R, G, B));
            tf_Console_ID.setText(s);
            }if(SQLiteQueries.t_Serial != null && !"".equals(SQLiteQueries.t_Serial)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.t_Serial;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_Serial.setBackground(new Color(R, G, B));
            tf_Serial.setText(s);
            }if(SQLiteQueries.t_Region != null && !"".equals(SQLiteQueries.t_Region)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.t_Region;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_Region.setBackground(new Color(R, G, B));
            tf_Region.setText(s);
            }if(SQLiteQueries.t_OSIG != null && !"".equals(SQLiteQueries.t_OSIG)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.t_OSIG;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_OSIG.setBackground(new Color(R, G, B));
            tf_OSIG.setText(s);
            }if(SQLiteQueries.t_BigBlock_BB != null && !"".equals(SQLiteQueries.t_BigBlock_BB)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.t_BigBlock_BB;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_BigBlock.setBackground(new Color(R, G, B));
            tf_BigBlock.setText(s);
            }if(SQLiteQueries.t_BadBlock_BB != null && !"".equals(SQLiteQueries.t_BadBlock_BB)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.t_BadBlock_BB;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_BadBlock.setBackground(new Color(R, G, B));
            tf_BadBlock.setText(s);
            }if(SQLiteQueries.t_LDV != null && !"".equals(SQLiteQueries.t_LDV)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.t_LDV;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_LDV.setBackground(new Color(R, G, B));
            tf_LDV.setText(s);
            }if(SQLiteQueries.t_FCRT != null && !"".equals(SQLiteQueries.t_FCRT)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.t_FCRT;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_FCRT.setBackground(new Color(R, G, B));
            tf_FCRT.setText(s);
            }if(SQLiteQueries.t_Comment != null && !"".equals(SQLiteQueries.t_Comment)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.t_Comment;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_Comment.setBackground(new Color(R, G, B));
            tf_Comment.setText(s);
            }if(SQLiteQueries.t_Flash_Drive_Type != null && !"".equals(SQLiteQueries.t_Flash_Drive_Type)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.t_Flash_Drive_Type;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_Flash_Drive_Type.setBackground(new Color(R, G, B));
            tf_Flash_Drive_Type.setText(s);
            }if(SQLiteQueries.t_Flash_Drive != null && !"".equals(SQLiteQueries.t_Flash_Drive)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.t_Flash_Drive;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_Flash_Drive.setBackground(new Color(R, G, B));
            tf_Flash_Drive.setText(s);
            }if(SQLiteQueries.t_Drive_Type != null && !"".equals(SQLiteQueries.t_Drive_Type)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.t_Drive_Type;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_Drive_Type.setBackground(new Color(R, G, B));
            tf_Drive_Type.setText(s);
            }if(SQLiteQueries.t_MailCustomer != null && !"".equals(SQLiteQueries.t_MailCustomer)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.t_MailCustomer;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_MailCustomer.setBackground(new Color(R, G, B));
            tf_MailCustomer.setText(s);
            }

            if(SQLiteQueries.t_Subject != null && !"".equals(SQLiteQueries.t_Subject)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.t_Subject;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_Subject.setBackground(new Color(R, G, B));
            tf_Subject.setText(s);
            }
            if(SQLiteQueries.t_MailPassWord != null && !"".equals(SQLiteQueries.t_MailPassWord)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.t_MailPassWord;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_MailPassWord.setBackground(new Color(R, G, B));
            tf_MailPassWord.setText(s);
            }
            if(SQLiteQueries.t_MailTechnician != null && !"".equals(SQLiteQueries.t_MailTechnician)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.t_MailTechnician;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_MailTechnician.setBackground(new Color(R, G, B));
            tf_MailTechnician.setText(s);
            }
            if(SQLiteQueries.jta_Area != null && !"".equals(SQLiteQueries.jta_Area)){
                int R;
                int G;
                int B;
            String s = SQLiteQueries.jta_Area;
            String[] str = s.split(",");
            R = StringToInt(str[0]);
            G = StringToInt(str[1]);
            B = StringToInt(str[2]);
            jbt_MailArea.setBackground(new Color(R, G, B));
            tf_MailArea.setText(s);
            }
        }
    }
    
    private void GetBackgroungDisplay(){
        
        if(SQLiteQueries.ImageBase != null && !"".equals(SQLiteQueries.ImageBase)){   
            CB_Base.setSelectedItem(SQLiteQueries.ImageBase);
        }if(SQLiteQueries.ImageEditBodyXbox != null && !"".equals(SQLiteQueries.ImageEditBodyXbox)){   
            CB_EditBodyXbox.setSelectedItem(SQLiteQueries.ImageEditBodyXbox);
        }if(SQLiteQueries.ImageCustomer != null && !"".equals(SQLiteQueries.ImageCustomer)){   
            CB_Customer.setSelectedItem(SQLiteQueries.ImageCustomer);
        }if(SQLiteQueries.Display != null && !"".equals(SQLiteQueries.Display)){   
            CB_Display.setSelectedItem(SQLiteQueries.Display);
        }if(SQLiteQueries.ImageMail != null && !"".equals(SQLiteQueries.ImageMail)){   
            CB_Mail.setSelectedItem(SQLiteQueries.ImageMail);
        }if(SQLiteQueries.ImageOptions != null && !"".equals(SQLiteQueries.ImageOptions)){   
            CB_Options.setSelectedItem(SQLiteQueries.ImageOptions);
        }        
    }
    
    private void GetComboBox(){
        
        if(SQLiteQueries.CB_DashVersionHack != null && !"".equals(SQLiteQueries.CB_DashVersionHack)){   
            tcb_Dash_Version_Hack.setText(SQLiteQueries.CB_DashVersionHack);
        }if(SQLiteQueries.CB_DriveType != null && !"".equals(SQLiteQueries.CB_DriveType)){   
            tcb_Drive_Type.setText(SQLiteQueries.CB_DriveType);
        }if(SQLiteQueries.CB_DualNand != null && !"".equals(SQLiteQueries.CB_DualNand)){   
            tcb_DualNand.setText(SQLiteQueries.CB_DualNand);
        }if(SQLiteQueries.CB_FlashDriveType != null && !"".equals(SQLiteQueries.CB_FlashDriveType)){   
            tcb_Flash_Drive_Type.setText(SQLiteQueries.CB_FlashDriveType);
        }if(SQLiteQueries.CB_Hack != null && !"".equals(SQLiteQueries.CB_Hack)){   
            tcb_Hack.setText(SQLiteQueries.CB_Hack);
        }if(SQLiteQueries.CB_ModChip != null && !"".equals(SQLiteQueries.CB_ModChip)){   
            tcb_ModChip.setText(SQLiteQueries.CB_ModChip);
        }
    }
    
    private void GetAppOptions(){
        
        if(SQLiteQueries.t_SMTP_PORT != null && !"".equals(SQLiteQueries.t_SMTP_PORT)){   
            t_SMTP_PORT.setText(SQLiteQueries.t_SMTP_PORT);
        }if(SQLiteQueries.t_SMTP_ADDRESS != null && !"".equals(SQLiteQueries.t_SMTP_ADDRESS)){   
            t_SMTP_ADDRESS.setText(SQLiteQueries.t_SMTP_ADDRESS);
        }if(SQLiteQueries.t_AppPassword != null && !"".equals(SQLiteQueries.t_AppPassword)){   
            t_AppPassword.setText(SQLiteQueries.t_AppPassword);
        }if(SQLiteQueries.t_EmailTechnician != null && !"".equals(SQLiteQueries.t_EmailTechnician)){   
            t_EmailTechnician.setText(SQLiteQueries.t_EmailTechnician);
        }if(SQLiteQueries.t_EmailPassWord != null && !"".equals(SQLiteQueries.t_EmailPassWord)){   
            t_EmailPassWord.setText(SQLiteQueries.t_EmailPassWord);
        }
    }
}
