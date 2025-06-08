package SOLID;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 👇 This class only stores user data.
 * Originally, it also saved to a file, which is a second responsibility.
 */
class User {
    private final String fullName;
    private final String contact;

    public User(String fullName, String contact) {
        this.fullName = fullName;
        this.contact = contact;
    }

    public String getFullName() {
        return fullName;
    }

    public String getContact() {
        return contact;
    }
}

/**
 * 👇 New class added to handle file I/O separately.
 * This separates concerns: data vs. persistence.
 */
class UserFileManager {
    public void store(User user) {
        try (FileWriter writer = new FileWriter(user.getFullName() + "_info.txt")) {
            writer.write("Name: " + user.getFullName() + "\n");
            writer.write("Email: " + user.getContact() + "\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

public class SRP_01 {
    public static void main(String[] args) {
        User u = new User("Alice", "alice@domain.com");
        UserFileManager manager = new UserFileManager();
        manager.store(u); // Delegating file saving responsibility
    }
}

