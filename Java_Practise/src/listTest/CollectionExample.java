package listTest;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
	
	public static void main(String[] args) {
        // Create a List to store Person objects
        List<Person> personList = new ArrayList<>();

        // Add custom Person objects to the List
        personList.add(new Person("Alice", 25));
        personList.add(new Person("Bob", 30));
        personList.add(new Person("Charlie", 35));

        // Iterate over the List and print each Person object
        for (Person person : personList) {
            System.out.println(person);
        }

}
}