package Interfaces;

interface EmployeeInterface {
    Employee search(String fullName); //возвращает сотрудника по запросу
    Employee oldestEmployee(); // возвращает самого старшего сотрудника
    Employee smallestEmployee(); // возвращает самого младшего сотрудника
    void addEmployee(Employee e); // добавляет сотрудника в массив
    void deleteEmployee(int index); // приравнивает к null данные сотрудника
    void printEmployee(); // выводит только тех сотрудников, у кого данные не null
}
