
public class Question307 {

	public static void main(String[] args) {
		int[] n = new int [10];
		
		for(int i=0; i<n.length; i++) {
			n[i] = (int)(Math.random()*9) + 11;
		}

		int sum = 0;
		System.out.print("랜덤한 정수들...");
		
		for(int i=0; i<n.length; i++) {
			System.out.print(n[i] + " ");
			sum += n[i];
		}
		
		System.out.println();
		System.out.println("평균은 " + (double)sum/n.length);
		
	}
	
}