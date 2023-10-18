package Lesson2.Task4;

import java.util.List;

public interface INewComputer {
    void addComputer(Computer computer);
    void deleteComputer(Computer computer);
    List<Computer> findComputer(Computer computer);
    List<Computer> findComputer(String name);
    List<Computer> findComputer(int price);
}
