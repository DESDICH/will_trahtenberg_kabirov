import java.util.Scanner;
public class task08_lab1 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = sc.nextInt();
        int tmp = num;
		
        for(int i = 1; i <= 10; ++i) {
            num *= i;
            System.out.println("Перемноженное число равно:" + num);
            num = tmp;
        }
	}	
}