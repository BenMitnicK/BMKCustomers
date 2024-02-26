/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BMKCustomers;

/**
 *
 * @author BenMitnicK
 */
import javax.swing.text.*;

public class TextFieldLimit extends PlainDocument {
    final private int limit;
    // optional uppercase conversion
    private boolean toUppercase = false;
    
    TextFieldLimit(int limit) {
        super();
        this.limit = limit;
    }
    
    TextFieldLimit(int limit, boolean upper) {
        super();
        this.limit = limit;
        toUppercase = upper;
    }
    
    public void insertString
            (int offset, String  str, AttributeSet attr)
            throws BadLocationException {
        if (str == null) return;
        
        if ((getLength() + str.length()) <= limit) {
            if (toUppercase) str = str.toUpperCase();
            super.insertString(offset, str, attr);
        }
    }
}