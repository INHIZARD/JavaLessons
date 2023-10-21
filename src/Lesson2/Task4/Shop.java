package lesson2.task4;

import java.util.ArrayList;
import java.util.List;

public class Shop implements INewComputer {
    private List<Computer> computers = new ArrayList<>();

    @Override
    public void addComputer(Computer computer) {
        computers.add(computer);
        System.out.println("Компьютер добавлен");
    }

    @Override
    public void deleteComputer(Computer computer) {
        for (int i = 0; i < computers.size(); i++){
            if (computer.equals(computers.get(i))) {
                computers.remove(i);
                System.out.println("Компьютер удален");
                return;
            }
        }
        System.out.println("Такого компьютера нет в магазине");
    }

    @Override
    public List<Computer> findComputer(Computer computer) {
        List<Computer> foundComputers = new ArrayList<>();
        for (Computer comp: computers){
            if (computer.equals(comp)) foundComputers.add(comp);
        }
        return foundComputers;
    }

    @Override
    public List<Computer> findComputer(String name) {
        List<Computer> foundComputers = new ArrayList<>();
        for (Computer comp: computers){
            if (name.equals(comp.getName())) foundComputers.add(comp);
        }
        return foundComputers;
    }

    @Override
    public List<Computer> findComputer(int price) {
        List<Computer> foundComputers = new ArrayList<>();
        for (Computer comp: computers){
            if (price == comp.getPrice()) foundComputers.add(comp);
        }
        return foundComputers;
    }

    @Override
    public String toString() {
        return computers.toString();
    }
}
