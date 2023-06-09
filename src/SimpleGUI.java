
package simplegui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame implements ActionListener{
    //declaring the required parts
    JFrame frame;
    JTextField name;
    JButton newwindow;
    JPanel panel;
    public SimpleGUI(){ //default constructor
        frame = new JFrame("SimpleGUI"); //title
        name = new JTextField("");
        newwindow = new JButton("New Window"); //enter user button
        panel = new JPanel();

        newwindow.setBounds(20,20,40,40); //enter button size
        name.setSize(40,40);
        name.setBounds(40,40,240,40);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(2,3)); //grid layout for frame

        panel.setLayout(new GridLayout(1,2));// panel are adjacent
        panel.setBounds(500,300,10,10);

        panel.add(name);//adding name to panel
        frame.add(panel);//adding panel to frame
        frame.add(newwindow);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        newwindow.addActionListener(this); //enter is visable from the

    }
    public void actionPerformed(ActionEvent e){
        JFrame g = new JFrame(); //declare the window object
        g.setTitle(name.getText()); //JTextField import name
        g.setSize(400,400); //new window open
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        g.setVisible(true);
    }

    public static void main(String[] args) {
        SimpleGUI b = new SimpleGUI(); //declare GUI Object
    }

}
