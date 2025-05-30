package com.homelab.studio.email_service.util;

import com.homelab.studio.email_service.model.MailFromFormDTO;
import com.homelab.studio.email_service.model.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class MessageBuilder {
    public String newSubscription(UserDTO userDTO) {
        return "<p>\n" + "  <b>Congratulazioni!</b> <br /><br />Ti diamo il benvenuto/a nella nostra\n"
                + "  piattaforma<br /><br />Per accedere alla piattaforma utilizza le seguenti\n" + "  credenziali:<br />\n" + "  <br />\n" + "  - <u>Username:</u> "
                + userDTO.getUsername() + "<br />\n" + "  - <u>Password:</u> " + userDTO.getPassword() + "<br />Grazie per averci scelto<br />\n" + "  <br />\n"
                + "  Cordiali saluti,<br />\n" + "  <i>il Team di StoCazzo/i>\n" + "</p>\n" + "<img\n" + "  style=\"width: 300px; height: 78px\"\n"
                + "  src=\"logo.png\"\n" + "  alt=\"Immagine\"\n" + "/>";
    }

    public String newContact(MailFromFormDTO mailFromFormDTO) {
        return "<p>Salve, c'&egrave; una nuova richiesta di contatto dalla piattaforma, di seguito i dettagli:<br />\n" + "  <br />\n" + "  - <u>Nome:</u> "
                + mailFromFormDTO.getName() + "<br />\n" + "  - <u>Email:</u> " + mailFromFormDTO.getMail() + "<br />\n"
                + "  <br />Di seguito il testo del messaggio:<br /><br /><i>\n" + mailFromFormDTO.getMessage()
                + "</i><br /><br /><b>Contattalo al pi&ugrave; presto per approfondire</b></p><img style=\"width: 300px; height: 78px\"\n"
                + "  src=\"logo.png\"\n" + "  alt=\"Immagine\"\n" + "/>";
    }

    public String newPurchase(UserDTO userDTO) {

        String uri = "";
        switch (userDTO.getPurchased().get(0).getProductId()) {
            case "prod_00":
                uri = "";
                break;
            case "prod_01":
                uri = "";
                break;
            case "prod_02":
                uri = "";
                break;
            case "prod_03":
                uri = "";
                break;
            case "prod_04":
                uri = "";
                break;
        }
        return "body";
    }

    public String preSell(UserDTO userDTO) {
        String uri = "";
        switch (userDTO.getCourseId()) {
            case "1":
                uri = "https://buy.stripe.com/00?prefilled_email=" + userDTO.getEmail();
                break;
            case "2":
                uri = "https://buy.stripe.com/01?prefilled_email=" + userDTO.getEmail();
                break;
            case "3":
                uri = "https://buy.stripe.com/02?prefilled_email=" + userDTO.getEmail();
                break;
            case "4":
                uri = "https://buy.stripe.com/03?prefilled_email=" + userDTO.getEmail();
                break;
            case "5":
                uri = "https://buy.stripe.com/04?prefilled_email=" + userDTO.getEmail();
                break;
        }
        return "<p>\n" + "  Salve abbiamo accolto la tua richiesta di acquisto.<br />\n" + "  Per accedere alla pagina di acquisto clicca sul link qui sotto<br /><br />-\n"
                + "  <u>Link:</u> " + uri + "<br />\n" + "  <br />\n" + "  Grazie per averci scelto <br />\n" + "  <br />Cordiali saluti,<br />\n"
                + "  <i>il Team di StoCazzo</i>\n" + "</p>\n" + "<img\n" + "  style=\"width: 300px; height: 78px\"\n"
                + "  src=\"logo\"\n" + "  alt=\"Immagine\"\n" + "/>";
    }
}
