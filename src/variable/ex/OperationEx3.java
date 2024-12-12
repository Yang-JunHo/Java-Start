package variable.ex;

public class OperationEx3 {
    public static void main(String[] args) {
        int score;
        score = 70;

//        if (score >= 80 && score <= 100) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
        System.out.println(score >= 80 && score <= 100 ? true : false); // 삼항연산자
//        boolean result = score >= 80 && score <= 100;
//        System.out.println(result);
    }
}
