import java.util.Scanner;

public class Question305 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("양의 정수 10개 입력 >>> ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = s.nextInt();
        }

        System.out.print("3의 배수는 ... ");
        for (int number : numbers) {
            if (number % 3 == 0) {
                System.out.print(number + " ");
            }
        }
        
        s.close();
    }
}