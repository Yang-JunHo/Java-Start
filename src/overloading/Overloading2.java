package overloading;

public class Overloading2 {
    public static void main(String[] args) {
        // 매개변수의 타입이 다른 오버로딩
        myMethod(1, 1.2);
        myMethod(1.2, 1);
    }

    public static void myMethod(int a, double b) {
        System.out.println("int a, double b: " + a + ", " + b);
    }

    public static void myMethod(double a, int b) {
        System.out.println("double a, int b: " + a + ", " + b);
    }
}
