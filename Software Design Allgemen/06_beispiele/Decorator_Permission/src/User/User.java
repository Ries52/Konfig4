package User;

public class User {
    private final boolean admin;
    private final int mandant;
    private final String secret;

    public User(boolean admin, int mandant, String secret) {
        this.admin = admin;
        this.mandant = mandant;
        this.secret = secret;
    }

    public boolean isAdmin() {
        return admin;
    }

    public int getMandant() {
        return mandant;
    }

    public String getSecret() {
        return secret;
    }
}
