package Permissions;


import User.User;

public class BasePermission implements Permission {
    @Override
    public boolean hasPermission(User user) {
        return user.isAdmin();
    }
}
