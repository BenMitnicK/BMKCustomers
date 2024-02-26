/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BMKCustomers;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author BenMitnicK
 */
public class SendMail {
        
        public static void sendMailsmtp() throws IOException {
                MailForm.FieldInformed3.setText("");
		Properties props = new Properties();
		props.put("mail.smtp.host", SQLiteQueries.t_SMTP_ADDRESS);
                props.put("mail.smtp.starttls.enable", "true");
                props.put("mail.smtp.ssl.protocols", "TLSv1.2");
		props.put("mail.smtp.socketFactory.port", SQLiteQueries.t_SMTP_PORT);
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", SQLiteQueries.t_SMTP_PORT);
                
                String res = new String(MailForm.jt_PassWord.getPassword());
 
                DataSource source = new FileDataSource(MailForm.JMailFormGetAttachment());
		Session session = Session.getInstance(props,
			new javax.mail.Authenticator() {
                                @Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(MailForm.JMailFormGetemailtechnician(),res);
				}
			});
                    //session.setDebug(true);
		try {
                    
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(MailForm.JMailFormGetemailtechnician()));
                        message.setRecipients(Message.RecipientType.CC,
					InternetAddress.parse(MailForm.JMailFormGetemailtechnician(), false));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(MailForm.JMailFormGetemailcustomers(), false));
			message.setSubject(MailForm.JMailFormGetsubject());
                        Multipart mp = new MimeMultipart( );
                        MimeBodyPart mbp1 = new MimeBodyPart( );
                        mbp1.setContent(MailForm.JMailFormGetArea(), "text/plain");
                        mp.addBodyPart(mbp1);
                        MimeBodyPart mbp = new MimeBodyPart( );
                        mbp.setDataHandler(new DataHandler(source));
                        mbp.setFileName(MailForm.JMailFormGetAttachmentName());
                        mp.addBodyPart(mbp);
                        message.setSentDate(new Date());
                        message.setContent(mp);
			Transport.send(message);
 
			MailForm.FieldInformed3.setText("Done");
 
		} catch (MessagingException e) {
                    System.out.println(e);
                        MailForm.FieldInformed3.setText("Error. Verified Your Settings");
		}
	}
}