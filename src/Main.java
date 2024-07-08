/*
Пирожок в столовой стоит a рублей и b копеек. Определите, сколько рублей и копеек нужно заплатить за n пирожков.
Программа получает на вход три числа: a, b, n.
Программа должна вывести два числа: стоимость покупки в рублях и копейках.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        //double a = scanner.nextDouble();
        //double b = scanner.nextDouble();
        int n = 10;
        double a = 15;
        double b = 2;
        double sumRub = n * a;
        double sumCope = n * b;
        System.out.println(sumRub + " " + sumCope);
    }
}