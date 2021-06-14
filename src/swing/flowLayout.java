package swing;

import javax.swing.*;
import java.awt.*;

public class flowLayout {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(450, 450);
        f.setLayout(new FlowLayout(FlowLayout.LEFT,0,10));


        f.add(new JButton("1"));
        f.add(new JButton("2"));
        f.add(new JButton("3"));
        f.add(new JButton("4"));
        f.add(new JButton("5"));
        f.add(new JButton("6"));
        f.add(new JButton("7"));
        f.add(new JButton("8"));
        f.add(new JButton("9"));
        f.add(new JButton("10"));
        f.add(new JButton("11"));
        f.add(new JButton("12"));

    }
}
