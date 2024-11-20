# [10815] 숫자 카드

---

### 문제 링크
[문제 링크](https://www.acmicpc.net/problem/10815)

---

## 문제 설명
숫자 카드는 정수가 하나씩 적혀 있는 카드입니다. 상근이는 숫자 카드 N개를 가지고 있습니다. 정수 M개가 주어졌을 때, 상근이가 이 숫자 카드를 가지고 있는지 아닌지를 구하는 프로그램을 작성하세요.

---

## 입력
1. 첫 번째 줄에 상근이가 가지고 있는 숫자 카드의 개수 `N`이 주어집니다.
2. 두 번째 줄에 상근이가 가지고 있는 숫자 카드에 적혀있는 정수가 공백으로 구분되어 주어집니다.
3. 세 번째 줄에 질문의 개수 `M`이 주어집니다.
4. 네 번째 줄에 질문에 해당하는 정수가 공백으로 구분되어 주어집니다.

---

## 출력
- M개의 줄에 각 질문에 대해 상근이가 해당 숫자 카드를 가지고 있으면 `1`, 없으면 `0`을 출력합니다.

---

## 제약 조건
- `1 ≤ N, M ≤ 500,000`
- `-10,000,000 ≤ 카드에 적혀있는 숫자 ≤ 10,000,000`

---

## 풀이 과정

1. **입력 데이터 처리**
    - `BufferedReader`를 사용하여 빠르게 데이터를 입력받습니다.
    - 상근이가 가진 숫자 카드는 `HashSet`에 저장합니다.

2. **숫자 카드 확인**
    - 질문으로 들어온 숫자에 대해 상근이의 카드 `HashSet`에서 존재 여부를 확인합니다.
    - `HashSet`의 `contains` 메서드를 사용해 빠르게 확인합니다.

3. **결과 출력**
    - 각 숫자에 대해 존재 여부를 `1` 또는 `0`으로 `StringBuilder`에 저장합니다.
    - 한 번에 출력하여 성능을 최적화합니다.

---

## 코드 설명

1. **입력 데이터 처리**
    - 상근이가 가진 숫자 카드를 `HashSet`에 저장하여 존재 여부를 빠르게 확인합니다.

2. **질문 처리**
    - 각 질문 숫자에 대해 `HashSet.contains()`를 사용하여 확인하고, 결과를 저장합니다.

3. **결과 출력**
    - `StringBuilder`를 사용해 결과를 한 번에 출력하여 성능을 개선합니다.

---

## 시간 복잡도
- `HashSet`의 삽입과 탐색은 평균적으로 **O(1)**입니다.
- 전체 시간 복잡도: **O(N + M)** (N: 카드 개수, M: 질문 개수)

---

## 코드 구현

```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Set<Integer> cards = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cards.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (cards.contains(num)) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
```

---

## 주요 포인트

- `HashSet`을 사용하여 중복 제거와 빠른 탐색을 동시에 수행합니다.
- `BufferedReader`와 `StringBuilder`를 사용하여 입출력 성능을 최적화합니다.
