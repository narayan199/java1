package swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class label {
    public static void main(String[] args) {
        ImageIcon i = new ImageIcon("Admin.png");
        Border border=BorderFactory.createLineBorder(Color.red,3);
        JLabel j = new JLabel("hey enter your name");
      //  j.setBounds(20,50,200,100);
        j.setIcon(i);
        j.setForeground(Color.yellow);
        j.setFont(new Font("italic",Font.BOLD,50));
        j.setBackground(Color.black);
        j.setOpaque(true);
        j.setBorder(border);
        j.setVerticalAlignment(JLabel.TOP);
        JFrame f=new JFrame();
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(450,450);
        f.getContentPane().setBackground(Color.green);
       // f.setLayout(null);
        f.add(j);
        f.pack();
    }
}
