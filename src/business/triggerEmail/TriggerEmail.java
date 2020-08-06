/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.triggerEmail;

import java.util.Properties;
import javax.mail.BodyPart;
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
 * @author Abhishek
 */
public class TriggerEmail {

 public static void labTestResultEmail(String doctorEmail, String name, String PatientId) {

 final String username = "youremail";
 final String password = "*****";
 Properties props = new Properties();
 props.put("mail.smtp.auth", "true");
 props.put("mail.smtp.starttls.enable", "true");
 props.put("mail.smtp.host", "smtp.gmail.com");
 props.put("mail.smtp.port", "587");

 Session session = Session.getInstance(props, new javax.mail.Authenticator() {
 protected PasswordAuthentication getPasswordAuthentication() {
 return new PasswordAuthentication(username, password);
 }
 });
 try {
 Message message = new MimeMessage(session);
 message.setFrom(new InternetAddress("youremail"));
 System.out.println(doctorEmail);
 message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(doctorEmail));
 message.setSubject("Lab Test Result");
 BodyPart messageBodyPart = new MimeBodyPart();
 messageBodyPart.setText("Hello Dr. " + name + "," + "\n\nWe hope you are doing well.\n\nLab test for your patient bearing ID: " + PatientId
 + " is complete and the result is updated in the system." + " \nThank you" + "\n\nRegards," + "\nLab Organization");
 Multipart multipart = new MimeMultipart();
 multipart.addBodyPart(messageBodyPart);
 message.setContent(multipart);
 Transport.send(message);
 System.out.println("Email sent");
 } catch (MessagingException e) {
 System.out.println("*");
 }
 }

 public static void doctorAppointmentEmail(String pantryEmail, String name, String enterprise, String date, String time, String address) {
 final String username = "youremail";
 final String password = "****";
 Properties props = new Properties();
 props.put("mail.smtp.auth", "true");
 props.put("mail.smtp.starttls.enable", "true");
 props.put("mail.smtp.host", "smtp.gmail.com");
 props.put("mail.smtp.port", "587");

 Session session = Session.getInstance(props, new javax.mail.Authenticator() {
 protected PasswordAuthentication getPasswordAuthentication() {
 return new PasswordAuthentication(username, password);
 }
 });
 try {
 Message message = new MimeMessage(session);
 message.setFrom(new InternetAddress("youremail"));
 System.out.println(pantryEmail);
 message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(pantryEmail));
 message.setSubject("Health Screening Appointment");
 BodyPart messageBodyPart = new MimeBodyPart();
 messageBodyPart.setText("Hello " + name + "," + "\n\nWe hope you are doing well.\n\nWe are writing this mail to confirm you that your request to conduct Health Screening for your community is approved. Following is the appointment details:"
 + "\n\nDate: " + date + " \nTime: " + time + "\nVenue: " + address + "\n\nWe are glad to help you in keeping your community healthy." + "\n\nThank you" + "\n\nRegards," + "\n" + enterprise);
 Multipart multipart = new MimeMultipart();
 multipart.addBodyPart(messageBodyPart);
 message.setContent(multipart);
 Transport.send(message);
 System.out.println("Email sent");
 } catch (MessagingException e) {
 System.out.println("*");
 }
 }
 
 public static void nutritionAppointmentEmail(String pantryEmail, String name, String enterprise, String date, String time, String address) {
 final String username = "youremail;
 final String password = "*****";
 Properties props = new Properties();
 props.put("mail.smtp.auth", "true");
 props.put("mail.smtp.starttls.enable", "true");
 props.put("mail.smtp.host", "smtp.gmail.com");
 props.put("mail.smtp.port", "587");
 Session session = Session.getInstance(props, new javax.mail.Authenticator() {
 protected PasswordAuthentication getPasswordAuthentication() {
 return new PasswordAuthentication(username, password);
 }
 });
 try {
 Message message = new MimeMessage(session);
 message.setFrom(new InternetAddress("youremail"));
 System.out.println(pantryEmail);
 message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(pantryEmail));
 message.setSubject("Nutritionist Appointment");
 BodyPart messageBodyPart = new MimeBodyPart();
 messageBodyPart.setText("Hello " + name + "," + "\n\nWe hope you are doing well.\n\nWe are writing this mail to confirm you that your request for a nutritionist suggestion, for your pantry, is approved. Following is the appointment details:"
 + "\n\nDate: " + date + " \nTime: " + time + "\nVenue: " + address + "\n\nWe are glad to help you in keeping your community healthy." + "\n\nThank you" + "\n\nRegards," + "\n" + enterprise);
 Multipart multipart = new MimeMultipart();
 multipart.addBodyPart(messageBodyPart);
 message.setContent(multipart);
 Transport.send(message);
 System.out.println("Email sent");
 } catch (MessagingException e) {
 System.out.println("*");
 }
 }
 
 public static void orderConfirmationEmail(String pantryEmail, String name, String enterprise, String date, String time, String address) {
 final String username = "youremail";
 final String password = "*****";
 Properties props = new Properties();
 props.put("mail.smtp.auth", "true");
 props.put("mail.smtp.starttls.enable", "true");
 props.put("mail.smtp.host", "smtp.gmail.com");
 props.put("mail.smtp.port", "587");
 Session session = Session.getInstance(props, new javax.mail.Authenticator() {
 protected PasswordAuthentication getPasswordAuthentication() {
 return new PasswordAuthentication(username, password);
 }
 });
 try {
 Message message = new MimeMessage(session);
 message.setFrom(new InternetAddress("youremail"));
 System.out.println(pantryEmail);
 message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(pantryEmail));
 message.setSubject("Order Shipped");
 BodyPart messageBodyPart = new MimeBodyPart();
 messageBodyPart.setText("Hello " + name + "," + "\n\nWe hope you are doing well.\n\nYour purchase order is shipped. Following is the delivery details:"
 + "\n\nEstimated Date: " + date + " \nEstimated Time: " + time + "\nDelivery Address: " + address + "\n\nWe are glad to help you in serving your community." + "\n\nThank you" + "\n\nRegards," + "\n" + enterprise);
 Multipart multipart = new MimeMultipart();
 multipart.addBodyPart(messageBodyPart);
 message.setContent(multipart);
 Transport.send(message);
 System.out.println("Email sent");
 } catch (MessagingException e) {
 System.out.println("*");
 }
 }
}
