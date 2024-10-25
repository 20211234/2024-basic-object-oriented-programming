import java.util.Scanner;

public class Question313 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String[] course = {"C", "C++", "Python", "Java", "HTML5" };
		String[] grade = {"A", "B+", "B", "A+", "D"};
		
		
		while(true) {
			System.out.print("과목 >>> ");
			String searchCourse = s.next();
			
			if(searchCourse.equals("그만"))
				break;
			
			int index = 0;
			for(index=0; index<course.length; index++) {
				if(course[index].equals(searchCourse)) {
					System.out.println(searchCourse + " 학점은 " + grade[index]);
					break;
				}
			}
			
			if(index == course.length)
				System.out.println(searchCourse + "는 없는 과목입니다.");
			
		}
		s.close();
	}

}