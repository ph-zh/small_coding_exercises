/*
 */

public class Main {
    public static void main(String[] args) {
        printUserInfo("Катя", 26, "Москва");
        printUserInfo("Серёжа", 40, "Воронеж");
    }

    public static void printUserInfo(String username, int age, String city) {
        System.out.println("Меня зовут " + username + ", я из города " + city + ", мне " + age + " лет.");
    }

}