package lyambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Database {
    private List<Person> personList = new ArrayList<>();

    void addPerson(Person person) {
        personList.add(person);
    }

    static void printYoungPeopleNames(List<Person> list) {
        List<String> youngPeople = list.stream().filter(s -> s.getAge() >= 18 && s.getAge() <= 30)
                .map(Person::getName).sorted().toList();

        youngPeople.forEach(System.out::println);
    }
}
