/*

 */
public class Main {
    public static void main(String[] args) {
        Hamster homa = new Hamster(); // создали объект
        System.out.println("Имя хомяка: " + homa.name);
        System.out.println("Возраст хомяка: " + homa.age);
        System.out.println("Вес хомяка: " + homa.weight);
        System.out.println("Пушистый ли хомяк: " + homa.isFluffy);
        System.out.println("Цвет хомяка: " + homa.color);

    }
}
class Hamster {
    String name; // не проинициализировали четыре поля
    int age;
    double weight;
    boolean isFluffy;
    String color = "Рыжий"; // здесь присвоили значение
}