import java.util.Scanner;

public class Question312 {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("***** 작명 프로그램이 실행됩니다. *****");
        
        while (true) {
            // 성별 입력받기
            System.out.print("남/여 선택 >>> ");
            String gender = s.nextLine();
            
            // "그만" 입력시 프로그램 종료하기
            if (gender.equals("그만")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 성 입력받기
            System.out.print("성 입력 >>> ");
            String lastName = s.nextLine();

            // 이름 생성하기
            String name = generateName(gender, lastName);
            System.out.println("추천 이름: " + name);
        }

        s.close();
    }

    // 이름 생성하기
    public static String generateName(String gender, String lastName) {
    	
        String[] boyMiddleList = {"기", "만", "용", "종", "현", "진", "재", "승", "소", "상", "자"};
        String[] boyLastList = {"태", "진", "광", "혁", "우", "철", "빈", "준", "구", "호", "석"};
        String[] girlMiddleList = {"은", "원", "경", "수", "현", "예", "여", "송", "서", "채", "하"};
        String[] girlLastList = {"진", "연", "경", "서", "리", "숙", "미", "원", "린", "희", "수"};

        String middleName;
        String lastNamePart;

        // 성별에 따른 이름 생성
        if (gender.equals("남")) {
            int middleIndex = (int)(Math.random() * boyMiddleList.length);
            middleName = boyMiddleList[middleIndex];
            int lastIndex = (int)(Math.random() * boyLastList.length);
            lastNamePart = boyLastList[lastIndex];
        
        } else if (gender.equals("여")) {
            int middleIndex = (int)(Math.random() * girlMiddleList.length);
            middleName = girlMiddleList[middleIndex];
            int lastIndex = (int)(Math.random() * girlLastList.length);
            lastNamePart = girlLastList[lastIndex];
        
        } else {
            return "잘못된 입력입니다.";
        }

        return lastName + middleName + lastNamePart;
    }

}