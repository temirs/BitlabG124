package lyambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        Collections.addAll(list, new Person("Frank",24),
                new Person("Drogba", 25),
                new Person("Petr", 27),
                new Person("Hazard", 17));

        Database.printYoungPeopleNames(list);
    }
}
