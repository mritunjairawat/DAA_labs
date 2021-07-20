import java.util.*;

class linear {
    static void linear_search(int[] arr, int n) {
        int i = 0, j = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println("Present " + i+1);
                j = 1;
                break;
            }
        }
        if (j == 0) {
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
            linear_search(arr, number);
        }
    }
}
