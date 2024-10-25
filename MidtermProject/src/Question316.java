import java.util.Scanner;

public class Question316 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("양의 정수를 입력하세요. 1은 입력 끝 >>> ");
        String input = s.nextLine();

        String[] numbers = input.split(" ");
        int sum = 0;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            String numberStr = numbers[i];
            try {
                int number = Integer.parseInt(numberStr);
                
                if (number > 0) {
                    sum += number;
                    count++;
                
                } else {
                    System.out.println(number + " 제외");
                }
                
            } catch (NumberFormatException e) {
                System.out.println(numberStr + " 제외");
            }
        }

        // 평균 계산 및 출력하기
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("평균은 " + (int)average);
        
        } else {
            System.out.println("유효한 양의 정수가 없습니다.");
        }

        s.close();
    }
}