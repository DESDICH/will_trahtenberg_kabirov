import java.util.Scanner;
public class task09_lab1 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = sc.nextInt();

        int tmp;
        int tmp1;
        for(tmp = 0; num != 0; tmp += tmp1) {
            tmp1 = num % 10;
            num /= 10;
        }

        System.out.println("Сложение всех его чисел равно:" + tmp);
	}	
}