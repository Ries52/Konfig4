package Decorator;

import Notifier.Notifier;

public class SlackDecorator extends BaseDecorator {
    public SlackDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        System.out.println("Sending Slack message: " + message);
        notifier.send(message);
    }
}
