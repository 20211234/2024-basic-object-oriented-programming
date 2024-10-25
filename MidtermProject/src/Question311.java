import java.util.Scanner;

public class Question311 {

	public static void main(String[] args) {
		System.out.println("***** 구구단 퀴즈입니다. *****");
		Scanner s = new Scanner(System.in);
		
		int failCount = 0;
		while(true) {
			int n = (int)(Math.random()*9 + 1);
			int m = (int)(Math.random()*9 + 1);
			int answer = n*m;
			
			System.out.print(n + "x" + m + "=");
			int user = s.nextInt();
			
			if(user == answer)
				System.out.println("정답입니다. 잘했습니다.");
			
			else {
				failCount++;
				if(failCount == 3) {
					System.out.println(failCount + "번 틀렸습니다. 퀴즈 종료합니다.");
					break;
				}
				
				else
					System.out.println(failCount + "번 틀렸습니다. 분발하세요.");
			}
		}
		s.close();
	}

}