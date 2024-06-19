/*
Прочитайте код и расположите имена хомяков в порядке убывания их веса
 */
public class Main {
    public static void main (String[] args) {
        // weight 370 - 4
        Hamster bite = new Hamster(); // Имя Байта менять не нужно
        bite.eat(35);
        for (int i = 0; i < 3; i++) {
            bite.runInWheel();
            System.out.println(bite.weight);
        }
        //weight 290 - 1
        Hamster ninja = new Hamster();
        ninja.name = "Ниндзя";
        ninja.weight = 250;
        ninja.runInWheel();
        if (ninja.weight < 265) {
            ninja.eat(45);
            System.out.println(ninja.weight);
        }

        //weight 345 - 3
        Hamster kuzya = new Hamster();
        kuzya.name = "Кузя";
        kuzya.weight = 450;
        kuzya.weight = 325;
        kuzya.eat(20);
        System.out.println(kuzya.weight);
        //320 - 2
        Hamster paskal = new Hamster();
        paskal.name = "Паскаль";
        paskal.weight = 320;
        System.out.println(paskal.weight);
    }
}


