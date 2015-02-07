package com.springapp.mailSending;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.ejb.Asynchronous;

/**
 * Created by Alicja on 2015-02-07.
 */
public class MailPreparation {

    public static void sendEmail(String nadawca, String adresat, String tytul, String tresc)
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Spring-Mail.xml");
        MailMail mm = (MailMail) context.getBean("mailMail");
        mm.sendMail(nadawca, adresat, tytul, tresc);
    }
}
