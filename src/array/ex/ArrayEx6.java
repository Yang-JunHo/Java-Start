package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int count = input.nextInt();
        int [] numbers = new int[count];

        System.out.println(count + "개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // 최대, 최소값 변수 정의
        int minNumber, maxNumber;
        minNumber = maxNumber = numbers[0];
        // 최소값 구하기
        for (int i = 0; i < count; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }
        // 최대값 구하기
        for (int i = 0; i < count; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        System.out.println("가장 작은 정수: " + minNumber);
        System.out.println("가장 큰 정수: " + maxNumber);
    }
}
