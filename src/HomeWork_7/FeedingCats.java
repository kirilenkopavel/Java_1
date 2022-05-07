package HomeWork_7;

/**
 * Java 1
 *@author Pavel Kirilenko
 *@version 07.05.2022
 */

public class FeedingCats {
    public static void main(String[] args) {

        Plate plate = new Plate(18);

        Cat[] arrCat = {
                new Cat("Barsik", 7, false),
                new Cat("Vaska", 5, false),
                new Cat("Belyash", 10, false),
                new Cat("Pushok", 4, false)
        };

        feedingCats(arrCat, plate);
        System.out.println("Food in a plate " + plate);

        plate.increaseFood(10);
        System.out.println("Added food. Food in a plate " + plate);

        feedingCats(arrCat, plate);
        System.out.println("Food in a plate " + plate);
    }

    static void feedingCats(Cat[] arrCat, Plate plate) {
        for (Cat cat : arrCat) {
            cat.eat(plate);
            System.out.println(cat);
        }
    }
}
