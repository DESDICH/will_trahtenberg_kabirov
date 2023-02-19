import java.util.Scanner;
public class task13_lab2 {
    public static void main() {
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        String string = sc.nextLine();
        char[] tmp = string.toCharArray();

        for(int i = 0; i < tmp.length; ++i) {
            if (tmp[i] == ' ') {
                if (tmp[i + 1] != ' ') {
                    ++counter;
                    if (counter != 1) {
                        System.out.print(tmp[i]);
                    }
                }
            } else if (tmp[i] != ' ') {
                System.out.print(tmp[i]);
            }
        }
	}	
}