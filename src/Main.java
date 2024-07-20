/*
Допишите код метода, который проверяет, чётное число или нет.
 */
public class Main {
    public static void main(String[] args) {
        int numberToCheck = 11;
        isEven(numberToCheck);
    }

    public static void isEven(int number) {
        if (number % 2 == 0) { // в условии должна быть проверка на чётность
            System.out.println(number + " - чётное");
        } else {
            System.out.println(number + " - нечётное");
        }
    }
}