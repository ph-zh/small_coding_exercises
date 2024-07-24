/*
Вычислите с помощью логического выражения, является ли год високосным по григорианскому календарю.
Для этого нужно проверить три условия:

1. номер года делится без остатка на 400;
или
2. номер года делится без остатка на 4;
и
3. номер года не делится без остатка на 100.

Результат проверки сохраните в переменную isLeapYear и подставьте в ветвление, которое печатает вывод в консоли.
Сообщение о том, что год не високосный должно стоять в первом блоке кода ветвления.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой год вы хотите проверить?");
        int year = scanner.nextInt();

        boolean isLeapYear = ... // Составьте логическое выражение
        ... // Напишите ветвление, где isLeapYear станет условием
        // Используйте фразы для печати:
        // System.out.println("Согласно григорианскому календарю, этот год - не високосный!");
        // System.out.println("Согласно григорианскому календарю, этот год - високосный!");
    }
}