import javax.swing.*;
import java.awt.Font;//if you don't wish to apply colours or fonts you don't need import this.bt you should import {import java.awt.*;}
import java.awt.Color;//same
public class Jtxt extends JFrame
{
public static void main(String []args)
{
new Jtxt();
}
private JTextField a;//a=txtbx 1
private JTextField b;//b=txtbx 2
public Jtxt()
{
this.setSize(600,500);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setTitle("Hi Jtxtboxs");
this.setLayout(null);
Font k=new Font("Monospaced",Font.BOLD,20);//k=font type
a=new JTextField("",5);
a.setBounds(200,50,200,50);
a.setForeground(Color.PINK);
a.setFont(k);
this.add(a);
b=new JTextField("",50);
b.setBounds(200,150,200,50);
b.setBackground(Color.GREEN);
b.setForeground(Color.PINK);
b.setFont(k);
this.add(b);
this.setVisible(true);
}}