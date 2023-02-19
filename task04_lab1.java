import java.util.Scanner;
public class task04_lab1 {
    public static void main() {
        double[] numbers = new double[4];
        System.out.println("Напишите x1,x2,y1,y2:");
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < numbers.length; ++i) {
            numbers[i] = sc.nextDouble();
        }
        double result = (double)((int)Math.sqrt(numbers[0] * numbers[0] * numbers[1] * numbers[1] + numbers[2] * numbers[2] * numbers[3] * numbers[3]));
        System.out.println("d =" + result);
	}	
}