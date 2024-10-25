import java.util.Scanner;

public class Question2082 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("연산 입력 >>> ");
		double number1 = s.nextDouble();
		String op = s.next();
		double number2 = s.nextDouble();
		double result = 0;
		
		switch(op) {
		case "더하기":
			result = number1 + number2;
			break;
		
		case "빼기":
			result = number1 - number2;
			break;
		
		case "곱하기":
			result = number1 * number2;
			break;
			
		case "나누기":
			if (number2 == 0) {
				System.out.print("0으로 나눌 수 없습니다.");
				s.close();
				return;
				
			} else {
				result = number1 / number2;
				break;
			}
		default:
			System.out.print("사칙연산이 아닙니다.");
			s.close();
			return;
		}
		
		System.out.println(number1 + " " + op + " " + number2 + "의 계산 결과는 " + result);
		
		s.close();
	}
	
}