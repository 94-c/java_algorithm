import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int strLen = str.length();

        for(int i=0; i<strLen-1; i++) {
            if(str.charAt(i) != str.charAt(strLen-i-1)) {
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
    }
}
