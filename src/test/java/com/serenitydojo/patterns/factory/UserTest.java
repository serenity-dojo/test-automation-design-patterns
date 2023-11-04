package com.serenitydojo.patterns.factory;

import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void newUserRegistration() {
        // Direct instantiation of user objects
        User user = UserFactory.createUser("JohnDoe",
                "john@example.com",
                "password123");
        // Test code for registration...
    }

    @Test
    public void adminUserLogin() {
        // Direct instantiation of admin user objects
        User adminUser = UserFactory.createAdmin("AdminUser",
                "admin@example.com",
                "adminPass");
        // Test code for admin login...
    }

    // Other test methods...
}


