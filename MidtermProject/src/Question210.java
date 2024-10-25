import java.util.Scanner;

public class Question210 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		System.out.print("(x1, y1), (x2, y2)의 좌표 입력 >>> ");
		int x1 = s.nextInt();
		int y1 = s.nextInt();
		int x2 = s.nextInt();
		int y2 = s.nextInt();
		
		// 기준 사각형 좌표
		int minX = 10;
        int minY = 10;
        int maxX = 200;
        int maxY = 300;
        
        // 입력받은 사각형의 모서리 좌표
        int rectMinX, rectMinY, rectMaxX, rectMaxY;

        if (x1 < x2) {
            rectMinX = x1;
            rectMaxX = x2;
        
        } else {
            rectMinX = x2;
            rectMaxX = x1;
        }

        if (y1 < y2) {
            rectMinY = y1;
            rectMaxY = y2;
        
        } else {
            rectMinY = y2;
            rectMaxY = y1;
        }
        
        // 포함여부 판단
        if (rectMinX >= minX && rectMaxX <= maxX && rectMinY >= minY && rectMaxY <= maxY) {
            System.out.println("(" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ") 사각형은 (10, 10)과 (200, 300)의 사각형에 포함된다.");
        
        } else {
            System.out.println("(" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ") 사각형은 (10, 10)과 (200, 300)의 사각형에 포함되지 않는다.");
        }
		
		s.close();
	}
}