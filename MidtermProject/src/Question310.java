import java.util.Scanner;

public class Question310 {

    public static void main(String[] args) {
        int[][] array = new int[4][4];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = (int)(Math.random() * 256);
            }
        }

        System.out.println("4*4 배열에 랜덤한 값을 저장한 후 출력합니다.");
        printArray(array);

        System.out.print("임계값 입력 >>> ");
        int threshold = s.nextInt();

        // 배열 수정: 임계값보다 크면 255, 작거나 같으면 0
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (array[i][j] > threshold) {
                    array[i][j] = 255;
                } else {
                    array[i][j] = 0;
                }
            }
        }

        System.out.println("수정된 배열 출력:");
        printArray(array);

        s.close();
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}