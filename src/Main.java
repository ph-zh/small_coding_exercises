/*
Заполните массив трат за неделю — expenses, используя цикл for. Расходы за каждый день будут определяться случайным образом с помощью
генератора Random с ограничением в 1000. После заполнения массива напечатайте значения его элементов и посчитайте сумму трат за неделю —
также с помощью циклов.
 */
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Объявите пустой массив трат за неделю (7 дней)
        int[] expenses = new int[7];

        Random random = new Random(); // Генерирует случайное число

        // Допишите условие цикла for, чтобы заполнить массив случайными тратами
        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = random.nextInt(1000);
        }

        System.out.println("Траты за неделю:");
        // Выведите с помощью цикла все траты за неделю в виде: "День ... . Потрачено рублей: ..."
        for (int j = 0; j < expenses.length; j++) {
            System.out.println("День " + (j + 1) + ". Потрачено рублей: " + expenses[j]);
        }

        int sum = 0;
        // Посчитайте и выведите сумму трат за неделю — используйте цикл и здесь
        for (int k = 0; k < expenses.length; k++) {
            sum = sum + expenses[k];
        }

        System.out.println("Траты в рублях за неделю: " + sum);
    }
}