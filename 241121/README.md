# [2747] 피보나치 수

---

### 문제 링크
[문제 링크](https://www.acmicpc.net/problem/2747)

---

## 문제 설명

피보나치 수는 0과 1로 시작하며, 그 다음 수부터는 바로 앞 두 피보나치 수의 합으로 정의됩니다.

이를 식으로 나타내면:

- **Fn = Fn-1 + Fn-2** (n ≥ 2)

주어진 정수 `n`에 대해 `n`번째 피보나치 수를 계산하세요.

---

## 풀이 방법

1. **피보나치 수 정의**
    - 피보나치 수는 다음과 같이 정의됩니다:
        - F0 = 0
        - F1 = 1
        - Fn = Fn-1 + Fn-2 (n ≥ 2)

2. **반복문을 사용한 계산**
    - F0과 F1의 초기 값을 설정합니다.
    - 반복문을 사용해 Fn 값을 계산하며, n번째 값을 구할 때까지 반복합니다.

3. **효율적인 계산**
    - `n`의 범위가 45로 작기 때문에, 재귀 방식보다는 반복문을 통한 계산이 효율적입니다.

---

## 코드 구현

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 초기 값 설정
        int a = 0, b = 1;

        // n이 0일 경우 바로 출력
        if (n == 0) {
            System.out.println(a);
        } else {
            // 반복문을 통해 피보나치 수 계산
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

