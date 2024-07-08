/*
Как видим, можно вычислить три признака високосного года:

Год является високосным, если год делится на 4 без остатка.
Год не является високосным, если он полностью делится и на 4, и на 100.
Год является високосным, если он делится и на 4, и на 100, и на 400.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year = 0;
        System.out.println(leapYearCount(year));
    }

    public static int leapYearCount(int year) {
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();

        if (year % 400 == 0) {
            if (year % 100 == 0) {
                if (year % 4 == 0) {
                    System.out.println("Leap Year");
                    return year;
                }
            }
        } else if (year % 100 == 0) {
            if (year % 4 == 0) {
                System.out.println("Not Leap Year");
                return year;
            }
        } else if (year % 4 == 0) {
            System.out.println("Not Leap Year");
            return year;
        }
        System.out.println("Not Leap Year");
        return year;
    }
}
