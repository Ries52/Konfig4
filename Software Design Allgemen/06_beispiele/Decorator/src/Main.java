import Decorator.FacebookDecorator;
import Decorator.SMSDecorator;
import Decorator.SlackDecorator;
import Notifier.*;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList(
                "user1@example.com",
                "user2@example.com"
        );
        Notifier emailNotifier = new EmailNotifier(emails);

        // Kombinieren der Decorators
        Notifier combinedNotifier = new SlackDecorator(
                new FacebookDecorator(
                        new SMSDecorator(emailNotifier)
                )
        );

        combinedNotifier.send("Important message: House is on fire!");
    }
}