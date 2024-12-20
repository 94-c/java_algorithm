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
