/*

 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> expenses = new ArrayList<>();
        expenses.add(120.23);
        expenses.add(290.32);
        expenses.add(420.03);

        System.out.println("Сейчас в списке: ");
        for (Double exp : expenses) {
            System.out.println("Трата на сумму " + exp + " руб.");
        }
    }
}