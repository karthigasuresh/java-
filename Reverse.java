public class Main {
    public static void Reverse(String[] args) {
        String str = "Hello Java";

        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println(reversed);
    }
}
