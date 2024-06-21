/*
Из-за того что мы добавили в класс Hamster конструктор с параметрами,
код из предыдущего урока перестал работать. Перепишите его.
 */
public class Hamster {
    String name;  // Имя
    int age;      // Возраст
    int weight;   // Вес в граммах
    String color; // Цвет

    Hamster(String hamsterName, int hamsterAge, int hamsterWeight, String hamsterColor) {
        name = hamsterName;
        age = hamsterAge;
        weight = hamsterWeight;
        color = hamsterColor;
    }
}
