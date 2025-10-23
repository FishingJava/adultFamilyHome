package com.adfh.Br.adultFamilyHome.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public final class EmailNotificationService {

    private final JavaMailSender mailSender;

    /**
     * Sends a plain-text email.
     * @param to to-address
     * @param subject subject
     * @param body body text
     */
    public void send(String to, String subject, String body) {
        SimpleMailMessage m = new SimpleMailMessage();
        m.setTo(to);
        m.setSubject(subject);
        m.setText(body);
        mailSender.send(m);
    }
}