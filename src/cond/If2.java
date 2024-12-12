package cond;

public class If2 {
    public static void main(String[] args) {
        int age;
        age = 7;
        String result;
        if (age <= 7){
            result = "미취학";
            System.out.println(result + "입니다.");
        } else if (age >= 8 && age <=13) {
            result = "초등학생";
            System.out.println(result + "입니다.");
        } else if (age >= 14 && age <= 19) {
            result = "고등학생";
            System.out.println(result + "입니다.");
        } else {
            result = "성인";
            System.out.println(result + "입니다.");
        }
    }
}
