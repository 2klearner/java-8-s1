package PS4;

import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;

class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters for fields
    

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.id, other.id);
    }

    // Override toString, hashCode, and equals methods
    

    public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void printAll(Set<Person> persons) {
        // 1. Print all the persons details using Method Reference
        persons.forEach(System.out::println);
    }

    public static void printSortedByNameAscending(Set<Person> persons) {
        // 2. Print all the persons details by sorting the names in ascending order using Comparator
        persons.stream()
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);
    }

    public static void printSortedByNameDescending(Set<Person> persons) {
        // 3. Print all the persons details by sorting the names in descending order using Comparator
        persons.stream()
                .sorted(Comparator.comparing(Person::getName).reversed())
                .forEach(System.out::println);
    }

    public static void printPersonsAbove25(Set<Person> persons) {
        // 4. Print all the persons details whose age is greater than 25 using Predicate
        persons.stream()
                .filter(person -> person.getAge() > 25)
                .forEach(System.out::println);
    }

    public static void printPersonDetails(Set<Person> persons, Consumer<Person> consumer) {
        // 5. Print the id, name, and salary of each person using Consumer
        persons.forEach(consumer);
    }

    public static void printNamesInUpperCase(Set<Person> persons, Function<Person, String> nameMapper) {
        // 6. Print all the names of persons in Uppercase using Function
        persons.stream()
                .map(nameMapper.andThen(String::toUpperCase))
                .forEach(System.out::println);
    }

    public static void printAppraisalDetails(Set<Person> persons, ToDoubleFunction<Person> appraisalFunction) {
        // 7. Print the names and salary of each person after applying the appraisal of 10% using ToDoubleFunction
        persons.forEach(person -> System.out.println("Name: " + person.getName() +
                ", Salary after 10% appraisal: " + appraisalFunction.applyAsDouble(person)));
    }

    public static void main(String[] args) {
        Set<Person> persons = new TreeSet<>();

        // Populate the TreeSet with person details
        persons.add(new Person(1, "Sahithi", 23, 21500));
        persons.add(new Person(2, "Bhargavi", 21, 30000));
        persons.add(new Person(3, "Abishek", 23, 21000));
        persons.add(new Person(4, "Ganesh", 27, 60000));
        persons.add(new Person(5, "pavan", 30, 80000));

        // Perform the requested operations
        System.out.println("1. Print all persons details:");
        printAll(persons);

        System.out.println("\n2. Print all persons details by sorting names in ascending order:");
        printSortedByNameAscending(persons);

        System.out.println("\n3. Print all persons details by sorting names in descending order:");
        printSortedByNameDescending(persons);

        System.out.println("\n4. Print persons details whose age is greater than 25:");
        printPersonsAbove25(persons);

        System.out.println("\n5. Print id, name, and salary of each person using Consumer:");
        printPersonDetails(persons, person -> System.out.println("Id: " + person.getId() +
                ", Name: " + person.getName() +
                ", Salary: " + person.getSalary()));

        System.out.println("\n6. Print names of persons in uppercase using Function:");
        printNamesInUpperCase(persons, Person::getName);

        System.out.println("\n7. Print names and salary after applying a 10% appraisal using ToDoubleFunction:");
        printAppraisalDetails(persons, person -> person.getSalary() * 1.10);
    }
}
