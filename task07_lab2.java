import java.util.Scanner;
public class task07_lab2 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Запишите слово: ");
        String word = sc.nextLine();
        char[] tmp = word.toCharArray();

        for(int i = 0; i < tmp.length; ++i) {
            if (tmp[i] < '[') {
                tmp[i] = (char)(tmp[i] + 32);
            } else if (tmp[i] > '[') {
                tmp[i] = (char)(tmp[i] - 32);
            } else {
                System.out.println(tmp[i]);
            }
        }

        String newWord = new String(tmp);
        System.out.println("Слово изменилось на: " + newWord);
	}	
}