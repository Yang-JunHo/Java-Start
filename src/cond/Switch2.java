package cond;

public class Switch2 {
    public static void main(String[] args) {
        // grade 1:1000, 2,3:2000, 나머지:500
        int grade = 3;
        int coupon;

        switch (grade){
            case 1:
                coupon = 1000;
                break;
            case 2:
            case 3:
                coupon = 2000;
                break;
            default:
                coupon = 500;
                break;
        }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
