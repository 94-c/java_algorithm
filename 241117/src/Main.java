import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 빠르게 처리하기 위해 BufferedReader 사용
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // 큐를 구현하기 위해 LinkedList 사용
        LinkedList<Integer> queue = new LinkedList<>();
        // 출력 결과를 저장할 StringBuilder
        StringBuilder sb = new StringBuilder();
        // 명령의 개수 입력
        int N = Integer.parseInt(bf.readLine());

        // 명령 처리 반복문
        for (int i = 0; i < N; i++) {
            // 명령어를 공백 기준으로 분리
            String[] command = bf.readLine().split(" ");
            // 명령어에 따라 동작 수행
            switch (command[0]) {
                case "push":
                    // push: 큐에 정수를 추가
                    queue.add(Integer.parseInt(command[1]));
                    break;
                case "pop":
                    // pop: 큐에서 가장 앞의 정수를 제거하고 출력
                    if (queue.size() == 0) {
                        sb.append(-1).append("\n"); // 큐가 비어있으면 -1 출력
                    } else {
                        int temp = queue.get(0); // 가장 앞의 값
                        queue.remove(0); // 제거
                        sb.append(temp).append("\n");
                    }
                    break;
                case "size":
                    // size: 큐의 크기를 출력
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    // empty: 큐가 비어있으면 1, 아니면 0 출력
                    if (queue.size() == 0) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "front":
                    // front: 큐의 가장 앞에 있는 값을 출력
                    if (queue.size() == 0) {
                        sb.append(-1).append("\n"); // 큐가 비어있으면 -1 출력
                    } else {
                        sb.append(queue.get(0)).append("\n");
                    }
                    break;
                case "back":
                    // back: 큐의 가장 뒤에 있는 값을 출력
                    if (queue.size() == 0) {
                        sb.append(-1).append("\n"); // 큐가 비어있으면 -1 출력
                    } else {
                        sb.append(queue.get(queue.size() - 1)).append("\n");
                    }
                    break;
            }
        }
        // 결과 출력
        System.out.println(sb);
    }
}
