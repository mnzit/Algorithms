

public class EncryptionDecryption {
    static int start = 97, end = 122;

    public static String encrypt(String text, int shift) {
        int result = 0;
        String encrypt = "";
        for (int i = 0; i < text.length(); i++) {
            int val = (int) text.charAt(i);
            int shifter = val + shift;
            int bound = end - shifter;
            if (bound < 0) {
                result = start + Math.abs(bound);
            } else {
                result = shifter;
            }
            encrypt += Character.toString((char) result);
        }
        return encrypt;
    }

    public static void main(String args[]) {
        String result = encrypt("wxy".toLowerCase(), 2);
        System.out.println(result);
    }
}