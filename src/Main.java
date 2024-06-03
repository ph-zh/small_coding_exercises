/*
Байт тем временем налёг на новый корм — съедает по целой пачке в день.
Ветеринар считает, что это не очень полезно, и порекомендовал делить пачку на три дня.
Вы, как обычно, отложили на корм 500 рублей. Подсчитайте с помощью цикла, на сколько дней вам хватит
этих денег, если одна пачка корма для Байта стоит 100 рублей. Ваша программа должна выводить каждый
трёхдневный период и остаток средств к этому моменту:
На 3-й день останется 400 рублей.
На 6-й день останется 300 рублей.
На 9-й день останется 200 рублей.
На 12-й день останется 100 рублей.
На 15-й день останется 0 рублей.
Денег хватит на 15 дней.
 */
public class Main {
    public static void main(String[] args) {
        int money = 500; // Деньги на корм
        int foodPerDay = 100; // Стоимость пачки корма
        int days = 0; // Дни, когда вы сможете покупать корм

        // Здесь опишите цикл, начинаем с 500 рублей
        // Здесь отразите, что вы будете покупать корм каждые три дня
        // Опишите строку вывода
        // Цикл оканчивается здесь
        for (int i = money; i > 0; i = i - foodPerDay) {
            for (int j = days; j <= 15; j = j ++) {
                System.out.println("На " + j + "-й день останется " + (i - foodPerDay) + " рублей.");
            }
        }
        System.out.println("Денег хватит на " + days + " дней.");
    }
}