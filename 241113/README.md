# [2587] 대표값2

---

### 문제 링크
[문제 링크](https://www.acmicpc.net/problem/2587)

## 문제 설명
다섯 개의 자연수가 주어질 때, 이들의 평균과 중앙값을 구하는 프로그램을 작성하세요.

- **평균**: 주어진 모든 수의 합을 수의 개수로 나눈 값입니다.
- **중앙값**: 주어진 수들을 크기 순서대로 정렬했을 때, 가장 가운데 위치한 값입니다.

## 입력
- 다섯 줄에 걸쳐 각 줄에 하나씩 자연수가 주어집니다.
- 주어지는 자연수는 100 이하의 10의 배수입니다.

## 출력
- 첫째 줄에 평균을 출력합니다.
- 둘째 줄에 중앙값을 출력합니다.

## 풀이 과정

1. **입력 받기**
    - `Scanner`를 사용하여 다섯 개의 자연수를 입력받아 배열에 저장하면서 동시에 합을 계산합니다.

2. **정렬하여 중앙값 찾기**
    - `Arrays.sort()`를 사용하여 배열을 오름차순으로 정렬합니다.
    - 정렬된 배열의 중간에 위치한 값(`arr[2]`)이 중앙값이 됩니다.

3. **평균 계산**
    - 배열의 모든 요소를 합산한 `sum`을 5로 나누어 평균을 구합니다. 이 평균은 자연수로 출력됩니다.

4. **출력**
    - 평균과 중앙값을 각각 출력합니다.

---

## 코드 설명

```java
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
