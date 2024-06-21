public class ExpensesManager {
    double[] expenses;

    ExpensesManager() {
        expenses = new double[7];
    }

    /*
    5/ Параметры метода saveExpense внутри класса ExpensesManager изменятся: теперь он должен принимать остаток
    на счёте moneyBeforeSalary, размер траты expense и номер дня недели day, за который нужно её учесть.
     */
    double saveExpense(double moneyBeforeSalary, double expense, int day) {

        // Печать вопросов и считывание ответов оставьте в классе Praktikum
        moneyBeforeSalary = moneyBeforeSalary - expense;
        expenses[day - 1] = expenses[day - 1] + expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }

    void printAllExpenses() {
        for (int i = 0; i < expenses.length; i++) {
            System.out.println("День " + (i + 1) + ". Потрачено " + expenses[i] + " рублей");
        }
    }

    double findMaxExpense() {
        double maxExpense = 0;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > maxExpense) {
                maxExpense = expenses[i];
            }
        }
        return maxExpense;
    }
}