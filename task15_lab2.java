import java.util.Scanner;
public class task15_lab2 {
    public static void main() {
       int counter = false;
        int tmpCounter = 0;
        int chChecker = 0;
        int maxCounter = 0;
        int checker = 0;
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        char[] tmp = st.toCharArray();
        int i = 0;

        for(int j = tmp.length - 1; i < tmp.length; ++i) {
            if (i != 0 && i != j) {
                if (tmp[i] == tmp[i + 1]) {
                    ++tmpCounter;
                    if (tmpCounter > maxCounter) {
                        maxCounter = tmpCounter;
                        chChecker = i;
                    }
                } else if (tmp[i] != tmp[i + 1]) {
                    tmpCounter = 0;
                }
            }
        }

        chChecker += 2;

        for(i = 0; i < tmp.length; ++i) {
            if (i == chChecker - maxCounter) {
                checker = i;
            }
        }

        ++maxCounter;
        System.out.println("Резултат:\nСимвол:" + tmp[chChecker - 2] + "\nПовторяется:" + maxCounter + " раза\nНачиная с символа под номером:" + checker);
 
	}	
}