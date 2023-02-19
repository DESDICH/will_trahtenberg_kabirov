import java.util.Scanner;
public class task12_lab2 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        System.out.println("Введите строку");
        String word = sc.nextLine();
        System.out.println("Введите символ");
        char sym = sc.next().charAt(0);
        System.out.println("Строка:" + word);
        char[] tmp = word.toCharArray();

        for(int i = 0; i < tmp.length; ++i) {
            if (tmp[i] != sym) {
                ++counter;
                System.out.print(tmp[i]);
            } else {
                System.out.print(" - " + counter);
                System.out.println("");
                counter = 0;
            }
        }

        System.out.print(" - " + counter);
        System.out.println("");
	}	
}