package l3.string_formatting.task3;

import java.text.NumberFormat;
import java.util.Locale;

public class Report {
    static public void generateReport(Employee[] employees){
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Отчет о сотрудников:\n\nСотрудник\t\tЗарплата");
        for (Employee employee:
             employees) {
            System.out.printf("%-9s\t%12s\n",
                    employee.fullname(),
                    numberFormat.format(employee.salary()));
        }
    }
}
