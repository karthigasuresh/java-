public class ReverseFirstHalf {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        int n = arr.length;
        int half = n / 2;

        // Reverse the first half
        for (int i = 0; i < half / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[half - 1 - i];
            arr[half - 1 - i] = temp;
        }

        // Print the array
        System.out.println("Array after reversing first half:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
