package cond;

public class If3 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 11;
        int discount = 0;

        if (price >= 10000) { // 10000원 이상일 경우
            discount += 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }

        if (age <= 10) { // 나이가 10살 이하인 경우
            discount += 1000;
            System.out.println("어린이 1000원 할인");
        }

        System.out.println("총 할인 금액 " + discount + "원");
    }
}
