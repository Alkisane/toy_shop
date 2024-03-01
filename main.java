java
// Создание класса Домашнее животное
public class Animal {
    private String id;
    private String type;
    private String name;
    private int age;

    // Конструктор класса Домашнее животное
    public Animal(String id, String type, String name, int age) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.age = age;
    }

    // Методы класса Домашнее животное
    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Создание класса Собаки, наследующего класс Домашнее животное
public class Dog extends Animal {
    private String breed;
    private String temperament;

    // Конструктор класса Собаки
    public Dog(String id, String type, String name, int age, String breed, String temperament) {
        super(id, type, name, age);
        this.breed = breed;
        this.temperament = temperament;
    }

    // Методы класса Собаки
    public String getBreed() {
        return breed;
    }

    public String getTemperament() {
        return temperament;
    }
}

// Создание класса Кошки, наследующего класс Домашнее животное
public class Cat extends Animal {
    private String breed;
    private String color;

    // Конструктор класса Кошки
    public Cat(String id, String type, String name, int age, String breed, String color) {
        super(id, type, name, age);
        this.breed = breed;
        this.color = color;
    }
     // Методы класса Кошки
    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }
}

// Создание класса Хомяки, наследующего класс Домашнее животное
public class Hamster extends Animal {
    private String species;
    private String color;

    // Конструктор класса Хомяки
    public Hamster(String id, String type, String name, int age, String species, String color) {
        super(id, type, name, age);
        this.species = species;
        this.color = color;
    }

    // Методы класса Хомяки
    public String getSpecies() {
        return species;
    }

    public String getColor() {
        return color;
    }
}

// Создание класса Лошади, наследующего класс Домашнее животное
public class Horse extends Animal {
    private String breed;
    private int height;

    // Конструктор класса Лошади
    public Horse(String id, String type, String name, int age, String breed, int height) {
        super(id, type, name, age);
        this.breed = breed;
        this.height = height;
    }

    // Методы класса Лошади
    public String getBreed() {
        return breed;
    }

    public int getHeight() {
        return height;
    }
}

// Создание класса Ослы, наследующего класс Домашнее животное
public class Donkey extends Animal {
    private String gender;
    private int weight;

    // Конструктор класса Ослы
    public Donkey(String id, String type, String name, int age, String gender, int weight) {
        super(id, type, name, age);
        this.gender = gender;
        this.weight = weight;
    }

    // Методы класса Ослы
    public String getGender() {
        return gender;
    }

    public int getWeight() {
        return weight;
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание экземпляра класса Собаки
        Dog dog = new Dog("1", "собака", "Бобик", 3, "дворняга", "игривый");

        // Вывод информации о собаке
        System.out.println("ID: " + dog.getId());
        System.out.println("Тип: " + dog.getType());
        System.out.println("Имя: " + dog.getName());
        System.out.println("Возраст: " + dog.getAge());
        System.out.println("Порода: " + dog.getBreed());
        System.out.println("Характер: " + dog.getTemperament());

        // Создание экземпляра класса Кошки
        Cat cat = new Cat("2", "кошка", "Мурка", 5, "мейн-кун", "трехцветный");

        // Вывод информации о кошке
        System.out.println("ID: " + cat.getId());
        System.out.println("Тип: " + cat.getType());
        System.out.println("Имя: " + cat.getName());
        System.out.println("Возраст: " + cat.getAge());
        System.out.println("Порода: " + cat.getBreed());
        System.out.println("Окрас: " + cat.getColor());

        // Создание экземпляра класса Хомяки
        Hamster hamster = new Hamster("3", "хомяк", "Чижик", 1, "золотой", "рыжий");
            // Вывод информации о хомяке
        System.out.println("ID: " + hamster.getId());
        System.out.println("Тип: " + hamster.getType());
        System.out.println("Имя: " + hamster.getName());
        System.out.println("Возраст: " + hamster.getAge());
        System.out.println("Вид: " + hamster.getSpecies());
        System.out.println("Цвет: " + hamster.getColor());

        // Создание экземпляра класса Лошади
        Horse horse = new Horse("4", "лошадь", "Рыжик", 8, "арабская", 170);

        // Вывод информации о лошади
        System.out.println("ID: " + horse.getId());
        System.out.println("Тип: " + horse.getType());
        System.out.println("Имя: " + horse.getName());
        System.out.println("Возраст: " + horse.getAge());
        System.out.println("Порода: " + horse.getBreed());
        System.out.println("Рост: " + horse.getHeight());

        // Создание экземпляра класса Ослы
        Donkey donkey = new Donkey("5", "осел", "Инокентий", 4, "мужской", 200);

        // Вывод информации о осле
        System.out.println("ID: " + donkey.getId());
        System.out.println("Тип: " + donkey.getType());
        System.out.println("Имя: " + donkey.getName());
        System.out.println("Возраст: " + donkey.getAge());
        System.out.println("Пол: " + donkey.getGender());
        System.out.println("Вес: " + donkey.getWeight());
    }
}
