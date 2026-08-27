import java.util.Array;

public class Both{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int n = arr.length;
        int mid = n / 2;

        reverse(arr, 0, mid - 1);

        reverse(arr, mid, n - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
