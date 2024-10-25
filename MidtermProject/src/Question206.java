import java.util.Scanner;

public class Question206 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("나이를 입력해주세요. >>> ");
		int age = s.nextInt();
		int sum = 0;
		int red = 0;
		int blue = 0;
		int yellow = 0;
		
		if (age <= 0) {
			System.out.print("나이는 양수로만 입력해주세요.");
			s.close();
			return;
			
		} else if (age < 5) {
			yellow = age;
			
		} else if (age <10) {
			blue = age / 5;
			yellow = age % 5;
			
		} else if (age >= 10) {
			red = age / 10;
			blue = (age % 10) / 5;
			yellow = age % 5; 
		}
		
		sum = red + blue + yellow;
		
		System.out.print("빨간 초 " + red + "개, 파란 초 " + blue + "개, 노란 초 " + yellow + "개. 총 " + sum + "개가 필요합니다.");
		
		s.close();
	}

}