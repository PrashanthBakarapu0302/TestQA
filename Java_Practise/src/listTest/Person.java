package listTest;
public class Person {
    private String name;
    private int age;

    // Constructor to initialize Person object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Override toString to represent the object as a string
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
