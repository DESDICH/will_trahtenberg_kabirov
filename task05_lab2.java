import java.util.Scanner;
public class task05_lab2 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        boolean boo = false;
        System.out.println("Напишите слово:");
        String s = sc.nextLine();
        char[] cm = s.toCharArray();
        int len = cm.length;

        for(int i = 0; i < cm.length; --len) {
            if (cm[i] != cm[len - 1]) {
                boo = false;
                break;
            }

            boo = true;
            ++i;
        }

        if (boo) {
            System.out.println("Это слово палиндром");
        } else {
            System.out.println("Это слово не палиндром");
        }

	}	
}