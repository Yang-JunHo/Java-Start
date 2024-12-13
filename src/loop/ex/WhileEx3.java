package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        // 누적 합 계산
        int max = 100;
        int sum = 0;
        int i = 1;

        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println("누적 합: " + sum);

        System.out.println("------------------");

        int max1 = 100;
        int sum1 = 0;
        for (int j = 1; j <= max; j++) {
            sum1 += j;
        }
        System.out.println(sum1);
    }
}
