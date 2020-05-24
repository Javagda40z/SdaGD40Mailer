package configuration;

import javax.mail.Authenticator;
import javax.mail.Session;
import java.util.Properties;

public class MailConfiguration {

    private Properties properties;
    private String username;
    private String password;

    public MailConfiguration() {
        prepareConfiguration();
    }

    private void prepareConfiguration() {
        properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
        username = "sdagda40z";
        password = "****"; // nie robcie tak :c

    }


    public Session createSession() {
        return Session.getDefaultInstance(properties, new GmailAuthenticator(username, password));
    }


}
