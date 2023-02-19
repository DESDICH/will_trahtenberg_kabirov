import java.util.Scanner;
public class task12_lab1 {
    public static void main() {
        int[] mass = new int[10];
        int p = 0;

        int i;
        for(i = 0; i < mass.length; mass[i] = i++) {
        }

        for(i = 0; i < mass.length; ++i) {
            mass[i] = i;
            p += mass[i];
        }

        System.out.println("Среднее арифтическое:" + p / mass.length);
	}	
}