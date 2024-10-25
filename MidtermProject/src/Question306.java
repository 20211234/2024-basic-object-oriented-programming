import java.util.Scanner;

public class Question306 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numbers = new int[10];

        // 양의 정수 10개 입력받기
        System.out.print("양의 정수 10개 입력 >>> ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = s.nextInt();
        }

        // 자리수의 합이 9인 수 출력하기
        System.out.print("자리수의 합이 9인 것은 ... ");
        for (int i = 0; i < numbers.length; i++) {
            if (digitSum(numbers[i]) == 9) {
                System.out.print(numbers[i] + " ");
            }
        }
        
        s.close();
    }

    // 자리수의 합 계산하기
    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}