package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        while(true) {
            System.out.print("정수를 입력하세요 (0을 입력하면 종료): ");
            int num = input.nextInt();

            if (num == 0) {
                System.out.println("프로그램 종료");
                break;
            } else {
                sum += num;
                System.out.println("총 합계: " + sum);
            }
        }
    }
}
