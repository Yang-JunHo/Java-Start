package loop.ex;

public class WhileEx1 {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 10){
            System.out.println("while문 : " + count);
            count++;
        }

        System.out.println("---------------");

        for (int i = 1; i <= 10; i++) {
            System.out.println("for문 : " + i);
        }
    }
}
