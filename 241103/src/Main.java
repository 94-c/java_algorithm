import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫번째 줄 : 숫자 카드의 개수 N
        int n = Integer.parseInt(br.readLine());

        // 두번째 줄 : 상근이가 가지고 있는 n개의 숫자 카드
        HashMap<Integer, Boolean> cardMap = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            cardMap.put(num, true); // 숫자 카드 저장
        }

        // 세번째 줄 : 검사할 숫자의 개수 M
        int m = Integer.parseInt(br.readLine());

        // 네번쨰 줄 : 검사할 숫자들
        StringBuffer sb = new StringBuffer();
        st = new StringTokenizer(br.readLine());
        for  (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (!cardMap.containsKey(num)) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }

        System.out.println(sb.toString().trim());
    }
}
