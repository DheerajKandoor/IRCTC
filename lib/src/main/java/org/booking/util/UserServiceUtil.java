package org.booking.util;

import org.springframework.security.crypto.bcrypt.BCrypt;

import static org.springframework.security.crypto.bcrypt.BCrypt.hashpw;

public class UserServiceUtil
{
    public static String hashPassword(String plainPassword) {
        return BCrypt.hashpw(plainPassword, BCrypt.gensalt());
    }

    public static boolean checkPassword(String plainPassword, String hashedPassword) {
        return BCrypt.checkpw(plainPassword, hashedPassword);
    }
}