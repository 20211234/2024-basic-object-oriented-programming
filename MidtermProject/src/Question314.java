import java.util.Scanner;

public class Question314 {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("***** 갬블링 프로그램이 실행됩니다. *****");

        while (true) {
            // 엔터키 입력 대기
            System.out.print("엔터키 입력 >>> ");
            s.nextLine();
            
            // 랜덤한 수 생성
            int num1 = (int)(Math.random() * 3);
            int num2 = (int)(Math.random() * 3);
            int num3 = (int)(Math.random() * 3);
            
            System.out.println(num1 + " " + num2 + " " + num3);
            
            // 모두 같은 값인지 확인
            if (num1 == num2 && num2 == num3) {
                System.out.println("성공! 대박났어요!");
                
                // 성공 메시지가 출력된 경우에만 게임 진행 여부 확인
                System.out.print("계속하시겠습니까?(yes/no) >>> ");
                String response = s.nextLine();
                if (response.equalsIgnoreCase("no")) {
                    System.out.println("게임을 종료합니다.");
                    break;
                }
            }
        }

        s.close();
    }

}