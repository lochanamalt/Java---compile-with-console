import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
public class JLabl extends JFrame
{
public static void main(String []args)
{
new JLabl();
}
JLabel a;//label 1
JLabel b;//label 2
public JLabl()
{
this.setSize(600,500);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setTitle("Hi JLabls");
this.setLayout(null);
Font k=new Font("Monospaced",Font.BOLD,20);//k=font type
a=new JLabel("Welcome Java");
a.setBounds(200,100,200,50);//(x axis,y axis from the top,width,height)
a.setForeground(Color.RED);
a.setFont(k);
this.add(a);
b=new JLabel("A cup of hot coffee");
b.setBounds(210,200,200,20);
this.add(b);
this.setVisible(true);
}}