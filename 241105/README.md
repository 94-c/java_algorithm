# [15552] 빠른 A+B

---

### 문제 링크
[문제 링크](https://www.acmicpc.net/problem/15552)

## 문제 설명
for문 문제를 풀 때 주의해야 할 점 중 하나는 입출력 방식입니다. 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 **시간초과**가 발생할 수 있습니다. 특히 `Scanner`와 `System.out.println`을 사용하는 경우 시간이 오래 걸릴 수 있습니다. 이를 해결하기 위해 **BufferedReader**와 **BufferedWriter**를 사용하여 입출력 속도를 높이는 것이 필요합니다.

이 문제에서는 `T`개의 테스트케이스에 대해 두 정수 `A`와 `B`를 더한 결과를 출력하는 프로그램을 작성합니다.

## 입력
- 첫 줄에 테스트케이스의 개수 `T`가 주어집니다. `T`는 최대 `1,000,000`입니다.
- 다음 `T`줄에는 각각 두 정수 `A`와 `B`가 주어지며, 두 정수는 1 이상 1,000 이하입니다.

## 출력
- 각 테스트케이스마다 `A + B`의 결과를 한 줄에 하나씩 순서대로 출력합니다.

## 풀이 과정

1. **BufferedReader와 BufferedWriter 사용**  
   - `Scanner`와 `System.out.println`은 입출력 속도가 느리기 때문에 `BufferedReader`와 `BufferedWriter`를 사용하여 입력과 출력을 빠르게 처리합니다.
   - `BufferedReader`는 입력을 한 줄 단위로 읽으며, `BufferedWriter`는 결과를 한꺼번에 출력하도록 설정해 속도를 높입니다.

2. **StringBuilder 사용**  
   - 각 덧셈 결과를 `StringBuilder`에 누적하여 저장한 뒤, 한꺼번에 출력합니다.
   - 반복문 안에서 `BufferedWriter.write`를 호출하는 것보다, 결과를 모두 `StringBuilder`에 추가하고 한 번에 출력하는 방식이 효율적입니다.

3. **StringTokenizer 사용**  
   - 각 줄에 두 개의 정수가 공백으로 구분되어 있으므로 `StringTokenizer`를 사용해 각 줄에서 두 정수를 분리해 가져옵니다.

4. **시간복잡도 최적화**  
   - `BufferedReader`, `BufferedWriter`, `StringBuilder`, `StringTokenizer`를 사용하여 시간 복잡도를 줄이고, 대량의 입력과 출력을 효율적으로 처리합니다.

---
### 주요 로직 설명

- **빠른 입출력**: `BufferedReader`와 `BufferedWriter`를 사용하여 속도를 높이고, `StringBuilder`로 결과를 한 번에 출력하여 시간초과를 방지합니다.
- **효율적인 문자열 처리**: `StringTokenizer`로 공백을 기준으로 두 정수를 분리해 처리합니다.

이 문제는 입력과 출력을 효율적으로 처리하는 방법을 연습할 수 있는 좋은 예제입니다.
