/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.api;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.util.Properties;
/**
 *
 * @author js802
 */
public class APIemail {
  public static void sentEmail(String projectName, String namePersonLog, String email, String detail, String date) throws Exception{
    Properties properties = new Properties();
    properties.put("mail.smtp.auth",true);
    properties.put("mail.smtp.host","smtp.gmail.com");
    properties.put("mail.smtp.port",587);
    properties.put("mail.smtp.starttls.enable",true);
    properties.put("mail.transport.protocl","smtp");
    properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
    Session session = Session.getInstance(properties, new Authenticator() {
      @Override
       protected PasswordAuthentication getPasswordAuthentication() {
         return new PasswordAuthentication("project1designsoftware@gmail.com","ntjwfxhcsvqhbzvb");
       }
    });
    //Create the meassage
    MimeMessage message = new MimeMessage(session);
    message.setSubject("Entrada en la bitacora del proyecto: " + projectName);
    //Set de email that is going to sent the email
    
    Address address = new InternetAddress(email);
    message.setRecipient(Message.RecipientType.TO, address);
    MimeBodyPart attachment = new MimeBodyPart();
    attachment.setContent("Entrada de la bitacora del dia "+ date + " de parte de "+namePersonLog + "<div><div/>","text/html");
    MimeBodyPart attachment2 = new MimeBodyPart();
    attachment2.setContent("Detalle: "+ detail,"text/html");
    MimeMultipart multipart = new MimeMultipart();
    multipart.addBodyPart(attachment);
    multipart.addBodyPart(attachment2);
    message.setContent(multipart);
    //Sent the email
    Transport.send(message);
    System.out.println("Correo enviado!");  
  }
}
