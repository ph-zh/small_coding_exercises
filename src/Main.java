/*

 */
public class Main {
    public static void main(String[] args) {
        long a = 142_858_234;
        long b = 9_123_456_678L;
        long maximum = Long.max(a, b);
        System.out.println("Максимальное значение - " + maximum);

        double c = 0.00175764;
        double d = 0.00138534;
        // возвращенный примитив можно сразу же упаковать в обёртку
        Double minimum = Double.min(c, d);
        System.out.println("Минимальное значение - " + minimum);
    }
}