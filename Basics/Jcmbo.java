import javax.swing.*;
import java.awt.Color;//if you don't wish to apply colors or fonts you don't need import these.bt you should import {import java.awt.*;}
import java.awt.Font;//same
public class Jcmbo extends JFrame
{
public static void main(String []args)
{
new Jcmbo();
}
private JComboBox e; //e=combobox list
private JLabel f; //f=page heading as a label
public Jcmbo()
{
this.setSize(600,500);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setTitle("Hi combobox");
this.setLayout(null);
Font k=new Font("Monospaced",Font.BOLD,50);//k=font type1
Font l=new Font("Dialog",Font.BOLD,24);//l=font type2
f=new JLabel("Country");
f.setBounds(10,10,300,50);
f.setFont(k);
f.setForeground(Color.YELLOW);
this.add(f);
e=new JComboBox();
e.setBounds(10,70,300,50);
e.setBackground(Color.BLACK);
e.setForeground(Color.GREEN);
e.setFont(l);
e.addItem("Sri Lanka");
e.addItem("India");
e.addItem("America");
e.addItem("Australia");
e.addItem("United Kindom");
this.add(e);
this.setVisible(true);
}}