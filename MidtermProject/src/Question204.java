import java.util.Scanner;

public class Question204 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("여행지 >>> ");
		String spot = s.nextLine();
		
		System.out.print("인원수 >>> ");
		int guest = s.nextInt();
		
		System.out.print("숙박일 >>> ");
		int stayLength = s.nextInt();
		String stayLengthNote = stayLength + "박 " + (stayLength + 1) + "일";
		
		System.out.print("인당 항공료 >>> ");
		int perFlightCost = s.nextInt();
		
		System.out.print("숙소 하나당 숙박비 >>> ");
		int stayFee = s.nextInt();
		
		int room = (guest + 1) / 2;							 // 필요한 숙소 개수
		int totalStayCost = room * stayFee * stayLength; 	 // 숙박비 총계
        int totalFlightCost = guest * perFlightCost;		 // 항공료 총계
        int total = totalStayCost + totalFlightCost;		 // 여행경비 총계
		
		System.out.print(guest + "명의 " + spot + " " + stayLengthNote + " 여행에는 방이 " + room + "개 필요하며, 경비는 " + total +"원입니다.");
		s.close();
	}
	
}