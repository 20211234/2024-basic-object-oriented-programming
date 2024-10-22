import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int dollar, won;
		
		System.out.print("$1=1,200원입니다. 달러를 입력하세요. >>> ");
		
		dollar = s.nextInt();
		won = dollar * 1200;
		
		System.out.print("$" + dollar + "는 " + won + "원입니다.");
		
		s.close();
	}
}