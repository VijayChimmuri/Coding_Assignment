public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
    public static boolean isPangram(String input) {
                input = input.toLowerCase();
                boolean[] alphabet = new boolean[26];
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }
        for (boolean letterPresent : alphabet) {
            if (!letterPresent) {
                return false;
            }
        }
        return true;
    }
}