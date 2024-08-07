public class Expense {

    //величина траты
    private double value;

    //номер транзакции
    private int transaction;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Integer getTransaction() {
        return transaction;
    }



    //в конструкторе мы сгенерируем уникальный номер транзакции от 0 до 1 000 000
    //с помощью функции Math.random();
    public Expense(double value) {
        this.value = value;
        this.transaction = (int) (Math.random() * 1000000); //реализуйте создание уникального номера транзакции
    }
}