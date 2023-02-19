import java.util.Scanner;
public class task02_lab2 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Запишите количество символов в пин-коде: ");
        int tmp = sc.nextInt();
        int range = (int)Math.pow(10.0, (double)tmp);
        double rNum = Math.random() * (double)range;
        int num = (int)rNum;
        System.out.println("Пин-код: " + num);
	}	
}