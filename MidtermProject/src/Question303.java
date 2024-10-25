import java.util.Scanner;

public class Question303 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("양의 정수 입력 >>> ");
            number = scanner.nextInt();

            // 양의 정수 확인
            if (number > 0) {
                break;
            }
        }

        for (int i = number; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}