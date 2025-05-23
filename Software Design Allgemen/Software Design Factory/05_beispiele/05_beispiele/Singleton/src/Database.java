import java.util.ArrayList;
import java.util.List;

public class Database {
    private Database() {
        // Initialisierungscode
    }

    private static class Holder {
        private static final Database INSTANCE = new Database();
    }

    public static Database getInstance() {
        return Holder.INSTANCE;
    }

    public List<User> queryUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Max Mustermann", "max@mustermnann.at"));
        users.add(new User("Tanja Musterfrau", "tanja@musterfrau.at"));

        return users;
    }
}