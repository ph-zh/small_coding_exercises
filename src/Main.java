/*
Дополните код так, чтобы теперь существовало два самостоятельных кота.
Первый с именем Роджер, второй с именем Барсик. Обратите внимание: новый код можно добавлять только в указанной строке.
Менять остальные строки не следует.
 */
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");
        Cat cat2 = cat1;
        // вставьте код сюда
        cat1 = new Cat("Роджер");
        System.out.println("Кот 1: " + cat1.name + ", кот 2: " + cat2.name);
    }
}

class Cat {
    String name;

    public Cat(String catName) {
        name = catName;
    }
}