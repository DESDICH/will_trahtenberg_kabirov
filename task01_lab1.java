import java.util.Scanner;
public class task01_lab1 {
    public static void main() {
	   System.out.println("Введите ко-во сантиметров");
        Scanner sc = new Scanner(System.in);
        float cm = sc.nextFloat() / 100.0F;
        System.out.println("В " + cm + " сантиметрах " + cm + " метров");
    }
}