import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("생년월일을 입력하세요. >>> ");
		
		int birthday = s.nextInt();
		int year = birthday / 10000;			// 생년월일을 10000으로 나누면 연도에 해당하는 상위 4자리 숫자만 남는다!
		int month = (birthday % 10000) / 100;	// 생년월일을 10000으로 나눈 나머지(=연도를 뺀 MMDD)를 다시 100으로 나누면 월에 해당하는 두 숫자만 남는다!
		int day = birthday % 100;				// 생년월일을 100으로 나눈 나머지는 일자에 해당하는 하위 2자리 숫자이다!
		
		System.out.print(year + "년 " + month + "월 " + day + "일" );
		
		s.close();
	}
}