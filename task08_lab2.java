import java.util.Scanner;
public class task08_lab2 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Запишите слово: ");
        String word = sc.nextLine();
        char[] tmp = word.toCharArray();
        char[] reversedWord = new char[tmp.length];
        int i = 0;

        for(int j = reversedWord.length - 1; i < reversedWord.length; --j) {
            reversedWord[j] = tmp[i];
            ++i;
        }

        String newWord = new String(reversedWord);
        System.out.println(" " + newWord);
	}	
}