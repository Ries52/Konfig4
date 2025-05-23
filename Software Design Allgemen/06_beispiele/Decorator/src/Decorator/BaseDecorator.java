package Decorator;

import Notifier.Notifier;

public abstract class BaseDecorator implements Notifier {
    protected final Notifier notifier;

    public BaseDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public abstract void send(String message);
}
