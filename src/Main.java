/*
На одной строчке через пробел записаны два целых числа: длина и ширина прямоугольника.
Вычислите его площадь и периметр (именно в таком порядке). Результат выведите на разных строках
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int length = scanner.nextInt();
        int square = width * length;
        int perimeter = 2 * (width + length);
        System.out.println(square);
        System.out.println(perimeter);
    }
}