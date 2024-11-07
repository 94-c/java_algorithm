import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 영수증에 총 금액
        int totalAmount = sc.nextInt();

        // 영수증에 적힌 구매한 물건의 종류의 수 N
        int numOfItems = sc.nextInt();

        // 계산된 총 금액 변수 초기화
        int calculatedTotal = 0;

        for(int i = 0; i < numOfItems; i++) {
            int price = sc.nextInt(); // 물건의 가격 a
            int quantity = sc.nextInt(); // 물건의 가격 b

            calculatedTotal += price * quantity;
        }

        // 계산된 총 금액과 영수증의 총 금액 비교
        if (calculatedTotal == totalAmount) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
