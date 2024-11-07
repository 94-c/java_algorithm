import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 입력받은 정수 n
        int sum = 0; // 합을 저장할 변수 초기화

        for (int i = 1; i <= n; i++) {
            sum += i; // 1부터 n까지의 합을 계산
        }

        System.out.println(sum); // 계산된 합 출력
        sc.close();
    }
}
