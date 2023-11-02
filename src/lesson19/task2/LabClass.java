package lesson19.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class LabClass {
    ArrayList<Student> students = new ArrayList<>();

    LabClass(Student ...students) {
        this.students.addAll(Arrays.asList(students));
    }

    public void sortStudents() {
        students.sort((o1, o2) -> (int) ((o2.getAvg() - o1.getAvg()) * 100));
    }

    public String[][] dataStudents() {
        String[][] data = new String[students.size()][];
        for (int i = 0; i < students.size(); i++) {
            data[i] = students.get(i).studentInformation();
        }
        return data;
    }
}
