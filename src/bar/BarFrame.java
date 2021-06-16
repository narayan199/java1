package bar;

import javax.swing.*;

public class BarFrame extends JFrame {

    BarFrame()
    {
        this.add(new BarPanel());
        this.setTitle("BAR");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

}
