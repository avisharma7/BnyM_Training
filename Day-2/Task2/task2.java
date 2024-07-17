package Task2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Optional;

class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}

public class task2 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        // Adding persons
        people.add(new Person("Aviral", 23, "Nepalgunj"));
        people.add(new Person("Ramesh", 30, "Kathmandu"));
        people.add(new Person("Aditya", 22, "Pokhara"));
        people.add(new Person("Hari", 28, "delhi"));
        people.add(new Person("krishna", 35, "kolkata"));

        // Filter persons older than 25 and collect their names
        List<String> namesOlderThan25 = people.stream()
                .filter(person -> person.getAge() > 25)
                .map(Person::getName) // Using method reference
                .collect(Collectors.toList());

        System.out.println("People older than 25: " + namesOlderThan25);

        // Find a person named "naina" using Optional
        Optional<Person> optionalDavid = people.stream()
                .filter(person -> "naina".equals(person.getName()))
                .findFirst();

        // Use ifPresent method of Optional to print David's details if found
        optionalDavid.ifPresent(System.out::println); // Using method reference
    }
}

