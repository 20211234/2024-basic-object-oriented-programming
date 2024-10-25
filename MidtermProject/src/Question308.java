import java.util.Scanner;

public class Question308 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;

        // 저장할 정수 개수 입력받기
        System.out.print("정수 몇 개 저장하시겠습니까? >>> ");
        count = s.nextInt();

        // 입력된 개수만큼의 배열 생성
        int[] numbers = new int[count];
        int index = 0;

        // 중복 없는 랜덤 정수 저장
        while (index < count) {
            int randomNum = (int)(Math.random() * 100) + 1; // 1~100 범위의 랜덤 정수

            // 중복 숫자 확인
            boolean isDuplicate = false;
            for (int i = 0; i < index; i++) {
                if (numbers[i] == randomNum) {
                    isDuplicate = true;
                    break;
                }
            }

            // 중복이 아닐 경우 배열에 추가
            if (!isDuplicate) {
                numbers[index] = randomNum;
                index++;
            }
        }

        // 랜덤한 정수 출력
        System.out.print("랜덤한 정수들... ");
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            sum += numbers[i];
        }
        System.out.println();

        // 평균 계산
        double average = sum / numbers.length;
        System.out.printf("평균은 %.15f\n", average);

        s.close();
    }
}