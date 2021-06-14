package swing;

import javax.swing.*;
import java.awt.*;

public class panel {
    public static void main(String[] args) {
        JLabel label = new JLabel("red");
        JLabel label1 = new JLabel("blue");
        JLabel label2 = new JLabel("green");
        JPanel panel = new JPanel();
        panel.setBackground(Color.red);
        panel.setBounds(0,0,100,100);
        panel.add(label);
        JPanel panel1= new JPanel();
        panel1.setBackground(Color.blue);
        panel1.setBounds(100,0,100,100);
        panel1.add(label1);
        JPanel panel2= new JPanel();
        panel2.setBackground(Color.green);
        panel2.setBounds(200,0,100,100);
        panel2.add(label2);
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(450,500);
        f.setLayout(null);
        f.add(panel);
        f.add(panel1);
        f.add(panel2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
