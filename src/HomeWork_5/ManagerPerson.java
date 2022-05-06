package HomeWork_5;

/**
 * Java 1
 *@author Pavel Kirilenko
 *@version 05.05.2022
 */

public class ManagerPerson extends Person {

    public ManagerPerson(String name, String position, String email, String phone, int salary, int years) {
        super(name, position, email, phone, salary, years);
    }

    public static void main(String[] args) {
        Person[] arrPerson = new Person[5];
        arrPerson[0] = new Person("Kozlov", "DevOps", "kozlov@compani.ru", "+7777777777", 120000, 42);
        arrPerson[1] = new Person("Sidorov", "DS", "sidorov@compani.ru", "+7777777777", 130000, 38);
        arrPerson[2] = new Person("Rogov", "QA", "rogov@compani.ru", "+7777777777", 80000, 25);
        arrPerson[3] = new Person("Baranov", "Bekend", "baranov@compani.ru", "+7777777777", 150000, 45);
        arrPerson[4] = new Person("Sinicin", "Fronted", "sinicin@compani.ru", "+7777777777", 150000, 35);

        filtrationYears(arrPerson, 40);
    }



}
