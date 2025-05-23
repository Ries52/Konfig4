import Decorator.MandantDecorator;
import Decorator.SecretDecorator;
import Permissions.BasePermission;
import User.User;

public class Main {
    public static void main(String[] args) {
        User user = new User(true, 1, "geheim");

        // Basis-Check: nur Admin?
        boolean stufe1 = new BasePermission().hasPermission(user);
        System.out.println("base: " + stufe1);

        // Basis + Mandant == 1
        boolean stufe2 = new MandantDecorator(
                new BasePermission(),
                1
        ).hasPermission(user);
        System.out.println("base + mandant: " + stufe2);

        // Basis + Mandant == 1 + Secret == "geheim"
        boolean stufe3 = new SecretDecorator(
                new MandantDecorator(
                        new BasePermission(),
                        1
                ),
                "geheim"
        ).hasPermission(user);
        System.out.println("base + mandant + secret: " + stufe3);
    }
}