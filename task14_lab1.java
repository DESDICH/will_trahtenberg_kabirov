import java.util.Scanner;
public class task14_lab1 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите N:");
        int N = sc.nextInt();
        int num = 0;
        for(int i = 0; i <= N; ++i) {
            num += i * i;
        }
        System.out.println("Результат вычислений:" + num);
	}	
}