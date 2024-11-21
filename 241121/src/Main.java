import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 첫 번째 피보나치 수와 두 번째 피보나치 수
        int a = 0, b = 1;

        // n이 0일 경우 0을 출력
        if (n == 0) {
            System.out.println(a);
        } else if (n == 1) {
            System.out.println(b);
        } else {
            // 피보나치 수 계산
            for (int i = 2; i <= n; i++) {
                int temp = a + b;
                a = b;
                b = temp;
            }
            System.out.println(b);
        }

        sc.close();
    }
}
