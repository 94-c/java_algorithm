import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 수의 합
        int sum = 0;

        // 평균 값
        int avg = 0;

        // 다섯개의 자연수
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            avg = sum / arr.length;
        }

        System.out.println("avg :: " + avg);
        System.out.println("center :: " + arr[arr.length / 2]);
        sc.close();
    }
}
