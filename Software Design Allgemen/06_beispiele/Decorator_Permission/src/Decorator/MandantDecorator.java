package Decorator;

import Permissions.Permission;
import User.User;

// Datei: MandantDecorator.java
public class MandantDecorator extends BaseDecorator {
    private final int requiredMandant;

    public MandantDecorator(Permission decorated, int requiredMandant) {
        super(decorated);
        this.requiredMandant = requiredMandant;
    }

    @Override
    public boolean hasPermission(User user) {
        // Zuerst Basisberechtigung prüfen
        if (!decorated.hasPermission(user)) {
            return false;
        }
        // Dann Mandant prüfen
        return user.getMandant() == requiredMandant;
    }
}
