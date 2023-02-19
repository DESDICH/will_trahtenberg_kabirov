import java.util.Scanner;
public class task05_lab1 {
    public static void main() {
		Scanner sc = new Scanner(System.in);
        System.out.println();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (x * x + y * y == z * z) {
            System.out.println("Гипотенузой является: " + z);
            System.out.println("Числа являются пифагоровой тройкой");
        } else if (x * x + z * z == y * y) {
            System.out.println("Гипотенузой является: " + y);
            System.out.println("Числа являются пифагоровой тройкой");
        } else if (y * y + z * z == x * x) {
            System.out.println("Гипотенузой является: " + x);
            System.out.println("Числа являются пифагоровой тройкой");
        }
	}	
}