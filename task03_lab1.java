import java.util.Scanner;
public class task03_lab1 {
    public static void main() {
		System.out.println("Введите двузначное число:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Число десяток:" + number / 10 + "\nЧисло едениц " + number % 10 + "\nСложение чисел:" + (number / 10 + number % 10) + "\nУмножение чисел: " + number / 10 * (number % 10));
 	}
}		