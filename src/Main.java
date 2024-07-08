/*
Дано целое число n. Выведите следующее за ним четное число.
При решении этой задачи нельзя использовать условную инструкцию if и циклы.
Подсказка: Подумайте, что будет оставаться в остатке при делении на 2 у чётных и у нечётных чисел.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 2;
        x = n - (n % x) + 2;
        System.out.println(x);
    }
}