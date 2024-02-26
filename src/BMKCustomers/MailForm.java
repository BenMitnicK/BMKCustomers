/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BMKCustomers;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.CodeSource;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author BenMitnicK
 */
public class MailForm extends JPanel {
    
    private JButton jb_Attachment;
    private JButton jb_Send;
    private JLabel jl_Subject;
    private JLabel jl_EmailCustomer;
    private JLabel jl_EmailTechnician;
    private JLabel jl_PassWord;
    private static JLabel FieldInformed;
    private JLabel FieldInformed2;
    public static JLabel FieldInformed3;
    private JScrollPane js_Mail;
    private static JTextArea jta_Area;
    private static JTextField jt_Subject;
    public static JTextField jt_EmailCustomer;
    private static JTextField jt_EmailTechnician;
    private static JTextField jt_Attachment;
    public static JPasswordField jt_PassWord;
    
    JFileChooser fc;
    static String name;
    BackgroundImage jPanel;

    public MailForm() throws IOException, URISyntaxException {
        initComponents();
        SetColorTextLabel();
        SetColorTextTextField();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() throws IOException, URISyntaxException {

        jb_Attachment = new JButton();
        jb_Send = new JButton();
        jl_Subject = new JLabel();
        jl_EmailCustomer = new JLabel();
        jl_EmailTechnician = new JLabel();
        jl_PassWord = new JLabel();
        FieldInformed = new JLabel();
        FieldInformed2 = new JLabel();
        FieldInformed3 = new JLabel();
        js_Mail = new JScrollPane();
        jta_Area = new JTextArea();
        jt_Subject = new JTextField();
        jt_EmailCustomer = new JTextField();
        jt_EmailTechnician = new JTextField();
        jt_Attachment = new JTextField();
        jt_PassWord = new JPasswordField();
        
        CodeSource codeSource = Main.class.getProtectionDomain().getCodeSource();
        File jarFile = new File(codeSource.getLocation().toURI().getPath());
        String jarDir = jarFile.getParentFile().getPath();
        
        File f;
        if(OSValidator.IS_UNIX){
            f = new File(jarDir + "/images/mail_linux.png");
        }else{
            f = new File("images/mail.png");
        }

        jta_Area.setColumns(20);
        jta_Area.setLineWrap(true);
        jta_Area.setRows(5);
        jta_Area.setText("Hi, You will find attached information about your xbox360. \nCordially,");
        js_Mail.setViewportView(jta_Area);

        jl_Subject.setText("Subject");
        
        jb_Attachment.setText("Attachment");
        jb_Attachment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_AttachmentActionPerformed(evt);
            }
        });

        jb_Send.setText("Send");
        jb_Send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jb_SendActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(MailForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        jl_EmailCustomer.setText("Mail Customer");
        jt_EmailCustomer.setFont(new java.awt.Font("Tahoma", 3, 12));
        jt_EmailCustomer.setText(BMKCustomersForm.t_Email.getText());
        jt_EmailCustomer.setHorizontalAlignment(SwingConstants.CENTER);
        jl_EmailTechnician.setText("Mail Technician");
        jt_EmailTechnician.setFont(new java.awt.Font("Tahoma", 3, 12));
        jt_EmailTechnician.setHorizontalAlignment(SwingConstants.CENTER);
        jt_EmailTechnician.setText(SQLiteQueries.t_EmailTechnician);
        jt_Subject.setFont(new java.awt.Font("Tahoma", 3, 12));
        jt_Subject.setDocument(new TextFieldLimit(30));
        jt_Subject.setText("Xbox Information");
        jt_Subject.setHorizontalAlignment(SwingConstants.CENTER);
        jt_Attachment.setEditable(false);
        jt_Attachment.setEnabled(false);
        jl_PassWord.setText("Mail PassWord");
        jt_PassWord.setHorizontalAlignment(SwingConstants.CENTER);
        jt_PassWord.setText(SQLiteQueries.t_EmailPassWord);
        FieldInformed3.setHorizontalAlignment(SwingConstants.CENTER);

        if ("YES".equals(SQLiteQueries.ImageMail) && f.exists() && f.canRead()) {             
            BufferedImage image = ImageIO.read(f);
            jPanel = new BackgroundImage(image);
        }else{
            jPanel = new BackgroundImage();
        }
        
        if(OSValidator.IS_UNIX){
            
            js_Mail.setBounds(440, 170, 398, 167);

            jl_EmailTechnician.setBounds(455, 374, 107, 20);
            jl_PassWord.setBounds(455, 406, 107, 20);
            jl_EmailCustomer.setBounds(455, 438, 107, 20);
            jl_Subject.setBounds(455, 470, 107, 20);

            jt_EmailTechnician.setBounds(566, 371, 180, 26);
            jt_PassWord.setBounds(566, 403, 180, 26);
            jt_EmailCustomer.setBounds(566, 435, 180, 26);
            jt_Subject.setBounds(566, 467, 180, 26);
            jt_Attachment.setBounds(566, 505, 180, 26); 

            FieldInformed.setBounds(750, 373, 76, 22);
            FieldInformed2.setBounds(750, 437, 76, 22);
            FieldInformed3.setBounds(566, 343, 180, 22); 

            jb_Attachment.setBounds(455, 506, 107, 25);
            jb_Send.setBounds(752, 506, 70, 25);
            
        }else{
            
            js_Mail.setBounds(436, 164, 357, 167);

            jl_EmailTechnician.setBounds(445, 368, 89, 20);
            jl_PassWord.setBounds(445, 401, 89, 20);
            jl_EmailCustomer.setBounds(445, 434, 89, 20);
            jl_Subject.setBounds(445, 467, 89, 20);

            jt_EmailTechnician.setBounds(535, 366, 180, 26);
            jt_PassWord.setBounds(535, 399, 180, 26);
            jt_EmailCustomer.setBounds(535, 432, 180, 26);
            jt_Subject.setBounds(535, 465, 180, 26);
            jt_Attachment.setBounds(535, 504, 180, 26); 

            FieldInformed.setBounds(720, 368, 70, 22);
            FieldInformed2.setBounds(720, 434, 70, 22);
            FieldInformed3.setBounds(535, 337, 180, 22); 

            jb_Attachment.setBounds(437, 505, 96, 25);
            jb_Send.setBounds(721, 505, 70, 25);
            
        }

        jPanel.setLayout(null);
        jPanel.add(js_Mail);
        jPanel.add(jl_EmailTechnician);
        jPanel.add(jl_PassWord);       
        jPanel.add(jl_EmailCustomer);
        jPanel.add(jl_Subject);
        jPanel.add(jt_EmailTechnician);       
        jPanel.add(jt_PassWord);
        jPanel.add(jt_EmailCustomer);
        jPanel.add(jt_Subject);
        jPanel.add(jt_Attachment);
        jPanel.add(FieldInformed);
        jPanel.add(FieldInformed2);
        jPanel.add(FieldInformed3);
        jPanel.add(jb_Attachment);
        jPanel.add(jb_Send);
        
    }                   

    private void jb_AttachmentActionPerformed(java.awt.event.ActionEvent evt) {                                         
        fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(TabbedPane.frame);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            fc.getCurrentDirectory();
            jt_Attachment.setText(fc.getSelectedFile().getPath());
            name = fc.getSelectedFile().getName();
         }   
    }     
    
    private void jb_SendActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        String res = new String(jt_PassWord.getPassword());
        FieldInformed.setText("");
        FieldInformed2.setText("");
        FieldInformed3.setText("");
        if(!"".equals(jta_Area.getText()) && !"".equals(jt_EmailTechnician.getText()) && !"".equals(res) && !"".equals(jt_EmailCustomer.getText()) && !"".equals(jt_Subject.getText()) && !"".equals(jt_Attachment.getText())){
            if(CustomerForm.isEmailAddress(JMailFormGetemailtechnician()) == false){
                FieldInformed.setText("Not Correct");
            }else if(CustomerForm.isEmailAddress(JMailFormGetemailcustomers()) == false){
                FieldInformed2.setText("Not Correct");
            }else{
                SendMail.sendMailsmtp();
            }            
        }else{
            FieldInformed3.setText("Fields Must Not Be Empty");
        }       
    }   
    
    private void SetColorTextLabel(){
                
        if(SQLiteQueries.MailTechnician == null || "".equals(SQLiteQueries.MailTechnician)){
            jl_EmailTechnician.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.MailTechnician;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        jl_EmailTechnician.setForeground(new Color(R, G, B));
        jl_EmailTechnician.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.MailPassWord == null || "".equals(SQLiteQueries.MailPassWord)){
            jl_PassWord.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.MailPassWord;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        jl_PassWord.setForeground(new Color(R, G, B));
        jl_PassWord.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.MailCustomer == null || "".equals(SQLiteQueries.MailCustomer)){
            jl_EmailCustomer.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.MailCustomer;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        jl_EmailCustomer.setForeground(new Color(R, G, B));
        jl_EmailCustomer.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.Subject == null || "".equals(SQLiteQueries.Subject)){
            jl_Subject.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.Subject;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        jl_Subject.setForeground(new Color(R, G, B));
        jl_Subject.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.jb_Attachment == null || "".equals(SQLiteQueries.jb_Attachment)){
            jb_Attachment.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.jb_Attachment;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        jb_Attachment.setForeground(new Color(R, G, B));
        jb_Attachment.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.jb_SendMail == null || "".equals(SQLiteQueries.jb_SendMail)){
            jb_Send.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.jb_SendMail;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        jb_Send.setForeground(new Color(R, G, B));
        jb_Send.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.l_WarningMessage == null || "".equals(SQLiteQueries.l_WarningMessage)){
            FieldInformed.setFont(new java.awt.Font("", 1, 11));
            FieldInformed2.setFont(new java.awt.Font("", 1, 11));
            FieldInformed3.setFont(new java.awt.Font("", 1, 11));
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
        FieldInformed2.setForeground(new Color(R, G, B));
        FieldInformed2.setFont(new java.awt.Font("Tahoma", 1, 11));
        FieldInformed3.setForeground(new Color(R, G, B));
        FieldInformed3.setFont(new java.awt.Font("Tahoma", 1, 11));
        }      
    }

    private void SetColorTextTextField(){
        
        if(SQLiteQueries.t_MailTechnician == null || "".equals(SQLiteQueries.t_MailTechnician)){
            jt_EmailTechnician.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.t_MailTechnician;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        jt_EmailTechnician.setForeground(new Color(R, G, B));
        jt_EmailTechnician.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.t_MailPassWord == null || "".equals(SQLiteQueries.t_MailPassWord)){
            jt_PassWord.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.t_MailPassWord;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        jt_PassWord.setForeground(new Color(R, G, B));
        jt_PassWord.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.t_MailCustomer == null || "".equals(SQLiteQueries.t_MailCustomer)){
            jt_EmailCustomer.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.t_MailCustomer;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        jt_EmailCustomer.setForeground(new Color(R, G, B));
        jt_EmailCustomer.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.t_Subject == null || "".equals(SQLiteQueries.t_Subject)){
            jt_Subject.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.t_Subject;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        jt_Subject.setForeground(new Color(R, G, B));
        jt_Subject.setFont(new java.awt.Font("Tahoma", 1, 11));
        }if(SQLiteQueries.jta_Area == null || "".equals(SQLiteQueries.jta_Area)){
            jta_Area.setFont(new java.awt.Font("", 1, 11));
        }else{
            int R;
            int G;
            int B;
        String s = SQLiteQueries.jta_Area;
        String[] str = s.split(",");
        R = StringToInt(str[0]);
        G = StringToInt(str[1]);
        B = StringToInt(str[2]);
        jta_Area.setForeground(new Color(R, G, B));
        jta_Area.setFont(new java.awt.Font("Tahoma", 1, 11));
        }        
    }
    
    private int StringToInt(String STR) {
        int str = Integer.parseInt(STR);
        return str;
    }
    
    public static String JMailFormGetsubject(){ return jt_Subject.getText(); }
    public static String JMailFormGetemailcustomers(){ return jt_EmailCustomer.getText(); }
    public static String JMailFormGetemailtechnician(){ return jt_EmailTechnician.getText(); }
    public static String JMailFormGetpassword(){ return jt_PassWord.getSelectedText(); }
    public static String JMailFormGetArea(){ return jta_Area.getText(); }
    public static String JMailFormGetAttachment(){ return jt_Attachment.getText(); }
    public static String JMailFormGetAttachmentName(){ return name; }
}