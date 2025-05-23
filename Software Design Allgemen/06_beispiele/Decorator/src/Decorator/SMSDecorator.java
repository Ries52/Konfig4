package Decorator;

import Notifier.Notifier;

public class SMSDecorator extends BaseDecorator {
    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
        notifier.send(message);
    }
}
