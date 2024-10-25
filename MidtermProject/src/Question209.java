import java.util.Scanner;

public class Question209 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		System.out.print("점 (x, y)의 좌표 입력 >>> ");
		int x = s.nextInt();
		int y = s.nextInt();

		// 좌표가 사각형 안에 있는 경우
		if ((x > 10 && x < 200) && (y > 10 && y < 300)) {
			System.out.print("점 (" + x + ", " + y + ")는 사각형 안에 있습니다."); 
		
		// 좌표가 사각형 선상에 있는 경우: 네 변 위에 존재하는 모든 좌표
		} else if ((x == 10 && y >= 10 && y <= 300) || (x == 200 && y >= 10 && y <= 300) || (y == 10 && x >= 10 && x <= 200) || (y == 300 && x >= 10 && x <= 200)) {
			System.out.print("점 (" + x + ", " + y + ")는 사각형 선 상에 있습니다.");
			
		// 좌표가 사각형 밖에 있는 경우
		} else {
			System.out.print("점 (" + x + ", " + y + ")는 사각형 밖에 있습니다.");
		}
		
		s.close();
	}
}