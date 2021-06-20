package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class button extends JFrame{
    JButton button = new JButton("presss me to fuck");
    button() {
        JButton button = new JButton("presss me to fuck");
        button.setText("gg");
        button.setFocusable(false);
        button.setBounds(0,0,400,30);
        button.addActionListener(e-> System.out.println("you fucked me "));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(500,500);
        this.add(button);

    }


    public static void main(String[] args) {
        new button();
    }

}
