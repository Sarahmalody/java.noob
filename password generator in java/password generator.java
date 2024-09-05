import java.security.SecureRandom;
import java.util.Arrays;

public class PasswordGenerator {

    private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPER   
 = CHAR_LOWER.toUpperCase();
    private static final String NUMBER = "0123456789";
    private static final String   
 SPECIAL_CHAR = "!@#$%^&*()_-+=<>?";

    private static final String ALL_CHAR = CHAR_LOWER + CHAR_UPPER + NUMBER   
 + SPECIAL_CHAR;

    private static final int PASSWORD_LENGTH = 12;

    public static String generatePassword() {
        SecureRandom random = new SecureRandom();
        char[] password = new char[PASSWORD_LENGTH];

        for (int i = 0; i < PASSWORD_LENGTH;   
 i++) {
            int randomIndex = random.nextInt(ALL_CHAR.length());
            password[i] = ALL_CHAR.charAt(randomIndex);
        }

        return new String(password);
    }

    public static void main(String[] args) {
        String password = generatePassword();
        System.out.println("Generated password: " + password);
    }
}