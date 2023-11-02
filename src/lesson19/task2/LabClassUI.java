package lesson19.task2;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;

public class LabClassUI extends JFrame {

    private static final String ADD = "add button";
    private static final String DELETE = "delete button";

    public LabClassUI() {
        super("Список студентов");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        LabClass data = new LabClass(
                new Student("Иванов Иван Иванович", 5, 4, 3),
                new Student("Николаев Николай Николаевич", 4, 4, 4),
                new Student("Магомедов Магомед Магомедович", 3, 3, 5),
                new Student("Александров Александр Александрович", 2, 5, 5),
                new Student("Андреев Андрей Андреевич", 3, 4, 3)
        );
        data.sortStudents();
        String[] columnNames = {"Студент", "Информатика", "Математика", "Русский язык", "Средний балл"};
        JTable table = new JTable(data.dataStudents(), columnNames);
        table.setDefaultEditor(Object.class, null);

        JTableHeader header = table.getTableHeader();
        header.setBackground(Color.PINK);
        header.setReorderingAllowed(false);
        header.setResizingAllowed(false);

        JButton addButton = new JButton("Добавить студента");
        addButton.setName(ADD);
        addButton.setBackground(Color.GREEN);
        addButton.setBorderPainted(true);
        addButton.setContentAreaFilled(true);
        addButton.addActionListener(new AddAction());

        JButton deleteButton = new JButton("Удалить студента");
        addButton.setName(DELETE);
        deleteButton.setBackground(Color.RED);
        deleteButton.setBorderPainted(true);
        deleteButton.setContentAreaFilled(true);

        JPanel buttons = new JPanel();
        buttons.add(addButton, BorderLayout.EAST);
        buttons.add(deleteButton, BorderLayout.EAST);
        getContentPane().add(buttons, BorderLayout.NORTH);
        getContentPane().add(new JScrollPane(table), BorderLayout.CENTER);
        setBounds(200, 200, 630, 450);
        setVisible(true);
    }

    static class AddAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            JDialog addDialog = new JDialog();
            addDialog.setDefaultCloseOperation(HIDE_ON_CLOSE);



            addDialog.setTitle("Новый студент");
            addDialog.setBounds(200, 200, 500, 300);
            addDialog.setVisible(true);
        }
    }
}
