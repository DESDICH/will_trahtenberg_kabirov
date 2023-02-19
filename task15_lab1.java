import java.util.Scanner;
public class task12_lab1 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Запишите последовательно x и y:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int tmp = x;

        for(int i = 1; i < y; ++i) {
            x += tmp;
        }

        System.out.println("" + tmp + " * " + y + " = " + x);
	}	
}