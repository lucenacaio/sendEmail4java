package email;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EnviandoEmailUsandoJava {
	public static void main(String[] args)  {
	
                System.out.println("Send email start");
		try {
                SimpleEmail email = new SimpleEmail();
                
		email.setHostName("aspmx.l.google.com");
		System.out.println("config host name");
		
                email.setSmtpPort(25);
		System.out.println("SMTP PORT");
		
            
                email.setFrom("email@email.com", "User Name");
            
		System.out.println("set from");
		
                email.addTo("email@gmail.com");
		System.out.println("add to");
		email.setSubject("SUBJECT");
		
                System.out.println("BODY");
                email.setMsg("eMAIL BODY");
                
		
                System.out.println("SEND");
		email.send();
		System.out.println("SUCESS!!!");
                
                } catch (EmailException ex) {
                    System.out.println("ERROR!!!");
            }
                
 	}	
}
