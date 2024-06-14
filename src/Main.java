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
        sayHello("Пиксель", "Байт");

        sayEnjoyMeal("Пиксель", "Байт");

        double[] feedExpensesCat = {100.50, 236.0, 510.6, 150.20, 80.0, 172.0, 135.4};
        double[] feedExpensesHamster = {70.50, 146.0, 710.6, 250.20, 83.0, 19.0, 55.4};

        findExpensesSum(feedExpensesCat, feedExpensesHamster);
        System.out.println("Всего на корм было потрачено " + feedExpensesCat);
        System.out.println("Всего на корм было потрачено " + feedExpensesHamster);

        findMaxExpense(feedExpensesCat, feedExpensesHamster);
        System.out.println("Твой самый дорогой корм стоил " + feedExpensesCat);
        System.out.println("Твой самый дорогой корм стоил " + feedExpensesHamster);
    }

    public static void sayHello(String catName, String hamsterName) {
        System.out.println("Привет, " + catName + "!");
        System.out.println("Привет, " + hamsterName + "!");
    }

    public static void sayEnjoyMeal(String catName, String hamsterName) {
        System.out.println("Приятного аппетита, " + catName + "!");
        System.out.println("Приятного аппетита, " + hamsterName + "!");
    }

    public static double findMaxExpense(double[] feedExpensesCat, double[] feedExpensesHamster) {
        double maxFeedExpenseCat = 0;
        for (int i = 0; i < feedExpensesCat.length; i++) {
            if (feedExpensesCat[i] > maxFeedExpenseCat) {
                maxFeedExpenseCat = feedExpensesCat[i];
            }
        }

        double maxFeedExpenseHamster = 0;
        for (int i = 0; i < feedExpensesHamster.length; i++) {
            if (feedExpensesHamster[i] > maxFeedExpenseHamster) {
                maxFeedExpenseHamster = feedExpensesHamster[i];
            }
        }
        return maxFeedExpenseCat;
    }

    public static double findExpensesSum(double[] feedExpensesCat, double[] feedExpensesHamster) {
        double sumFeedCat = 0;
        for (int i = 0; i < feedExpensesCat.length; i++) {
            sumFeedCat = sumFeedCat + feedExpensesCat[i];
        }

        double sumFeedHamster = 0;
        for (int i = 0; i < feedExpensesHamster.length; i++) {
            sumFeedHamster = sumFeedHamster + feedExpensesHamster[i];
        }
        return sumFeedCat;
    }
}