import java.util.Scanner;
public class task06_lab2 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Напишите слово:");
        String str = sc.nextLine();
        char[] tmp = str.toCharArray();
        System.out.println("Напишите символ:");
        String symbol = sc.nextLine();
        char[] sym = symbol.toCharArray();

        for(int i = 0; i < tmp.length; ++i) {
            if (tmp[i] == sym[0]) {
                tmp[i] = (char)(tmp[i] - 32);
            }
        }
        String word = new String(tmp);
        System.out.println(word);
	}	
}