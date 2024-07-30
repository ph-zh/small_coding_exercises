/*

 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> expenses = new ArrayList<>();  // создали список
        expenses.add(120.47);    // добавили элемент
        expenses.add(290.24);    // добавили элемент
        expenses.add(420.78);    // добавили элемент

        System.out.println("Сейчас в списке: ");
        for (int i = 0; i < expenses.size(); i++) { // i строго меньше размера списка
            // печатаем траты и их индексы в списке
            System.out.println("Трата " + i + ": " + expenses.get(i) + " руб.");
        }
    }
}