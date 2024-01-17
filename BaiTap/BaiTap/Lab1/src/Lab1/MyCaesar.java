package Lab1;
public class MyCaesar {
    private static final int SHIFT = 3;
    private static final int ALPHABET_SIZE = 26;
    private static final char A = 'A';
    private static final char Z = 'Z';

    public static String encrypt(String text) {
        StringBuilder result = new StringBuilder();
        for (char character : text.toCharArray()) {
            if (character >= A && character <= Z) {
                char encrypted = (char) ((character - A + SHIFT) % ALPHABET_SIZE + A);
                result.append(encrypted);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    public static String decrypt(String text) {
        StringBuilder result = new StringBuilder();
        for (char character : text.toCharArray()) {
            if (character >= A && character <= Z) {
                char decrypted = (char) ((character - A - SHIFT + ALPHABET_SIZE) % ALPHABET_SIZE + A);
                result.append(decrypted);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }
}
 
