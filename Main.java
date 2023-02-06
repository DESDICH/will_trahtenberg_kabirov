import java.util.Scanner;
class Cube{
    private int col,lin,tmp;
    Cube(int a, int b){
        lin = a;
        col = b;
    }
    public void line(){
        for(int i = 0; i < lin; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
    public void column(){
        for (int j = 0;j<col-2;j++){
            for(int i = 0; i < lin; i++){
                if(tmp==(lin-1) || tmp==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                tmp++;
            }
            System.out.println("");
            if (tmp == lin){
                tmp = 0;
            }
        }
    }
}
public class Main {
    public static void zadanie1(){
        String name,country;
        Scanner sc = new Scanner(System.in);
        System.out.println("Имя города:");
        name = sc.nextLine();
        System.out.println("Страна:");
        country = sc.nextLine();
        System.out.println(name +" является столицой "+ country);
    }
    public static void zadanie2(){
        Scanner sc = new Scanner(System.in);
        int range, num, tmp;
        System.out.println("Запишите количество символов в пин-коде: ");
        tmp = sc.nextInt();
        range = (int) Math.pow(10.0,tmp);
        double rNum = Math.random()*range;
        num = (int) rNum;
        System.out.println("Пин-код: " + num);
    }
    public static void zadanie3(){
        Scanner sc = new Scanner(System.in);
        String n;
        System.out.println("Запишите слово");
        n = sc.nextLine();
        char [] sep = n.toCharArray();
        for (int i = 0; i < sep.length;i++){
            for (int j = 0; j <= i;j++){
                System.out.print(sep[i]);
            }
            System.out.println("");
        }
    }
    public static void zadanie4(){
        Scanner sc = new Scanner(System.in);
        int columns,lines;
        System.out.println("Запишите количество колонок");
        lines = sc.nextInt();
        System.out.println("Запишите количество линий");
        columns = sc.nextInt();
        Cube cube = new Cube(lines,columns);
        cube.line();
        cube.column();
        cube.line();
    }
    public static void zadanie5(){
        Scanner sc = new Scanner(System.in);
        boolean boo = false;
        int len;
        System.out.println("Напишите слово:");
        String s = sc.nextLine();
        char [] cm = s.toCharArray();
        len = cm.length;
        for (int i=0;i<cm.length;i++,len--){
            if (cm[i]==cm[len-1]){
                boo = true;
            }
            else{
                boo = false;
                break;
            }
        }
        if(boo){
            System.out.println("Это слово палиндром");
        }
        else{
            System.out.println("Это слово не палиндром");
        }
    }
    public static void zadanie6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Напишите слово:");
        String str = sc.nextLine();
        char [] tmp = str.toCharArray();
        System.out.println("Напишите символ:");
        String symbol = sc.nextLine();
        char [] sym = symbol.toCharArray();
        for (int i=0; i<tmp.length;i++){
            if (tmp[i]==sym[0]){
                tmp[i]-=32;
            }
        }
        String word = new String(tmp);
        System.out.println(word);
    }
    public static void zadanie7(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Запишите слово: ");
        String word = sc.nextLine();
        char[] tmp = word.toCharArray();
        for (int i=0;i<tmp.length;i++){
            if(tmp[i]<91){
                tmp[i]+=32;
                continue;
            }
            if (tmp[i] > 91){
                tmp[i]-=32;
                continue;
            }
            System.out.println(tmp[i]);
        }
        String newWord = new String(tmp);
        System.out.println("Слово изменилось на: "+ newWord);
    }
    public static void zadanie8(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Запишите слово: ");
        String word = sc.nextLine();
        char[] tmp = word.toCharArray();
        char[] reversedWord = new char[tmp.length];
        for (int i=0, j=reversedWord.length-1;i<reversedWord.length;i++,j--){
            reversedWord[j] = tmp[i];
        }
        String newWord = new String(reversedWord);
        System.out.println(" "+newWord);
    }
    public static void zadanie9(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Запишите количество слов:");
        int j = sc.nextInt();
        System.out.println("Запишите слова:");
        String [] words = new String[j+=1];
        for (int i=0;i<j;i++){
            words[i] = sc.nextLine();
        }
        for (int i = 1; i<j;i++){
            System.out.println("Строка №"+ (i-1) +": "+ words[i]);
        }
    }
    public static void zadanie10(){
        Scanner sc = new Scanner(System.in);
        int tmp=0;
        System.out.println("Введите слово:");
        String word = sc.nextLine();
        char[] check = word.toCharArray();
        for (int i=0;i<check.length;i++){
            if ((check[i]=='Ж')|(check[i]=='ж')){
                if ((check[i]!=check.length)&&(check[i+1]=='ы')){
                    check[i+1] = 'и';
                    tmp++;
                }
            }
        }
        String chekedWord= new String(check);
        if (tmp>=1){
            System.out.println("Допущена ошибка жи/ши в слове:"+chekedWord);
        }
        else{
            System.out.println("Ошибка не была допущена");
        }
    }
    public static void zadanie11(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Запишите слово");
        String str = sc.nextLine();
        char[] tmp = str.toCharArray();
        for (int i=0;i<tmp.length;i++){
            switch (tmp[i]){
                case 'а':tmp[i]='a';break;
                case 'б':tmp[i]='b';break;
                case 'в':tmp[i]='v';break;
                case 'г':tmp[i]='g';break;
                case 'д':tmp[i]='d';break;
                case 'е':tmp[i]='e';break;
                case 'ё':tmp[i]='e';break;
                case 'ж':tmp[i]='j';break;
                case 'з':tmp[i]='z';break;
                case 'и':tmp[i]='i';break;
                case 'к':tmp[i]='k';break;
                case 'л':tmp[i]='l';break;
                case 'м':tmp[i]='m';break;
                case 'н':tmp[i]='n';break;
                case 'о':tmp[i]='o';break;
                case 'п':tmp[i]='p';break;
                case 'р':tmp[i]='r';break;
                case 'с':tmp[i]='s';break;
                case 'т':tmp[i]='t';break;
                case 'у':tmp[i]='u';break;
                case 'ц':tmp[i]='c';break;
                case 'ч':tmp[i]='c';break;
                case 'ш':tmp[i]='h';break;
                case 'ь':tmp[i]='\'';break;
                case 'э':tmp[i]='e';break;
                case 'ю':tmp[i]='y';break;
                case 'ф':tmp[i]='f';break;
                case 'х':tmp[i]='h';break;
            }
        }
        String translate = new String(tmp);
        System.out.println("Транслит слова: "+translate);
    }
    public static void zadanie12(){
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        System.out.println("Введите строку");
        String word = sc.nextLine();
        System.out.println("Введите символ");
        char sym = sc.next().charAt(0);
        System.out.println("Строка:" + word);
        char[] tmp = word.toCharArray();
        for (int i = 0;i<tmp.length;i++){
            if (tmp[i]!=sym ){
                counter++;
                System.out.print(tmp[i]);
            }
            else {
                System.out.print(" - " + counter);
                System.out.println("");
                counter = 0;
            }
        }
        System.out.print(" - " + counter);
        System.out.println("");
    }
    public static void zadanie13(){
        int counter=0;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        String string = sc.nextLine();
        char[] tmp = string.toCharArray();
        for (int i = 0;i < tmp.length;i++){
            if (tmp[i]==' '){
                if (tmp[i+1]!=' '){
                    counter++;
                    if (counter==1){
                        continue;
                    }
                    System.out.print(tmp[i]);
                }
                continue;
            }
            else if (tmp[i]!=' ') {
                System.out.print(tmp[i]);
            }
        }
    }
    public static void zadanie14(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа для сложения:");
        int numbers = 0,nextnumber;
        while(sc.hasNextInt()){
            nextnumber = sc.nextInt();
            numbers+=nextnumber;
        }
        System.out.println(numbers);
    }
    public static void zadanie15() {
        int counter = 0, tmpCounter = 0, chChecker = 0, maxCounter = 0, checker = 0;
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        char[] tmp = st.toCharArray();
        for (int i = 0, j = tmp.length - 1; i < tmp.length; i++) {
            if (i == 0 || i == j) {
                continue;
            }
            if (tmp[i] == tmp[i + 1]) {
                tmpCounter++;
                counter = tmpCounter;
                if (counter > maxCounter) {
                    maxCounter = counter;
                    chChecker = i;
                }
            } else if (tmp[i] != tmp[i + 1]) {
                tmpCounter = 0;
            }
        }
        chChecker += 2;
        for (int i = 0; i < tmp.length; i++) {
            if (i == (chChecker - maxCounter)) {
                checker = i;
            }
        }
        maxCounter++;
        System.out.println("Резултат:\n"+ "Символ:"+ tmp[chChecker-2] + "\nПовторяется:" + maxCounter+" раза\nНачиная с символа под номером:"+ checker);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер задания:");
        int number = sc.nextInt();
        switch (number){
            case 1:{
                zadanie1();
                break;
            }
            case 2:{
                zadanie2();
                break;
            }
            case 3:{
                zadanie3();
                break;
            }
            case 4:{
                zadanie4();
                break;
            }
            case 5:{
                zadanie5();
                break;
            }
            case 6:{
                zadanie6();
                break;
            }
            case 7:{
                zadanie7();
                break;
            }
            case 8:{
                zadanie8();
                break;
            }
            case 9:{
                zadanie9();
                break;
            }
            case 10:{
                zadanie10();
                break;
            }
            case 11:{
                zadanie11();
                break;
            }
            case 12:{
                zadanie12();
                break;
            }
            case 13:{
                zadanie13();
                break;
            }
            case 14:{
                zadanie14();
                break;
            }
            case 15:{
                zadanie15();
                break;
            }
        }
    }
}