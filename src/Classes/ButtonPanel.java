package Classes;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ButtonPanel extends JPanel {
    private JButton addTask;
    private JButton clear;
    Border emptyBorder =  BorderFactory.createEmptyBorder();

    ButtonPanel(){
        this.setPreferredSize(new Dimension(400,60));
        addTask = new JButton("Добавить задачу");
        addTask.setBorder(emptyBorder);
        addTask.setFont(new Font("SheriffVenom", Font.PLAIN,20));

        this.add(addTask);

        this.add(Box.createHorizontalStrut(20));
        clear = new JButton("Стереть задачи");
        clear.setBorder(emptyBorder);
        clear.setFont(new Font("SheriffVenom", Font.PLAIN,20));
        this.add(clear);
    }

    public JButton getAddTask(){
        return addTask;
    }

    public JButton getClear(){
        return clear;
    }
}
