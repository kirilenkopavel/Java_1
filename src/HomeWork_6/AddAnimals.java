package HomeWork_6;

/**
 * Java 1
 *@author Pavel Kirilenko
 *@version 06.05.2022
 */

public abstract class AddAnimals extends Animals {


    public AddAnimals(String name, int limitRun, int limitSwim) {
        super(name, limitRun, limitSwim);
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 200, -1);
        Dog dog = new Dog("Sharik", 500, 10);

        InAnimals[] animals = {cat, dog};
        for(InAnimals animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(150));
            System.out.println(animal.run(300));
            System.out.println(animal.run(500));
            System.out.println(animal.swim(7));
            System.out.println(animal.swim(20));
        }
        System.out.println("Animals were created: " + Animals.getNumber());
    }
}
