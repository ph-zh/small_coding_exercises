/*
Прочитайте код. Сейчас программа анализирует расходы на корм одновременно для двух питомцев: кота Пикселя и хомяка
Байта — из-за этого в результатах печати можно запутаться. Декомпозируйте код — разбейте его отдельные методы: sayHello,
sayEnjoyMeal, findMaxExpense и findExpensesSum. Методы с приветствием и пожеланием приятного аппетита должны быть типа void;
методы, касающиеся анализа трат, должны возвращать значение.
У всех методов должны быть параметры. Внутри главного метода main(String[] args) должны остаться массивы с тратами,
вызов методов и вывод результатов трат.
Вызовите методы так, чтобы сначала была напечатана информация про Пикселя, а потом про Байта. Порядок вывода такой:
сперва приветствие, затем стоимость самого дорогого корма и общие траты на него и только потом пожелание приятного аппетита.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] feedExpensesCat = {100.50, 236.0, 510.6, 150.20, 80.0, 172.0, 135.4};
        double[] feedExpensesHamster = {70.50, 146.0, 710.6, 250.20, 83.0, 19.0, 55.4};

        sayHelloCat("Пиксель");
        sayEnjoyMealCat("Пиксель");
        findExpensesSumCat(feedExpensesCat);
        System.out.println("Всего на корм было потрачено " + findExpensesSumCat(feedExpensesCat));
        findMaxExpenseCat(feedExpensesCat);
        System.out.println("Твой самый дорогой корм стоил " + findMaxExpenseCat(feedExpensesCat));

        sayHelloHamster("Байт");
        sayEnjoyMealHamster("Байт");
        findExpensesSumHamster(feedExpensesHamster);
        System.out.println("Всего на корм было потрачено " + findExpensesSumHamster(feedExpensesHamster));
        findMaxExpenseHamster(feedExpensesHamster);
        System.out.println("Твой самый дорогой корм стоил " + findMaxExpenseHamster(feedExpensesHamster));
    }

    public static void sayHelloCat(String catName) {
        System.out.println("Привет, " + catName + "!");
    }

    public static void sayHelloHamster(String hamsterName) {
        System.out.println("Привет, " + hamsterName + "!");
    }

    public static void sayEnjoyMealCat(String catName) {
        System.out.println("Приятного аппетита, " + catName + "!");
    }

    public static void sayEnjoyMealHamster(String hamsterName) {
        System.out.println("Приятного аппетита, " + hamsterName + "!");
    }

    public static double findMaxExpenseCat(double[] feedExpensesCat) {
        double maxFeedExpenseCat = 0;
        for (int i = 0; i < feedExpensesCat.length; i++) {
            if (feedExpensesCat[i] > maxFeedExpenseCat) {
                maxFeedExpenseCat = feedExpensesCat[i];
            }
        }
        return maxFeedExpenseCat;
    }

    public static double findMaxExpenseHamster(double[] feedExpensesHamster) {
        double maxFeedExpenseHamster = 0;
        for (int i = 0; i < feedExpensesHamster.length; i++) {
            if (feedExpensesHamster[i] > maxFeedExpenseHamster) {
                maxFeedExpenseHamster = feedExpensesHamster[i];
            }
        }
        return maxFeedExpenseHamster;
    }

    public static double findExpensesSumCat(double[] feedExpensesCat) {
        double sumFeedCat = 0;
        for (int i = 0; i < feedExpensesCat.length; i++) {
            sumFeedCat = sumFeedCat + feedExpensesCat[i];
        }
        return sumFeedCat;
    }

    public static double findExpensesSumHamster(double[] feedExpensesHamster) {
        double sumFeedHamster = 0;
        for (int i = 0; i < feedExpensesHamster.length; i++) {
            sumFeedHamster = sumFeedHamster + feedExpensesHamster[i];
        }
        return sumFeedHamster;
    }
}