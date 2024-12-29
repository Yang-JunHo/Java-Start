package array;

public class ArrayDi1 {
    public static void main(String[] args) {
        // 2x3 2차원 배열을 만듭니다.
        int[][] arr = new int [2][3]; //행(row), 열(column)

        arr[0][0] = 1; //0행, 0열
        arr[0][1] = 2; //0행, 1열
        arr[0][2] = 3; //0행, 2열
        arr[1][0] = 4; //1행, 0열
        arr[1][1] = 5; //1행, 1열
        arr[1][2] = 6; //1행, 2열

        for (int i = 0; i < 2; i++) {
            System.out.print(arr[i][0] + " "); //i행 0열출력
            System.out.print(arr[i][1] + " "); //i행 1열출력
            System.out.print(arr[i][2] + " "); //i행 2열출력
            System.out.println(); //한 행이 끝나면 라인을 변경한다.
        }
    }
}
