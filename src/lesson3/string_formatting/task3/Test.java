package lesson3.string_formatting.task3;

public class Test {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Сергей", 1237.122),
                new Employee("Андрей", 803.18311),
                new Employee("Виктор", 1004.1562),
                new Employee("Айбек", 230.998)
        };
        Report.generateReport(employees);
    }
}
