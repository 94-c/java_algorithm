# [10828] 스택

---

### 문제 링크
[문제 링크](https://www.acmicpc.net/problem/10828)

---

## 문제 설명
정수를 저장하는 **스택**을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성합니다.

### 명령 종류
1. `push X`: 정수 `X`를 스택에 넣습니다.
2. `pop`: 스택에서 가장 위에 있는 정수를 제거하고 출력합니다. 스택이 비어있으면 `-1`을 출력합니다.
3. `size`: 스택에 들어있는 정수의 개수를 출력합니다.
4. `empty`: 스택이 비어있으면 `1`, 비어있지 않으면 `0`을 출력합니다.
5. `top`: 스택의 가장 위에 있는 정수를 출력합니다. 스택이 비어있으면 `-1`을 출력합니다.

---

## 입력
1. 첫째 줄에 명령의 수 `N`이 주어집니다. `(1 ≤ N ≤ 10,000)`
2. 둘째 줄부터 `N`개의 줄에 명령이 하나씩 주어집니다.

---

## 출력
- 각 명령에 대한 결과를 한 줄씩 출력합니다.

---

## 풀이 과정

1. **명령 입력**
    - `BufferedReader`를 사용하여 입력을 효율적으로 처리합니다.
    - 명령어와 정수를 구분하기 위해 `StringTokenizer`를 사용합니다.

2. **스택 구현**
    - `java.util.Stack` 클래스를 사용하여 스택 연산을 처리합니다.

3. **명령 처리**
    - `push X`: 정수를 스택에 추가합니다.
    - `pop`: 스택이 비어있으면 `-1`을 출력하고, 아니면 스택의 가장 위의 값을 제거하고 출력합니다.
    - `size`: 스택에 저장된 정수의 개수를 출력합니다.
    - `empty`: 스택이 비어있으면 `1`, 아니면 `0`을 출력합니다.
    - `top`: 스택이 비어있으면 `-1`, 아니면 가장 위의 값을 출력합니다.

4. **출력**
    - `StringBuilder`를 사용하여 명령의 결과를 저장하고, 한 번에 출력하여 성능을 최적화합니다.

---

## 코드

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if (str.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (str.equals("pop")) {
                if (stack.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(stack.pop() + "\n");
                }
            } else if (str.equals("size")) {
                sb.append(stack.size() + "\n");
            } else if (str.equals("empty")) {
                if (stack.isEmpty()) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            } else if (str.equals("top")) {
                if (stack.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(stack.peek() + "\n");
                }
            }
        }

        System.out.println(sb);
    }
}
