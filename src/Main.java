/*
Отредактируйте код, который ищет максимальное значение в массиве. Измените массив на список, заполните его элементами
и получите с помощью цикла for самое большое значение.
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        double[] temperatures = new double[4];
        temperatures[0] = 92.3;
        temperatures[1] = 12.4;
        temperatures[2] = 74.1;
        temperatures[3] = 45.0;

        double max = 0;
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > max) {
                max = temperatures[i];
            }
        }
        System.out.println("Самая высокая температура: " + max + " °С.");
    }
}