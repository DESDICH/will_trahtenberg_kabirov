import java.util.Scanner;
public class task06_lab1 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите r:");
        double r = sc.nextDouble();
        int s = (int)(6.28 * r * r);
        int c = (int)(6.28 * r);
        System.out.println("Площадь равна:" + s + "\nДлина равна:" + c);
	}	
}