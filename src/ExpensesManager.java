import java.util.ArrayList;

public class ExpensesManager {
    ArrayList<Expense> expenses;

    ExpensesManager() {
        expenses = new ArrayList<>();
    }

    double saveExpense(double moneyBeforeSalary, double expense) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        expenses.add(new Expense(expense));
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }

    void printAllExpenses() {
        for (int i = 0; i < expenses.size(); i++) {
            Expense exp = expenses.get(i);
            System.out.println("Трата № " + (i + 1) + ". Потрачено " + exp.getValue() + " рублей, код транзакции: " + exp.getTransaction());
        }
    }

    double findMaxExpense() {
        double maxExpense = 0;
        for (Expense exp : expenses) {
            if (exp.getValue() > maxExpense) {
                maxExpense = exp.getValue();
            }
        }
        return maxExpense;
    }

    void removeAllExpenses() {
        expenses.clear();
        System.out.println("Список трат пуст.");
    }

    /*
    метод removeExpense(int transaction) должен проверять, содержится ли указанное пользователем значение в списке.
    Если в списке нет ни одной траты, то нужно сообщить пользователю, что «Список трат пуст». Если трата найдена,
    то её нужно удалить и сообщить об этом. Если указанной суммы расходов в списке нет, то нужно вывести на экран, что «Такой траты нет».
    System.out.println("Список трат пуст.");
    System.out.println("Такой траты нет.");
    System.out.println("Трата удалена!");
     */
    void removeExpense(int transaction, int index) {
        if (expenses.isEmpty()) {
            System.out.println("Список трат пуст.");
        } else {
            if(index < expenses.size()) {
                for(index = 0; index < expenses.size(); index++) {
                    if (expenses.contains(expenses.get(transaction))) {
                        expenses.remove(expenses.get(transaction));
                            System.out.println("Трата удалена!");
                            break;
                    } else {
                        System.out.println("Такой траты нет.");
                    }
                }
            } else {
                System.out.println("Такой траты нет.");
            }
        }
    }
}