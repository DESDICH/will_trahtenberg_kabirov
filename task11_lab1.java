import java.util.Scanner;
public class task10_lab1 {
    public static void main() {
        new Scanner(System.in);
        System.out.println();
        int maxcount = 0;
        int maxindex = 0;
        int mincount = 0;
        int minindex = 0;
        int[] days = new int[30];

        int i;
        for(i = 0; i < days.length; days[i] = i++) {
        }

        for(i = 0; i < days.length; ++i) {
            if (days[i] > maxcount) {
                maxcount = days[i];
                maxindex = i;
            } else if (mincount < days[i]) {
                mincount = days[i];
                minindex = i;
            }
        }
        System.out.println("Максимальное количество осадков:" + maxcount + ", его индекс: " + maxindex + "\nМиниальное количество осадков:" + minindex + ", его индекс:" + minindex);

	}	
}