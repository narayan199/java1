package swing;

import javax.swing.*;
import java.awt.*;

public class myFrame extends JFrame {
    myFrame()
    {
        this.setTitle("hello");
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(450,450);
        ImageIcon image= new ImageIcon("Admin.png");// create imageicon
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(Color.green);
    }
}
