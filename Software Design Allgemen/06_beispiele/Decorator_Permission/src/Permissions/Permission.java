package Permissions;

import User.User;

// Datei: Permission.java
public interface Permission {
    boolean hasPermission(User user);
}
