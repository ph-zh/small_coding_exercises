/*
Создайте пустой массив с именем expenses, в нём должно быть место для трёх элементов.
Задайте значения каждого из них. Пусть первая трата будет 100 рублей, вторая — 50 рублей, а третья — 200. Используйте тип данных double.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] expenses; // Создайте массив
        expenses = new double[3];
        // Ниже задайте значение элементов массива
        expenses[0] = 100;
        expenses[1] = 50;
        expenses[2] = 200;
    }
}