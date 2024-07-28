/*
Это финальный тренажёр по темам «Типы в Java» и «Операции с примитивами». Сразу предупреждаем — он непростой и чтобы его
решить, придётся поломать голову. Однако в нём нет подвоха — задание базируется на пройденном материале, поэтому мы уверены,
что вам по силам его выполнить.
Вам необходимо доработать игру — гонки. Игрок-пользователь соревнуется с противником, сгенерированным компьютером. Победитель
определяется по сравнению характеристик. Действуйте по пунктам:

1/ Внимательно прочитайте код. Разберитесь, как он устроен.
2/ Допечатайте все нужные характеристики — для этого нужно обратиться к полям класса.
3/ Реализуйте методы:
4/ Параметры авто игрока будут подгружаться из отдельного сервиса, хранение данных в котором отличается от используемого в игре.
Метод createCarByProperties(CarProperties carProperties), должен конвертировать параметры в нужные типы и возвращает экземпляр
класса Car.
5/ Метод Integer getNitroLevel(int nitroLevel) должен возвращать значение nitroLevel. Если nitroLevel равен нулю — тогда нужно
вернуть null.
6/ Метод makeRace(Car userCar, Car opponentCar, int distance) должен определять победителя и возвращать количество полученных
или проигранных очков:
- Если гоночная дистанция — переменная distance — меньше или равна 15 километрам, то победителем объявляется тот игрок,
у автомобиля которого больше ускорение — поле acceleration. Если дистанция больше 50 километров, то выигрывает тот,
у автомобиля которого наибольшая максимальная скорость — поле maxSpeed.
- В случае победы игрока метод возвращает количество очков, равное наибольшему из максимальных скоростей участников.
- Если по первому условию определить победителя не удалось, сравниваются ускорения игроков. Если они равны, объявляется
ничья и метод возвращает 0 очков.
- Если и ничью определить не удалось, сравнивается уровень закиси азота. Если он строго больше, то метод возвращает 0 очков.
Если нет, метод возвращает -100 очков.
7/ Метод changePointAndDistance(...) должен менять количество очков на переданный аргумент points и увеличивать количество
пройденных километров на аргумент distance.

Если что-то не получается — на помощь придут подсказки и наставник. Ничего не бойтесь и гоните на полной скорости!
 */
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarProperties userCarProperties =
                new CarProperties(
                        "100",
                        0.7f,
                        2
                );

        Car userCar = createCarByProperties(userCarProperties);
        System.out.println("Давно тебя не было в Яндекс.Гонках!");
        System.out.println("Характеристики твоего автомобиля:");
        // Напечатайте характеристики автомобиля игрока
        System.out.println("- Максимальная скорость: " + userCar.maxSpeed);
        System.out.println("- Ускорение: " + userCar.acceleration);
        System.out.println("- Закись азота: " + userCar.nitroLevel);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Что выберете?");
            System.out.println("1 - Устроить заезд");
            System.out.println("2 - Показать статистику");
            System.out.println("3 - Закончить игру");
            int command = scanner.nextInt();

            if (command == 1) {
                Car opponentCar = generateOpponentCar();
                System.out.println("Характеристики автомобиля соперника:");
                // Напечатайте характеристики автомобиля соперника
                System.out.println("- Максимальная скорость: " + opponentCar.maxSpeed);
                System.out.println("- Ускорение: " +opponentCar.acceleration);
                System.out.println("- Закись азота: " + opponentCar.nitroLevel);

                int distance = generateInt(5, 70);
                System.out.println("Гонка будет проходить на дистанции: " + distance + " км.");

                int points = makeRace(userCar, opponentCar, distance);
                changePointAndDistance(points); // передайте в метод аргументы

            } else if (command == 2) {
                // Напечатайте количество заработанных очков и пройденных километров
                System.out.println("- Количество заработанных очков: " + userCar.score);
                System.out.println("- Пройдено километров на этом авто: " + userCar.kilometersTravelled);
            } else if (command == 3) {
                System.out.println("Увидимся!");
                break;
            }
        }
    }

    /*
    7/ Метод changePointAndDistance(...) должен менять количество очков на переданный аргумент points и увеличивать количество
пройденных километров на аргумент distance.
     */
    private static void changePointAndDistance(int points) { // реализуйте метод
        // В результате выполнения метода у userCar количество очков должно увеличиться
        // на значение points, пройденное расстояние - на значение distance.
        points = points + 1;
    }

    private static int makeRace(Car userCar, Car opponentCar, int distance) {
        printFlag();
        // Напишите логические выражения для определения победителя
        boolean shortRaceWin = distance <= 15 && userCar.acceleration > opponentCar.acceleration; // на короткой дистанции
        boolean longRaceWin = distance > 50 && userCar.maxSpeed > opponentCar.maxSpeed; // на длинной дистанции

        if (shortRaceWin || longRaceWin) { // если победил на короткой или на длинной дистанции
            System.out.println("Вы выиграли!");
            // Найдите и верните наибольшее из максимальных скоростей
            return Integer.max((int)userCar.maxSpeed,(int)opponentCar.maxSpeed);
        } else if (userCar.acceleration == opponentCar.acceleration) { // Уровни ускорения должны быть равны
            System.out.println("Ничья!");
            return 0;
        } else {
            // Сравните уровни закиси азота
            if (getNitroLevel(userCar.nitroLevel) > getNitroLevel(opponentCar.nitroLevel)) {
                System.out.println("Вы проиграли, но благодаря закиси азота сохранили очки.");
                return 0;
            } else {
                System.out.println("Вы проиграли(");
                return -100;
            }
        }
    }
    private static void printFlag() { // Метод печатает флаг
        System.out.println("_\n" +
                "\\'-,,.\n" +
                " \\    \\\n" +
                "  \\-..,\\\n" +
                "   \\\n" +
                "    \\\n");
    }
    // Метод генерирует авто противника
    private static Car generateOpponentCar() {
        // С помощью метода generateInt() генерируем число от 75 до 125
        double maxSpeed = generateInt(75, 125);
        // Чтобы создать число от 0.4 до 1, с помощью метода generateInt() генерируем число от 4 до 10,
        // после чего делим его на 10
        float acceleration = generateInt(4, 10) / 10.0f;
        int score = 0;
        // С помощью метода generateInt() генерируем число от 1 до 5
        Integer nitroLevel = generateInt(1, 5);

        return new Car(
                maxSpeed,
                acceleration,
                score,
                nitroLevel
        );
    }

    // Этот метод создаёт случайное число в промежутке от from до to
    private static int generateInt(int from, int to) {
        int diapason = to - from;
        int offence = new Random().nextInt(diapason);
        return from + offence;
    }

    private static Car createCarByProperties(CarProperties carProperties) {
        // Конвертируйте параметры в нужные типы
        double maxSpeed = Double.parseDouble(carProperties.maxSpeed);
        float acceleration = (float) carProperties.acceleration;
        int score = carProperties.initialScore;
        Integer nitroLevel = carProperties.nitroLevel;

        return new Car( // Метод возвращает экземпляр класса Car
                maxSpeed,
                acceleration,
                score,
                nitroLevel
        );
    }

    private static Integer getNitroLevel(int nitroLevel) {
        // Пропишите логику по конвертации параметра nitroLevel
        if(nitroLevel == 0) {
            return null;
        } else {
            return nitroLevel;
        }
    }
}