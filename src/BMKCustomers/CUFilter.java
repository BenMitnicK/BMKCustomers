/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMKCustomers;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Abdel Le BG
 */
class CUFilter extends FileFilter {

        @Override
        public boolean accept(File f) {
            if (f.isDirectory())
                return true;
            String s = f.getName();
            int i = s.lastIndexOf('.');

            if (i > 0 && i < s.length() - 1)
                if (s.substring(i + 1).toLowerCase().equals("txt"))
                    return true;

            return false;
        }

        @Override
        public String getDescription() {
            return "Accept .xml files only";
        }
}