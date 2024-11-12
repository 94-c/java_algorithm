import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 수의 개수
        int n = sc.nextInt();

        // 입력 받 수의 배열
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
