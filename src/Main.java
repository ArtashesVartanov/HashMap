import java.util.*;

public class Main {

    public static final String Text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> fregs = new HashMap<>();
        for (int i = 0; i < Text.length (); i++) {
            char c = Text.charAt(i);
            if (Character.isLetter(c)) {
                if (fregs.containsKey(c)) {
                    fregs.put(c, fregs.get(c) + 1);
                } else {
                    fregs.put(c, 1);
                }
            }
        }

        int max = -1;
        char maxc = 0;
        for (char c : fregs.keySet()) {
            if (fregs.get(c) > max) {
                max = fregs.get(c);
                maxc = c;
            }
        }

        System.out.println("Максимальная частота у символа " + maxc + ": " + max);

    }
}