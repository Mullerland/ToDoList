package Classes;

import javax.swing.*;
import java.awt.*;

public class TitleBar extends JPanel {

     TitleBar() {
        this.setPreferredSize(new Dimension(400,80));
        JLabel titleText = new JLabel("To Do List");
        setPreferredSize(new Dimension(200,80));
        titleText.setFont(new Font("SheriffVenom", Font.BOLD, 20));
        titleText.setHorizontalAlignment(JLabel.CENTER);
        this.add(titleText);
    }
}
