import java.util.Scanner;
public class task10_lab2 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int tmp = 0;
        System.out.println("Введите слово:");
        String word = sc.nextLine();
        char[] check = word.toCharArray();

        for(int i = 0; i < check.length; ++i) {
            if (check[i] == 1046 | check[i] == 1078 && check[i] != check.length && check[i + 1] == 1099) {
                check[i + 1] = 1080;
                ++tmp;
            }
        }

        String chekedWord = new String(check);
        if (tmp >= 1) {
            System.out.println("Допущена ошибка жи/ши в слове:" + chekedWord);
        } else {
            System.out.println("Ошибка не была допущена");
        }

	}	
}