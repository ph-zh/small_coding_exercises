/*
Программа не работает — мы пытаемся обратиться к объекту, но он ещё не создан. Исправьте это.
 */

public class Main {
    public static void main(String[] args) {
        Hamster homka = new Hamster();

        System.out.println("Имя: " + homka.name);
    }
}