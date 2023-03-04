public class Person {
    String name;
    int age;

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Fuad";
        person1.age = 21;

        Person person2 = new Person();
        person2.name = "MK";
        person2.age = 22;

        System.out.println("Person 1:");
        System.out.println("Name: " + person1.name);
        System.out.println("Age: " + person1.age);

        System.out.println("Person 2:");
        System.out.println("Name: " + person2.name);
        System.out.println("Age: " + person2.age);
    }
}