package MenuBeispiel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Person> persons = new ArrayList<>();

        boolean running = true;
        while (running) {
            System.out.println("\n--- Bibliothek ---");
            System.out.println("1) Neuen Benutzer anlegen");
            System.out.println("2) Benutzer anzeigen");
            System.out.println("3) Beenden");
            System.out.print("Auswahl: ");

            switch (scanner.nextLine()) {
                case "1":
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    persons.add(new Person(name));
                    break;
                case "2":
                    System.out.print(persons);
                    break;
                case "3":
                    running = false;
                    break;
                default:
                    System.out.println("Ungültige Auswahl.");

            }
        }
    }
}
