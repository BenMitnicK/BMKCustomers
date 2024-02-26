/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMKCustomers;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import javax.swing.SwingWorker;

/**
 *
 * @author BenMitnicK
 */
public class TaskForQueries extends SwingWorker<Void, Void>{
    @Override
    public Void doInBackground() throws InterruptedException, SQLException, IOException, URISyntaxException { 
        if("settings".equals(OptionsForm.chooseQueries)){
            SQLiteQueries.updateOptions();
        }else{
            SQLiteQueries.CustomersXMLtoBDD(OptionsForm.CustomersXML);
        }     
        return null;
    }    
}
