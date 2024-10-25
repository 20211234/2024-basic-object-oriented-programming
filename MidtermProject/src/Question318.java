import java.util.InputMismatchException;
import java.util.Scanner;

public class Question318 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int studentCount = 10;
        int[] studentIds = new int[studentCount];
        int[] scores = new int[studentCount];

        // 학번 및 점수 입력받기
        System.out.println(studentCount + "명 학생의 학번과 점수 입력");
        for (int i = 0; i < studentCount; i++) {
            System.out.print((i + 1) + " >>> ");
            studentIds[i] = s.nextInt();
            scores[i] = s.nextInt();
        }

        // 조회하기
        while (true) {
            System.out.print("학번으로 검색: 1, 점수로 검색: 2, 끝내려면 3 >>> ");
            int option = s.nextInt();

            if (option == 1) {
                System.out.print("학번 >>> ");
                int searchId = 0;
                boolean validInput = false;

                // 학번 입력 처리하기
                while (!validInput) {
                    try {
                        searchId = s.nextInt();
                        validInput = true;
                    } catch (InputMismatchException e) {
                        System.out.println("경고!! 정수를 입력하세요.");
                        s.nextLine();
                    }
                }

                boolean found = false;

                for (int i = 0; i < studentCount; i++) {
                    if (studentIds[i] == searchId) {
                        System.out.println(scores[i] + "점");
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println(searchId + "의 학생은 없습니다.");
                }

            } else if (option == 2) {
                System.out.print("점수 >>> ");
                int searchScore = 0;
                boolean validInput = false;

                // 점수 입력 처리
                while (!validInput) {
                    try {
                        searchScore = s.nextInt();
                        validInput = true;
                    } catch (InputMismatchException e) {
                        System.out.println("경고!! 정수를 입력하세요.");
                        s.nextLine();
                    }
                }

                boolean found = false;
                StringBuilder studentList = new StringBuilder();

                for (int i = 0; i < studentCount; i++) {
                    if (scores[i] == searchScore) {
                        studentList.append(studentIds[i]).append(" ");
                        found = true;
                    }
                }

                if (found) {
                    System.out.println("점수가 " + searchScore + "인 학생은 " + studentList.toString().trim() + "입니다.");
                } else {
                    System.out.println("점수가 " + searchScore + "인 학생은 없습니다.");
                }

            } else if (option == 3) { // 종료
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
        }

        s.close();
    }
}