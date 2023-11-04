package com.serenitydojo.patterns.factory;

public class UserFactory {

    // Factory method for creating a standard user
    public static User createUser(String username, String email, String password) {
        return new User(username, email, password, false);
    }

    // Factory method for creating an admin user
    public static User createAdmin(String username, String email, String password) {
        return new User(username, email, password, true);
    }

    // Other factory methods for different user types can be added here...
}

