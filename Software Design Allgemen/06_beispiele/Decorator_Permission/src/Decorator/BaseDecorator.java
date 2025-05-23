package Decorator;

import Permissions.Permission;
import User.User;

public abstract class BaseDecorator implements Permission {
    protected final Permission decorated;

    public BaseDecorator(Permission decorated) {
        this.decorated = decorated;
    }

    @Override
    public abstract boolean hasPermission(User user);
}
