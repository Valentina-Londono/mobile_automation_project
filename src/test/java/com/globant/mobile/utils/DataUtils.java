package com.globant.mobile.utils;

import java.util.UUID;

public class DataUtils {

    public static String generateRandomEmail() {
        String uniqueId = UUID.randomUUID().toString().substring(0, 5);
        return "user_" + uniqueId + "@test.com";
    }
}
