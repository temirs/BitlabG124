package streamApi;

import java.util.List;
import java.util.stream.Collectors;

public class PersonFilter {
    List<Person> filterPersons(List<Person> persons) {
        return (List<Person>) persons.stream().filter(s -> s.getCity().equals("Almaty"))
                .filter(s -> s.getAge() > 18).collect(Collectors.toList());
    }
}
