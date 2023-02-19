import java.util.Scanner;
public class task09_lab2 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Запишите количество слов:");
        int j = sc.nextInt();
        System.out.println("Запишите слова:");
        ++j;
        String[] words = new String[j];

        int i;
        for(i = 0; i < j; ++i) {
            words[i] = sc.nextLine();
        }

        for(i = 1; i < j; ++i) {
            System.out.println("Строка №" + (i - 1) + ": " + words[i]);
        }

	}	
}