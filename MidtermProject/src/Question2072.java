import java.util.Scanner;

// p.111 실습문제 7번 문제오류: 월 범위를 벗어난 0월을 겨울로 처리하라는 잘못된 지시 ⇒ 해당 조건은 구현하지 않음
public class Question2072 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("월을 입력하세요(1~12) >>> ");
		int season = s.nextInt();
		
		switch (season) {
			case 3, 4, 5:
				System.out.print("따뜻한 봄 🌺");
				break;
			
			case 6, 7, 8:
				System.out.print("바다가 즐거운 여름🌊");
				break;
			
			case 9, 10, 11:
				System.out.print("낙엽이 지는 아름다운 가을🍁");
				break;
			
			case 12, 1, 2:
				System.out.print("눈 내리는 하얀 겨울☃️");
				break;

			default:
				System.out.print("1~12만 입력하세요.");
				break;
		}
		
		s.close();
	}

}