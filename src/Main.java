/*
Исправьте код таким образом, чтобы метод sayHello() принимал параметр — имя того,
с кем нужно поздороваться. Затем поздоровайтесь с Пикселем и Байтом, используя переменные в main.
 */

public class Main {
    public static void main(String[] args) {
        sayHello("Пиксель");
        sayHello("Байт");
    }

    public static String sayHello(String username) {
        System.out.println("Привет, " + username);
        return username;
    }
}