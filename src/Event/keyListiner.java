package Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyListiner implements KeyListener {
    JFrame frame=new JFrame();
    JLabel jLabel = new JLabel();
    keyListiner()
    {
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.addKeyListener(this);
        jLabel.setBounds(0,0,100,50);
        jLabel.setBackground(Color.BLUE);
        jLabel.setOpaque(true);
        frame.add(jLabel);
    }
    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar())
        {
            case 'a':
                jLabel.setLocation(jLabel.getX()-1,jLabel.getY());
                break;
            case 'w':
                jLabel.setLocation(jLabel.getX(),jLabel.getY()-1);
                break;
            case 's':
                jLabel.setLocation(jLabel.getX()+1,jLabel.getY());
                break;
            case 'd':
                jLabel.setLocation(jLabel.getX(),jLabel.getY()+1);
                break;
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode())
        {
            case 37:
                jLabel.setLocation(jLabel.getX()-10,jLabel.getY());
                break;
            case 38:
                jLabel.setLocation(jLabel.getX(),jLabel.getY()-10);
                break;
            case 39:
                jLabel.setLocation(jLabel.getX()+10,jLabel.getY());
                break;
            case 40:
                jLabel.setLocation(jLabel.getX(),jLabel.getY()+10);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("key released "+ e.getKeyChar());
        System.out.println("key released "+ e.getKeyCode());
    }

    public static void main(String[] args) {
        new keyListiner();
    }
}
