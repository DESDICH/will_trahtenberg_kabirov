import java.util.Scanner;
public class task11_lab2 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Запишите слово");
        String str = sc.nextLine();
        char[] tmp = str.toCharArray();

        for(int i = 0; i < tmp.length; ++i) {
            switch (tmp[i]) {
                case 'а':
                    tmp[i] = 'a';
                    break;
                case 'б':
                    tmp[i] = 'b';
                    break;
                case 'в':
                    tmp[i] = 'v';
                    break;
                case 'г':
                    tmp[i] = 'g';
                    break;
                case 'д':
                    tmp[i] = 'd';
                    break;
                case 'е':
                    tmp[i] = 'e';
                    break;
                case 'ж':
                    tmp[i] = 'j';
                    break;
                case 'з':
                    tmp[i] = 'z';
                    break;
                case 'и':
                    tmp[i] = 'i';
                case 'к':
                    tmp[i] = 'k';
                    break;
                case 'л':
                    tmp[i] = 'l';
                    break;
                case 'м':
                    tmp[i] = 'm';
                    break;
                case 'н':
                    tmp[i] = 'n';
                    break;
                case 'о':
                    tmp[i] = 'o';
                    break;
                case 'п':
                    tmp[i] = 'p';
                    break;
                case 'р':
                    tmp[i] = 'r';
                    break;
                case 'с':
                    tmp[i] = 's';
                    break;
                case 'т':
                    tmp[i] = 't';
                    break;
                case 'у':
                    tmp[i] = 'u';
                    break;
                case 'ф':
                    tmp[i] = 'f';
                    break;
                case 'х':
                    tmp[i] = 'h';
                    break;
                case 'ц':
                    tmp[i] = 'c';
                    break;
                case 'ч':
                    tmp[i] = 'c';
                    break;
                case 'ш':
                    tmp[i] = 'h';
                    break;
                case 'ь':
                    tmp[i] = '\'';
                    break;
                case 'э':
                    tmp[i] = 'e';
                    break;
                case 'ю':
                    tmp[i] = 'y';
                    break;
                case 'ё':
                    tmp[i] = 'e';
				default:
                    break;
            }
        }

        String translate = new String(tmp);
        System.out.println("Транслит слова: " + translate);
	}	
}