
public class Hello {
	// 메소드
	public static int sum(int n, int m) {
		return n+m;
	}
	
	// main 메소드에서 실행 시작
	public static void main(String[] args) {
		int i = 20;
		int s;
		char a;
		
		s = sum(i, 10);					// 메소드 호출로 반환된 값 30을 변수 s 안에 저장
		a = '?';						// 변수 a 안에 문자 '?' 저장
		System.out.println(a);			// 변수 a 출력
		System.out.println("Hello");	// "Hello" 문자열 출력
		System.out.println(s);			// 변수 s 출력
	}
}