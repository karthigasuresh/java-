public class Main {
    public static void main(String[] args) {
        String str = "cooee";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (i == 0 || !(isVowel(ch) && isVowel(str.charAt(i - 1)))) {
                result = result + ch;
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("After removing consecutive vowels: " + result);
    }

    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u';
    }
}
