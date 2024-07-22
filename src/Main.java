/*

 */
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 22;
        int c = (--b / 2) - a++ * 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}