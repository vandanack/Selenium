package selenium;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EmailSendingDemo {

	public static void main(String[] args) throws EmailException {
		// TODO Auto-generated method stub

		Email e = new SimpleEmail();
		
		e.setHostName("smtp.gmail.com");
		e.setSmtpPort(465);
		e.setAuthenticator(new DefaultAuthenticator("vandanack.17is@saividya.ac.in", "Vandanack@23"));
		e.setSSLOnConnect(true);
		e.setFrom("vandanack.17is@saividya.ac.in");
		e.setSubject("het from eclipse");
		e.setMsg("Hello!");
		e.addTo("vandanack1999@gmail.com");
		e.send();
		System.out.println("Email Sent");
		
		
	}

}
