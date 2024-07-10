/*

 */
public class Main {
    public static void main(String[] args) {
        Hamster homa = new Hamster(); // не создали объект для переменной homa
        System.out.println(homa); // здесь произойдёт сбой
    }
}

class Hamster {
    String name = "Хома";
    int age = 2;
    double weight = 323.4;
    boolean isFluffy = true;
    String color = "Рыжий";
}