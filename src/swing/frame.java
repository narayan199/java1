package swing;

import javax.swing.*;
import java.awt.*;

public class frame {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(450,450);
        ImageIcon image= new ImageIcon("Admin.png");// create imageicon
        f.setIconImage(image.getImage());
        f.getContentPane().setBackground(Color.green);
    myFrame m = new myFrame();
    }
}
