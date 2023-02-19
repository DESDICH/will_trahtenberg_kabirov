import java.util.Scanner;
public class task07_lab1 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x:");
        int x = sc.nextInt();
        double tmp;
        if (x > 0) {
            tmp = Math.sin((double)x);
            double result = Math.pow(tmp, 2.0);
            System.out.println("sin x =" + result);
        } else {
            x = (int)Math.pow((double)x, 2.0);
            tmp = 1.0 - Math.sin((double)x);
            System.out.println("sin x = " + tmp);
        }
	}	
}