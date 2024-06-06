/*

 */
public class Main {
    public static void main(String[] args) {
        int foodWeight = 500; // Количество корма

        while (foodWeight >= 10) { // Условие работы цикла - пока осталась хотя бы одна порция
            foodWeight = foodWeight - 10; // Байт съедает 10 грамм корма за раз
        }

        System.out.println("Корм закончился! Пора идти в магазин!");
    }
}