package streamApi;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeStream {
    static void printUniqueLastNames(List<Employee> employees) {
        employees.stream().map(Employee::getLastName).distinct().sorted().forEach(System.out::println);
    }

    static double calculateAverageSalaryOfEmployeesYoungerThan30( List<Employee> employees) {
        return employees.stream().filter(s -> s.getAge() < 30).map(Employee::getSalary).mapToDouble(Double::doubleValue).average().orElseThrow();
    }

    static double findMaximumSalaryOfEmployeesOlderThan50( List<Employee> employees) {
        return employees.stream().filter(s -> s.getAge() > 50).map(Employee::getSalary).mapToDouble(Double::doubleValue).max().orElseThrow();
    }

    static void printAverageSalaryByAge(List<Employee> employees) {
        Map<Integer, Double> ageSalary = employees.stream().collect(Collectors.groupingBy(Employee::getAge, Collectors.averagingDouble(Employee::getSalary)));
        ageSalary.forEach((s, s1) -> System.out.println("Average salary for age " + s + ": " + s1));
    }
}
