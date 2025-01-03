package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        // 메서드와 형변환: 메서드를 호출할 때도 형변환이 적용
        // 명시적 형변환

        double number = 1.5;
        //printNumber(number); // double을 int형에 대입하므로 컴파일 오류
        printNumber((int) number); // 명시적 형변환을 사용해 double을 int로 변환
    }

    public static void printNumber(int n) {
        System.out.println("숫자: " + n);
    }
}
