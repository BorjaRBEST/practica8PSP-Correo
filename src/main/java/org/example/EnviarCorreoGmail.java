package org.example;

import javax.mail.*;
import javax.mail.internet.*;

import java.util.Properties;

public class EnviarCorreoGmail {
    public static void main(String[] args) {
        // Configurar las propiedades para la sesión de correo
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        // Cuenta de correo de Gmail y contraseña
        final String username = "brb0004@alu.medac.es";
        final String password = "thpjbcnqsnpwujvv";

        // Crear una instancia de la sesión de correo
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {
            // Crear un mensaje de correo
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("borjarodriguez203@gmail.com"));
            message.setSubject("Prueba de Correo Práctica 8 PSP");
            message.setText("Esto es un mensaje de prueba para que veas lo bueno que eres programando!");

            // Enviar el mensaje
            Transport.send(message);

            System.out.println("El mensaje fue enviado con éxito.");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
