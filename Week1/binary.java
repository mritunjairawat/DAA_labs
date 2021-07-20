import java.util.*;

public class binary {
    static void binary_search(int[] arr, int n) {
        int low = 0, high = arr.length, mid = 0, t = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == n) {
                System.out.println("Present " + mid + 1);
                t = 1;
                break;
            } else if (arr[mid] < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        if (t == 0) {
            System.out.println("Not Present");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a, i = 0, j = 0, number;
        int[] arr;
        a = sc.nextInt();
        for (i = 0; i < a; i++) {
            n = sc.nextInt();
            arr = new int[n];
            for (j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            number = sc.nextInt();
            binary_search(arr, number);
        }
    }

}
