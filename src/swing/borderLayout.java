package swing;

import javax.swing.*;
import java.awt.*;

public class borderLayout {
    public static void main(String[] args) {

        JFrame f=new JFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(450,450);
        f.setLayout(new BorderLayout(10,10));

        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();
        JPanel panel3=new JPanel();
        JPanel panel4=new JPanel();
        JPanel panel5=new JPanel();


        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.blue);
        panel5.setBackground(Color.magenta);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(70,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));
        f.add(panel1,BorderLayout.NORTH);
        f.add(panel2,BorderLayout.WEST);
        f.add(panel3,BorderLayout.EAST);
        f.add(panel4,BorderLayout.SOUTH);
        f.add(panel5,BorderLayout.CENTER);

        //sub panel
        JPanel panel10=new JPanel();
        JPanel panel11=new JPanel();
        JPanel panel12=new JPanel();
        panel10.setBackground(Color.cyan);
        panel11.setBackground(Color.black);
        panel12.setBackground(Color.red);
        panel10.setPreferredSize(new Dimension(20,50));
        panel11.setPreferredSize(new Dimension(20,50));
        panel12.setPreferredSize(new Dimension(20,50));


        panel5.setLayout(new BorderLayout(5,5));
        panel5.add(panel10,BorderLayout.CENTER);
        panel5.add(panel11,BorderLayout.EAST);
        panel5.add(panel12,BorderLayout.SOUTH);

    }

}
