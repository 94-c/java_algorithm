import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 줄에 테스트케이스의 갯수 T (최대 1,000,000)
        int T = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder(); // 출력 성능을 위해

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim()); // 한 줄에 두 정수를 읽기 위해 StringTokenizer 사용
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(a + b).append("\n"); // 결과를 StringBuilder에 추가
        }

        bw.write(sb.toString()); // 모든 결과를 한번에 출력
        bw.flush();
        br.close();
    }
}
