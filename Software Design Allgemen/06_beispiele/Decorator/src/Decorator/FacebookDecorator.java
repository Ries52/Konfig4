package Decorator;

import Notifier.Notifier;

public class FacebookDecorator extends BaseDecorator {
    public FacebookDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        System.out.println("Sending Facebook message: " + message);
        notifier.send(message);
    }
}
