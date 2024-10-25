
public class Question3014 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        do {
            sum += i;
            i += 3;
        } while (i <= 50);
        
        System.out.println(sum);
    }
}