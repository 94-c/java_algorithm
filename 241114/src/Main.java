import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 카드 개수
        int n = sc.nextInt();
        // 블랙잭 목표 값
        int m = sc.nextInt();

        int sum = 0;
        int tmp = 0;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if (sum > tmp && sum <= m) {
                        tmp = sum;
                    }
                }
            }
        }

        System.out.println(tmp);

        sc.close();
    }
}
