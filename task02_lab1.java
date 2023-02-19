import java.util.Scanner;
public class task02_lab1 {
    public static void main() {
		System.out.println("Введите кол-во секунд:");
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();
        double hours = (double)(seconds / 3600);
        double minutes = (double)(seconds % 3600 / 60);
        double secondSec = (double)(seconds % 60);
        System.out.println("Часов прошло:" + hours + "\nМинут прошло с часа:" + minutes + "\nСекунд прошло c минут: " + secondSec);
    }
}