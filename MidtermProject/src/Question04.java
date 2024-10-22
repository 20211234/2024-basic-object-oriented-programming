import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int room = 0;
		
		System.out.print("여행지 >>> ");
		String spot = s.nextLine();
		
		System.out.print("인원수 >>> ");
		int guest = s.nextInt();
		
		System.out.print("숙박일 >>> ");
		int stayLength = s.nextInt();
		String stayLengthNote = stayLength + "박 " + (stayLength + 1) + "일";
		
		System.out.print("인당 항공료 >>> ");
		int flightCost = s.nextInt();
		
		System.out.print("인당 숙박비 >>> ");
		int perStayFee = s.nextInt();
		
		room = (guest + 1) / 2;
		
		int totalStayCost = guest * perStayFee * stayLength;
        int totalFlightCost = guest * flightCost;
        int total = totalStayCost + totalFlightCost;
		
		System.out.print(guest + "명의 " + spot + " " + stayLengthNote + " 여행에는 방이 " + room + "개 필요하며, 경비는 " + total +"원입니다.");
		s.close();
	}
}

위 코드는 여행경비 계산을 위해 작성되었으며, 방 하나에는 2명까지 투숙가능하고, 1명만 투숙해도 1방의 비용을 지불한다는 조건이 있어.