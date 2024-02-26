/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BMKCustomers;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author BenMitnicK
 */
public class KVinfoFile {
    
        public static String kvinfo;
    
    public static void AlimKVInfoCF(){    
        try{
            // Création du flux bufférisé sur un FileReader, immédiatement suivi par un 
            // try/finally, ce qui permet de ne fermer le flux QUE s'il le reader
            // est correctement instancié (évite les NullPointerException)
                BufferedReader buff = new BufferedReader(new FileReader(CustomerForm.kvinfo));
            try {
                String line;
                // Lecture du fichier ligne par ligne. Cette boucle se termine
                // quand la méthode retourne la valeur null.
                while ((line = buff.readLine()) != null) {
                    StringTokenizer tok = new StringTokenizer(line, "*" );
                        while (tok.hasMoreTokens()) {
                            String KVInfoCF = tok.nextToken();

                                if(KVInfoCF.contains("Modelo")){
                                    AlimKVInfoAutoggCF();
                                    buff.close();
                                }else if(KVInfoCF.contains("Console") && KVInfoCF.contains("Type")){
                                    AlimKVInfoJRunnerCF();
                                    buff.close();
                                }else if(KVInfoCF.contains("XboxType")){
                                    AlimKVInfoxeBuildCF();
                                    buff.close();
                                }else{
                                    JOptionPane.showMessageDialog(TabbedPane.frame, "KVInfo Not Valid. Please Use AutoGG, Xebuild Gui, JRunner \nOr KVInfo In The Directory For Generat It", "Error Message", JOptionPane.ERROR_MESSAGE);
                                    buff.close();
                                }
                        }
                }

            } finally {
                // dans tous les cas, on ferme nos flux
                buff.close();
            }
            } catch (IOException ioe) {
                // erreur de fermeture des flux
            }
    }

    public static void AlimKVInfoEX(){       
        try{
            // Création du flux bufférisé sur un FileReader, immédiatement suivi par un 
            // try/finally, ce qui permet de ne fermer le flux QUE s'il le reader
            // est correctement instancié (évite les NullPointerException)
                BufferedReader buff = new BufferedReader(new FileReader(CustomerEditBodyXboxDataForm.kvinfo));
            try {
                String line;
                // Lecture du fichier ligne par ligne. Cette boucle se termine
                // quand la méthode retourne la valeur null.
                while ((line = buff.readLine()) != null) {
                    StringTokenizer tok = new StringTokenizer(line, "*" );
                        while (tok.hasMoreTokens()) {
                            String KVInfoEX = tok.nextToken();

                                if(KVInfoEX.contains("Modelo")){
                                    AlimKVInfoAutoggEX();
                                    buff.close();
                                }else if(KVInfoEX.contains("Console") && KVInfoEX.contains("Type")){
                                    AlimKVInfoJRunnerEX();
                                    buff.close();
                                }else if(KVInfoEX.contains("XboxType")){
                                    AlimKVInfoxeBuildEX();
                                    buff.close();
                                }else{
                                    JOptionPane.showMessageDialog(TabbedPane.frame, "KVInfo Not Valid. Please Use AutoGG, Xebuild Gui, JRunner \nOr KVInfo In The Directory For Generat It", "Error Message", JOptionPane.ERROR_MESSAGE);
                                    buff.close();
                                }
                         }
                }
            } finally {
                // dans tous les cas, on ferme nos flux
                buff.close();
            }
        } catch (IOException ioe) {
                // erreur de fermeture des flux
        }
    }
    
    public static void AlimKVInfoJRunnerEX(){        
        try{
            // Création du flux bufférisé sur un FileReader, immédiatement suivi par un 
            // try/finally, ce qui permet de ne fermer le flux QUE s'il le reader
            // est correctement instancié (évite les NullPointerException)
                BufferedReader buff = new BufferedReader(new FileReader(CustomerEditBodyXboxDataForm.kvinfo));
                CustomerEditBodyXboxDataForm.t_CPU_KEY.setText("");
                CustomerEditBodyXboxDataForm.t_ConsoleType.setText("");
                CustomerEditBodyXboxDataForm.t_Dash_Version_Now.setText("");
                CustomerEditBodyXboxDataForm.t_DVD_KEY.setText("");
                CustomerEditBodyXboxDataForm.t_FCRT.setText("");
                CustomerEditBodyXboxDataForm.t_CB_Version.setText("");
                CustomerEditBodyXboxDataForm.t_Console_ID.setText("");
                CustomerEditBodyXboxDataForm.t_Serial.setText("");
                CustomerEditBodyXboxDataForm.t_Region.setText("");
                CustomerEditBodyXboxDataForm.t_OSIG.setText("");
                CustomerEditBodyXboxDataForm.t_MFR_Date.setText("");
                CustomerEditBodyXboxDataForm.jc_BigBlock_BB.setSelectedIndex(0);
                CustomerEditBodyXboxDataForm.jc_LDV.setSelectedIndex(0);
            try {
                String line;
                // Lecture du fichier ligne par ligne. Cette boucle se termine
                // quand la méthode retourne la valeur null.
                while ((line = buff.readLine()) != null) {
                    StringTokenizer tok = new StringTokenizer(line, "*" );
                        while (tok.hasMoreTokens()) {
                            String KVInfoJREX = tok.nextToken();

                            if(KVInfoJREX.contains("Console Type")){
                                String[] strjrex = KVInfoJREX.split(": ");
                                CustomerEditBodyXboxDataForm.t_ConsoleType.setText(strjrex[1]);
                            }else if(KVInfoJREX.contains("Cpu Key")){
                                String[] strjrex = KVInfoJREX.split(": ");
                                CustomerEditBodyXboxDataForm.t_CPU_KEY.setText(strjrex[1]);
                            }else if(KVInfoJREX.contains("KV Type")){
                                String[] strjrcf = KVInfoJREX.split(": ");
                                CustomerForm.jc_LDV.setSelectedIndex(StringToInt(strjrcf[1])+1);
                            }else if(KVInfoJREX.contains("MFR Date")){
                                String[] strjrex = KVInfoJREX.split(": ");
                                CustomerEditBodyXboxDataForm.t_MFR_Date.setText(strjrex[1]);
                            }else if(KVInfoJREX.contains("Console ID")){
                                String[] strjrex = KVInfoJREX.split(": ");
                                CustomerEditBodyXboxDataForm.t_Console_ID.setText(strjrex[1]);
                            }else if(KVInfoJREX.contains("Serial")){
                                String[] strjrex = KVInfoJREX.split(": ");
                                CustomerEditBodyXboxDataForm.t_Serial.setText(strjrex[1]);
                            }else if(KVInfoJREX.contains("Region")){
                                String[] strjrex = KVInfoJREX.split(": ");
                                CustomerEditBodyXboxDataForm.t_Region.setText(strjrex[1]);
                            }else if(KVInfoJREX.contains("Osig")){
                                String[] strjrex = KVInfoJREX.split(": ");
                                CustomerEditBodyXboxDataForm.t_OSIG.setText(strjrex[1]);
                            }else if(KVInfoJREX.contains("DVD Key")){
                                String[] strjrex = KVInfoJREX.split(": ");
                                CustomerEditBodyXboxDataForm.t_DVD_KEY.setText(strjrex[1]);
                            }
                        }
                }
            } finally {
                // dans tous les cas, on ferme nos flux
                buff.close();
            }
        } catch (IOException ioe) {
                // erreur de fermeture des flux
        }           
    }
        
    public static void AlimKVInfoAutoggEX(){         
        try{
            // Création du flux bufférisé sur un FileReader, immédiatement suivi par un 
            // try/finally, ce qui permet de ne fermer le flux QUE s'il le reader
            // est correctement instancié (évite les NullPointerException)
                BufferedReader buff = new BufferedReader(new FileReader(CustomerEditBodyXboxDataForm.kvinfo));
                CustomerEditBodyXboxDataForm.t_CPU_KEY.setText("");
                CustomerEditBodyXboxDataForm.t_ConsoleType.setText("");
                CustomerEditBodyXboxDataForm.t_Dash_Version_Now.setText("");
                CustomerEditBodyXboxDataForm.t_DVD_KEY.setText("");
                CustomerEditBodyXboxDataForm.t_FCRT.setText("");
                CustomerEditBodyXboxDataForm.t_CB_Version.setText("");
                CustomerEditBodyXboxDataForm.t_Console_ID.setText("");
                CustomerEditBodyXboxDataForm.t_Serial.setText("");
                CustomerEditBodyXboxDataForm.t_Region.setText("");
                CustomerEditBodyXboxDataForm.t_OSIG.setText("");
                CustomerEditBodyXboxDataForm.t_MFR_Date.setText("");
                CustomerEditBodyXboxDataForm.jc_BigBlock_BB.setSelectedIndex(0);
                CustomerEditBodyXboxDataForm.jc_LDV.setSelectedIndex(0);
            try {
                String line;
                // Lecture du fichier ligne par ligne. Cette boucle se termine
                // quand la méthode retourne la valeur null.
                while ((line = buff.readLine()) != null) {
                    StringTokenizer tok = new StringTokenizer(line, "*" );
                    while (tok.hasMoreTokens()) {
                        String KVInfoggEX = tok.nextToken();

                        if(KVInfoggEX.contains("Modelo")){
                            String[] strggex = KVInfoggEX.split(":");
                            CustomerEditBodyXboxDataForm.t_ConsoleType.setText(strggex[1]);
                        }else if(KVInfoggEX.contains("Serial")){
                            String[] strggex = KVInfoggEX.split(":");
                            CustomerEditBodyXboxDataForm.t_Serial.setText(strggex[1]);
                        }else if(KVInfoggEX.contains("Cpu")){
                            String[] strggex = KVInfoggEX.split(":");
                            CustomerEditBodyXboxDataForm.t_CPU_KEY.setText(strggex[1]);
                        }else if(KVInfoggEX.contains("Dvd")){
                            String[] strggex = KVInfoggEX.split(":");
                            CustomerEditBodyXboxDataForm.t_DVD_KEY.setText(strggex[1]);
                        }else if(KVInfoggEX.contains("CB")){
                            String[] strggex = KVInfoggEX.split(":");
                            CustomerEditBodyXboxDataForm.t_CB_Version.setText(strggex[1]);
                        }else if(KVInfoggEX.contains("CF")){
                            String[] strggex = KVInfoggEX.split(":");
                            CustomerEditBodyXboxDataForm.t_Dash_Version_Now.setText(strggex[1]);
                        }else if(KVInfoggEX.contains("LDV")){
                            String[] strggex = KVInfoggEX.split(":");
                            CustomerEditBodyXboxDataForm.jc_LDV.setSelectedItem(strggex[1]);
                        }else if(KVInfoggEX.contains("OSIG")){
                            String[] strggex = KVInfoggEX.split(":");
                            CustomerEditBodyXboxDataForm.t_OSIG.setText(strggex[1]);
                        }else if(KVInfoggEX.contains("Region")){
                            String[] strggex = KVInfoggEX.split(":");
                            CustomerEditBodyXboxDataForm.t_Region.setText(strggex[1]);
                        }
                    }
                }
            } finally {
                // dans tous les cas, on ferme nos flux
                buff.close();
            }
        } catch (IOException ioe) {
                // erreur de fermeture des flux
        }           
    }
        
    public static void AlimKVInfoxeBuildEX(){       
        try{
            // Création du flux bufférisé sur un FileReader, immédiatement suivi par un 
            // try/finally, ce qui permet de ne fermer le flux QUE s'il le reader
            // est correctement instancié (évite les NullPointerException)
                BufferedReader buff = new BufferedReader(new FileReader(CustomerEditBodyXboxDataForm.kvinfo));
                CustomerEditBodyXboxDataForm.t_CPU_KEY.setText("");
                CustomerEditBodyXboxDataForm.t_ConsoleType.setText("");
                CustomerEditBodyXboxDataForm.t_Dash_Version_Now.setText("");
                CustomerEditBodyXboxDataForm.t_DVD_KEY.setText("");
                CustomerEditBodyXboxDataForm.t_FCRT.setText("");
                CustomerEditBodyXboxDataForm.t_CB_Version.setText("");
                CustomerEditBodyXboxDataForm.t_Console_ID.setText("");
                CustomerEditBodyXboxDataForm.t_Serial.setText("");
                CustomerEditBodyXboxDataForm.t_Region.setText("");
                CustomerEditBodyXboxDataForm.t_OSIG.setText("");
                CustomerEditBodyXboxDataForm.t_MFR_Date.setText("");
                CustomerEditBodyXboxDataForm.jc_BigBlock_BB.setSelectedIndex(0);
                CustomerEditBodyXboxDataForm.jc_LDV.setSelectedIndex(0);
            try {
                String line;
                // Lecture du fichier ligne par ligne. Cette boucle se termine
                // quand la méthode retourne la valeur null.
                while ((line = buff.readLine()) != null) {
                    StringTokenizer tok = new StringTokenizer(line, "*" );
                    while (tok.hasMoreTokens()) {
                        String KVInfoxeEX = tok.nextToken();

                         if(KVInfoxeEX.contains("XboxType")){
                            String[] strxeex = KVInfoxeEX.split(": ");
                            CustomerEditBodyXboxDataForm.t_ConsoleType.setText(strxeex[1]);
                        }else if(KVInfoxeEX.contains("CpuKey")){
                            String[] strxeex = KVInfoxeEX.split(": ");
                            CustomerEditBodyXboxDataForm.t_CPU_KEY.setText(strxeex[1]);
                        }else if(KVInfoxeEX.contains("DVDKey")){
                            String[] strxeex = KVInfoxeEX.split(": ");
                            CustomerEditBodyXboxDataForm.t_DVD_KEY.setText(strxeex[1]);
                        }else if(KVInfoxeEX.contains("MFRDate")){
                            String[] strxeex = KVInfoxeEX.split(": ");
                            CustomerEditBodyXboxDataForm.t_MFR_Date.setText(strxeex[1]);
                        }else if(KVInfoxeEX.contains("ConsoleID")){
                            String[] strxeex = KVInfoxeEX.split(": ");
                            CustomerEditBodyXboxDataForm.t_Console_ID.setText(strxeex[1]);
                        }else if(KVInfoxeEX.contains("Serial")){
                            String[] strxeex = KVInfoxeEX.split(": ");
                            CustomerEditBodyXboxDataForm.t_Serial.setText(strxeex[1]);
                        }else if(KVInfoxeEX.contains("Region")){
                            String[] strxeex = KVInfoxeEX.split(": ");
                            CustomerEditBodyXboxDataForm.t_Region.setText(strxeex[1]);
                        }else if(KVInfoxeEX.contains("OSIG")){
                            String[] strxeex = KVInfoxeEX.split(": ");
                            CustomerEditBodyXboxDataForm.t_OSIG.setText(strxeex[1]);
                        }else if(KVInfoxeEX.contains("CB")){
                            String[] strxeex = KVInfoxeEX.split(": ");
                            CustomerEditBodyXboxDataForm.t_CB_Version.setText(strxeex[1]);
                        }else if(KVInfoxeEX.contains("BigBlock")){
                            String[] strxeex = KVInfoxeEX.split(": ");
                            CustomerEditBodyXboxDataForm.jc_BigBlock_BB.setSelectedItem(strxeex[1]);
                        }else if(KVInfoxeEX.contains("LDV")){
                            String[] strxeex = KVInfoxeEX.split(": ");
                            CustomerEditBodyXboxDataForm.jc_LDV.setSelectedItem(strxeex[1]);
                        }else if(KVInfoxeEX.contains("DashVersion")){
                            String[] strxeex = KVInfoxeEX.split(": ");
                            CustomerEditBodyXboxDataForm.t_Dash_Version_Now.setText(strxeex[1]);
                        }else if(KVInfoxeEX.contains("FCRT")){
                            String[] strxeex = KVInfoxeEX.split(": ");
                            if("False".equals(strxeex[1])){
                            CustomerEditBodyXboxDataForm.t_FCRT.setText(strxeex[1]);
                            CustomerEditBodyXboxDataForm.t_FCRT.setForeground(Color.GREEN);
                            }else{
                            CustomerEditBodyXboxDataForm.t_FCRT.setText(strxeex[1]);
                            CustomerEditBodyXboxDataForm.t_FCRT.setForeground(Color.RED);
                            }
                        }       
                    }
                }

            } finally {
                // dans tous les cas, on ferme nos flux
                buff.close();
            }
        } catch (IOException ioe) {
                // erreur de fermeture des flux
         }
    }
        
    public static void AlimKVInfoJRunnerCF(){        
        try{
            // Création du flux bufférisé sur un FileReader, immédiatement suivi par un 
            // try/finally, ce qui permet de ne fermer le flux QUE s'il le reader
            // est correctement instancié (évite les NullPointerException)
                BufferedReader buff = new BufferedReader(new FileReader(CustomerForm.kvinfo));
                CustomerForm.t_CPU_KEY.setText("");
                CustomerForm.t_ConsoleType.setText("");
                CustomerForm.t_Dash_Version_Now.setText("");
                CustomerForm.t_DVD_KEY.setText("");
                CustomerForm.t_FCRT.setText("");
                CustomerForm.t_CB_Version.setText("");
                CustomerForm.t_Console_ID.setText("");
                CustomerForm.t_Serial.setText("");
                CustomerForm.t_Region.setText("");
                CustomerForm.t_OSIG.setText("");
                CustomerForm.t_MFR_Date.setText("");
                CustomerForm.jc_BigBlock_BB.setSelectedIndex(0);
                CustomerForm.jc_LDV.setSelectedIndex(0);
            try {
                String line;
                // Lecture du fichier ligne par ligne. Cette boucle se termine
                // quand la méthode retourne la valeur null.
                while ((line = buff.readLine()) != null) {
                StringTokenizer tok = new StringTokenizer(line, "*" );
                    while (tok.hasMoreTokens()) {
                        String KVInfoJRCF = tok.nextToken();

                         if(KVInfoJRCF.contains("Console Type")){
                            String[] strjrcf = KVInfoJRCF.split(": ");
                            //System.out.println(strjrcf[0] + " : " + strjrcf[1]);
                            CustomerForm.t_ConsoleType.setText(strjrcf[1]);
                        }else if(KVInfoJRCF.contains("Cpu Key")){
                            String[] strjrcf = KVInfoJRCF.split(": ");
                            CustomerForm.t_CPU_KEY.setText(strjrcf[1]);
                        }else if(KVInfoJRCF.contains("KV Type")){
                            String[] strjrcf = KVInfoJRCF.split(": ");
                            CustomerForm.jc_LDV.setSelectedIndex(StringToInt(strjrcf[1])+1);
                        }else if(KVInfoJRCF.contains("MFR Date")){
                            String[] strjrcf = KVInfoJRCF.split(": ");
                            CustomerForm.t_MFR_Date.setText(strjrcf[1]);
                        }else if(KVInfoJRCF.contains("Console ID")){
                            String[] strjrcf = KVInfoJRCF.split(": ");
                            CustomerForm.t_Console_ID.setText(strjrcf[1]);
                        }else if(KVInfoJRCF.contains("Serial")){
                            String[] strjrcf = KVInfoJRCF.split(": ");
                            CustomerForm.t_Serial.setText(strjrcf[1]);
                        }else if(KVInfoJRCF.contains("Region")){
                            String[] strjrcf = KVInfoJRCF.split(": ");
                            CustomerForm.t_Region.setText(strjrcf[1]);
                        }else if(KVInfoJRCF.contains("Osig")){
                            String[] strjrcf = KVInfoJRCF.split(": ");
                            CustomerForm.t_OSIG.setText(strjrcf[1]);
                        }else if(KVInfoJRCF.contains("DVD Key")){
                            String[] strjrcf = KVInfoJRCF.split(": ");
                            CustomerForm.t_DVD_KEY.setText(strjrcf[1]);
                        }     
                    }
                }

            } finally {
                // dans tous les cas, on ferme nos flux
                buff.close();
            }
        } catch (IOException ioe) {
                // erreur de fermeture des flux
        }
    }
        
    public static void AlimKVInfoAutoggCF(){       
        try{
            // Création du flux bufférisé sur un FileReader, immédiatement suivi par un 
            // try/finally, ce qui permet de ne fermer le flux QUE s'il le reader
            // est correctement instancié (évite les NullPointerException)
                BufferedReader buff = new BufferedReader(new FileReader(CustomerForm.kvinfo));
                CustomerForm.t_CPU_KEY.setText("");
                CustomerForm.t_ConsoleType.setText("");
                CustomerForm.t_Dash_Version_Now.setText("");
                CustomerForm.t_DVD_KEY.setText("");
                CustomerForm.t_FCRT.setText("");
                CustomerForm.t_CB_Version.setText("");
                CustomerForm.t_Console_ID.setText("");
                CustomerForm.t_Serial.setText("");
                CustomerForm.t_Region.setText("");
                CustomerForm.t_OSIG.setText("");
                CustomerForm.t_MFR_Date.setText("");
                CustomerForm.jc_BigBlock_BB.setSelectedIndex(0);
                CustomerForm.jc_LDV.setSelectedIndex(0);
            try {
                String line;
                // Lecture du fichier ligne par ligne. Cette boucle se termine
                // quand la méthode retourne la valeur null.
                while ((line = buff.readLine()) != null) {
                    StringTokenizer tok = new StringTokenizer(line, "*" );
                    while (tok.hasMoreTokens()) {
                        String KVInfoggCF = tok.nextToken();

                         if(KVInfoggCF.contains("Modelo")){
                            String[] strggcf = KVInfoggCF.split(":");
                            CustomerForm.t_ConsoleType.setText(strggcf[1]);
                        }else if(KVInfoggCF.contains("Serial")){
                            String[] strggcf = KVInfoggCF.split(":");
                            CustomerForm.t_Serial.setText(strggcf[1]);
                        }else if(KVInfoggCF.contains("Cpu")){
                            String[] strggcf = KVInfoggCF.split(":");
                            CustomerForm.t_CPU_KEY.setText(strggcf[1]);
                        }else if(KVInfoggCF.contains("Dvd")){
                            String[] strggcf = KVInfoggCF.split(":");
                            CustomerForm.t_DVD_KEY.setText(strggcf[1]);
                        }else if(KVInfoggCF.contains("CB")){
                            String[] strggcf = KVInfoggCF.split(":");
                            CustomerForm.t_CB_Version.setText(strggcf[1]);
                        }else if(KVInfoggCF.contains("CF")){
                            String[] strggcf = KVInfoggCF.split(":");
                            CustomerForm.t_Dash_Version_Now.setText(strggcf[1]);
                        }else if(KVInfoggCF.contains("LDV")){
                            String[] strggcf = KVInfoggCF.split(":");
                            CustomerForm.jc_LDV.setSelectedItem(strggcf[1]);
                        }else if(KVInfoggCF.contains("OSIG")){
                            String[] strggcf = KVInfoggCF.split(":");
                            CustomerForm.t_OSIG.setText(strggcf[1]);
                        }else if(KVInfoggCF.contains("Region")){
                            String[] strggcf = KVInfoggCF.split(":");
                            CustomerForm.t_Region.setText(strggcf[1]);
                        }       
                    }
         }
            } finally {
                // dans tous les cas, on ferme nos flux
                buff.close();
            }
        } catch (IOException ioe) {
                // erreur de fermeture des flux
        }
    }
        
    public static void AlimKVInfoxeBuildCF(){       
        try{
            // Création du flux bufférisé sur un FileReader, immédiatement suivi par un 
            // try/finally, ce qui permet de ne fermer le flux QUE s'il le reader
            // est correctement instancié (évite les NullPointerException)
                BufferedReader buff = new BufferedReader(new FileReader(CustomerForm.kvinfo));
                CustomerForm.t_CPU_KEY.setText("");
                CustomerForm.t_ConsoleType.setText("");
                CustomerForm.t_Dash_Version_Now.setText("");
                CustomerForm.t_DVD_KEY.setText("");
                CustomerForm.t_FCRT.setText("");
                CustomerForm.t_CB_Version.setText("");
                CustomerForm.t_Console_ID.setText("");
                CustomerForm.t_Serial.setText("");
                CustomerForm.t_Region.setText("");
                CustomerForm.t_OSIG.setText("");
                CustomerForm.t_MFR_Date.setText("");
                CustomerForm.jc_BigBlock_BB.setSelectedIndex(0);
                CustomerForm.jc_LDV.setSelectedIndex(0);
            try {
                String line;
                // Lecture du fichier ligne par ligne. Cette boucle se termine
                // quand la méthode retourne la valeur null.
                while ((line = buff.readLine()) != null) {
                    //items.add(line);
                    //System.out.println(items);
                    StringTokenizer tok = new StringTokenizer(line, "*" );
                    while (tok.hasMoreTokens()) {
                        String KVInfoxeCF = tok.nextToken();

                        if(KVInfoxeCF.contains("XboxType")){
                            String[] strxecf = KVInfoxeCF.split(": ");
                            CustomerForm.t_ConsoleType.setText(strxecf[1]);
                        }else if(KVInfoxeCF.contains("CpuKey")){
                            String[] strxecf = KVInfoxeCF.split(": ");
                            CustomerForm.t_CPU_KEY.setText(strxecf[1]);
                        }else if(KVInfoxeCF.contains("DVDKey")){
                            String[] strxecf = KVInfoxeCF.split(": ");
                            //System.out.println(strxecf[1]);
                            CustomerForm.t_DVD_KEY.setText(strxecf[1]);
                        }else if(KVInfoxeCF.contains("MFRDate")){
                            String[] strxecf = KVInfoxeCF.split(": ");
                            CustomerForm.t_MFR_Date.setText(strxecf[1]);
                        }else if(KVInfoxeCF.contains("ConsoleID")){
                            String[] strxecf = KVInfoxeCF.split(": ");
                            CustomerForm.t_Console_ID.setText(strxecf[1]);
                        }else if(KVInfoxeCF.contains("Serial")){
                            String[] strxecf = KVInfoxeCF.split(": ");
                            CustomerForm.t_Serial.setText(strxecf[1]);
                        }else if(KVInfoxeCF.contains("Region")){
                            String[] strxecf = KVInfoxeCF.split(": ");
                            CustomerForm.t_Region.setText(strxecf[1]);
                        }else if(KVInfoxeCF.contains("OSIG")){
                            String[] strxecf = KVInfoxeCF.split(": ");
                            CustomerForm.t_OSIG.setText(strxecf[1]);
                        }else if(KVInfoxeCF.contains("CB")){
                            String[] strxecf = KVInfoxeCF.split(": ");
                            CustomerForm.t_CB_Version.setText(strxecf[1]);
                        }else if(KVInfoxeCF.contains("BigBlock")){
                            String[] strxecf = KVInfoxeCF.split(": ");
                            CustomerForm.jc_BigBlock_BB.setSelectedItem(strxecf[1]);
                        }else if(KVInfoxeCF.contains("LDV")){
                            String[] strxecf = KVInfoxeCF.split(": ");
                            CustomerForm.jc_LDV.setSelectedItem(strxecf[1]);
                        }else if(KVInfoxeCF.contains("DashVersion")){
                            String[] strxecf = KVInfoxeCF.split(": ");
                            CustomerForm.t_Dash_Version_Now.setText(strxecf[1]);
                        }else if(KVInfoxeCF.contains("FCRT")){
                            String[] strxecf = KVInfoxeCF.split(": ");
                            if("False".equals(strxecf[1])){
                            CustomerForm.t_FCRT.setText(strxecf[1]);
                            CustomerForm.t_FCRT.setForeground(Color.GREEN);
                            }else{
                            CustomerForm.t_FCRT.setText(strxecf[1]);
                            CustomerForm.t_FCRT.setForeground(Color.RED);
                            }
                        }
                    }
                }
            } finally {
                // dans tous les cas, on ferme nos flux
                buff.close();
            }
        } catch (IOException ioe) {
                // erreur de fermeture des flux
        }
    }
    
    private static int StringToInt(String STR) {
        int str = Integer.parseInt(STR);
        return str;
    }
    
}
