package Snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import  java.util.Random;;

public class gamepanel extends JPanel implements ActionListener{
    static  final  int SCREEN_WIDTH=500;
    static  final  int SCREEN_HEIGHT=500;
    static final int UNIT_SIZE=25;
    static final int GAME_UNIT=(SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
    static final int DELAY=75;
    final int[] x= new int[GAME_UNIT];
    final int[] y= new int[GAME_UNIT];
    int bodyparts=6;
    int ApplesEaten=0;
    int AppleX;
    int AppleY;
    char direction ='R';
    boolean running =false;
    Random random;
    Timer timer;
    int score=0;
    gamepanel()
    {
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_WIDTH));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdpater());
        startGame();
    }

    public  void startGame()
    {
        newApple();
        running=true;
        timer= new Timer(DELAY,this);
        timer.start();
    }
    public  void paintComponent(Graphics g)
    {
           super.paintComponent(g);
           draw(g);
    }
    public  void draw(Graphics g)
    {
       if (running) {
           g.setColor(Color.red);
           g.fillOval(AppleX, AppleY, UNIT_SIZE, UNIT_SIZE);
           for (int i = 0; i < bodyparts; i++) {
               if (i == 0) {
                   g.setColor(Color.GREEN);
                   g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
               } else {
                   g.setColor(new Color(45, 180, 0));
                   g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
               }
           }
       }
       else
       {
           g.setColor(Color.blue);
           g.drawString("game over ",10,25);
           g.drawString(String.valueOf(score),30,40);
       }
    }
    public  void newApple()
    {
    AppleX=random.nextInt((SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
    AppleY=random.nextInt((SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
    }
    public  void move()
    {
        for (int i=bodyparts;i>0;i--)
        {
            x[i]=x[i-1];
            y[i]=y[i-1];
        }
        switch (direction)
        {
            case 'U':
                y[0]=y[0]-UNIT_SIZE;
                break;
            case 'D':
                y[0]=y[0]+UNIT_SIZE;
                break;
            case 'L':
                x[0]=x[0]-UNIT_SIZE;
                break;
            case 'R':
                x[0]=x[0]+UNIT_SIZE;
                break;
        }
        if (!running)
        {
            timer.stop();
        }
    }
    public  void checkApple()
    {
    if ((x[0]==AppleX)&&y[0]==AppleY)
    {
         bodyparts++;
         newApple();
         score++;
    }
    }
    public  void  checkCollision()
    {
    for (int i =bodyparts;i>0;i--)
    {
        if ((x[0]==x[i]) && y[0]==y[i])
        {
            running= false;
        }
    }
        //head touch left border
        if (x[0]<0)
        {
            running= false;
        }
        //head touch right border
        if (x[0]>SCREEN_WIDTH)
        {
            running= false;
        }
        //head touch up border
        if (y[0]<0)
        {
            running= false;
        }
        //head touch button border
        if (y[0]>SCREEN_HEIGHT)
        {
            running= false;
        }
    }
    public  void gameOver(Graphics g)
    {

    }
    @Override
    public void actionPerformed(ActionEvent e) {
    if (running) {
        move();
        checkApple();
        checkCollision();
    }
    repaint();
    }
    public  class MyKeyAdpater extends KeyAdapter
    {
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode())
            {
                case  KeyEvent.VK_LEFT:
                   if (direction!='R')
                   {
                       direction='L';
                       break;
                   }
                case  KeyEvent.VK_RIGHT:
                    if (direction !='L')
                    {
                        direction='R';
                        break;
                    }
                case  KeyEvent.VK_UP:
                    if (direction !='D')
                    {
                        direction='U';
                        break;
                    }
                    case  KeyEvent.VK_DOWN:
                if (direction !='U')
                {
                    direction='D';
                    break;
                }

            }
        }
    }
}
