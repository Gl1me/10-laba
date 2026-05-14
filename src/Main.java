import java.util.Arrays;

class Main {
    static void main(String[] args) {
        Animal dog = new Dog("Собака", "Мясо", "Дом", "лабрадор");
        Animal cat = new Cat("Кошка", "Рыба", "Квартира", "пятнистую");
        Animal horse = new Horse("Лошадь", "Сено", "Ферма", "смоляная");
        Veterinarian vet = new Veterinarian();
        dog.makeNoise();
        dog.eat();
        vet.treatAnimal(dog);

        cat.makeNoise();
        cat.eat();
        vet.treatAnimal(cat);

        horse.makeNoise();
        horse.eat();
        vet.treatAnimal(horse);
    }
}

class Animal {
    String name;
    String food;
    String location;

    Animal(String name, String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println(this.name + " кричит.");
    }

    public void eat() {
        System.out.println(this.name + " ест.");
    }

    public void sleep() {
        System.out.println(this.name + " спит.");
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String food, String location, String breed) {
        super(name, food, location);
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println(this.name + " породы " + this.breed + ".");
    }

    @Override
    public void eat() {
        System.out.println(this.name + " ест.");
    }
}

class Cat extends Animal {
    String wool;

    Cat(String name, String food, String location, String wool) {
        super(name, food, location);
        this.wool = wool;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println(this.name + " имеет " + this.wool + " шерсть.");
    }

    @Override
    public void eat() {
        System.out.println(this.name + " ест.");
    }
}

class Horse extends Animal {
    String mane;

    Horse(String name, String food, String location, String mane) {
        super(name, food, location);
        this.mane = mane;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("У лошади " + this.mane + " грива.");
    }

    @Override
    public void eat() {
        System.out.println(this.name + " ест.");
    }
}

class Veterinarian {
    public void treatAnimal(Animal animal) {
        System.out.println("Еда: " + animal.food + ". Локация: " + animal.location + ".");
    }
}