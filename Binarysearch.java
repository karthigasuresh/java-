import java.util.Scanner;

public class Binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        search(n, arr, k);
    }

    static void search(int n, int arr[], int k) {
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == k) {
                System.out.println(mid);
                return;
            } 
            else if (k > arr[mid]) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }

        System.out.println("Not Found");
    }
}
