import javax.swing.*;
import java.awt.Color;//.awt.*; means that you want to import all the things such as color,font..etc
import java.awt.Font;
public class Jbt extends JFrame
{
public static void main(String []args)
{
new Jbt();
}
private JButton c;//c=button1
private JButton d;//d=button2
public Jbt()
{
this.setSize(600,500);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setTitle("Hi JButtons");
this.setLayout(null);
Font l=new Font("Dialog",Font.BOLD,24);//l=font type
c=new JButton("one");
c.setBounds(150,100,200,50);
c.setBackground(Color.YELLOW);
c.setForeground(Color.GREEN);
c.setFont(l);
this.add(c);
d=new JButton("two");
d.setBounds(150,200,200,50);
d.setBackground(Color.BLUE);
d.setForeground(Color.PINK);
d.setFont(l);
this.add(d);
this.setVisible(true);
}}