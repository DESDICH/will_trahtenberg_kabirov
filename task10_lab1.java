import java.util.Scanner;
public class task10_lab1 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Запишите размер массива");
        int[] arr = new int[sc.nextInt()];
        int nums1 = 0;
        int nums2 = 0;
        System.out.println("Запишите числа:");

        for(int i = 0; i < arr.length; ++i) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                nums1 += arr[i];
            } else {
                nums2 += arr[i];
            }
        }

        System.out.println("Сумма четных чисел:" + nums1 + "\n Сумма нечетных чисел:" + nums2); 
	}	
}