package swing;

import javax.swing.*;
import java.awt.*;

public class jlayered {
    public static void main(String[] args) throws Exception {
        JLabel j = new JLabel();
        JLabel j1 = new JLabel();
        JLabel j2= new JLabel();
        j.setBackground(Color.red);
        j.setBounds(0,0,250,250);
        j1.setBackground(Color.red);
        j.setBounds(30,20,250,250);
        j2.setBackground(Color.red);
        j.setBounds(50 ,40,250,250);
        JLayer jLayer= new JLayer();
        jLayer.setBounds(0,0,250,250);
        jLayer.add(j);
        jLayer.add(j1);
        jLayer.add(j2);
        JFrame f=new JFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(450,450);
        f.setLayout(null);
        f.add(jLayer);
    }

}
