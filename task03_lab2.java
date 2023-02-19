import java.util.Scanner;
public class task03_lab2 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Запишите слово");
        String n = sc.nextLine();
        char[] sep = n.toCharArray();

        for(int i = 0; i < sep.length; ++i) {
            for(int j = 0; j <= i; ++j) {
                System.out.print(sep[i]);
            }

            System.out.println("");
        }
	}	
}