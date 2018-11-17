import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
public class JrbJpnl extends JFrame
{
public static void main(String[]args)
{
new JrbJpnl ();
}
private JLabel h;//h=title as a label
private JPanel pn1;//left panel
private JPanel pn2;// right panel
private JRadioButton opt11;//options in panel left
private JRadioButton opt12;//options in panel left
private JRadioButton opt13;//options in panel left
private JRadioButton opt21;//options in panel right
private JRadioButton opt22;//options in panel right
private JRadioButton opt23;//options in panel right
public JrbJpnl()
{
this.setSize(800,900);
this.setLocation(100,100);//location is where the Jframe window is located on the monitor.
this.setTitle("JRadioButtons and Panel");
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLayout(null);
Font k=new Font("Dialog",Font.BOLD,24);//k=font type
h=new JLabel("Radio Buttons & JPanels");
h.setBounds(200,10,300,50);
h.setFont(k);
this.add(h);
pn1=new JPanel();
pn1.setLayout(null);//type setLayout where having a Jpanel.Otherwise you didn't do that,options of the panel are set in one line.
pn1.setBounds(10,100,300,400);
pn1.setBackground(Color.RED);
this.add(pn1);
pn2=new JPanel();
pn2.setLayout(null);//type setLayout where having a Jpanel
pn2.setBounds(350,100,300,400);
pn2.setBackground(Color.GREEN);
this.add(pn2);
ClickOne c=new ClickOne();//ClickOne can change.but in below it is defined as Action Listener.
opt11=new JRadioButton("Blue");
opt11.addActionListener(c);
opt11.setBounds(10,100,100,50);
opt12=new JRadioButton("Orange");
opt12.addActionListener(c);
opt12.setBounds(10,200,100,50);
opt13=new JRadioButton("Pink");
opt13.addActionListener(c);
opt13.setBounds(10,300,100,50);
ButtonGroup a=new ButtonGroup();//a=button group in left side is named as a.
opt21=new JRadioButton("Blue");
opt21.addActionListener(c);
opt21.setBounds(10,100,100,50);
opt22=new JRadioButton("Orange");
opt22.addActionListener(c);
opt22.setBounds(10,200,100,50);
opt23=new JRadioButton("Pink");
opt23.addActionListener(c);
opt23.setBounds(10,300,100,50);
ButtonGroup b=new ButtonGroup();//b=button group in left side is named as b.
a.add(opt11);
a.add(opt12);
a.add(opt13);
b.add(opt21);
b.add(opt22);
b.add(opt23);
pn1.add(opt11);
pn1.add(opt12);
pn1.add(opt13);
pn2.add(opt21);
pn2.add(opt22);
pn2.add(opt23);
this.setVisible(true);
}
private class ClickOne implements ActionListener
{//This is an inner class; contained with in GUI
protected ClickOne(){}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==opt11)
{
pn2.setBackground(Color.BLUE);
}
if(e.getSource()==opt12)
{
pn2.setBackground(Color.ORANGE);
}
if(e.getSource()==opt13)
{
pn2.setBackground(Color.PINK);
}
if(e.getSource()==opt21)
{
pn1.setBackground(Color.BLUE);
}
if(e.getSource()==opt22)
{
pn1.setBackground(Color.ORANGE);
}
if(e.getSource()==opt23)
{
pn1.setBackground(Color.PINK);
}}}}