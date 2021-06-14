package Snake;

import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame()
    {
        this.add(new gamepanel());
        this.setTitle("game");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

}
