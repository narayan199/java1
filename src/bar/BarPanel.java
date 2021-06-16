package bar;

import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import static java.awt.event.KeyEvent.VK_LEFT;
import static java.awt.event.KeyEvent.VK_RIGHT;

public class BarPanel extends JPanel implements ActionListener{
    static  final  int SCREEN_WIDTH=500;
    static  final  int SCREEN_HEIGHT=500;
    Random random;
    Timer timer;
    int x= 250;
    int y= 250;
    int j=250;
    int k=490;
    int randomX = 0;
    int randomY= 0;
    BarPanel()
    {
        random = new Random();
        this.addKeyListener(new AL());
        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_WIDTH));
        this.setBackground(Color.black);
        this.setFocusable(true);
        startGame();
    }
    public  void startGame()
    {
        timer= new Timer(90,this);
        timer.start();

    }
    public  void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        draw(g);
    }
    public  void draw(Graphics g)
    {

        g.setColor(Color.blue);
        g.fillOval(x,y,20,20);
        g.fillRect(j,k,50,10);
    }
    public  void ballMove()
    {
        x+=randomX;
        y+=randomY;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        ballMove();
        repaint();

    }
    public class AL extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
           if (e.getKeyCode() == VK_LEFT)
           {
               j-=10;
           }
           if (e.getKeyCode()==VK_RIGHT)
           {
               j+=10;
           }
        }
    }
}
