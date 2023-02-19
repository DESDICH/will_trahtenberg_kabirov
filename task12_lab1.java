import java.util.Scanner;
public class task12_lab1 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Запишите средний расход топлива за 100 км:");
        int c = sc.nextInt();
        System.out.println("Запишите стоимость одного литра в рублях:");
        int v = sc.nextInt();
        System.out.println("Количество КМ:");
        int s = sc.nextInt();
        int N = c / s;
        int O = s * v;
        System.out.println("Расход денег :" + O + "\nРасход топлива:" + N);
	}	
}