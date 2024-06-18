public class Hamster {
    public static void main(String[] args) {
        Hamster bite = new Hamster();
        Hamster ninja = new Hamster();
        Hamster kuzya = new Hamster();
        Hamster paskal = new Hamster();
    }
    //Поля
        String name = "Байт"; // Имя
        int age = 2; // Возраст
        String color = "Рыжий"; // Цвет
        int weight = 350;

        // Методы
        void eat(int foodWeight) {
            weight = weight + foodWeight;
        }

        // Бегать в колесе
        void runInWheel() {
            System.out.println("Бегу-бегу-бегу!");
            weight = weight - 5;
        }

        // Прятать семечки
        void hideSeeds(int seedWeight) {
            System.out.println("Зимой не заголодаю.");
            weight = weight + seedWeight;
        }
}
