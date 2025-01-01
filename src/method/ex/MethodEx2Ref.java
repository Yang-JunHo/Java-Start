package method.ex;

public class MethodEx2Ref {
    // 반복출력 리펙토링
    public static void main(String[] args) {
        printMessage("Hello, World!", 3);
        printMessage("Hello, World!", 5);
        printMessage("Hello, World!", 7);
    }

    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}