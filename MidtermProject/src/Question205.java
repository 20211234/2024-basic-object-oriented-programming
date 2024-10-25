import java.util.Scanner;

public class Question205 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		
				
		System.out.print("학생1 >>> ");
		String name1 = s.next();
		int lateCount1 = s.nextInt();
		int absentCount1 = s.nextInt();
		int lossScore1 = (lateCount1 * 3) + (absentCount1 * 8);
		int attendanceScore1 = 100 - lossScore1;
		
		System.out.print("학생2 >>> ");
		String name2 = s.next();
		int lateCount2 = s.nextInt();
		int absentCount2 = s.nextInt();
		int lossScore2 = (lateCount2 * 3) + (absentCount2 * 8);
		int attendanceScore2 = 100 - lossScore2;
		
		System.out.println(name1 + "의 감점은 " + lossScore1 + ", " + name2 + "의 감점은 " + lossScore2);
		
		if (attendanceScore1 == attendanceScore2) {
			System.out.print("출석점수 동일");
		} else if (attendanceScore1 > attendanceScore2) {
			System.out.print(name1 + "의 출석점수가 더 높음. " + name1 + "의 출석점수는 " + attendanceScore1);
		} else {
			System.out.print(name2 + "의 출석점수가 더 높음. " + name2 + "의 출석점수는 " + attendanceScore2);
		}

		s.close();
	}

}