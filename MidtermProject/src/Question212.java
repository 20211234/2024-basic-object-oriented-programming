import java.util.Scanner;

public class Question212 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("자동차 상태 입력 >>> ");
        int status = s.nextInt();
        String runningStatus = "정지 상태";
        String airConditionerStatus = "꺼진 상태";
        
        // 비트 5: 자동차 내 온도 확인
        int temperature = status & 0b00111111;

        // 비트 7: 자동차 주행상태 확인
        if ((status & 0b10000000) != 0) {
            runningStatus = "달리는 상태";
        }

        // 비트 6: 에어컨 가동여부 확인
        if ((status & 0b01000000) != 0) {
            airConditionerStatus = "켜진 상태";
        }
        
        System.out.printf("자동차는 %s이고 에어컨이 %s이고 온도는 %d도이다.%n", runningStatus, airConditionerStatus, temperature);
        
        s.close();
    }

}