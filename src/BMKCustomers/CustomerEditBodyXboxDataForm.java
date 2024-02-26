/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMKCustomers;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URISyntaxException;
import java.security.CodeSource;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author BenMitnicK
 */
public class CustomerEditBodyXboxDataForm extends JPanel{

    public static JComboBox<String> jc_CustomersList;
    public static JComboBox<String> jc_BigBlock_BB;
    public static JComboBox<String> jc_BadBlock_BB;
    public static JComboBox<String> jc_LDV;
    public static JComboBox<String> jc_Flash_Drive;
    public static JComboBox<String> jc_Flash_Drive_Type;
    public static JComboBox<String> jc_Hack;
    public static JComboBox<String> jc_Drive_Type;
    public static JComboBox<String> jc_Dash_Version_Hack;
    public static JComboBox<String> jc_ModChip;
    public static JComboBox<String> jc_DualNand;
    
    private JButton jb_SaveBodyXboxData;
    public static JButton jb_KV_Info;
    private static JButton jb_EditBodyXboxData;
    private JLabel CPU_KEY;
    private JLabel DVD_KEY;
    private JLabel Dash_Version_Now;
    private JLabel Dash_Version_Hack;
    private JLabel Console_Type;
    private JLabel DualNand;
    private JLabel ModChip;
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
    private JLabel FieldInformed;
    private JLabel CustomersList;
    private JLabel Flash_Drive;
    private JLabel Hack;
    private JLabel Comment;
    private JLabel FCRT;
    public static JLabel tp_image;

    private JScrollPane jsp_address;
    public JScrollPane jsp_panel1;
    private JScrollPane jsp_Comment;
    public static JScrollPane jsp_image;
    public static JTextArea t_Comment;
    public static JTextArea t_Address;
    public static JTextField t_CPU_KEY;
    public static JTextField t_DVD_KEY;
    public static JTextField t_Dash_Version_Now;
    public static JTextField t_ConsoleType;
    public static JTextField t_CB_Version;
    public static JTextField t_Console_ID;
    public static JTextField t_Serial;
    public static JTextField t_Region;
    public static JTextField t_OSIG;
    public static JTextField t_MFR_Date;
    public static JTextField t_FirstName;
    public static JTextField t_LastName;
    public static JTextField t_Pseudo;
    public static JTextField t_Email;
    public static JTextField t_FCRT;
    
    BackgroundImage jPanel;

    public static String ext;
    JFileChooser fc;
    public static String kvinfo;
    public static String nand;
    public static String cpukey;
    boolean isProcessRunning;
    
    public CustomerEditBodyXboxDataForm() throws IOException, SQLException, URISyntaxException{       
        initComponents();       
        ButtonStat();
        SetColorTextLabel();
        SetColorTextLabel2();        
        initComboDashVersionHack();
        initComboModChip();
        initComboDualNand();
        initComboHack();
        initComboDriveType();
        initComboFlashDriveType();
        SQLiteQueries.getElements();
        t_LastNameVerif();
        initComboBoxCustomers();
    }  
    
    private void initComponents() throws IOException, URISyntaxException {

        jc_CustomersList = new JComboBox<>();
        jc_BigBlock_BB = new JComboBox<>();
        jc_BadBlock_BB = new JComboBox<>();
        jc_LDV = new JComboBox<>();
        jc_Flash_Drive = new JComboBox<>();
        jc_Flash_Drive_Type = new JComboBox<>();
        jc_Hack = new JComboBox<>();
        jc_Drive_Type = new JComboBox<>();
        jc_Dash_Version_Hack = new JComboBox<>();
        jc_ModChip = new JComboBox<>();
        jc_DualNand = new JComboBox<>();

        jb_SaveBodyXboxData = new JButton();
        jb_KV_Info = new JButton();
        jb_EditBodyXboxData = new JButton();
        CPU_KEY = new JLabel();
        DVD_KEY = new JLabel();
        Dash_Version_Now = new JLabel();
        Dash_Version_Hack = new JLabel();
        Console_Type = new JLabel();
        DualNand = new JLabel();
        ModChip = new JLabel();
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
        FieldInformed = new JLabel();
        CustomersList = new JLabel();
        Flash_Drive = new JLabel();
        Hack = new JLabel();
        Comment = new JLabel();
        FCRT = new JLabel();
        tp_image = new JLabel();

        jsp_address = new JScrollPane();
        jsp_panel1 = new JScrollPane();
        jsp_Comment = new JScrollPane();
        jsp_image = new JScrollPane();
        t_Comment = new JTextArea();
        t_Address = new JTextArea();
        t_CPU_KEY = new JTextField();
        t_DVD_KEY = new JTextField();
        t_Dash_Version_Now = new JTextField();
        t_ConsoleType = new JTextField();
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
        t_FCRT = new JTextField();
        
        jc_CustomersList.setFont(new java.awt.Font("Tahoma", 3, 12));
        t_LastName.setFont(new java.awt.Font("Tahoma", 1, 12));
        t_LastName.setForeground(new java.awt.Color(204, 0, 51));
        t_Pseudo.setFont(new java.awt.Font("Tahoma", 1, 11));
        t_Email.setFont(new java.awt.Font("Tahoma", 1, 11));
        t_FirstName.setFont(new java.awt.Font("Tahoma", 1, 11));
        jsp_address.setFont(new java.awt.Font("Tahoma", 1, 11));
        t_Address.setFont(new java.awt.Font("Tahoma", 1, 11));
        
        t_CB_Version.setFont(new java.awt.Font("Tahoma", 1, 11));
        t_CPU_KEY.setFont(new java.awt.Font("Tahoma", 1, 11));
        t_DVD_KEY.setFont(new java.awt.Font("Tahoma", 1, 11));
        t_Console_ID.setFont(new java.awt.Font("Tahoma", 1, 11));
        t_OSIG.setFont(new java.awt.Font("Tahoma", 1, 11));
        t_Serial.setFont(new java.awt.Font("Tahoma", 1, 11));
        t_Region.setFont(new java.awt.Font("Tahoma", 1, 11));
        t_MFR_Date.setFont(new java.awt.Font("Tahoma", 1, 11));
        t_ConsoleType.setFont(new java.awt.Font("Tahoma", 1, 11));
        t_Dash_Version_Now.setFont(new java.awt.Font("Tahoma", 1, 11));
        jc_Flash_Drive_Type.setFont(new java.awt.Font("Tahoma", 1, 11));
        jc_BadBlock_BB.setFont(new java.awt.Font("Tahoma", 1, 11));
        jc_LDV.setFont(new java.awt.Font("Tahoma", 1, 11));
        jc_Drive_Type.setFont(new java.awt.Font("Tahoma", 1, 11));
        jc_BigBlock_BB.setFont(new java.awt.Font("Tahoma", 1, 11));
        jc_Hack.setFont(new java.awt.Font("Tahoma", 1, 11));
        jc_Flash_Drive.setFont(new java.awt.Font("Tahoma", 1, 11));
        jc_Dash_Version_Hack.setFont(new java.awt.Font("Tahoma", 1, 11));
        jc_ModChip.setFont(new java.awt.Font("Tahoma", 1, 11));
        jc_DualNand.setFont(new java.awt.Font("Tahoma", 1, 11));
        t_FCRT.setFont(new java.awt.Font("Tahoma", 1, 12));
        
        CodeSource codeSource = Main.class.getProtectionDomain().getCodeSource();
        File jarFile = new File(codeSource.getLocation().toURI().getPath());
        String jarDir = jarFile.getParentFile().getPath();
        
        File f;
        if(OSValidator.IS_UNIX){
            f = new File(jarDir + "/images/editbodyxboxdata_linux.png");
        }else{
            f = new File("images/editbodyxboxdata.png");
        }

        CustomersList.setToolTipText("List Of Your Customers");
        CPU_KEY.setToolTipText("CPU_KEY Of The Xbox 360");
        DVD_KEY.setToolTipText("DVD_KEY Of The Xbox 360");
        Dash_Version_Now.setToolTipText("Dash Version At The Dump Of Xbox 360");
        Dash_Version_Hack.setToolTipText("Dash Version From Hack :-)");
        Console_Type.setToolTipText("Type Of The Xbox 360");
        DualNand.setToolTipText("ModChip DualNand Used for the Xbox 360");
        ModChip.setToolTipText("ModChip Used for the Xbox 360");
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
        Comment.setToolTipText("Comment About your Customer");
        jb_SaveBodyXboxData.setToolTipText("Save Body/Xbox Data");        
        if(OSValidator.IS_UNIX){
            jb_KV_Info.setToolTipText("Open KVInfo For Read");
        }else{
            jb_KV_Info.setToolTipText("Open KVInfo Or Dump For Read");
        }        
        FCRT.setToolTipText("File For Read DVD");        
        jb_EditBodyXboxData.setToolTipText("Back");        
        tp_image.setToolTipText("Console Image Of Your Customer");

               
        CPU_KEY.setText("CPU KEY");
        DVD_KEY.setText("DVD KEY");       
        Comment.setText("Comment");        
        ModChip.setText("ModChip");       
        DualNand.setText("DualNand");      
        Dash_Version_Now.setText("Dash Version (Now)");
        Hack.setText("Hack");
        Dash_Version_Hack.setText("Dash Version (Hack)");
        Console_Type.setText("Console Type");
        CB_Version.setText("CB Version");
        Console_ID.setText("Console ID");
        Serial.setText("Serial");
        Region.setText("Region");
        OSIG.setText("OSIG");
        BigBlock_BB.setText("BigBlock (BB)");      
        BadBlock_BB.setText("BadBlock (BB)");
        LDV.setText("LDV");
        MFR_Date.setText("MFR Date");          
        FirstName.setText("First Name");
        LastName.setText("Last Name");
        Pseudo.setText("Pseudo");
        Email.setText("E-Mail");
        Address.setText("Address");
        CustomersList.setText("Customers List");
        Flash_Drive.setText("Flash/Drive");
        FCRT.setText("FCRT");
       
        jc_BigBlock_BB.setModel(new DefaultComboBoxModel<>(new String[] { "", "No", "Yes" }));

        jc_BadBlock_BB.setModel(new DefaultComboBoxModel<>(new String[] { "", "No", "Yes" }));

        jc_LDV.setModel(new DefaultComboBoxModel<>(new String[] { "", "0", "1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12","13", "14", "15", "16","17", "18", "19", "20", "21", "22", "23", "24","25", "26", "27", "28","29", "30", "31", "32", "33", "34","35", "36", "37", "38","39", "40", "41", "42", "43", "44","45", "46", "47", "48","49", "50" }));

        jc_Flash_Drive.setModel(new DefaultComboBoxModel<>(new String[] { "No", "Yes" }));

        t_LastName.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_LastNameFocusGained(evt);
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_LastNameFocusLost(evt);
            }
        });
        
        t_CPU_KEY.setDocument(new TextFieldLimit(32));
        t_DVD_KEY.setDocument(new TextFieldLimit(32));
        t_CB_Version.setDocument(new TextFieldLimit(32));
        t_Console_ID.setDocument(new TextFieldLimit(32));
        t_Serial.setDocument(new TextFieldLimit(32));
        t_Region.setDocument(new TextFieldLimit(32));
        t_OSIG.setDocument(new TextFieldLimit(32));
        t_MFR_Date.setDocument(new TextFieldLimit(32));
        t_Dash_Version_Now.setDocument(new TextFieldLimit(32));
        t_LastName.setDocument(new TextFieldLimit(20));
        t_FirstName.setDocument(new TextFieldLimit(20));
        t_Pseudo.setDocument(new TextFieldLimit(20));
        t_Email.setDocument(new TextFieldLimit(30));
        t_Address.setLineWrap(true);
        t_Address.setDocument(new TextFieldLimit(160));

        jb_EditBodyXboxData.setIcon(new ImageIcon(getClass().getResource("/images/back.png")));
        jb_SaveBodyXboxData.setIcon(new ImageIcon(getClass().getResource("/images/savebodyxboxdata.png")));
        jb_KV_Info.setIcon(new ImageIcon(getClass().getResource("/images/kvinfo.png")));         
        
        t_Address.setLineWrap(true);
        t_Address.setDocument(new TextFieldLimit(160));
        t_Address.setColumns(20);
        t_Address.setRows(5); 
        t_Address.getAccessibleContext().setAccessibleParent(t_Address);
        jsp_address.setViewportView(t_Address);
        
        t_Comment.setLineWrap(true);
        t_Comment.getAccessibleContext().setAccessibleParent(t_Comment);
        jsp_Comment.setViewportView(t_Comment);
        
        jb_EditBodyXboxData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jb_EditBodyXboxDataActionPerformed(evt);
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerEditBodyXboxDataForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (URISyntaxException ex) {
                    Logger.getLogger(CustomerEditBodyXboxDataForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        jb_SaveBodyXboxData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jb_SaveBodyXboxDataActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(CustomerEditBodyXboxDataForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerEditBodyXboxDataForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        jb_KV_Info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jb_KV_InfoActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(CustomerForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerEditBodyXboxDataForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (URISyntaxException ex) {
                    Logger.getLogger(CustomerEditBodyXboxDataForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        jc_Flash_Drive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_Flash_DriveActionPerformed(evt);
            }
        });

        jc_CustomersList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jc_CustomersListActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(BMKCustomersForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(BMKCustomersForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (URISyntaxException ex) {
                    Logger.getLogger(BMKCustomersForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        if ("YES".equals(SQLiteQueries.ImageEditBodyXbox) && f.exists() && f.canRead()) {
            BufferedImage image = ImageIO.read(f);
            jPanel = new BackgroundImage(image);
        }else{
            jPanel = new BackgroundImage();
        }       
        
        if(OSValidator.IS_UNIX){
          
            jc_CustomersList.setBounds(177, 66, 150, 25);

            jc_Dash_Version_Hack.setBounds(177, 273, 282, 25);
            jc_ModChip.setBounds(177, 344, 282, 25);
            jc_DualNand.setBounds(177, 378, 282, 25);
            jc_Hack.setBounds(177, 414, 282, 25);

            jc_BigBlock_BB.setBounds(594, 344, 282, 25);
            jc_BadBlock_BB.setBounds(594, 378, 282, 25);
            jc_LDV.setBounds(594, 414, 62, 25);
            jc_Flash_Drive.setBounds(594, 450, 62, 25);
            jc_Flash_Drive_Type.setBounds(655, 450, 68, 25);       
            jc_Drive_Type.setBounds(723, 450, 153, 25);


            jb_EditBodyXboxData.setBounds(377, 48, 80, 60);
            jb_SaveBodyXboxData.setBounds(469, 48, 80, 60);
            jb_KV_Info.setBounds(561, 48, 80, 60);

            CustomersList.setBounds(25, 68, 126, 20);

            CPU_KEY.setBounds(25, 166, 135, 20);
            DVD_KEY.setBounds(25, 203, 135, 20);
            Dash_Version_Now.setBounds(25, 239, 135, 20);
            Dash_Version_Hack.setBounds(25, 275, 135, 20);
            Console_Type.setBounds(25, 311, 135, 20);
            ModChip.setBounds(25, 346, 135, 20);            
            DualNand.setBounds(25, 380, 135, 20);
            Hack.setBounds(25, 416, 135, 20);               
            CB_Version.setBounds(25, 452, 135, 20);
            Comment.setBounds(25, 527, 135, 20);

            MFR_Date.setBounds(482, 166, 98, 20);        
            Console_ID.setBounds(482, 203, 98, 20);
            Serial.setBounds(482, 239, 98, 20);
            Region.setBounds(482, 275, 98, 20);
            OSIG.setBounds(482, 311, 98, 20);
            BigBlock_BB.setBounds(482, 346, 98, 20);
            BadBlock_BB.setBounds(482, 380, 98, 20);
            LDV.setBounds(482, 416, 98, 20);
            FCRT.setBounds(721, 416, 50, 20);
            Flash_Drive.setBounds(482, 452, 98, 20);        

            FirstName.setBounds(923, 166, 75, 20);
            LastName.setBounds(923, 203, 75, 20);
            Pseudo.setBounds(923, 239, 75, 20);
            Email.setBounds(923, 275, 75, 20);
            Address.setBounds(923, 311, 75, 20);        

            FieldInformed.setBounds(966, 567, 272, 20);

            t_CPU_KEY.setBounds(177, 163, 282, 26);
            t_DVD_KEY.setBounds(177, 200, 282, 26);
            t_Dash_Version_Now.setBounds(177, 236, 280, 26);
            t_ConsoleType.setBounds(177, 308, 282, 26);
            t_CB_Version.setBounds(177, 449, 282, 26);

            t_MFR_Date.setBounds(594, 163, 282, 26);
            t_Console_ID.setBounds(594, 200, 282, 26);
            t_Serial.setBounds(594, 236, 282, 26);
            t_Region.setBounds(594, 272, 282, 26);
            t_OSIG.setBounds(594, 308, 282, 26);
            t_FCRT.setBounds(802, 414, 74, 26);
            jsp_Comment.setBounds(177, 485, 700, 163);

            t_FirstName.setBounds(1003, 163, 246, 26);
            t_LastName.setBounds(1003, 200, 246, 26);
            t_Pseudo.setBounds(1003, 236, 246, 26);
            t_Email.setBounds(1003, 272, 246, 26);
            jsp_address.setBounds(1003, 308, 246, 113);
            
        }else{
            
            jc_CustomersList.setBounds(183, 61, 150, 25);

            jc_Dash_Version_Hack.setBounds(183, 274, 262, 25);
            jc_ModChip.setBounds(183, 345, 262, 25);
            jc_DualNand.setBounds(183, 379, 262, 25);
            jc_Hack.setBounds(183, 415, 262, 25);

            jc_BigBlock_BB.setBounds(566, 345, 262, 25);
            jc_BadBlock_BB.setBounds(566, 379, 262, 25);   
            jc_LDV.setBounds(566, 415, 62, 25);
            jc_Flash_Drive.setBounds(566, 451, 62, 25);
            jc_Flash_Drive_Type.setBounds(628, 451, 64, 25);       
            jc_Drive_Type.setBounds(692, 451, 136, 25);


            jb_EditBodyXboxData.setBounds(383, 46, 80, 60);
            jb_SaveBodyXboxData.setBounds(475, 46, 80, 60);
            jb_KV_Info.setBounds(567, 46, 80, 60);

            CustomersList.setBounds(35, 62, 126, 20);       
            CPU_KEY.setBounds(35, 166, 115, 20);
            DVD_KEY.setBounds(35, 203, 115, 20);
            Dash_Version_Now.setBounds(35, 239, 115, 20);
            Dash_Version_Hack.setBounds(35, 275, 115, 20);
            Console_Type.setBounds(35, 311, 115, 20);
            ModChip.setBounds(35, 346, 115, 20);            
            DualNand.setBounds(35, 380, 115, 20);
            Hack.setBounds(35, 416, 115, 20);               
            CB_Version.setBounds(35, 452, 115, 20);
            Comment.setBounds(35, 528, 115, 20);

            MFR_Date.setBounds(473, 166, 80, 20);        
            Console_ID.setBounds(473, 203, 80, 20);
            Serial.setBounds(473, 239, 80, 20);
            Region.setBounds(473, 275, 80, 20);
            OSIG.setBounds(473, 311, 80, 20);
            BigBlock_BB.setBounds(473, 346, 80, 20);
            BadBlock_BB.setBounds(473, 380, 80, 20);
            LDV.setBounds(473, 416, 80, 20);
            FCRT.setBounds(687, 416, 55, 20);
            Flash_Drive.setBounds(473, 452, 80, 20);        

            FirstName.setBounds(876, 166, 65, 20);
            LastName.setBounds(876, 203, 65, 20);
            Pseudo.setBounds(876, 239, 65, 20);
            Email.setBounds(876, 275, 65, 20);
            Address.setBounds(876, 311, 65, 20);        

            FieldInformed.setBounds(909, 566, 272, 20);

            t_CPU_KEY.setBounds(183, 164, 262, 26);
            t_DVD_KEY.setBounds(183, 201, 262, 26);
            t_Dash_Version_Now.setBounds(183, 237, 262, 26);
            t_ConsoleType.setBounds(183, 309, 262, 26);
            t_CB_Version.setBounds(183, 450, 262, 26);
            t_MFR_Date.setBounds(566, 164, 262, 26);   
            t_Console_ID.setBounds(566, 201, 262, 26);
            t_Serial.setBounds(566, 237, 262, 26);
            t_Region.setBounds(566, 273, 262, 26);
            t_OSIG.setBounds(566, 309, 262, 26);
            t_FCRT.setBounds(754, 414, 74, 26);
            jsp_Comment.setBounds(183, 487, 646, 158);   

            t_FirstName.setBounds(945, 164, 246, 26);
            t_LastName.setBounds(945, 201, 246, 26);
            t_Pseudo.setBounds(945, 237, 246, 26);
            t_Email.setBounds(945, 273, 246, 26);
            jsp_address.setBounds(945, 308, 246, 113);
        
        }

        jPanel.setLayout(null);        
        jPanel.add(jc_CustomersList);
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
        jPanel.add(jb_EditBodyXboxData);
        jPanel.add(jb_SaveBodyXboxData);
        jPanel.add(jb_KV_Info);       
        jPanel.add(CustomersList);       
        jPanel.add(CPU_KEY);
        jPanel.add(DVD_KEY);
        jPanel.add(Dash_Version_Now);
        jPanel.add(Dash_Version_Hack);
        jPanel.add(Console_Type);
        jPanel.add(ModChip);  
        jPanel.add(DualNand);
        jPanel.add(Hack);   
        jPanel.add(CB_Version);
        jPanel.add(Comment);       
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
        jPanel.add(FieldInformed);
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
        jPanel.add(jsp_Comment);        
        jPanel.add(t_FirstName);
        jPanel.add(t_LastName);
        jPanel.add(t_Pseudo);
        jPanel.add(t_Email);
        jPanel.add(jsp_address);
        
    }                        

    private void jb_SaveBodyXboxDataActionPerformed(java.awt.event.ActionEvent evt) throws IOException, SQLException {                                           
        if (!"".equals(t_LastName.getText()) && "".equals(t_Email.getText())){
            if (isLastName(t_LastName.getText()) == true){
                if (t_LastName.getText().equals(BMKCustomersForm.t_LastName.getText()) || SQLiteQueries.ElementVerifLastName(t_LastName.getText().toUpperCase()) == false){
                    SQLiteQueries.updateCustomer();
                    GoToBMKCustomersForm();
                    BMKCustomersForm.jc_CustomersList.removeAllItems();
                    BMKCustomersForm.initComboBoxCustomers();
                }else {                                             
                    FieldInformed.setText("Last Name Is Already Exist");
                    FieldInformed.setVisible(true);                                            
                } 
            } else {                                         
                FieldInformed.setText("Last Name Is Not Formated Correctly");
                FieldInformed.setVisible(true);                                        
            }
        }
        if (!"".equals(EditbodyGetemail())){
            if(isEmailAddress(EditbodyGetemail()) == true && !"".equals(t_LastName.getText())){                  
                if (isLastName(t_LastName.getText()) == true){
                    if (t_LastName.getText().equals(BMKCustomersForm.t_LastName.getText()) || SQLiteQueries.ElementVerifLastName(t_LastName.getText().toUpperCase()) == false){
                            SQLiteQueries.updateCustomer();
                            GoToBMKCustomersForm();
                            BMKCustomersForm.jc_CustomersList.removeAllItems();
                            BMKCustomersForm.initComboBoxCustomers();
                     }else {                                             
                        FieldInformed.setText("Last Name Is Already Exist");
                        FieldInformed.setVisible(true);                                           
                    }
                } else { 
                    FieldInformed.setText("Last Name Is Not Formated Correctly");
                    FieldInformed.setVisible(true);
                }                   
            }else {                                         
                FieldInformed.setText("Email Is Not Valide");
                FieldInformed.setVisible(true);
            }
        }  
    }  
    
    private void jb_KV_InfoActionPerformed(java.awt.event.ActionEvent evt) throws IOException, SQLException, URISyntaxException { 
        fc = new JFileChooser();
        fc.setDialogTitle("Choose Your KVInfo Options");
        JOptionPane d = new JOptionPane(); // les textes figurant // sur les boutons 
        String lesTextes[]={ "KVInfos.txt", "Dump.bin"}; // indice du bouton qui a été // cliqué ou CLOSED_OPTION 
        String[] lesTextes2 = {"KVInfos.txt"};            
        if(OSValidator.IS_UNIX){                
            int retour = JOptionPane.showOptionDialog(TabbedPane.frame, "Make Your Choice", "Information", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, lesTextes2, lesTextes2[0]); 
            if(retour == 0 ){
                int returnVal = fc.showOpenDialog(TabbedPane.frame);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File DirKv = fc.getSelectedFile();
                    kvinfo = DirKv.toString();
                    KVinfoFile.AlimKVInfoEX();
                }    
            }else if(retour == JOptionPane.CLOSED_OPTION){ }                
        }else{
            int retour = JOptionPane.showOptionDialog(TabbedPane.frame, "Make Your Choice", "Information", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, lesTextes, lesTextes[0]); 
            if(retour == 0 ){               
                int returnVal = fc.showOpenDialog(TabbedPane.frame);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File DirKv = fc.getSelectedFile();
                   kvinfo = DirKv.toString();
                    KVinfoFile.AlimKVInfoEX();
                }    
            }else if(retour == JOptionPane.CLOSED_OPTION){ }else{
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
                        new ProcessCustomerEditEndNotifier(this, process).start();                        
                    }catch(Exception e) {e.printStackTrace();}         
                }
            }
        }
    }
    
    public void processEnded()
    {
        isProcessRunning = false;
        // Or just do stuff here!
        KVinfoFile.AlimKVInfoEX();
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
    
    private void jb_EditBodyXboxDataActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, URISyntaxException { 
        GoToBMKCustomersForm();
    }
    
    private void GoToBMKCustomersForm(){       
        BMKCustomersForm.jsp_panel1.getViewport().removeAll();
        BMKCustomersForm.jsp_panel1.setViewportView(BMKCustomersForm.jPanel);
        BMKCustomersForm.jsp_panel1.getViewport().revalidate();
        BMKCustomersForm.jsp_panel1.getViewport().repaint();        
    }
    
    private void ButtonStat(){
        jc_CustomersList.setEnabled(false);
        jb_EditBodyXboxData.setSelected(true);
    }
     
    
    private void jc_CustomersListActionPerformed(java.awt.event.ActionEvent evt) throws IOException, SQLException, URISyntaxException {                                           
        SQLiteQueries.element("CustomersEditBodyXboxData"); 
   }                                                
    
    public static void initComboBoxCustomers() throws IOException{
        ResultSet result = SQLiteQueries.query("SELECT Lastname FROM Customers");
        SortedSet<String> tabdyn = new TreeSet<String>();
        try {           
            while (result.next()) {
                tabdyn.add(result.getString("Lastname"));  
            }
        } catch (SQLException e) { e.printStackTrace(); }
        Iterator it = tabdyn.iterator();
        while (it.hasNext()) {
            jc_CustomersList.addItem((String) it.next());
        }
        jc_CustomersList.setSelectedItem(t_LastName.getText());
    }
    
    private void t_LastNameVerif(){        
        if (!"".equals(t_LastName.getText())){               
            jb_SaveBodyXboxData.setEnabled(true);
            FieldInformed.setVisible(false);                
        }else{
            jb_SaveBodyXboxData.setEnabled(false);               
            FieldInformed.setText("The field 'Last Name' must be informed");
            FieldInformed.setVisible(true);               
        }       
    }
    
    private void t_LastNameFocusGained(java.awt.event.FocusEvent evt) {                                                
        if (!"".equals(t_LastName.getText())){                
            jb_SaveBodyXboxData.setEnabled(true);
            FieldInformed.setVisible(false);                
        }else{
            jb_SaveBodyXboxData.setEnabled(false);                
            FieldInformed.setText("The field 'Last Name' must be informed");
            FieldInformed.setVisible(true);                
        }      
    }                                        

    private void t_LastNameFocusLost(java.awt.event.FocusEvent evt) {                                           
        if (!"".equals(t_LastName.getText())){                
            jb_SaveBodyXboxData.setEnabled(true);
            FieldInformed.setVisible(false);               
        }else{
            jb_SaveBodyXboxData.setEnabled(false);               
            FieldInformed.setText("The field 'Last Name' must be informed");
            FieldInformed.setVisible(true);                
        }        
    }       

    public static boolean isEmailAddress(String email){
        Pattern p = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}$");
        Matcher m = p.matcher(email.toUpperCase()); 
        return m.matches();
    }
    
    public static boolean isLastName(String Name){
        Pattern p = Pattern.compile("([a-zA-Z0-9_-]*)");
        Matcher m = p.matcher(Name.toUpperCase());
        return m.matches();
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
        }if(SQLiteQueries.jb_SaveBodyXboxData == null || "".equals(SQLiteQueries.jb_SaveBodyXboxData)){
            jb_SaveBodyXboxData.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.jb_SaveBodyXboxData;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        jb_SaveBodyXboxData.setForeground(new Color(R, G, B));
        jb_SaveBodyXboxData.setFont(new java.awt.Font("Tahoma", 1, 11));
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
    
    private void SetColorTextLabel2(){
        
        if(SQLiteQueries.CustomersList == null || "".equals(SQLiteQueries.CustomersList)){
            CustomersList.setFont(new java.awt.Font("", 1, 14));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.CustomersList;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        CustomersList.setForeground(new Color(R, G, B));
        CustomersList.setFont(new java.awt.Font("Tahoma", 1, 14));
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
        }if(SQLiteQueries.Comment == null || "".equals(SQLiteQueries.Comment)){
            Comment.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.Comment;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        Comment.setForeground(new Color(R, G, B));
        Comment.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.t_Comment == null || "".equals(SQLiteQueries.t_Comment)){
            t_Comment.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.t_Comment;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        t_Comment.setForeground(new Color(R, G, B));
        t_Comment.setFont(new java.awt.Font("Tahoma", 1, 11));
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
            for(int i=0;i<str.length;i++) {
    		jc_Dash_Version_Hack.insertItemAt(str[i],i);
            }
            jc_Dash_Version_Hack.setSelectedIndex(0);           
        }        
    } 
    
    private static void initComboModChip(){        
        if(SQLiteQueries.CB_ModChip == null || "".equals(SQLiteQueries.CB_ModChip)){
            String[] strModChip = {  "", "CoolRunner Rev-A (Xecuter)", "CoolRunner Rev-B (Xecuter)", "CoolRunner Rev-C (Xecuter)", "CoolRunner Rev-D (Xecuter)", "CR3 LITE (Xecuter)", "CR3 PRO (Xecuter)", "CR4 (Xecuter)", "X360GlitChip V1.4+ (LibraSoft)", "X360GlitChip V2.0+ (LibraSoft)", "Glitcher360 (Matrix)","Glitcher360 V2 (Matrix)", "360Squirt (Squirt)", "Glitch360KeyUltra (Glitch360Team)", "Glitch360Key V1.1 (Glitch360Team)", "X360Ace V1", "X360Ace V2", "X360Ace V3", "X360Ace V4", "X360Ace V5" };
            for(int i=0;i<strModChip.length;i++) {
    		jc_ModChip.insertItemAt(strModChip[i],i);
            }
            jc_ModChip.setSelectedIndex(0);            
        }else{            
            String s = SQLiteQueries.CB_ModChip;
            String[] str=s.split(",");
            for(int i=0;i<str.length;i++) {
    		jc_ModChip.insertItemAt(str[i],i);
            }
            jc_ModChip.setSelectedIndex(0);            
        }        
    } 
    
    private static void initComboDualNand(){        
        if(SQLiteQueries.CB_DualNand == null || "".equals(SQLiteQueries.CB_DualNand)){
            String[] strDualNand = {  "", "DemoN (Xecuter)", "X360DNA (LibraSoft)", "Cygnos V1.0 (Team Cygnos)", "Cygnos V2.0 (Team Cygnos)", "360SquirtNandPCB (Squirt)", "Glitch360Shark (Glitch360Team)" };
            for(int i=0;i<strDualNand.length;i++) {
    		jc_DualNand.insertItemAt(strDualNand[i],i);
            }
            jc_DualNand.setSelectedIndex(0);            
        }else{           
            String s = SQLiteQueries.CB_DualNand;
            String[] str=s.split(",");
            for(int i=0;i<str.length;i++) {
    		jc_DualNand.insertItemAt(str[i],i);
            }
            jc_DualNand.setSelectedIndex(0);            
        }        
    } 
    
    private static void initComboHack(){        
        if(SQLiteQueries.CB_Hack == null || "".equals(SQLiteQueries.CB_Hack)){
            String[] strHack = {  "", "jTag", "RGH-1", "RGH-2", "RGH-1.2", "S-RGH", "RGH-3", "R-jTag", "R-jTop", "Muffin", "FlashDrive", "XKey", "Wasabi" };
            for(int i=0;i<strHack.length;i++) {
    		jc_Hack.insertItemAt(strHack[i],i);
            }
            jc_Hack.setSelectedIndex(0);            
        }else{            
            String s = SQLiteQueries.CB_Hack;
            String[] str=s.split(",");
            for(int i=0;i<str.length;i++) {
    		jc_Hack.insertItemAt(str[i],i);
            }
            jc_Hack.setSelectedIndex(0);           
        }        
    } 

    private static void initComboDriveType(){        
        if(SQLiteQueries.CB_DriveType == null || "".equals(SQLiteQueries.CB_DriveType)){
            String[] strDriveType = {  "", "Hitachi (Fat)", "Samsung (Fat)", "BenQ (Fat)", "Liteon (Fat)", "Liteon 9504 (Slim)", "Liteon 0225 (Slim)", "Liteon 0272 (Slim)", "Liteon 0401 (Slim)", "Liteon 1071 (Slim)", "Liteon 1175 (Slim)", "Hitachi 500 (Slim)", "Hitachi 502 (Slim)" };
            for(int i=0;i<strDriveType.length;i++) {
    		jc_Drive_Type.insertItemAt(strDriveType[i],i);
            }
            jc_Drive_Type.setSelectedIndex(0);           
        }else{           
            String s = SQLiteQueries.CB_DriveType;
            String[] str=s.split(",");
            for(int i=0;i<str.length;i++) {
    		jc_Drive_Type.insertItemAt(str[i],i);
            }
            jc_Drive_Type.setSelectedIndex(0);            
        }        
    } 
    
    private static void initComboFlashDriveType(){        
        if(SQLiteQueries.CB_FlashDriveType == null || "".equals(SQLiteQueries.CB_FlashDriveType)){
            String[] strFlashDriveType = {  "", "LT+2", "LT+3", "LT-U" };
            for(int i=0;i<strFlashDriveType.length;i++) {
    		jc_Flash_Drive_Type.insertItemAt(strFlashDriveType[i],i);
            }
            jc_Flash_Drive_Type.setSelectedIndex(0);            
        }else{            
            String s = SQLiteQueries.CB_FlashDriveType;
            String[] str=s.split(",");
            for(int i=0;i<str.length;i++) {
    		jc_Flash_Drive_Type.insertItemAt(str[i],i);
            }
            jc_Flash_Drive_Type.setSelectedIndex(0);            
        }        
    } 

    public static String EditxboxGetcpukey(){ return t_CPU_KEY.getText(); }
    
    public static String EditxboxGetdvdkey(){ return t_DVD_KEY.getText(); }
    
    public static String EditxboxGetdashnow(){ return t_Dash_Version_Now.getText(); }
    
    public static Object EditxboxGetdashhack(){ return jc_Dash_Version_Hack.getSelectedItem(); }
    
    public static String EditxboxGetconsoletype(){ return t_ConsoleType.getText(); }
    
    public static String EditxboxGetcbversion(){ return t_CB_Version.getText(); }
    
    public static Object EditxboxGethack(){ return jc_Hack.getSelectedItem(); }
    
    public static Object EditxboxGetmodchip(){ return jc_ModChip.getSelectedItem(); }
    
    public static Object EditxboxGetdualnand(){ return jc_DualNand.getSelectedItem(); }
    
    public static String EditxboxGetmfrdate(){ return t_MFR_Date.getText(); }
    
    public static String EditxboxGetconsoleid(){ return t_Console_ID.getText(); }
    
    public static String EditxboxGetserial(){ return t_Serial.getText(); }
    
    public static String EditxboxGetregion(){ return t_Region.getText(); }
    
    public static String EditxboxGetosig(){ return t_OSIG.getText(); }
     
    public static Object EditxboxGetbigblock(){ return jc_BigBlock_BB.getSelectedItem(); }
    
    public static Object EditxboxGetbadblock(){ return jc_BadBlock_BB.getSelectedItem(); }
    
    public static Object EditxboxGetldv(){ return jc_LDV.getSelectedItem(); }
    
    public static String EditxboxGetfcrt(){ return t_FCRT.getText(); }
    
    public static Object EditxboxGetflashdrive(){ return jc_Flash_Drive.getSelectedItem(); }
    
    public static Object EditxboxGetflashdrivetype(){ return jc_Flash_Drive_Type.getSelectedItem(); }
    
    public static Object EditxboxGetdrivetype(){ return jc_Drive_Type.getSelectedItem(); }
    
    public static String EditbodyGetfirstname(){ return t_FirstName.getText(); }
    
    public static String EditbodyGetlastname(){ return t_LastName.getText(); }
    
    public static String EditbodyGetpseudo(){ return t_Pseudo.getText(); }
    
    public static String EditbodyGetemail(){ return t_Email.getText(); }
    
    public static String EditbodyGetaddress(){ return t_Address.getText(); }
    
    public static String GetComment(){ return t_Comment.getText(); }
    
    public static String GetImage(){ return tp_image.getText(); }
    
}

class ProcessCustomerEditEndNotifier extends Thread
{
    Process process;
    CustomerEditBodyXboxDataForm classThatNeedsToBeNotified;

    public ProcessCustomerEditEndNotifier(CustomerEditBodyXboxDataForm classThatNeedsToBeNotified, Process process)
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