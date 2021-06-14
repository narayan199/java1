package swing.newWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LunchPage  implements ActionListener {
    JFrame frame = new JFrame();
    JButton mybutton = new JButton("new window");
    LunchPage()
    {
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(450,450);
     frame.setLayout(null);
     frame.setVisible(true);
     mybutton.setBounds(20,30,100,30);
     mybutton.setFocusable(false);
     mybutton.addActionListener(this);
     frame.add(mybutton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==mybutton)
    {
        frame.dispose();
        newWindow window = new newWindow();
    }
    }
}
