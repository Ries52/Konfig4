package Notifier;

import java.util.List;

public class EmailNotifier implements Notifier {
    private final List<String> emails;

    public EmailNotifier(List<String> emails) {
        this.emails = emails;
    }

    @Override
    public void send(String message) {
        System.out.println("Sending email to " + emails + ": " + message);
    }
}