import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;  // 수들의 합
        int mid = 0;  // 중앙값
        int[] arr = new int[5];

        // 다섯 개의 자연수를 입력받아 배열에 저장하고 합 계산
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        // 배열 오름차순으로 정렬
        Arrays.sort(arr);

        // 평균 구하기
        int avg = sum / 5;

        // 중앙값은 정렬된 배열의 세 번째 요소
        mid = arr[2];

        // 평균과 중앙값 출력
        System.out.print(avg + "\n" + mid);

        sc.close();
    }
}
