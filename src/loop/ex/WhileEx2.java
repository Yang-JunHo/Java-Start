package loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        // 짝수 출력
        int num = 2;
        while (num < 11) {
            System.out.println("while문:" + num);
            num += 2;
        }

        System.out.println("----------------");

        for (int i = 2; i < 11; i+=2) {
            System.out.println("for문:" + i);
        }
    }
}
