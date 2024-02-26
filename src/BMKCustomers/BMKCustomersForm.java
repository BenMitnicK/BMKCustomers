/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BMKCustomers;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URISyntaxException;
import java.security.CodeSource;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author BenMitnicK
 */
public class BMKCustomersForm extends JPanel {
     
    public static JComboBox<String> jc_CustomersList;
    private static JButton jb_EditBodyXboxData;
    private static JButton jb_DelCustomer;
    private static JButton jb_ScreenShot;
    private static JButton jb_AddImage;
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
    private JLabel CustomersList;
    private JLabel Flash_Drive;
    private JLabel Hack;
    private JLabel Comment;
    private JLabel FCRT;
    public static JLabel tp_image;   

    private JScrollPane jsp_address;
    private JScrollPane jsp_Comment;
    public static JScrollPane jsp_panel1;
    public static JScrollPane jsp_image;
    public static JTextArea t_Address;
    public static JTextArea t_Comment;
    public static JTextField t_CPU_KEY;
    public static JTextField t_DVD_KEY;
    public static JTextField t_Dash_Version_Now;
    public static JTextField t_Dash_Version_Hack;
    public static JTextField t_Console_Type;
    public static JTextField t_ModChip;
    public static JTextField t_DualNand;
    public static JTextField t_CB_Version;
    public static JTextField t_Console_ID;
    public static JTextField t_Serial;
    public static JTextField t_Region;
    public static JTextField t_OSIG;
    public static JTextField t_BigBlock_BB;
    public static JTextField t_BadBlock_BB;
    public static JTextField t_LDV;
    public static JTextField t_MFR_Date;
    public static JTextField t_FirstName;
    public static JTextField t_LastName;
    public static JTextField t_Pseudo;
    public static JTextField t_Email;
    public static JTextField t_Flash_Drive;
    public static JTextField t_Flash_Drive_Type;
    public static JTextField t_Hack;
    public static JTextField t_Drive_Type;
    public static JTextField t_FCRT;
    
    static BackgroundImage jPanel;
    JFileChooser fci;
    public static String ext;
    
    public BMKCustomersForm() throws IOException, SQLException, URISyntaxException{              
        SQLiteQueries.getElementsOptions();
        initComponents();
        checkCustomersExist();
        initComboBoxCustomers();
        SetColorTextLabel();
        SetColorTextTextField();
        SetElementsMod();  
    }  
    
    private void initComponents() throws IOException, URISyntaxException, SQLException {
        
        jc_CustomersList = new JComboBox<>();
        jb_EditBodyXboxData = new JButton();
        jb_DelCustomer = new JButton();
        jb_ScreenShot = new JButton();
        jb_AddImage = new JButton();
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
        CustomersList = new JLabel();
        Flash_Drive = new JLabel();
        Hack = new JLabel();
        Comment = new JLabel();
        FCRT = new JLabel();
        tp_image = new JLabel();   

        jsp_address = new JScrollPane();
        jsp_Comment = new JScrollPane();
        jsp_panel1 = new JScrollPane();
        jsp_image = new JScrollPane();
        t_Address = new JTextArea();
        t_Comment = new JTextArea();
        t_CPU_KEY = new JTextField();
        t_DVD_KEY = new JTextField();
        t_Dash_Version_Now = new JTextField();
        t_Dash_Version_Hack = new JTextField();
        t_Console_Type = new JTextField();
        t_ModChip = new JTextField();
        t_DualNand = new JTextField();
        t_CB_Version = new JTextField();
        t_Console_ID = new JTextField();
        t_Serial = new JTextField();
        t_Region = new JTextField();
        t_OSIG = new JTextField();
        t_BigBlock_BB = new JTextField();
        t_BadBlock_BB = new JTextField();
        t_LDV = new JTextField();
        t_MFR_Date = new JTextField();
        t_FirstName = new JTextField();
        t_LastName = new JTextField();
        t_Pseudo = new JTextField();
        t_Email = new JTextField();
        t_Flash_Drive = new JTextField();
        t_Flash_Drive_Type = new JTextField();
        t_Hack = new JTextField();
        t_Drive_Type = new JTextField();
        t_FCRT = new JTextField();
        
        CodeSource codeSource = Main.class.getProtectionDomain().getCodeSource();
        File jarFile = new File(codeSource.getLocation().toURI().getPath());
        String jarDir = jarFile.getParentFile().getPath();
        
        File f;
        if(OSValidator.IS_UNIX){
            f = new File(jarDir + "/images/base_linux.png");
        }else{
            f = new File("images/base.png");
        }
        
        jc_CustomersList.setFont(new java.awt.Font("Tahoma", 3, 12));

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
        FCRT.setToolTipText("File For Read DVD");
        jb_EditBodyXboxData.setToolTipText("Edit BodyXboxData Of Your Customer");
        jb_DelCustomer.setToolTipText("Delete Customer");
        jb_ScreenShot.setToolTipText("Take ScreenShot");
        jb_AddImage.setToolTipText("Add Console Image Of Your Customer");
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
       
        t_CPU_KEY.setEditable(false);
        t_DVD_KEY.setEditable(false);
        t_OSIG.setEditable(false);
        t_BigBlock_BB.setEditable(false);       
        t_Console_ID.setEditable(false);
        t_Serial.setEditable(false);
        t_Region.setEditable(false);       
        t_Dash_Version_Hack.setEditable(false);       
        t_Dash_Version_Now.setEditable(false);        
        t_Hack.setEditable(false);
        t_Console_Type.setEditable(false);
        t_CB_Version.setEditable(false);       
        t_BadBlock_BB.setEditable(false);        
        t_MFR_Date.setEditable(false);       
        t_LDV.setEditable(false);
        t_FirstName.setEditable(false);
        t_LastName.setEditable(false);
        t_Pseudo.setEditable(false);
        t_Email.setEditable(false);        
        t_Drive_Type.setEditable(false);        
        t_ModChip.setEditable(false);       
        t_DualNand.setEditable(false);
        t_Address.setEditable(false);        
        t_Address.setAutoscrolls(false);        
        t_Comment.setAutoscrolls(false);
        t_Comment.setEditable(false);
        t_Flash_Drive.setEditable(false);
        t_Flash_Drive_Type.setEditable(false);       
        t_DVD_KEY.setEditable(false);
        t_CPU_KEY.setEditable(false);
        t_FCRT.setEditable(false);

        jb_ScreenShot.setIcon(new ImageIcon(getClass().getResource("/images/screenshot.png")));
        jb_AddImage.setIcon(new ImageIcon(getClass().getResource("/images/addimage.png")));
        jb_EditBodyXboxData.setIcon(new ImageIcon(getClass().getResource("/images/editcustomerdata.png")));
        jb_DelCustomer.setIcon(new ImageIcon(getClass().getResource("/images/delcustomer.png")));

        jb_ScreenShot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jb_ScreenShotActionPerformed(evt);
                } catch (SQLException ex) {
                    Logger.getLogger(BMKCustomersForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (URISyntaxException ex) {
                    Logger.getLogger(BMKCustomersForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        jb_AddImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jb_AddImageActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(BMKCustomersForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(BMKCustomersForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (URISyntaxException ex) {
                    Logger.getLogger(BMKCustomersForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        tp_image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tp_imageMouseClicked(evt);
            }
        });
        
        
        t_Address.setLineWrap(true);
        t_Address.setDocument(new TextFieldLimit(160));
        t_Address.setColumns(20);
        t_Address.setRows(5); 
        t_Address.getAccessibleContext().setAccessibleParent(t_Address);
        jsp_address.setViewportView(t_Address);
        
        t_Comment.setLineWrap(true);
        t_Comment.getAccessibleContext().setAccessibleParent(t_Comment);
        jsp_Comment.setViewportView(t_Comment);
        
        tp_image.setHorizontalAlignment(JLabel.CENTER);
        tp_image.setVerticalAlignment(JLabel.CENTER);
        tp_image.setBackground(new Color(0,0,0,80));           
        
        tp_image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tp_imageMouseEntered(evt);
            }
        });
                
        jb_DelCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jb_DelCustomerActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(BMKCustomersForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(BMKCustomersForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        jb_EditBodyXboxData.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jb_EditBodyXboxDataActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(BMKCustomersForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(BMKCustomersForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (URISyntaxException ex) {
                    Logger.getLogger(BMKCustomersForm.class.getName()).log(Level.SEVERE, null, ex);
                }
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
        
        if ("YES".equals(SQLiteQueries.ImageBase) && f.exists() && f.canRead()) {
            BufferedImage image = ImageIO.read(f);
            jPanel = new BackgroundImage(image);
        }else{
            jPanel = new BackgroundImage();
        }       
                
        if(OSValidator.IS_UNIX){
            
            CustomersList.setBounds(25, 67, 126, 20);
            jc_CustomersList.setBounds(177, 65, 150, 25);
            jb_EditBodyXboxData.setBounds(377, 47, 80, 60);
            jb_DelCustomer.setBounds(469, 47, 80, 60);
            jb_ScreenShot.setBounds(561, 47, 80, 60);
            jb_AddImage.setBounds(653, 47, 80, 60);

            CPU_KEY.setBounds(25, 165, 135, 20);
            DVD_KEY.setBounds(25, 201, 135, 20);
            Dash_Version_Now.setBounds(25, 237, 135, 20);
            Dash_Version_Hack.setBounds(25, 273, 135, 20);
            Console_Type.setBounds(25, 309, 135, 20);
            ModChip.setBounds(25, 345, 135, 20);
            DualNand.setBounds(25, 381, 135, 20);
            Hack.setBounds(25, 417, 135, 20);
            CB_Version.setBounds(25, 453, 135, 20);
            Comment.setBounds(25, 528, 135, 20);

            MFR_Date.setBounds(484, 165, 98, 20);
            Console_ID.setBounds(484, 201, 98, 20);
            Serial.setBounds(484, 237, 98, 20);
            Region.setBounds(484, 273, 98, 20);
            OSIG.setBounds(484, 309, 98, 20);
            BigBlock_BB.setBounds(484, 345, 98, 20);
            BadBlock_BB.setBounds(484, 381, 98, 20);
            LDV.setBounds(484, 417, 98, 20);
            FCRT.setBounds(721, 417, 50, 20);
            Flash_Drive.setBounds(484, 453, 98, 20);

            FirstName.setBounds(922, 165, 75, 20);
            LastName.setBounds(922, 201, 75, 20);
            Pseudo.setBounds(922, 237, 75, 20);
            Email.setBounds(922, 273, 75, 20);
            Address.setBounds(922, 309, 75, 20);

            t_CPU_KEY.setBounds(177, 162, 280, 26);
            t_DVD_KEY.setBounds(177, 198, 280, 26);
            t_Dash_Version_Now.setBounds(177, 234, 280, 26);
            t_Dash_Version_Hack.setBounds(177, 270, 280, 26);
            t_Console_Type.setBounds(177, 306, 280, 26);
            t_ModChip.setBounds(177, 342, 280, 26);
            t_DualNand.setBounds(177, 378, 280, 26);
            t_Hack.setBounds(177, 414, 280, 26);
            t_CB_Version.setBounds(177, 450, 280, 26);

            t_MFR_Date.setBounds(595, 162, 280, 26);
            t_Console_ID.setBounds(595, 198, 280, 26);
            t_Serial.setBounds(595, 234, 280, 26);
            t_Region.setBounds(595, 270, 280, 26);
            t_OSIG.setBounds(595, 306, 280, 26);
            t_BigBlock_BB.setBounds(595, 342, 280, 26);
            t_BadBlock_BB.setBounds(595, 378, 280, 26);
            t_LDV.setBounds(595, 414, 62, 26);
            t_FCRT.setBounds(801, 414, 74, 26);
            t_Flash_Drive.setBounds(595, 450, 67, 26);
            t_Flash_Drive_Type.setBounds(662, 450, 65, 26);       
            t_Drive_Type.setBounds(727, 450, 148, 26);

            t_FirstName.setBounds(1002, 162, 246, 26);
            t_LastName.setBounds(1002, 198, 246, 26);
            t_Pseudo.setBounds(1002, 234, 246, 26);
            t_Email.setBounds(1002, 269, 246, 26);
            jsp_address.setBounds(1002, 306, 246, 113);

            jsp_Comment.setBounds(177, 486, 698, 163);
            tp_image.setBounds(924, 452, 322, 195);
            
        }else{
            
            CustomersList.setBounds(43, 59, 126, 20);
            jc_CustomersList.setBounds(191, 58, 150, 25);
            jb_EditBodyXboxData.setBounds(391, 43, 80, 60);
            jb_DelCustomer.setBounds(483, 43, 80, 60);
            jb_ScreenShot.setBounds(575, 43, 80, 60);
            jb_AddImage.setBounds(667, 43, 80, 60);

            CPU_KEY.setBounds(43, 158, 115, 20);
            DVD_KEY.setBounds(43, 195, 115, 20);
            Dash_Version_Now.setBounds(43, 232, 115, 20);
            Dash_Version_Hack.setBounds(43, 269, 115, 20);
            Console_Type.setBounds(43, 306, 115, 20);
            ModChip.setBounds(43, 343, 115, 20);
            DualNand.setBounds(43, 380, 115, 20);
            Hack.setBounds(43, 417, 115, 20);
            CB_Version.setBounds(43, 454, 115, 20);
            Comment.setBounds(43, 530, 115, 20);

            MFR_Date.setBounds(473, 158, 80, 20);
            Console_ID.setBounds(473, 195, 80, 20);
            Serial.setBounds(473, 232, 80, 20);
            Region.setBounds(473, 269, 80, 20);
            OSIG.setBounds(473, 306, 80, 20);
            BigBlock_BB.setBounds(473, 343, 80, 20);
            BadBlock_BB.setBounds(473, 380, 80, 20);
            LDV.setBounds(473, 417, 80, 20);
            FCRT.setBounds(683, 417, 55, 20);
            Flash_Drive.setBounds(473, 454, 80, 20);

            FirstName.setBounds(868, 158, 65, 20);
            LastName.setBounds(868, 195, 65, 20);
            Pseudo.setBounds(868, 232, 65, 20);
            Email.setBounds(868, 269, 65, 20);
            Address.setBounds(868, 306, 65, 20);

            t_CPU_KEY.setBounds(191, 156, 254, 26);
            t_DVD_KEY.setBounds(191, 193, 254, 26);
            t_Dash_Version_Now.setBounds(191, 230, 254, 26);
            t_Dash_Version_Hack.setBounds(191, 267, 254, 26);
            t_Console_Type.setBounds(191, 304, 254, 26);
            t_ModChip.setBounds(191, 341, 254, 26);
            t_DualNand.setBounds(191, 378, 254, 26);
            t_Hack.setBounds(191, 415, 254, 26);
            t_CB_Version.setBounds(191, 452, 254, 26);

            t_MFR_Date.setBounds(566, 156, 254, 26);
            t_Console_ID.setBounds(566, 193, 254, 26);
            t_Serial.setBounds(566, 230, 254, 26);
            t_Region.setBounds(566, 267, 254, 26);
            t_OSIG.setBounds(566, 304, 254, 26);
            t_BigBlock_BB.setBounds(566, 341, 254, 26);
            t_BadBlock_BB.setBounds(566, 378, 254, 26);
            t_LDV.setBounds(566, 415, 62, 26);
            t_FCRT.setBounds(746, 415, 74, 26);
            t_Flash_Drive.setBounds(566, 452, 62, 26);
            t_Flash_Drive_Type.setBounds(628, 452, 60, 26);       
            t_Drive_Type.setBounds(688, 452, 132, 26);

            t_FirstName.setBounds(937, 156, 246, 26);
            t_LastName.setBounds(937, 193, 246, 26);
            t_Pseudo.setBounds(937, 230, 246, 26);
            t_Email.setBounds(937, 267, 246, 26);
            jsp_address.setBounds(937, 304, 246, 113);

            jsp_Comment.setBounds(191, 488, 629, 158);
            tp_image.setBounds(868, 449, 314, 195);
        } 
        
        jPanel.setLayout(null);
        jPanel.add(CustomersList);
        jPanel.add(jc_CustomersList);
        jPanel.add(jb_EditBodyXboxData);       
        jPanel.add(jb_DelCustomer);
        jPanel.add(jb_ScreenShot);
        jPanel.add(jb_AddImage);       
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
        jPanel.add(t_CPU_KEY);
        jPanel.add(t_DVD_KEY);
        jPanel.add(t_Dash_Version_Now);
        jPanel.add(t_Dash_Version_Hack);
        jPanel.add(t_Console_Type);
        jPanel.add(t_ModChip);
        jPanel.add(t_DualNand);
        jPanel.add(t_Hack);
        jPanel.add(t_CB_Version);       
        jPanel.add(t_MFR_Date);
        jPanel.add(t_Console_ID);
        jPanel.add(t_Serial);
        jPanel.add(t_Region);
        jPanel.add(t_OSIG);
        jPanel.add(t_BigBlock_BB);
        jPanel.add(t_BadBlock_BB);
        jPanel.add(t_LDV);
        jPanel.add(t_FCRT);
        jPanel.add(t_Flash_Drive);
        jPanel.add(t_Flash_Drive_Type);       
        jPanel.add(t_Drive_Type);       
        jPanel.add(t_FirstName);
        jPanel.add(t_LastName);
        jPanel.add(t_Pseudo);
        jPanel.add(t_Email);
        jPanel.add(jsp_address);      
        jPanel.add(jsp_Comment);
        jPanel.add(tp_image);

        jsp_panel1.setViewportView(jPanel);       
        jsp_panel1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jsp_panel1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jsp_panel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addComponent(jsp_panel1))
        );
    }                                

    private void tp_imageMouseClicked(java.awt.event.MouseEvent evt) {                                     
        ZoomLabelImage LaodZommImage = new ZoomLabelImage(TabbedPane.frame, true);
        if(Objects.nonNull(SQLiteQueries.istreamImage)){
           LaodZommImage.setVisible(true);
        }
    }

    private void tp_imageMouseEntered(java.awt.event.MouseEvent evt) { 
        if(Objects.nonNull(SQLiteQueries.istreamImage)){
            tp_image.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }else if(Objects.isNull(SQLiteQueries.istreamImage)){
            tp_image.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }
    }
    
    private void jb_AddImageActionPerformed(java.awt.event.ActionEvent evt) throws IOException, SQLException, FileNotFoundException, URISyntaxException {             
        fci = new JFileChooser();
        fci.setDialogTitle("Choose Your Image Options");
        String lesTextes[]={ "Add Image", "Delete Image"};
        int retour = JOptionPane.showOptionDialog(TabbedPane.frame, "Make Your Choice", "Information", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, lesTextes, lesTextes[0]);
        fci.addChoosableFileFilter(new ImageFilter());
        fci.setAcceptAllFileFilterUsed(false);
        if(retour == 0 ){
            int returnVal = fci.showOpenDialog(TabbedPane.frame);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File DirImg = fci.getSelectedFile();
                ext = new ImageFilter().getExtension(DirImg);               
                SQLiteQueries.addImage(DirImg.toString(), ext);
            }    
        }else if(retour == JOptionPane.CLOSED_OPTION){
                    
        }else{
            SQLiteQueries.delImage();
        }    
    } 
    
    private void jb_ScreenShotActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, URISyntaxException {  
        ScreenShot.ScreenWindows();   
    }                                          

    private void jb_EditBodyXboxDataActionPerformed(java.awt.event.ActionEvent evt) throws IOException, SQLException, URISyntaxException {                                         
        jsp_panel1.getViewport().removeAll();
        jsp_panel1.setViewportView(new CustomerEditBodyXboxDataForm().jPanel);
        jsp_panel1.revalidate();
        jsp_panel1.repaint();            
    }                                        

    private void jb_DelCustomerActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, IOException {
        JOptionPane d = new JOptionPane();
        try{                
            int retour = d.showConfirmDialog(TabbedPane.frame, "Are You Sure You Want To Delete Customer ??", "Delete Confirmation", JOptionPane.OK_CANCEL_OPTION);
            if (retour == 0){
                SQLiteQueries.deleteCustomer();
                jc_CustomersList.removeAllItems();
                initComboBoxCustomers();   
            }               
        }catch(SQLException e){e.printStackTrace();}catch(IOException e){e.printStackTrace();}
    }   
    
    private static void checkCustomersExist() throws IOException{
        int count = SQLiteQueries.CustomersCount();
        if(count == 0){
            jb_EditBodyXboxData.setEnabled(false);
            jb_DelCustomer.setEnabled(false); 
            jb_AddImage.setEnabled(false);
            jb_ScreenShot.setEnabled(false);
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
            t_BigBlock_BB.setText("");
            t_BadBlock_BB.setText("");
            t_LDV.setText("");
            t_FCRT.setText("");
            t_Flash_Drive.setText("");
            t_Flash_Drive_Type.setText("");
            t_Drive_Type.setText("");           
            t_FirstName.setText("");
            t_LastName.setText("");
            t_Email.setText("");
            t_Pseudo.setText("");
            t_Address.setText("");
            t_Comment.setText("");
        }else{
            jb_EditBodyXboxData.setEnabled(true);
            jb_DelCustomer.setEnabled(true);
            jb_AddImage.setEnabled(true);
            jb_ScreenShot.setEnabled(true);
        }
    }
    
    private void jc_CustomersListActionPerformed(java.awt.event.ActionEvent evt) throws IOException, SQLException, URISyntaxException {                                           
        SQLiteQueries.element("BMKCustomersForm"); 
        SetElementsMod();
   }                                                
 
    private void SetElementsMod() throws SQLException{
        if("ENABLE".equals(SQLiteQueries.Display())){
            ElementsEnable();
        } 
    }
    
    private void SetColorTextLabel(){
                
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
        }if(SQLiteQueries.LastName == null || "".equals(SQLiteQueries.LastName)){
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
        }    
    }
    
    public final void SetColorTextTextField() throws IOException{
        
        if(SQLiteQueries.t_LastName == null || "".equals(SQLiteQueries.t_LastName)){
            t_LastName.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.t_LastName;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        t_LastName.setForeground(new Color(R, G, B));
        t_LastName.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.t_FirstName == null || "".equals(SQLiteQueries.t_FirstName)){
            t_FirstName.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.t_FirstName;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        t_FirstName.setForeground(new Color(R, G, B));
        t_FirstName.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.t_pseudo == null || "".equals(SQLiteQueries.t_pseudo)){
            t_Pseudo.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.t_pseudo;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        t_Pseudo.setForeground(new Color(R, G, B));
        t_Pseudo.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.t_email == null || "".equals(SQLiteQueries.t_email)){
            t_Email.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.t_email;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        t_Email.setForeground(new Color(R, G, B));
        t_Email.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.t_address == null || "".equals(SQLiteQueries.t_address)){
            t_Address.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.t_address;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        t_Address.setForeground(new Color(R, G, B));
        t_Address.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.t_CPU_KEY == null || "".equals(SQLiteQueries.t_CPU_KEY)){
            t_CPU_KEY.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.t_CPU_KEY;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        t_CPU_KEY.setForeground(new Color(R, G, B));
        t_CPU_KEY.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.t_DVD_KEY == null || "".equals(SQLiteQueries.t_DVD_KEY)){
            t_DVD_KEY.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.t_DVD_KEY;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        t_DVD_KEY.setForeground(new Color(R, G, B));
        t_DVD_KEY.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.t_Dash_Version_Now == null || "".equals(SQLiteQueries.t_Dash_Version_Now)){
            t_Dash_Version_Now.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.t_Dash_Version_Now;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        t_Dash_Version_Now.setForeground(new Color(R, G, B));
        t_Dash_Version_Now.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.t_Dash_Version_Hack == null || "".equals(SQLiteQueries.t_Dash_Version_Hack)){
            t_Dash_Version_Hack.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.t_Dash_Version_Hack;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        t_Dash_Version_Hack.setForeground(new Color(R, G, B));
        t_Dash_Version_Hack.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.t_Console_Type == null || "".equals(SQLiteQueries.t_Console_Type)){
            t_Console_Type.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.t_Console_Type;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        t_Console_Type.setForeground(new Color(R, G, B));
        t_Console_Type.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.t_ModChip == null || "".equals(SQLiteQueries.t_ModChip)){
            t_ModChip.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.t_ModChip;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        t_ModChip.setForeground(new Color(R, G, B));
        t_ModChip.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.t_DualNand == null || "".equals(SQLiteQueries.t_DualNand)){
            t_DualNand.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.t_DualNand;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        t_DualNand.setForeground(new Color(R, G, B));
        t_DualNand.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.t_Hack == null || "".equals(SQLiteQueries.t_Hack)){
            t_Hack.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.t_Hack;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        t_Hack.setForeground(new Color(R, G, B));
        t_Hack.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.t_CB_Version == null || "".equals(SQLiteQueries.t_CB_Version)){
            t_CB_Version.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.t_CB_Version;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        t_CB_Version.setForeground(new Color(R, G, B));
        t_CB_Version.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.t_MFR_Date == null || "".equals(SQLiteQueries.t_MFR_Date)){
            t_MFR_Date.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.t_MFR_Date;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        t_MFR_Date.setForeground(new Color(R, G, B));
        t_MFR_Date.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.t_Console_ID == null || "".equals(SQLiteQueries.t_Console_ID)){
            t_Console_ID.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.t_Console_ID;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        t_Console_ID.setForeground(new Color(R, G, B));
        t_Console_ID.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.t_Serial == null || "".equals(SQLiteQueries.t_Serial)){
            t_Serial.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.t_Serial;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        t_Serial.setForeground(new Color(R, G, B));
        t_Serial.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.t_Region == null || "".equals(SQLiteQueries.t_Region)){
            t_Region.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.t_Region;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        t_Region.setForeground(new Color(R, G, B));
        t_Region.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.t_OSIG == null || "".equals(SQLiteQueries.t_OSIG)){
            t_OSIG.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.t_OSIG;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        t_OSIG.setForeground(new Color(R, G, B));
        t_OSIG.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.t_BigBlock_BB == null || "".equals(SQLiteQueries.t_BigBlock_BB)){
            t_BigBlock_BB.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.t_BigBlock_BB;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        t_BigBlock_BB.setForeground(new Color(R, G, B));
        t_BigBlock_BB.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.t_BadBlock_BB == null || "".equals(SQLiteQueries.t_BadBlock_BB)){
            t_BadBlock_BB.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.t_BadBlock_BB;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        t_BadBlock_BB.setForeground(new Color(R, G, B));
        t_BadBlock_BB.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.t_LDV == null || "".equals(SQLiteQueries.t_LDV)){
            t_LDV.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.t_LDV;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        t_LDV.setForeground(new Color(R, G, B));
        t_LDV.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.t_FCRT == null || "".equals(SQLiteQueries.t_FCRT)){
            t_FCRT.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.t_FCRT;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        t_FCRT.setForeground(new Color(R, G, B));
        t_FCRT.setFont(new java.awt.Font("Tahoma", 1, 11));
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
        }if(SQLiteQueries.t_Flash_Drive_Type == null || "".equals(SQLiteQueries.t_Flash_Drive_Type)){
            t_Flash_Drive_Type.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.t_Flash_Drive_Type;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        t_Flash_Drive_Type.setForeground(new Color(R, G, B));
        t_Flash_Drive_Type.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.t_Flash_Drive == null || "".equals(SQLiteQueries.t_Flash_Drive)){
            t_Flash_Drive.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.t_Flash_Drive;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        t_Flash_Drive.setForeground(new Color(R, G, B));
        t_Flash_Drive.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.t_Drive_Type == null || "".equals(SQLiteQueries.t_Drive_Type)){
            t_Drive_Type.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.t_Drive_Type;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        t_Drive_Type.setForeground(new Color(R, G, B));
        t_Drive_Type.setFont(new java.awt.Font("Tahoma", 1, 11));
        }
        
     }
    
    private int StringToInt(String STR) {
        int str = Integer.parseInt(STR);
        return str;
    }
    
    private void ElementsEnable(){        
        if ("".equals(t_CPU_KEY.getText())){
            t_CPU_KEY.setEnabled(false); 
            validate();
            repaint();
        }else{
            t_CPU_KEY.setEnabled(true);
            validate();
            repaint();
        }if ("".equals(t_DVD_KEY.getText())){
            t_DVD_KEY.setEnabled(false);
            validate();
            repaint();
        }else{
            t_DVD_KEY.setEnabled(true);
            validate();
            repaint();
        }if ("".equals(t_Dash_Version_Now.getText())){
            t_Dash_Version_Now.setEnabled(false);  
            validate();
            repaint();
        }else{
            t_Dash_Version_Now.setEnabled(true);
            validate();
            repaint();
        }if ("".equals(t_Dash_Version_Hack.getText())){
            t_Dash_Version_Hack.setEnabled(false);
            validate();
            repaint();
        }else{
            t_Dash_Version_Hack.setEnabled(true);
            validate();
            repaint();
        }if ("".equals(t_Console_Type.getText())){
            t_Console_Type.setEnabled(false); 
            validate();
            repaint();
        }else{
            t_Console_Type.setEnabled(true);
            validate();
            repaint();
        }if ("".equals(t_CB_Version.getText())){
            t_CB_Version.setEnabled(false);
            validate();
            repaint();
        }else{
            t_CB_Version.setEnabled(true);
            validate();
            repaint();
        }if ("".equals(t_ModChip.getText())){
            t_ModChip.setEnabled(false);
            validate();
            repaint();
        }else{
            t_ModChip.setEnabled(true);
            validate();
            repaint();
        }if ("".equals(t_DualNand.getText())){
            t_DualNand.setEnabled(false);
            validate();
            repaint();
        }else{
            t_DualNand.setEnabled(true);
            validate();
            repaint();
        }if ("".equals(t_Console_ID.getText())){
            t_Console_ID.setEnabled(false);  
            validate();
            repaint();
        }else{
            t_Console_ID.setEnabled(true);
            validate();
            repaint();
        }if ("".equals(t_Serial.getText())){
            t_Serial.setEnabled(false);
            validate();
            repaint();
        }else{
            t_Serial.setEnabled(true);
            validate();
            repaint();
        }if ("".equals(t_Region.getText())){
            t_Region.setEnabled(false);
            validate();
            repaint();
        }else{
            t_Region.setEnabled(true);
            validate();
            repaint();
        }if ("".equals(t_OSIG.getText())){
            t_OSIG.setEnabled(false);
            validate();
            repaint();
        }else{
            t_OSIG.setEnabled(true);
            validate();
            repaint();
        }if ("".equals(t_BigBlock_BB.getText())){
            t_BigBlock_BB.setEnabled(false);
            validate();
            repaint();
        }else{
            t_BigBlock_BB.setEnabled(true);
            validate();
            repaint();
        }if ("".equals(t_BadBlock_BB.getText())){
            t_BadBlock_BB.setEnabled(false);
            validate();
            repaint();
        }else{
            t_BadBlock_BB.setEnabled(true);
            validate();
            repaint();
        }if ("".equals(t_LDV.getText())){
            t_LDV.setEnabled(false);
            validate();
            repaint();
        }else{
            t_LDV.setEnabled(true);
            validate();
            repaint();
        }if ("".equals(t_FCRT.getText())){
            t_FCRT.setEnabled(false);
            validate();
            repaint();
        }else{
            t_FCRT.setEnabled(true);
            validate();
            repaint();
        }if ("".equals(t_MFR_Date.getText())){
            t_MFR_Date.setEnabled(false);
            validate();
            repaint();
        }else{
            t_MFR_Date.setEnabled(true);
            validate();
            repaint();
        }if ("".equals(t_FirstName.getText())){
            t_FirstName.setEnabled(false);
            validate();
            repaint();
        }else{
            t_FirstName.setEnabled(true);
            validate();
            repaint();
        }if ("".equals(t_Pseudo.getText())){
            t_Pseudo.setEnabled(false);
            validate();
            repaint();
        }else{
            t_Pseudo.setEnabled(true);
            validate();
            repaint();
        }if ("".equals(t_Email.getText())){
            t_Email.setEnabled(false);
            validate();
            repaint();
        }else{
            t_Email.setEnabled(true);
            validate();
            repaint();
        }if ("".equals(t_Flash_Drive.getText())){
            t_Flash_Drive.setEnabled(false);
            validate();
            repaint();
        }else{
            t_Flash_Drive.setEnabled(true);
            validate();
            repaint();
        }if ("".equals(t_Flash_Drive_Type.getText())){
            t_Flash_Drive_Type.setEnabled(false);
            validate();
            repaint();
        }else{
            t_Flash_Drive_Type.setEnabled(true);
            validate();
            repaint();
        }if ("".equals(t_Hack.getText())){
            t_Hack.setEnabled(false);
            validate();
            repaint();
        }else {
            t_Hack.setEnabled(true);
            validate();
            repaint();
        }if ("".equals(t_Drive_Type.getText())){
            t_Drive_Type.setEnabled(false);
            validate();
            repaint();
        }else{
            t_Drive_Type.setEnabled(true);
            validate();
            repaint();
        }if ("".equals(t_Address.getText())){
            t_Address.setEnabled(false);
            validate();
            repaint();
        }else{
            t_Address.setEnabled(true);
            validate();
            repaint();
        }if ("".equals(t_Comment.getText())){
            t_Comment.setEnabled(false);
            validate();
            repaint();
        }else{
            t_Comment.setEnabled(true);
            validate();
            repaint();
        }  
    }
    
    public static void initComboBoxCustomers() throws IOException{
        checkCustomersExist();
        ResultSet result = SQLiteQueries.query("SELECT Lastname FROM Customers");
        SortedSet<String> tabdyn = new TreeSet<String>();
        try {           
            while (result.next()) {
                tabdyn.add(result.getString("Lastname"));  
            }
        } catch (SQLException e) { e.printStackTrace(); }
            Iterator it = tabdyn.iterator();
            while (it.hasNext())
            {
                jc_CustomersList.addItem((String) it.next());
            }
    }
    
    public static String GetComment(){ return t_Comment.getText(); }    
}
