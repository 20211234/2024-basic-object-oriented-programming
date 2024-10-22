import java.util.Scanner;

public class Question03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("*** 자바분식입니다. 주문을 입력하시면 금액을 알려드립니다. ***");
		
		System.out.print("떡볶이를 몇인분 주문하시겠습니까? >>> ");
		int dduk = 2000 * s.nextInt();
		
		System.out.print("김말이를 몇인분 주문하시겠습니까? >>> ");
		int kim = 1000 * s.nextInt(); 
		
		System.out.print("쫄면을 몇인분 주문하시겠습니까? >>> ");
		int jjeol = 3000 * s.nextInt();
		
		int sum = dduk + kim + jjeol;
		
		System.out.print("전체 금액은 " + sum + "원입니다.");
		
		s.close();
	}
}