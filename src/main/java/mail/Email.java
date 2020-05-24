package mail;

public class Email {

    private final String mailAddress;
    private final String subject;
    private final String content;
    private boolean sent;

    public Email(String mailAddress, String subject, String content) {
        this.mailAddress = mailAddress;
        this.subject = subject;
        this.content = content;
        sent = false;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public boolean isSent() {
        return sent;
    }

    public void setSent(boolean sent) {
        this.sent = sent;
    }
}
