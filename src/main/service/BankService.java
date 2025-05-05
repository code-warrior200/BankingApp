package service;

import utils.FileUtils;

import java.util.Collections;
import java.util.List;

public class BankService {
    public static boolean authenticateUser(String username, String password) {
        List<String> users;
        users = FileUtils.readFile("BankingApp/data/users.txt");
        for (String user : Collections.unmodifiableList(users)) {
            String[] parts = user.split(",");
            if (parts.length >= 2 && parts[0].equals(username) && parts[1].equals(password)) {
                return true;
            }
        }
        return false;
    }

    public static boolean registerUser() {
        return false;
    }
}
