/*
Хьюстон, у нас проблемы! Сломался алгоритм обратного отсчёта на ракете SpaceY! Из центра управления есть доступ только к одной
строке кода — строке печати в теле цикла. Исправьте её так, чтобы в консоли появились числа от 7 до 1.
 */
public class Main {
    public static void main(String[] args) {
        int countDown = 8;
        for (int i = 0; i < 7; i++) {
            System.out.println(--countDown); // Исправьте эту строку
        }
        System.out.println("Вперёд!");
    }
}