package Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class mouse implements MouseListener {
    JFrame frame = new JFrame();
    JLabel jLabel = new JLabel();

    mouse() {
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.addMouseListener(this);
        jLabel.setBounds(0, 0, 100, 50);
        jLabel.setBackground(Color.BLUE);
        jLabel.setOpaque(true);
        frame.add(jLabel);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("mouse click");

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("you press the mouse");
        jLabel.setBackground(Color.cyan);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("you realed the mouse");
        jLabel.setBackground(Color.BLUE);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("you entred a mouse");

    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("you exit a mouse");
    }

    public static void main(String[] args) {
    new mouse();
    }
}