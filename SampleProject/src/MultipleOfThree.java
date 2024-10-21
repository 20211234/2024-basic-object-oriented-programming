import java.util.Scanner;

public class MultipleOfThree {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("수를 입력하시오: ");
		int number = s.nextInt(); // 변수 number에 정수 입력
		
		if (number % 3 == 0) // 변수 number에 입력된 숫자를 3으로 나누었을 때, 나머지가 0인지 확인
			System.out.println("3의 배수입니다.");
		else
			System.out.println("3의 배수가 아닙니다.");
	s.close();
	}
}