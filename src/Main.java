/*

 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> femaleNames = new ArrayList<>(); // Создайте список
        femaleNames.add("Екатерина");
        femaleNames.add("Мария");
        femaleNames.add("Анна");
        femaleNames.add(1,"Наталья"); // Добавьте имя "Наталья"
        System.out.println(femaleNames); // Распечайте список
    }
}