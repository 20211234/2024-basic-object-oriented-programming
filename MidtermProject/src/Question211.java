import java.util.Scanner;

public class Question211 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("냉장고 상태 입력 >>> ");
		String str = s.next();
		byte status = Byte.parseByte(str, 2); // str 속에 문자열 형태로 담긴 숫자 8개를 2진수로 변환하여 status에 저장
		
		// 전원 확인
		if((status & 0b00000001) != 0) {
			System.out.print("전원 켜져 있음. ");
		} else {
			System.out.print("전원 꺼져 있음. ");
		}
		
		// 문열림 확인
		if((status & 0b00000010) != 0) {
			System.out.print("문 닫혀 있음. ");
		} else {
			System.out.print("문 열려 있음. ");
		}
		
		// 전구 확인		
		if((status & 0b00000100) != 0) {
			System.out.print("전구 정상 작동. ");
		} else {
			System.out.print("전구 손상. ");
		}
		
		// 온도 확인
		if((status & 0b00001000) != 0) {
			System.out.print("냉장고 온도 3도 미만.");
		} else {
			System.out.print("냉장고 온도 3도 이상.");
		}
		
		s.close();
	}

}
