import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static int N, M; // 다른 함수에서도 쓰기 위해
    static Map<Integer, Boolean> NMap; // 상근이의 카드를 저장할 Map

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine()); // 상근이의 카드 개수
        NMap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int card = Integer.parseInt(st.nextToken());
            NMap.put(card, true); // 상근이의 카드를 Map에 저장 (key는 카드 값)
        }

        M = Integer.parseInt(br.readLine()); // 기준 카드 개수 (비교)

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            bw.write(NMap.containsKey(num) ? "1 " : "0 "); // Map을 이용해 카드 존재 여부 확인
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
