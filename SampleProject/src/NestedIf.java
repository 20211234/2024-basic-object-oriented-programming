import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		int score, grade;
		boolean isPassed = false;

		Scanner s = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요. :");
		score = s.nextInt();
		
		System.out.print("학년을 입력해주세요. :");
		grade = s.nextInt();
		
		if (grade == 4) {			// STEP1. 학년 구분하기			
			if (score >= 70) {		// STEP2. 점수 구분하기
				isPassed = true;
			}
		} else if (score >= 60) {
			isPassed = true;
		}
		
		if(isPassed)				// STEP3. 합불여부 구분하기
			System.out.print("축하합니다. 합격입니다!");
		else
			System.out.print("불합격입니다.");

		s.close();
	}
}