package PS5;

import java.util.*;
import java.util.stream.Collectors;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
        Set<Person> persons = new HashSet<>();

        // Accept information for 6 persons
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            persons.add(new Person(id, name, age, salary));
        }

        // 1. Print all persons using Streams and Method Reference
        System.out.println("1. All Persons:");
        persons.stream().forEach(System.out::println);

        // 2. Print all persons sorted by id in ascending order
        System.out.println("\n2. Persons sorted by ID in ascending order:");
        persons.stream()
                .sorted(Comparator.comparingInt(Person::getId))
                .forEach(System.out::println);

        // 3. Print all persons sorted by name in ascending order
        System.out.println("\n3. Persons sorted by Name in ascending order:");
        persons.stream()
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);

        // 4. Print all persons sorted by names in descending order
        System.out.println("\n4. Persons sorted by Name in descending order:");
        persons.stream()
                .sorted(Comparator.comparing(Person::getName).reversed())
                .forEach(System.out::println);

        // 5. Print all persons whose Name starts with J
        System.out.println("\n5. Persons whose Name starts with J:");
        persons.stream()
                .filter(person -> person.getName().startsWith("J"))
                .forEach(System.out::println);

        // 6. Print the count of persons
        System.out.println("\n6. Count of Persons: " + persons.stream().count());

        // 7. Print the Max salary
        System.out.println("7. Max Salary: " + persons.stream().mapToDouble(Person::getSalary).max().orElse(0.0));

        // 8. Print the Min salary
        System.out.println("8. Min Salary: " + persons.stream().mapToDouble(Person::getSalary).min().orElse(0.0));

        // 9. Print the average of all salaries
        System.out.println("9. Average Salary: " + persons.stream().mapToDouble(Person::getSalary).average().orElse(0.0));

        // 10. Print the sum of all salaries
        System.out.println("10. Sum of Salaries: " + persons.stream().mapToDouble(Person::getSalary).sum());

        // 11. Print the First Person whose Name starts with J using Streams - filter and findFirst method
        System.out.println("\n11. First Person whose Name starts with J: " +
                persons.stream().filter(person -> person.getName().startsWith("J")).findFirst().orElse(null));

        // 12. Check whether all the persons age is greater than 10 using Streams – allMatch method
        System.out.println("\n12. All persons age greater than 10: " +
                persons.stream().allMatch(person -> person.getAge() > 10));

        // 13. Check whether all the persons age is greater than 50 using Streams – noneMatch method
        System.out.println("13. All persons age greater than 50: " +
                persons.stream().noneMatch(person -> person.getAge() > 50));

        // 14. Print the average of all salaries using Streams and Collectors
        System.out.println("14. Average Salary using Collectors: " +
                persons.stream().collect(Collectors.averagingDouble(Person::getSalary)));

        // 15. Print all persons details group by salary using Streams and Collectors
        System.out.println("\n15. Persons grouped by Salary:");
        Map<Double, List<Person>> personsBySalary = persons.stream()
                .collect(Collectors.groupingBy(Person::getSalary));
        personsBySalary.forEach((salary, personList) -> {
            System.out.println("Salary: " + salary);
            personList.forEach(System.out::println);
        });

        // 16. Print all names after joining whose age is greater than 18 using Streams and Collectors
        System.out.println("\n16. Names of persons older than 18 joined: " +
                persons.stream().filter(person -> person.getAge() > 18)
                        .map(Person::getName)
                        .collect(Collectors.joining(", ")));

        // 17. Print the Min, Max, Count, Average, and Sum of all persons using Statistics and Collectors
        System.out.println("\n17. Statistics of Salaries:");
        DoubleSummaryStatistics salaryStatistics = persons.stream()
                .collect(Collectors.summarizingDouble(Person::getSalary));
        System.out.println("Min: " + salaryStatistics.getMin());
        System.out.println("Max: " + salaryStatistics.getMax());
        System.out.println("Count: " + salaryStatistics.getCount());
        System.out.println("Average: " + salaryStatistics.getAverage());
        System.out.println("Sum: " + salaryStatistics.getSum());

        // 18. Determine the oldest person among all using Streams and Reduce
        System.out.println("\n18. Oldest Person using Streams and Reduce: " +
                persons.stream()
                        .reduce((p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2)
                        .orElse(null));

        // 19. Add n number of multiple records and print the time taken with sequential using stream
        int n = 1000000; // Adjust the value of n as needed
        List<Person> additionalPersons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            additionalPersons.add(new Person(i, "Person" + i, 25, 50000.0));
        }

        long startTime = System.currentTimeMillis();
        persons.addAll(additionalPersons);
        long endTime = System.currentTimeMillis();
        System.out.println("\n19. Time taken to add " + n + " records sequentially: " + (endTime - startTime) + " ms");

        // 20. Print the time taken with parallel using parallelStream
        startTime = System.currentTimeMillis();
        persons.parallelStream().forEach(person -> {}); // Perform a dummy operation
        endTime = System.currentTimeMillis();
        System.out.println("20. Time taken with parallel stream: " + (endTime - startTime) + " ms");

	}

}
