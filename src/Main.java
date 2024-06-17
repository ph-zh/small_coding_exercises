/*
Переменная называется homka, но хомяка все еще зовут Байт. Измените имя хомяка на Хомку, а заодно отредактируйте
и другие атрибуты: пусть ему будет 1 год, он будет весить 420 грамм, а его цвет будет не рыжий, а чёрный.
 */

public class Main {
    public static void main(String[] args) {
        Hamster homka = new Hamster();

        System.out.println("Имя: " + homka.name);
        System.out.println("Возраст: " + homka.age);
        System.out.println("Вес: " + homka.weight);
        System.out.println("Цвет: " + homka.color);
    }
}