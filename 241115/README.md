# [2231] 분해합

---

### 문제 링크
[문제 링크](https://www.acmicpc.net/problem/2231)

## 문제 설명
자연수 `N`의 **분해합**은 `N`과 `N`을 이루는 각 자리수의 합을 의미합니다. 어떤 자연수 `M`의 분해합이 `N`이라면, `M`은 `N`의 **생성자**라고 합니다.

- 예를 들어, `245`의 분해합은 `256(= 245 + 2 + 4 + 5)`입니다. 따라서, `245`는 `256`의 생성자입니다.
- 어떤 자연수는 생성자가 없을 수도 있고, 여러 개의 생성자를 가질 수도 있습니다.

**목표**: 자연수 `N`이 주어졌을 때, `N`의 가장 작은 생성자를 구하세요. 생성자가 없는 경우에는 `0`을 출력합니다.

---

## 입력
- 첫째 줄에 자연수 `N`이 주어집니다. `(1 ≤ N ≤ 1,000,000)`

## 출력
- 첫째 줄에 `N`의 가장 작은 생성자를 출력합니다.
- 생성자가 없는 경우에는 `0`을 출력합니다.

---

## 풀이 과정

1. **문자열로 입력받아 자릿수 파악**
    - `BufferedReader`를 사용해 입력을 문자열로 받아 자릿수를 계산합니다.
    - 자릿수의 최대 합은 `N_len * 9`이므로, 생성자의 범위를 `N - (N_len * 9)`부터 시작합니다.

2. **생성자 찾기**
    - 생성자가 될 수 있는 수 `i`를 하나씩 증가시키며 확인합니다.
    - 각 수 `i`의 자릿수 합과 `i`를 더한 값이 `N`과 같으면 해당 `i`가 가장 작은 생성자입니다.

3. **결과 저장**
    - 생성자를 찾으면 `result`에 저장하고 탐색을 종료합니다.
    - 생성자가 없는 경우 `result`는 기본값 `0`을 유지합니다.

4. **결과 출력**
    - 탐색 후, 가장 작은 생성자를 출력합니다.

---

## 코드 설명

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 자릿수의 길이를 알기위해 문자열로 입력받는다.
        String str_N = br.readLine();

        // 해당 문자열의 길이 변수
        int N_len = str_N.length();

        // 문자열을 정수(int)로 변환
        int N = Integer.parseInt(str_N);
        int result = 0;

        // i는 가능한 최솟값인 N - 9 * N의 각 자릿수부터 시작
        for (int i = (N - (N_len * 9)); i < N; i++) {
            int number = i;
            int sum = 0;    // 각 자릿수 합 변수

            while (number != 0) {
                sum += number % 10;    // 각 자릿수 더하기
                number /= 10;
            }

            // i 값과 각 자릿수 누적합이 같을 경우 (생성자를 찾았을 경우)
            if (sum + i == N) {
                result = i;
                break;
            }

        }

        System.out.println(result);
    }
}
