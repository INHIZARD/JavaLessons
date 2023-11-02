package lesson19.task2;

public class Student {
    private String name;
    private int informatics;
    private int math;
    private int russian;
    private double avg;

    Student(String name, int informatics, int math, int russian) {
        this.name = name;
        this.informatics = informatics;
        this.math = math;
        this.russian = russian;
        avg = (informatics + math + russian) / 3.;
    }

    public double getAvg() {
        return avg;
    }

    public String[] studentInformation() {
        return new String[] {
                name,
                String.valueOf(informatics),
                String.valueOf(math),
                String.valueOf(russian),
                String.format("%.2f", avg)
        };
    }
}
