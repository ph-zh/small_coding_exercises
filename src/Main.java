/*
Чем больше уроков и учебных задач, тем больше выпитых чашек кофе и переменных в коде.
 На этой неделе ваш одногруппник Игорь прошёл 8 уроков, решил 6 задач и выпил 3 чашки кофе.
 Определите, сколько переменных он объявил в коде — решите пример, используя математический порядок действий.
 */
public class Main {
    public static void main(String[] args) {
        int classes = 8;
        int tasks = 6;
        int coffeeCups = 3;
        int variables = coffeeCups - classes * tasks + tasks / coffeeCups + (classes + coffeeCups) * tasks;
        System.out.println(variables);
    }
}