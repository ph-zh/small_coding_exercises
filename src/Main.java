/*
Разбейте вычисление переменной а на четыре последовательные операции. Используйте дополнительную переменную c.
 */
public class Main {
    public static void main(String[] args) {
        int a = 13;
        int b = 3;

        a = ++a - a % b++;
        System.out.println(a + " и " + b);
    }
}