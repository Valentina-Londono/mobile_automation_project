package com.globant.mobile.utils;

import java.util.UUID;

public class DataUtils {

    /**
     * Create a random email.
     * It uses a random id to make the email unique.
     * @return a String with the random email
     */
    public static String generateRandomEmail() {
        String uniqueId = UUID.randomUUID().toString().substring(0, 5);
        return "user_" + uniqueId + "@test.com";
    }
}

