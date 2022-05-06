package HomeWork_5;

public class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int years;

    public Person(String name, String position, String email, String phone, int salary, int years) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.years = years;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + ", position='" + position + ", email='" + email + ", phone='" + phone + ", salary=" + salary + ", years=" + years + '}';
    }

    public int getYears() {
        return years;
    }

    public static void filtrationYears(Person[] arr, int years) {
        for (Person person : arr) {
            if (person.getYears() > years) {
                System.out.println(person);
            }
        }
    }
}
