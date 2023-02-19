import java.util.Scanner;
public class task01_lab2 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Имя города:");
        String name = sc.nextLine();
        System.out.println("Страна:");
        String country = sc.nextLine();
        System.out.println(name + " является столицой " + country);
	}	
}