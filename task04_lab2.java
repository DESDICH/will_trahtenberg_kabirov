import java.util.Scanner;

class Cube {
    private int col;
    private int lin;
    private int tmp;

    Cube(int a, int b) {
        this.lin = a;
        this.col = b;
    }

    public void line() {
        for(int i = 0; i < this.lin; ++i) {
            System.out.print("*");
        }

        System.out.println("");
    }

    public void column() {
        for(int j = 0; j < this.col - 2; ++j) {
            for(int i = 0; i < this.lin; ++i) {
                if (this.tmp != this.lin - 1 && this.tmp != 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

                ++this.tmp;
            }

            System.out.println("");
            if (this.tmp == this.lin) {
                this.tmp = 0;
            }
        }

    }
}
public class task04_lab2 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Запишите количество колонок");
        int lines = sc.nextInt();
        System.out.println("Запишите количество линий");
        int columns = sc.nextInt();
        Cube cube = new Cube(lines, columns);
        cube.line();
        cube.column();
        cube.line();
	}	
}