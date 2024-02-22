package com.Arth.service;

import java.util.Properties;

import org.springframework.stereotype.Service;
import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

@Service
public class Weicomemailsend {
	
	
	public void welcomeMailSend(String email,String msg) {
		
		Properties props = System.getProperties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "465");
		props.put("mail.smtp.ssl.enable", "true");
		props.put("mail.smtp.auth", "true");

		// get Session
		Session session = Session.getInstance(props, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("ppavan.tec@gmail.com", "bjrnajtkbmqsooby");
			}
		});
		session.setDebug(true);
		// compose message
		try {
			MimeMessage message = new MimeMessage(session);
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
			message.setSubject("DARK HOSPITAL");
			message.setText("HELLO"
					+ "Dear" + msg+  ", We are delighted to welcome you to DARK HOSPITAL❤️❤! Our team is committed "
					+ "to providing exceptional healthcare and ensuring your well-being ❤️. To help you get started,"
					+ " we have enclosed a new patient registration form and a list of our services.");
			// send message
			Transport.send(message);
			System.out.println("message sent successfully");
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
		
		
		
	}

}
