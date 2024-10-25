import java.util.Scanner;

public class Question2081 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("연산 입력 >>> ");
		double number1 = s.nextDouble();
		String op = s.next();
		double number2 = s.nextDouble();
		double result = 0;
		
		if (op.equals("더하기")) {
			result = number1 + number2;
		
		} else if (op.equals("빼기")) {
			result = number1 - number2;
		
		} else if (op.equals("곱하기")) {
			result = number1 * number2;
		
		} else if (op.equals("나누기")) {
			
			if (number2 == 0) {
				System.out.print("0으로 나눌 수 없습니다.");
				s.close();
				return;
				
			} else {
				result = number1 / number2;
			}
			
		} else {
			System.out.print("사칙연산이 아닙니다.");
			s.close();
			return;
		}
		
		System.out.println(number1 + " " + op + " " + number2 + "의 계산 결과는 " + result);
		
		s.close();
	}
	
}