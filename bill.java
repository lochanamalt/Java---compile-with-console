import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
public class bill extends JFrame
{
public static void main(String []args)
{
new bill();
}
private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22;
private JButton b1;
private JTextField t1,t2,t3;
private JRadioButton bt1,bt2,bt3,bt4;
double a,b,c,d,p,q,r,s,ba,nou;
public bill()
{
this.setSize(570,570);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setTitle("Elec Bill");
this.setLayout(null);
Font l=new Font("Monospaced",Font.BOLD,24);
Font m=new Font("Dialog",Font.BOLD,15);
l1=new JLabel("Electricity Bill System");
l1.setBounds(180,6,250,40);
l1.setFont(l);
this.add(l1);
l2=new JLabel("Name");
l2.setBounds(10,60,135,30);
this.add(l2);
t1=new JTextField("");
t1.setBounds(150,60,135,30);
this.add(t1);
l3=new JLabel("Address");
l3.setBounds(10,100,135,30);
this.add(l3);
t2=new JTextField("");
t2.setBounds(150,100,135,30);
this.add(t2);
l4=new JLabel("No Of Units");
l4.setBounds(10,140,135,30);
this.add(l4);
t3=new JTextField("");
t3.setBounds(150,140,135,30);
this.add(t3);
l5=new JLabel("Group");
l5.setBounds(400,60,135,30);
l5.setFont(m);
this.add(l5);
ClickO c=new ClickO();
bt1=new JRadioButton("Normal");
bt1.addActionListener(c);
bt1.setBounds(400,90,135,20);
this.add(bt1);
bt2=new JRadioButton("Business");
bt2.addActionListener(c);
bt2.setBounds(400,115,135,20);
this.add(bt2);
bt3=new JRadioButton("Premium");
bt3.addActionListener(c);
bt3.setBounds(400,140,135,20);
this.add(bt3);
bt4=new JRadioButton("Extreme");
bt4.addActionListener(c);
bt4.setBounds(400,165,135,20);
this.add(bt4);
ButtonGroup a=new ButtonGroup();
a.add(bt1);
a.add(bt2);
a.add(bt3);
a.add(bt4);
l6=new JLabel("0-60");
l6.setBounds(10,200,60,30);
this.add(l6);
l10=new JLabel("None");
l10.setBounds(100,200,80,30);
this.add(l10);
l14=new JLabel("Rs...............");
l14.setBounds(210,200,100,30);
this.add(l14);
l7=new JLabel("61-90");
l7.setBounds(10,240,60,30);
this.add(l7);
l11=new JLabel("None");
l11.setBounds(100,240,80,30);
this.add(l11);
l15=new JLabel("Rs...............");
l15.setBounds(210,240,100,30);
this.add(l15);
l8=new JLabel("91-150");
l8.setBounds(10,280,60,30);
this.add(l8);
l12=new JLabel("None");
l12.setBounds(100,280,80,30);
this.add(l12);
l16=new JLabel("Rs...............");
l16.setBounds(210,280,100,30);
this.add(l16);
l9=new JLabel("151-180");
l9.setBounds(10,320,60,30);
this.add(l9);
l13=new JLabel("None");
l13.setBounds(100,320,80,30);
this.add(l13);
l17=new JLabel("Rs...............");
l17.setBounds(210,320,100,30);
this.add(l17);
l18=new JLabel("Units Used");
l18.setBounds(150,420,100,30);
this.add(l18);
l19=new JLabel("None");
l19.setBounds(300,420,100,30);
this.add(l19);
l20=new JLabel("Total Payment");
l20.setBounds(150,460,100,30);
this.add(l20);
l21=new JLabel("None");
l21.setBounds(300,460,100,30);
this.add(l21);
b1=new JButton("CAL");
b1.setBounds(200,370,100,30);
b1.setFont(m);
ClickT d=new ClickT();
b1.addActionListener(d);
this.add(b1);
this.setVisible(true);
}
private class ClickO implements ActionListener
{
protected ClickO(){}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==bt1)
{
ba=250;
}
if(e.getSource()==bt2)
{
ba=750;
}
if(e.getSource()==bt3)
{
ba=1000;
}
if(e.getSource()==bt4)
{
ba=1500;
}
}}
private class ClickT implements ActionListener
{
protected ClickT(){}
public void actionPerformed(ActionEvent g)
{
if(g.getSource()==b1)
nou=Double.parseDouble(t3.getText());
if(nou<=60)
{
l10.setText(""+nou);
l11.setText("0");
l12.setText("0");
l13.setText("0");
}
else
if(nou<=90)
{l10.setText("60.0");
l11.setText(""+(nou-60));
l12.setText("0");
l13.setText("0");
}
else
if(nou<=150)
{l10.setText("60.0");
l11.setText("30.0");
l12.setText(""+(nou-90));
l13.setText("0");
}
else
if(nou<=180)
{l10.setText("60.0");
l11.setText("30.0");
l12.setText("60.0");
l13.setText(""+(nou-150));
}
p=1.50;
q=2.00;
r=3.00;
s=3.50;
a=Double.parseDouble(l10.getText());
b=Double.parseDouble(l11.getText());
c=Double.parseDouble(l12.getText());
d=Double.parseDouble(l13.getText());
{
l14.setText("Rs: "+(p*a));
l15.setText("Rs: "+(q*b));
l16.setText("Rs: "+(r*c));
l17.setText("Rs: "+(s*d));
l19.setText(""+nou);
l21.setText("Rs: "+(ba+(p*a)+(q*b)+(s*d)+(r*c)));
}
if(nou>180)
{l10.setText("ERROR");
l10.setForeground(Color.RED);
l11.setText("ERROR");
l11.setForeground(Color.RED);
l12.setText("ERROR");
l12.setForeground(Color.RED);
l13.setText("ERROR");
l13.setForeground(Color.RED);
l14.setText("ERROR");
l14.setForeground(Color.RED);
l15.setText("ERROR");
l15.setForeground(Color.RED);
l16.setText("ERROR");
l16.setForeground(Color.RED);
l17.setText("ERROR");
l17.setForeground(Color.RED);
l19.setText("ERROR");
l19.setForeground(Color.RED);
l21.setText("ERROR");
l21.setForeground(Color.RED);
}
}}}