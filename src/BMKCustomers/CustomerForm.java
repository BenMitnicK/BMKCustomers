/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BMKCustomers;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.CodeSource;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author BenMitnicK
 */
public class CustomerForm extends JPanel{
        
    private JButton jb_SaveCustomer;
    public static JButton jb_KV_Info;
    public static JComboBox<String> jc_BigBlock_BB;
    private static JComboBox<String> jc_BadBlock_BB;
    public static JComboBox<String> jc_LDV;
    private static JComboBox<String> jc_LDV_2;
    public static JComboBox<String> jc_Console_Type;
    private static JComboBox<String> jc_Flash_Drive;
    private static JComboBox<String> jc_Flash_Drive_Type;
    private static JComboBox<String> jc_Hack;
    private static JComboBox<String> jc_Drive_Type;
    public static JComboBox<String> jc_Dash_Version_Now;
    private static JComboBox<String> jc_Dash_Version_Hack;
    private static JComboBox<String> jc_ModChip;
    private static JComboBox<String> jc_DualNand;
    private JLabel CPU_KEY;
    private JLabel DVD_KEY;
    private JLabel Dash_Version_Now;
    private JLabel Dash_Version_Hack;
    private JLabel ModChip;
    private JLabel Console_Type;
    private JLabel CB_Version;
    private JLabel Console_ID;
    private JLabel Serial;
    private JLabel Region;
    private JLabel OSIG;
    private JLabel BigBlock_BB;
    private JLabel BadBlock_BB;
    private JLabel LDV;
    private JLabel MFR_Date;
    private JLabel FirstName;
    private JLabel LastName;
    private JLabel Pseudo;
    private JLabel Email;
    private JLabel Address;
    private JLabel Flash_Drive;
    private JLabel Hack;
    private JLabel DualNand;
    private JLabel FCRT;
    private JLabel FieldInformed;
    private JScrollPane js_Address;
    private static JTextArea t_Address;
    public static JTextField t_CPU_KEY;
    public static JTextField t_ConsoleType;
    public static JTextField t_Dash_Version_Now;
    public static JTextField t_DVD_KEY;
    public static JTextField t_FCRT;
    public static JTextField t_CB_Version;
    public static JTextField t_Console_ID;
    public static JTextField t_Serial;
    public static JTextField t_Region;
    public static JTextField t_OSIG;
    public static JTextField t_MFR_Date;
    private static JTextField t_FirstName;
    private static JTextField t_LastName;
    private static JTextField t_Pseudo;
    private static JTextField t_Email;

    JFileChooser fc;
    public static String kvinfo;
    static BackgroundImage jPanel;
    boolean isProcessRunning;

    public CustomerForm() throws IOException, URISyntaxException {
        initComponents();
        SetColorTextLabel();
        initComboDashVersionHack();
        initComboModChip();
        initComboDualNand();
        initComboHack();
        initComboDriveType();
        initComboFlashDriveType();
        t_LastNameVerif(); 
    }
    
    private void initComponents() throws IOException, URISyntaxException {

        jb_SaveCustomer = new JButton();
        jb_KV_Info = new JButton();
        jc_BigBlock_BB = new JComboBox<>();
        jc_BadBlock_BB = new JComboBox<>();
        jc_LDV = new JComboBox<>();
        jc_LDV_2 = new JComboBox<>();
        jc_Console_Type = new JComboBox<>();
        jc_Flash_Drive = new JComboBox<>();
        jc_Flash_Drive_Type = new JComboBox<>();
        jc_Hack = new JComboBox<>();
        jc_Drive_Type = new JComboBox<>();
        jc_Dash_Version_Now = new JComboBox<>();
        jc_Dash_Version_Hack = new JComboBox<>();
        jc_ModChip = new JComboBox<>();
        jc_DualNand = new JComboBox<>();
        CPU_KEY = new JLabel();
        DVD_KEY = new JLabel();
        Dash_Version_Now = new JLabel();
        Dash_Version_Hack = new JLabel();
        ModChip = new JLabel();
        Console_Type = new JLabel();
        CB_Version = new JLabel();
        Console_ID = new JLabel();
        Serial = new JLabel();
        Region = new JLabel();
        OSIG = new JLabel();
        BigBlock_BB = new JLabel();
        BadBlock_BB = new JLabel();
        LDV = new JLabel();
        MFR_Date = new JLabel();
        FirstName = new JLabel();
        LastName = new JLabel();
        Pseudo = new JLabel();
        Email = new JLabel();
        Address = new JLabel();
        Flash_Drive = new JLabel();
        Hack = new JLabel();
        DualNand = new JLabel();
        FCRT = new JLabel();
        FieldInformed = new JLabel();
        js_Address = new JScrollPane();
        t_Address = new JTextArea();
        t_CPU_KEY = new JTextField();
        t_ConsoleType = new JTextField();
        t_Dash_Version_Now = new JTextField();
        t_DVD_KEY = new JTextField();
        t_FCRT = new JTextField();
        t_CB_Version = new JTextField();
        t_Console_ID = new JTextField();
        t_Serial = new JTextField();
        t_Region = new JTextField();
        t_OSIG = new JTextField();
        t_MFR_Date = new JTextField();
        t_FirstName = new JTextField();
        t_LastName = new JTextField();
        t_Pseudo = new JTextField();
        t_Email = new JTextField();
        
        t_CB_Version.setFont(new java.awt.Font("Tahoma", 3, 11));
        t_CPU_KEY.setFont(new java.awt.Font("Tahoma", 3, 11));
        t_DVD_KEY.setFont(new java.awt.Font("Tahoma", 3, 11));
        t_Console_ID.setFont(new java.awt.Font("Tahoma", 3, 11));
        t_OSIG.setFont(new java.awt.Font("Tahoma", 3, 11));
        t_Serial.setFont(new java.awt.Font("Tahoma", 3, 11));
        t_Region.setFont(new java.awt.Font("Tahoma", 3, 11));
        t_MFR_Date.setFont(new java.awt.Font("Tahoma", 3, 11));
        t_LastName.setFont(new java.awt.Font("Tahoma", 3, 11));
        t_Pseudo.setFont(new java.awt.Font("Tahoma", 3, 11));
        t_ConsoleType.setFont(new java.awt.Font("Tahoma", 3, 11));
        t_Email.setFont(new java.awt.Font("Tahoma", 3, 11));
        t_FirstName.setFont(new java.awt.Font("Tahoma", 3, 11));
        js_Address.setFont(new java.awt.Font("Tahoma", 3, 11));
        t_Address.setFont(new java.awt.Font("Tahoma", 3, 11));
        t_Dash_Version_Now.setFont(new java.awt.Font("Tahoma", 3, 11));
        jc_Flash_Drive_Type.setFont(new java.awt.Font("Tahoma", 3, 11));
        jc_LDV_2.setFont(new java.awt.Font("Tahoma", 3, 11));
        jc_Console_Type.setFont(new java.awt.Font("Tahoma", 3, 11));
        jc_BadBlock_BB.setFont(new java.awt.Font("Tahoma", 3, 11));
        jc_LDV.setFont(new java.awt.Font("Tahoma", 3, 11));
        jc_Drive_Type.setFont(new java.awt.Font("Tahoma", 3, 11));
        jc_BigBlock_BB.setFont(new java.awt.Font("Tahoma", 3, 11));
        jc_Hack.setFont(new java.awt.Font("Tahoma", 3, 11));
        jc_Flash_Drive.setFont(new java.awt.Font("Tahoma", 3, 11));
        jc_Dash_Version_Now.setFont(new java.awt.Font("Tahoma", 3, 11));
        jc_Dash_Version_Hack.setFont(new java.awt.Font("Tahoma", 3, 11));
        jc_ModChip.setFont(new java.awt.Font("Tahoma", 3, 11));
        jc_DualNand.setFont(new java.awt.Font("Tahoma", 3, 11));
        t_FCRT.setFont(new java.awt.Font("Tahoma", 3, 12));
        
        CodeSource codeSource = Main.class.getProtectionDomain().getCodeSource();
        File jarFile = new File(codeSource.getLocation().toURI().getPath());
        String jarDir = jarFile.getParentFile().getPath();
        
        File f;
        if(OSValidator.IS_UNIX){
            f = new File(jarDir + "/images/customer_linux.png");
        }else{
            f = new File("images/customer.png");
        }        
        
        CPU_KEY.setToolTipText("CPU_KEY Of The Xbox 360");
        DVD_KEY.setToolTipText("DVD_KEY Of The Xbox 360");
        Dash_Version_Now.setToolTipText("Dash Version At The Dump Of Xbox 360");
        Dash_Version_Hack.setToolTipText("Dash Version From Hack :-)");
        Console_Type.setToolTipText("Type Of The Xbox 360");
        DualNand.setToolTipText("ModChip DualNand Used for the Xbox 360");
        ModChip.setToolTipText("ModChip Used For The Xbox 360");
        CB_Version.setToolTipText("CB Version Of The Xbox 360");
        Hack.setToolTipText("Hack Mode");
        MFR_Date.setToolTipText("MFR_Date Of The Xbox 360");
        Console_ID.setToolTipText("ID Of The Xbox 360");
        Serial.setToolTipText("Seriel Number Of The Xbox 360");
        Region.setToolTipText("Region Of The Xbox 360");
        OSIG.setToolTipText("Model Drive Of The Xbox 360");
        BigBlock_BB.setToolTipText("Nand Greater than 16MO");
        BadBlock_BB.setToolTipText("Nand With BadBlock");
        LDV.setToolTipText("LDV Of The Xbox 360");
        Flash_Drive.setToolTipText("If Drive is flashed or not With Version Of Firmware And Drive");
        FirstName.setToolTipText("First Name Of Customer");
        LastName.setToolTipText("Last Name Of Customer");
        Pseudo.setToolTipText("Pseudo Of Customer");
        Email.setToolTipText("Email Of Customer");
        Address.setToolTipText("Address Of Customer");
        FCRT.setToolTipText("File For Read DVD");
        jb_SaveCustomer.setToolTipText("Save Customer");
        
        if(OSValidator.IS_UNIX){
            jb_KV_Info.setToolTipText("Open KVInfo For Read");
        }else{
            jb_KV_Info.setToolTipText("Open KVInfo Or Dump For Read");
        }
        
        LDV.setText("LDV");
        BadBlock_BB.setText("BadBlock (BB)");
        BigBlock_BB.setText("BigBlock (BB)");
        OSIG.setText("OSIG");
        Region.setText("Region");
        Serial.setText("Serial");       
        Hack.setText("Hack");
        CB_Version.setText("CB Version");
        ModChip.setText("ModChip");       
        DualNand.setText("DualNand");       
        Console_ID.setText("Console ID");
        Console_Type.setText("Console Type");
        DVD_KEY.setText("DVD KEY");
        Dash_Version_Now.setText("Dash Version (Now)");
        Dash_Version_Hack.setText("Dash Version (Hack)");
        Flash_Drive.setText("Flash Drive");
        MFR_Date.setText("MFR Date");
        CPU_KEY.setText("CPU KEY");
        LastName.setText("Last Name");
        Pseudo.setText("Pseudo");
        FirstName.setText("First Name");
        Email.setText("E-Mail");
        Address.setText("Address");
        Flash_Drive.setText("Flash/Drive");
        FCRT.setText("FCRT");
        
        t_Address.setColumns(20);
        t_Address.setRows(5);
        t_Address.setAutoscrolls(false);
        js_Address.setViewportView(t_Address);
        
        t_LastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_LastNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_LastNameFocusLost(evt);
            }
        });
        t_LastName.setFont(new java.awt.Font("Tahoma", 3, 12));
        t_LastName.setForeground(new java.awt.Color(204, 0, 51));     
        t_LastName.setDocument(new TextFieldLimit(12));
        t_FirstName.setDocument(new TextFieldLimit(20));
        t_Pseudo.setDocument(new TextFieldLimit(20));
        t_Email.setDocument(new TextFieldLimit(30));
        t_Address.setLineWrap(true);
        t_Address.setDocument(new TextFieldLimit(160));
        t_CPU_KEY.setDocument(new TextFieldLimit(32));
        t_DVD_KEY.setDocument(new TextFieldLimit(32));
        t_Dash_Version_Now.setDocument(new TextFieldLimit(32));
        t_CB_Version.setDocument(new TextFieldLimit(32));
        t_Console_ID.setDocument(new TextFieldLimit(32));
        t_Serial.setDocument(new TextFieldLimit(32));
        t_Region.setDocument(new TextFieldLimit(32));
        t_OSIG.setDocument(new TextFieldLimit(32));
        t_MFR_Date.setDocument(new TextFieldLimit(32));
             
        jb_SaveCustomer.setIcon(new ImageIcon(getClass().getResource("/images/savebodyxboxdata.png"))); // NOI18N
        jb_KV_Info.setIcon(new ImageIcon(getClass().getResource("/images/kvinfo.png"))); // NOI18N
        
        jb_SaveCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jb_SaveCustomerActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(CustomerForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        jb_KV_Info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jb_KV_InfoActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(CustomerForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        jc_Flash_Drive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_Flash_DriveActionPerformed(evt);
            }
        });
              
        jc_Drive_Type.setEnabled(false);
        jc_Flash_Drive_Type.setEnabled(false);
        
        jc_BigBlock_BB.setModel(new DefaultComboBoxModel<>(new String[] { "", "No", "Yes" }));

        jc_BadBlock_BB.setModel(new DefaultComboBoxModel<>(new String[] { "", "No", "Yes" }));

        jc_LDV.setModel(new DefaultComboBoxModel<>(new String[] { "", "0", "1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12","13", "14", "15", "16","17", "18", "19", "20", "21", "22", "23", "24","25", "26", "27", "28","29", "30", "31", "32", "33", "34","35", "36", "37", "38","39", "40", "41", "42", "43", "44","45", "46", "47", "48","49", "50" }));

        jc_Flash_Drive.setModel(new DefaultComboBoxModel<>(new String[] { "No", "Yes" }));
        
        if ("YES".equals(SQLiteQueries.ImageCustomer) && f.exists() && f.canRead()) {
            BufferedImage image = ImageIO.read(f);
            jPanel = new BackgroundImage(image);
        }else{
            jPanel = new BackgroundImage();
        }
        
        if(OSValidator.IS_UNIX){
            
            jb_SaveCustomer.setBounds(677, 319, 80, 60);
            jb_KV_Info.setBounds(585, 319, 80, 60);

            jc_Dash_Version_Hack.setBounds(197, 146, 275, 25);
            jc_ModChip.setBounds(197, 216, 275, 25);    
            jc_DualNand.setBounds(197, 250, 275, 25); 
            jc_Hack.setBounds(197, 284, 275, 25);   
            jc_BigBlock_BB.setBounds(197, 534, 275, 25);    
            jc_BadBlock_BB.setBounds(197, 568, 275, 25);    
            jc_LDV.setBounds(197, 604, 60, 25);    
            jc_Flash_Drive.setBounds(197, 639, 60, 25);    
            jc_Flash_Drive_Type.setBounds(257, 639, 65, 25);            
            jc_Drive_Type.setBounds(322, 639, 150, 25);    

            CPU_KEY.setBounds(50, 42, 135, 20);    
            DVD_KEY.setBounds(50, 78, 135, 20);    
            Dash_Version_Now.setBounds(50, 114, 135, 20);    
            Dash_Version_Hack.setBounds(50, 149, 135, 20); 
            Console_Type.setBounds(50, 184, 135, 20); 
            ModChip.setBounds(50, 219, 135, 20);   
            DualNand.setBounds(50, 253, 135, 20); 
            Hack.setBounds(50, 287, 135, 20);           
            CB_Version.setBounds(50, 322, 135, 20); 
            MFR_Date.setBounds(50, 358, 135, 20);
            Console_ID.setBounds(50, 394, 135, 20);    
            Serial.setBounds(50, 430, 135, 20);    
            Region.setBounds(50, 466, 135, 20);    
            OSIG.setBounds(50, 502, 135, 20);    
            BigBlock_BB.setBounds(50, 537, 135, 20);    
            BadBlock_BB.setBounds(50, 571, 135, 20);    
            LDV.setBounds(50, 607, 135, 20);    
            FCRT.setBounds(316, 607, 50, 20); 
            Flash_Drive.setBounds(50, 642, 135, 20);  

            FirstName.setBounds(872, 42, 75, 20);    
            LastName.setBounds(872, 79, 75, 20);    
            Pseudo.setBounds(872, 115, 75, 20);    
            Email.setBounds(872, 151, 75, 20);    
            Address.setBounds(872, 182, 75, 20);

            t_CPU_KEY.setBounds(197, 39, 275, 26);
            t_DVD_KEY.setBounds(197, 75, 275, 26);           
            t_Dash_Version_Now.setBounds(197, 111, 275, 26);    
            t_ConsoleType.setBounds(197, 181, 275, 26); 
            t_CB_Version.setBounds(197, 319, 275, 26); 
            t_MFR_Date.setBounds(197, 355, 275, 26);
            t_Console_ID.setBounds(197, 391, 275, 26);    
            t_Serial.setBounds(197, 427, 275, 26);    
            t_Region.setBounds(197, 463, 275, 26);    
            t_OSIG.setBounds(197, 499, 275, 26);           
            t_FCRT.setBounds(388, 603, 84, 26);

            t_FirstName.setBounds(959, 39, 272, 26);
            t_LastName.setBounds(959, 76, 272, 26);    
            t_Pseudo.setBounds(959, 112, 272, 26);    
            t_Email.setBounds(959, 148, 272, 26);    
            js_Address.setBounds(959, 184, 272, 139);

            FieldInformed.setBounds(945, 571, 272, 20);    
            
        }else{
            
            jb_SaveCustomer.setBounds(656, 307, 80, 60);
            jb_KV_Info.setBounds(564, 307, 80, 60);

            jc_Dash_Version_Hack.setBounds(195, 143, 275, 25);
            jc_ModChip.setBounds(195, 213, 275, 25);    
            jc_DualNand.setBounds(195, 247, 275, 25); 
            jc_Hack.setBounds(195, 281, 275, 25);   
            jc_BigBlock_BB.setBounds(195, 531, 275, 25);    
            jc_BadBlock_BB.setBounds(195, 565, 275, 25);    
            jc_LDV.setBounds(195, 601, 60, 25);    
            jc_Flash_Drive.setBounds(195, 636, 60, 25);    
            jc_Flash_Drive_Type.setBounds(255, 636, 65, 25);            
            jc_Drive_Type.setBounds(320, 636, 150, 25);    

            CPU_KEY.setBounds(51, 37, 126, 20);    
            DVD_KEY.setBounds(51, 73, 126, 20);    
            Dash_Version_Now.setBounds(51, 109, 126, 20);    
            Dash_Version_Hack.setBounds(51, 144, 126, 20); 
            Console_Type.setBounds(51, 179, 126, 20); 
            ModChip.setBounds(51, 214, 126, 20);   
            DualNand.setBounds(51, 248, 126, 20); 
            Hack.setBounds(51, 282, 126, 20);           
            CB_Version.setBounds(51, 317, 126, 20); 
            MFR_Date.setBounds(51, 353, 126, 20);
            Console_ID.setBounds(51, 389, 126, 20);    
            Serial.setBounds(51, 425, 126, 20);    
            Region.setBounds(51, 461, 126, 20);    
            OSIG.setBounds(51, 497, 126, 20);    
            BigBlock_BB.setBounds(51, 532, 126, 20);    
            BadBlock_BB.setBounds(51, 566, 126, 20);    
            LDV.setBounds(51, 602, 126, 20);    
            FCRT.setBounds(316, 602, 126, 20); 
            Flash_Drive.setBounds(51, 637, 126, 20);  

            FirstName.setBounds(832, 37, 65, 20);    
            LastName.setBounds(832, 74, 65, 20);    
            Pseudo.setBounds(832, 110, 65, 20);    
            Email.setBounds(832, 146, 65, 20);    
            Address.setBounds(832, 177, 65, 20);

            t_CPU_KEY.setBounds(195, 36, 275, 26);
            t_DVD_KEY.setBounds(195, 73, 275, 26);           
            t_Dash_Version_Now.setBounds(195, 108, 275, 26);    
            t_ConsoleType.setBounds(195, 178, 275, 26); 
            t_CB_Version.setBounds(195, 316, 275, 26); 
            t_MFR_Date.setBounds(195, 352, 275, 26);
            t_Console_ID.setBounds(195, 388, 275, 26);    
            t_Serial.setBounds(195, 424, 275, 26);    
            t_Region.setBounds(195, 460, 275, 26);    
            t_OSIG.setBounds(195, 496, 275, 26);           
            t_FCRT.setBounds(386, 600, 84, 26);

            t_FirstName.setBounds(910, 36, 272, 26);
            t_LastName.setBounds(910, 73, 272, 26);    
            t_Pseudo.setBounds(910, 109, 272, 26);    
            t_Email.setBounds(910, 145, 272, 26);    
            js_Address.setBounds(910, 181, 272, 139);    

            FieldInformed.setBounds(896, 566, 272, 20);
            
        }

        jPanel.setLayout(null);
        jPanel.add(jb_SaveCustomer);    
        jPanel.add(jb_KV_Info);          
        jPanel.add(jc_Dash_Version_Hack);
        jPanel.add(jc_ModChip);    
        jPanel.add(jc_DualNand); 
        jPanel.add(jc_Hack);   
        jPanel.add(jc_BigBlock_BB);    
        jPanel.add(jc_BadBlock_BB);    
        jPanel.add(jc_LDV);    
        jPanel.add(jc_Flash_Drive);    
        jPanel.add(jc_Flash_Drive_Type); 
        jPanel.add(jc_Drive_Type);   
        jPanel.add(CPU_KEY);    
        jPanel.add(DVD_KEY);    
        jPanel.add(Dash_Version_Now);    
        jPanel.add(Dash_Version_Hack); 
        jPanel.add(Console_Type); 
        jPanel.add(ModChip);   
        jPanel.add(DualNand); 
        jPanel.add(Hack); 
        jPanel.add(CB_Version); 
        jPanel.add(MFR_Date);
        jPanel.add(Console_ID);    
        jPanel.add(Serial);    
        jPanel.add(Region);    
        jPanel.add(OSIG);    
        jPanel.add(BigBlock_BB);    
        jPanel.add(BadBlock_BB);    
        jPanel.add(LDV);    
        jPanel.add(FCRT); 
        jPanel.add(Flash_Drive);   
        jPanel.add(FirstName);    
        jPanel.add(LastName);    
        jPanel.add(Pseudo);    
        jPanel.add(Email);    
        jPanel.add(Address);
        jPanel.add(t_CPU_KEY);  
        jPanel.add(t_DVD_KEY);           
        jPanel.add(t_Dash_Version_Now);    
        jPanel.add(t_ConsoleType); 
        jPanel.add(t_CB_Version); 
        jPanel.add(t_MFR_Date);
        jPanel.add(t_Console_ID);    
        jPanel.add(t_Serial);    
        jPanel.add(t_Region);    
        jPanel.add(t_OSIG);           
        jPanel.add(t_FCRT);    
        jPanel.add(t_FirstName);    
        jPanel.add(t_LastName);    
        jPanel.add(t_Pseudo);    
        jPanel.add(t_Email);    
        jPanel.add(js_Address);           
        jPanel.add(FieldInformed);

    }                     
    
    private void jb_KV_InfoActionPerformed(java.awt.event.ActionEvent evt) throws IOException { 
        fc = new JFileChooser();
        FileNameExtensionFilter txt_filter = new FileNameExtensionFilter("Accept .txt files only", "txt");
        FileNameExtensionFilter bin_filter = new FileNameExtensionFilter("Accept .bin files only", "bin");
        fc.setDialogTitle("Choose Your KVInfo Options");
        String[] lesTextes = {"KVInfos.txt", "Dump.bin"}; // indice du bouton qui a été // cliqué ou CLOSED_OPTION 
        String[] lesTextes2 = {"KVInfos.txt"};
        
        if(OSValidator.IS_UNIX){
            int retour = JOptionPane.showOptionDialog(TabbedPane.frame, "Make Your Choice", "Information", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, lesTextes2, lesTextes2[0]); 
            if(retour == 0 ){
                fc.setAcceptAllFileFilterUsed(false);
                fc.addChoosableFileFilter(txt_filter);
                int returnVal = fc.showOpenDialog(TabbedPane.frame);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File DirKv = fc.getSelectedFile();
                    kvinfo = DirKv.toString();
                    KVinfoFile.AlimKVInfoCF();
                }    
            }else if(retour == JOptionPane.CLOSED_OPTION){ }               
        }else{               
            int retour = JOptionPane.showOptionDialog(TabbedPane.frame, "Make Your Choice", "Information", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, lesTextes, lesTextes[0]); 
            if(retour == 0 ){
                fc.setAcceptAllFileFilterUsed(false);
                fc.addChoosableFileFilter(txt_filter);
                int returnVal = fc.showOpenDialog(TabbedPane.frame);               
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File DirKv = fc.getSelectedFile();
                    kvinfo = DirKv.toString();
                    KVinfoFile.AlimKVInfoCF();
                }    
            }else if(retour == JOptionPane.CLOSED_OPTION){ }else{
                fc.setAcceptAllFileFilterUsed(false);
                fc.addChoosableFileFilter(bin_filter);
                int returnVal = fc.showOpenDialog(TabbedPane.frame);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File DirKv = fc.getCurrentDirectory();
                    kvinfo = DirKv.toString() + "\\KVInfos.txt";
                    File f = new File("KVInfo/xeBuildGUI(KVInfo)2.0.exe");                    
                    try {
                        ProcessBuilder pb = new ProcessBuilder();
                        pb.command(f.getPath());
                        Process process = pb.start();
                        isProcessRunning = true;
                        new ProcessNewCustomerEndNotifier(this, process).start();                       
                    }catch(Exception e) {e.printStackTrace();}         
                }
            }               
            }
    }
    
    public void processEnded()
    {
        isProcessRunning = false;
        // Or just do stuff here!        
        KVinfoFile.AlimKVInfoCF();
    }
    
    private void jb_SaveCustomerActionPerformed(java.awt.event.ActionEvent evt) throws IOException, SQLException { 
        if (!"".equals(t_LastName.getText()) && "".equals(t_Email.getText()) ){
            if (isLastName(t_LastName.getText()) == true){
                try {
                    if (SQLiteQueries.ElementVerifLastName(t_LastName.getText().toUpperCase()) == false){
                        try {
                            SQLiteQueries.addCustomer();
                            Reset();
                            BMKCustomersForm.jc_CustomersList.removeAllItems();
                            BMKCustomersForm.initComboBoxCustomers();
                            t_CPU_KEY.requestFocus();
                            t_LastNameVerif();                                                        
                        } catch (IOException e) {e.printStackTrace();}
                        catch (SQLException e) {e.printStackTrace();}
                    } else {
                        
                        FieldInformed.setText("Last Name Is Already Exist");
                        FieldInformed.setVisible(true);
                        
                    }// Error message.
                }catch (IOException e) {e.printStackTrace();}              
            } else {
                
                FieldInformed.setText("Last Name Is Not Formated Correctly");
                FieldInformed.setVisible(true);
                
            }// Error message.  
        } else if (!"".equals(Getemail()) && !"".equals(t_LastName.getText())){
            if(isEmailAddress(Getemail()) == true && !"".equals(t_LastName.getText())){
                if (isLastName(t_LastName.getText()) == true){
                    try{
                        if (SQLiteQueries.ElementVerifLastName(t_LastName.getText().toUpperCase()) == false){
                            try {
                                SQLiteQueries.addCustomer();
                                Reset();
                                BMKCustomersForm.jc_CustomersList.removeAllItems();
                                BMKCustomersForm.initComboBoxCustomers();
                                t_CPU_KEY.requestFocus();
                                t_LastNameVerif();                          
                            } catch (IOException e) {e.printStackTrace();}
                            catch (SQLException e) {e.printStackTrace();}
                            
                        }else {
                            
                            FieldInformed.setText("Last Name Is Already Exist");
                            FieldInformed.setVisible(true);
                            
                        }// Error message.
                        
                    } catch (IOException e) { e.printStackTrace(); }
                    
                }else {
                    
                    FieldInformed.setText("Last Name Is Not Formated Correctly");
                    FieldInformed.setVisible(true);
                    
                }// Error message.
                
            } else {
                
                FieldInformed.setText("Email Is Not Valide");
                FieldInformed.setVisible(true);
                
            }// Error message. 
            
        }
        
}
    
    private void jc_Flash_DriveActionPerformed(java.awt.event.ActionEvent evt) {                                           
            
            if ("Yes".equals(jc_Flash_Drive.getSelectedItem())){
                jc_Flash_Drive_Type.setEnabled(true);
                jc_Drive_Type.setEnabled(true);
            }else{
                jc_Flash_Drive_Type.setEnabled(false);
                jc_Flash_Drive_Type.setSelectedIndex(0);
                jc_Drive_Type.setEnabled(false);
                jc_Drive_Type.setSelectedIndex(0);
            }
        
   }                
    
    public static boolean isEmailAddress(String email){
        Pattern p = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}$");
        Matcher m = p.matcher(email.toUpperCase());
        return m.matches();
    }
    
    public static boolean isLastName(String Name){
        Pattern p = Pattern.compile("([a-zA-Z0-9_-]*)");
        String a = Name.toUpperCase();
        Matcher m = p.matcher(Name.toUpperCase());
        return m.matches();
    }
    
    private void Reset(){
        
        t_CPU_KEY.setText("");
        t_DVD_KEY.setText("");
        t_Dash_Version_Now.setText("");
        t_ConsoleType.setText("");
        t_CB_Version.setText("");
        t_Console_ID.setText("");
        t_Serial.setText("");
        t_Region.setText("");
        t_OSIG.setText("");
        jc_BigBlock_BB.setSelectedIndex(0);
        jc_BadBlock_BB.setSelectedIndex(0);
        jc_LDV.setSelectedIndex(0);
        t_MFR_Date.setText("");
        t_FirstName.setText("");
        t_LastName.setText("");
        t_Pseudo.setText("");
        t_Email.setText("");
        t_FCRT.setText("");
        jc_Flash_Drive.setSelectedIndex(0);
        jc_Flash_Drive_Type.setSelectedIndex(0);
        jc_Hack.setSelectedIndex(0);
        jc_Drive_Type.setSelectedIndex(0);
        jc_Dash_Version_Hack.setSelectedIndex(0);
        jc_ModChip.setSelectedIndex(0);
        jc_DualNand.setSelectedIndex(0);
        t_Address.setText("");        
    }
    
    private void t_LastNameVerif(){
        
        if (!"".equals(t_LastName.getText())){                
            jb_SaveCustomer.setEnabled(true);
            FieldInformed.setVisible(false);           
        }else{
            jb_SaveCustomer.setEnabled(false);               
            FieldInformed.setText("The field 'Last Name' must be informed");
            FieldInformed.setVisible(true);               
        }        
    }
    
    private void t_LastNameFocusGained(java.awt.event.FocusEvent evt) {                                         
        
        if (!"".equals(t_LastName.getText())){                
            jb_SaveCustomer.setEnabled(true);
            FieldInformed.setVisible(false);               
        }else{
            jb_SaveCustomer.setEnabled(false);                
            FieldInformed.setText("The field 'Last Name' must be informed");
            FieldInformed.setVisible(true);               
        }      
    }                                        

    private void t_LastNameFocusLost(java.awt.event.FocusEvent evt) {                                               
        if (!"".equals(t_LastName.getText())){               
            jb_SaveCustomer.setEnabled(true);
            FieldInformed.setVisible(false);               
        }else{
            jb_SaveCustomer.setEnabled(false);              
            FieldInformed.setText("The field 'Last Name' must be informed");
            FieldInformed.setVisible(true);               
        }       
    }       
  
    private void SetColorTextLabel(){
        
        if(SQLiteQueries.LastName == null || "".equals(SQLiteQueries.LastName)){
            LastName.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.LastName;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        LastName.setForeground(new Color(R, G, B));
        LastName.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.FirstName == null || "".equals(SQLiteQueries.FirstName)){
            FirstName.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.FirstName;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        FirstName.setForeground(new Color(R, G, B));
        FirstName.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.pseudo == null || "".equals(SQLiteQueries.pseudo)){
            Pseudo.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.pseudo;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        Pseudo.setForeground(new Color(R, G, B));
        Pseudo.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.email == null || "".equals(SQLiteQueries.email)){
            Email.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.email;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        Email.setForeground(new Color(R, G, B));
        Email.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.address == null || "".equals(SQLiteQueries.address)){
            Address.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.address;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        Address.setForeground(new Color(R, G, B));
        Address.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.CPU_KEY == null || "".equals(SQLiteQueries.CPU_KEY)){
            CPU_KEY.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.CPU_KEY;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        CPU_KEY.setForeground(new Color(R, G, B));
        CPU_KEY.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.DVD_KEY == null || "".equals(SQLiteQueries.DVD_KEY)){
            DVD_KEY.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.DVD_KEY;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        DVD_KEY.setForeground(new Color(R, G, B));
        DVD_KEY.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.Dash_Version_Now == null || "".equals(SQLiteQueries.Dash_Version_Now)){
            Dash_Version_Now.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.Dash_Version_Now;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        Dash_Version_Now.setForeground(new Color(R, G, B));
        Dash_Version_Now.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.Dash_Version_Hack == null || "".equals(SQLiteQueries.Dash_Version_Hack)){
            Dash_Version_Hack.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.Dash_Version_Hack;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        Dash_Version_Hack.setForeground(new Color(R, G, B));
        Dash_Version_Hack.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.Console_Type == null || "".equals(SQLiteQueries.Console_Type)){
            Console_Type.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.Console_Type;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        Console_Type.setForeground(new Color(R, G, B));
        Console_Type.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.ModChip == null || "".equals(SQLiteQueries.ModChip)){
            ModChip.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.ModChip;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        ModChip.setForeground(new Color(R, G, B));
        ModChip.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.DualNand == null || "".equals(SQLiteQueries.DualNand)){
            DualNand.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.DualNand;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        DualNand.setForeground(new Color(R, G, B));
        DualNand.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.Hack == null || "".equals(SQLiteQueries.Hack)){
            Hack.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.Hack;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        Hack.setForeground(new Color(R, G, B));
        Hack.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.CB_Version == null || "".equals(SQLiteQueries.CB_Version)){
            CB_Version.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.CB_Version;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        CB_Version.setForeground(new Color(R, G, B));
        CB_Version.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.MFR_Date == null || "".equals(SQLiteQueries.MFR_Date)){
            MFR_Date.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.MFR_Date;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        MFR_Date.setForeground(new Color(R, G, B));
        MFR_Date.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.Console_ID == null || "".equals(SQLiteQueries.Console_ID)){
            Console_ID.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.Console_ID;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        Console_ID.setForeground(new Color(R, G, B));
        Console_ID.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.Serial == null || "".equals(SQLiteQueries.Serial)){
            Serial.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.Serial;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        Serial.setForeground(new Color(R, G, B));
        Serial.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.Region == null || "".equals(SQLiteQueries.Region)){
            Region.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.Region;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        Region.setForeground(new Color(R, G, B));
        Region.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.OSIG == null || "".equals(SQLiteQueries.OSIG)){
            OSIG.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.OSIG;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        OSIG.setForeground(new Color(R, G, B));
        OSIG.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.BigBlock_BB == null || "".equals(SQLiteQueries.BigBlock_BB)){
            BigBlock_BB.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.BigBlock_BB;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        BigBlock_BB.setForeground(new Color(R, G, B));
        BigBlock_BB.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.BadBlock_BB == null || "".equals(SQLiteQueries.BadBlock_BB)){
            BadBlock_BB.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.BadBlock_BB;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        BadBlock_BB.setForeground(new Color(R, G, B));
        BadBlock_BB.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.LDV == null || "".equals(SQLiteQueries.LDV)){
            LDV.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.LDV;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        LDV.setForeground(new Color(R, G, B));
        LDV.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.FCRT == null || "".equals(SQLiteQueries.FCRT)){
            FCRT.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.FCRT;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        FCRT.setForeground(new Color(R, G, B));
        FCRT.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.Flash_Drive == null || "".equals(SQLiteQueries.Flash_Drive)){
            Flash_Drive.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.Flash_Drive;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        Flash_Drive.setForeground(new Color(R, G, B));
        Flash_Drive.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.l_WarningMessage == null || "".equals(SQLiteQueries.l_WarningMessage)){
            FieldInformed.setFont(new java.awt.Font("", 1, 11));
            FieldInformed.setHorizontalAlignment(SwingConstants.CENTER);
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.l_WarningMessage;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        FieldInformed.setForeground(new Color(R, G, B));
        FieldInformed.setFont(new java.awt.Font("Tahoma", 1, 11));
        FieldInformed.setHorizontalAlignment(SwingConstants.CENTER);
        }       
    }

    private int StringToInt(String STR) {
        int str = Integer.parseInt(STR);
        return str;
    }

    private static void initComboDashVersionHack(){
        
        if(SQLiteQueries.CB_DashVersionHack == null || "".equals(SQLiteQueries.CB_DashVersionHack)){
            String[] strDashVersionHack = {  "", "17559", "17526", "17502", "17489", "17349", "17150", "17148", "16767", "16756", "16747", "16547", "16537", "16203", "16202", "16197", "15574", "15572", "14719", "14717", "14699", "13604", "13599", "13146", "12625", "12611", "9199", "8955", "8507", "8498", "7371", "7363", "7357", "6717", "6690", "6683", "5787", "5766", "5759", "4552", "4548", "4532", "2858", "2857", "2258", "2255", "2241", "1888" };
            for(int i=0;i<strDashVersionHack.length;i++) {
    		jc_Dash_Version_Hack.insertItemAt(strDashVersionHack[i],i);
            }
            jc_Dash_Version_Hack.setSelectedIndex(0);           
        }else{           
            String s = SQLiteQueries.CB_DashVersionHack;
            String[] str=s.split(",");
            for(int i=0;i<str.length;i++)    {
    		jc_Dash_Version_Hack.insertItemAt(str[i],i);
            }
                jc_Dash_Version_Hack.setSelectedIndex(0);           
        }       
    } 
    
    private static void initComboModChip(){
        
        if(SQLiteQueries.CB_ModChip == null || "".equals(SQLiteQueries.CB_ModChip)){
            String[] strModChip = {  "", "CoolRunner Rev-A (Xecuter)", "CoolRunner Rev-B (Xecuter)", "CoolRunner Rev-C (Xecuter)", "CoolRunner Rev-D (Xecuter)", "CR3 LITE (Xecuter)", "CR3 PRO (Xecuter)", "CR4 (Xecuter)", "X360GlitChip V1.4+ (LibraSoft)", "X360GlitChip V2.0+ (LibraSoft)", "Glitcher360 (Matrix)", "Glitcher360 V2 (Matrix)", "360Squirt (Squirt)", "Glitch360KeyUltra (Glitch360Team)", "Glitch360Key V1.1 (Glitch360Team)", "X360Ace V1", "X360Ace V2", "X360Ace V3", "X360Ace V4", "X360Ace V5" };
            for(int i=0;i<strModChip.length;i++)    {
    		jc_ModChip.insertItemAt(strModChip[i],i);
            }
            jc_ModChip.setSelectedIndex(0);           
        }else{           
            String s = SQLiteQueries.CB_ModChip;
            String[] str=s.split(",");
            for(int i=0;i<str.length;i++)    {
    		jc_ModChip.insertItemAt(str[i],i);
            }
            jc_ModChip.setSelectedIndex(0);           
        }       
    } 
    
    private static void initComboDualNand(){
        
        if(SQLiteQueries.CB_DualNand == null || "".equals(SQLiteQueries.CB_DualNand)){
            String[] strDualNand = {  "", "DemoN (Xecuter)", "X360DNA (LibraSoft)", "Cygnos V1.0 (Team Cygnos)", "Cygnos V2.0 (Team Cygnos)", "360SquirtNandPCB (Squirt)", "Glitch360Shark (Glitch360Team)" };
            for(int i=0;i<strDualNand.length;i++)    {
    		jc_DualNand.insertItemAt(strDualNand[i],i);
            }
            jc_DualNand.setSelectedIndex(0);           
        }else{           
            String s = SQLiteQueries.CB_DualNand;
            String[] str=s.split(",");
            for(int i=0;i<str.length;i++)    {
    		jc_DualNand.insertItemAt(str[i],i);
            }
            jc_DualNand.setSelectedIndex(0);          
        }       
    } 
    
    private static void initComboHack(){
        
        if(SQLiteQueries.CB_Hack == null || "".equals(SQLiteQueries.CB_Hack)){
            String[] strHack = {  "", "jTag", "RGH-1", "RGH-2", "RGH-1.2", "S-RGH", "RGH-3", "R-jTag", "R-jTop", "Muffin", "FlashDrive", "XKey", "Wasabi" };
            for(int i=0;i<strHack.length;i++)    {
    		jc_Hack.insertItemAt(strHack[i],i);
            }
            jc_Hack.setSelectedIndex(0);           
        }else{           
            String s = SQLiteQueries.CB_Hack;
            String[] str=s.split(",");
            for(int i=0;i<str.length;i++)    {
    		jc_Hack.insertItemAt(str[i],i);
            }
            jc_Hack.setSelectedIndex(0);           
        }       
    } 

    private static void initComboDriveType(){
        
        if(SQLiteQueries.CB_DriveType == null || "".equals(SQLiteQueries.CB_DriveType)){
            String[] strDriveType = {  "", "Hitachi (Fat)", "Samsung (Fat)", "BenQ (Fat)", "Liteon (Fat)", "Liteon 9504 (Slim)", "Liteon 0225 (Slim)", "Liteon 0272 (Slim)", "Liteon 0401 (Slim)", "Liteon 1071 (Slim)", "Liteon 1175 (Slim)", "Hitachi 500 (Slim)", "Hitachi 502 (Slim)" };
            for(int i=0;i<strDriveType.length;i++)    {
    		jc_Drive_Type.insertItemAt(strDriveType[i],i);
            }
            jc_Drive_Type.setSelectedIndex(0);           
        }else{            
            String s = SQLiteQueries.CB_DriveType;
            String[] str=s.split(",");
            for(int i=0;i<str.length;i++)    {
    		jc_Drive_Type.insertItemAt(str[i],i);
            }
            jc_Drive_Type.setSelectedIndex(0);            
        }        
    } 
    
    private static void initComboFlashDriveType(){
        
        if(SQLiteQueries.CB_FlashDriveType == null || "".equals(SQLiteQueries.CB_FlashDriveType)){
            String[] strFlashDriveType = {  "", "LT+2", "LT+3", "LT-U" };
            for(int i=0;i<strFlashDriveType.length;i++)    {
    		jc_Flash_Drive_Type.insertItemAt(strFlashDriveType[i],i);
            }
            jc_Flash_Drive_Type.setSelectedIndex(0);           
        }else{            
            String s = SQLiteQueries.CB_FlashDriveType;
            String[] str=s.split(",");
            for(int i=0;i<str.length;i++)    {
    		jc_Flash_Drive_Type.insertItemAt(str[i],i);
            }
            jc_Flash_Drive_Type.setSelectedIndex(0);            
        }       
    } 
    
    public static String Getcpukey(){ return t_CPU_KEY.getText(); }
    
    public static String Getdvdkey(){ return t_DVD_KEY.getText(); }
    
    public static String Getdashnow(){ return t_Dash_Version_Now.getText(); }
    
    public static Object Getdashhack(){ return jc_Dash_Version_Hack.getSelectedItem(); }
    
    public static Object Getmodchip(){ return jc_ModChip.getSelectedItem(); }
    
    public static Object Getdualnand(){ return jc_DualNand.getSelectedItem(); }
    
    public static String Getconsoletype(){ return t_ConsoleType.getText(); }
    
    public static String Getcbversion(){ return t_CB_Version.getText(); }
    
    public static Object Gethack(){ return jc_Hack.getSelectedItem(); }
    
    public static String Getmfrdate(){ return t_MFR_Date.getText(); }
    
    public static String Getconsoleid(){ return t_Console_ID.getText(); }
    
    public static String Getserial(){ return t_Serial.getText(); }
    
    public static String Getregion(){ return t_Region.getText(); }
    
    public static String Getosig(){ return t_OSIG.getText(); }
     
    public static Object Getbigblock(){ return jc_BigBlock_BB.getSelectedItem(); }
    
    public static Object Getbadblock(){ return jc_BadBlock_BB.getSelectedItem(); }
    
    public static Object Getldv(){ return jc_LDV.getSelectedItem(); }
    
    public static String Getfcrt(){ return t_FCRT.getText(); }
    
    public static Object Getflashdrive(){ return jc_Flash_Drive.getSelectedItem(); }
    
    public static Object Getflashdrivetype(){ return jc_Flash_Drive_Type.getSelectedItem(); }
    
    public static Object Getdrivetype(){ return jc_Drive_Type.getSelectedItem(); }
    
    public static String Getfirstname(){ return t_FirstName.getText(); }
    
    public static String Getlastname(){ return t_LastName.getText(); }
    
    public static String Getpseudo(){ return t_Pseudo.getText(); }
    
    public static String Getemail(){ return t_Email.getText(); }
    
    public static String Getaddress(){ return t_Address.getText(); }  
}

class ProcessNewCustomerEndNotifier extends Thread
{
    Process process;
    CustomerForm classThatNeedsToBeNotified;

    public ProcessNewCustomerEndNotifier(CustomerForm classThatNeedsToBeNotified, Process process)
    {
        this.process = process;
        this.classThatNeedsToBeNotified = classThatNeedsToBeNotified;
    }

    @Override
    public void run()
    {
        try {
            process.waitFor();
        }
        catch (InterruptedException e) {
            classThatNeedsToBeNotified.processEnded();
        }
        classThatNeedsToBeNotified.processEnded();
    }
}
