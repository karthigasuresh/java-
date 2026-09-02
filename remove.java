public class Main {
    public static void main(String[] args) {
        String str = "Hello Java World";

        String result = str.replaceAll("\\s", "");

        System.out.println("Original String: " + str);
        System.out.println("After removing spaces: " + result);
    }
}
