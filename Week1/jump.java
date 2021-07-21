import java.util.*;

public class jump {
    static void jump_search(int[] arr, int j, int n) {
        int i = 0, t = 0, p = 0, k = 0;
        for (i = 0; i < arr.length; i = i + j) {
            p = i;
            if (arr[i] == n) {
                System.out.println("Present " + i + 1);
                t = 1;
                break;
            } else if (arr[i] < n || i==arr.length) {
                for (k = p; k < i; k++) {
                    if (arr[k] == n) {
                        System.out.println("Present " + (k + 1));
                        t = 1;
                        break;
                    }
                }
            }
        }
        if (t == 0) {
            System.out.println("Not Present");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a, i = 0, j = 0, number, jp;
        int[] arr;
        a = sc.nextInt();
        for (i = 0; i < a; i++) {
            n = sc.nextInt();
            arr = new int[n];
            for (j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            jp = sc.nextInt();
            number = sc.nextInt();
            jump_search(arr, jp, number);
        }
    }
}
