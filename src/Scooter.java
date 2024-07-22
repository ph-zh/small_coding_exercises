/*
4/ Метод getPrice() должен вычислять текущую стоимость аренды currentPrice. Для этого к числу арендованных скутеров
scootersInUse надо прибавить 1, результат разделить на число доступных скутеров availableScooters.
Полученное частное умножить на добавочную стоимость additionalPrice и прибавить к цене по умолчанию defaultPrice.
5/ Метод rentScooter() должен обрабатывать выдачу самоката и сообщать администратору текущую цену его аренды.
Чтобы это сделать, нужно модифицировать формулу currentPrice — перед проведением расчётов увеличить на единицу значение
переменной scootersInUse, а после их окончания уменьшить на единицу значение переменной availableScooters.
6/ Вычисления в методах getPrice() и rentScooter() необходимо провести одной строкой. Перед выполнением арифметических
выражений в обоих методах нужно проверить наличие доступных самокатов.
7/ Метод returnScooter() должен учитывать возврат самоката: уменьшать на единицу число арендованных самокатов и увеличивать
на единицу число доступных самокатов. При приёме нужно не забыть проверить, есть ли вообще несданные самокаты.
 */

class Scooter {
    int availableScooters;
    int scootersInUse;
    int defaultPrice = 8; // Цена аренды по умолчанию
    int additionalPrice = 5; // Добавочная стоимость при повышенном спросе

    Scooter(int inputAvailableScooters, int inputScootersInUse) {
        availableScooters = inputAvailableScooters;
        scootersInUse = inputScootersInUse;
    }

    void getPrice() {
        if (availableScooters <= 0) { // Проверьте, есть ли доступные самокаты
            System.out.println("Нет доступных самокатов.");
        } else {
            int currentPrice = (scootersInUse / availableScooters * additionalPrice + defaultPrice) + 1; // Посчитайте текущую стоимость проката
            System.out.println("Текущая стоимость проката: " + currentPrice + " руб/мин");
        }
    }

    void rentScooter() {
        if (availableScooters <= 0) { // Проверьте, есть ли доступные самокаты
            System.out.println("Доступных самокатов не осталось.");
        } else {
            int currentPrice = (scootersInUse / availableScooters * additionalPrice + defaultPrice) + 1; /* Посчитайте текущую стоимость проката,
            увеличьте число арендованных самокатов и уменьшите число доступных */
            System.out.println("Выдайте самокат по цене " + currentPrice + " руб/мин");
            System.out.println("Самокатов в аренде: " + scootersInUse);
            System.out.println("Самокатов доступно: " + availableScooters);
        }
    }

    void returnScooter() {
        if(availableScooters >= 1) { // Проверьте, есть ли самокаты в аренде
            System.out.println("Все самокаты уже возвращены.");
        } else {
            // Уменьшите число арендованных самокатов и увеличьте число доступных
            --scootersInUse;
            ++availableScooters;
            System.out.println("Самокат принят.");
            System.out.println("Самокатов в аренде: " + scootersInUse);
            System.out.println("Самокатов доступно: " + availableScooters);
        }
    }
}