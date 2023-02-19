import java.util.Scanner;
public class task14_lab2 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа для сложения:");

        int numbers;
        int nextnumber;
        for(numbers = 0; sc.hasNextInt(); numbers += nextnumber) {
            nextnumber = sc.nextInt();
        }

        System.out.println(numbers);
	}	
}