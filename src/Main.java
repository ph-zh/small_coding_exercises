/*
Разбейте вычисление переменной а на четыре последовательные операции. Используйте дополнительную переменную c.
 */
public class Main {
    public static void main(String[] args) {
        int a = 13;
        int b = 3;

        a = a + 1;
        int c = a % b;
        a = a - c;
        b = b + 1;
        System.out.println(a + " и " + b);
    }
}