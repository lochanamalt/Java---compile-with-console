import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SalarySystem extends JFrame implements ActionListener
{
public static void main(String []args)
{
new SalarySystem();
}
private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22;
private JButton b1;
private JTextField t1,t2,t3,t4,t5,t6;
private JRadioButton bt1,bt2,bt3,bt4;
private JComboBox cb;
double al,oth,ba,otr,otp,pay,ir,it,nom,mp,ts,p,q,r,s,a,b,c,d;
public SalarySystem()
{
this.setSize(770,540);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setTitle("Salary System");
this.setLayout(null);
Font l=new Font("Monospaced",Font.BOLD,24);
Font m=new Font("Dialog",Font.BOLD,20);
Font n=new Font("Monospaced",Font.BOLD,18);
l1=new JLabel("Salary System");
l1.setBounds(240,6,250,40);
l1.setFont(l);
this.add(l1);
l2=new JLabel("EMP No:");
l2.setBounds(10,60,135,20);
this.add(l2);
cb=new JComboBox();
cb.setBounds(165,60,135,20);
cb.addItem("1");
cb.addItem("2");
cb.addItem("3");
cb.addItem("4");
cb.addItem("5");
cb.addItem("6");
cb.addItem("7");
cb.addItem("8");
cb.addItem("9");
cb.addItem("10");
cb.addItem("11");
cb.addItem("12");
cb.addItem("13");
cb.addItem("14");
cb.addItem("15");
cb.addItem("16");
cb.addItem("17");
cb.addItem("18");
cb.addItem("19");
cb.addItem("20");
cb.addItem("21");
cb.addItem("22");
cb.addItem("23");
cb.addItem("24");
cb.addItem("25");
cb.addItem("26");
cb.addItem("27");
cb.addItem("28");
cb.addItem("29");
cb.addItem("30");
cb.addItem("31");
cb.addItem("32");
cb.addItem("33");
cb.addItem("34");
cb.addItem("35");
cb.addItem("36");
cb.addItem("37");
cb.addItem("38");
cb.addItem("39");
cb.addItem("40");
cb.addItem("41");
cb.addItem("42");
cb.addItem("43");
cb.addItem("44");
cb.addItem("45");
cb.addItem("46");
cb.addItem("47");
cb.addItem("48");
cb.addItem("49");
cb.addItem("50");
this.add(cb);
l3=new JLabel("Name");
l3.setBounds(10,85,135,20);
this.add(l3);
t1=new JTextField("");
t1.setBounds(165,85,135,20);
this.add(t1);
l4=new JLabel("Address");
l4.setBounds(10,110,135,20);
this.add(l4);
t2=new JTextField("");
t2.setBounds(165,110,135,20);
this.add(t2);
bt1=new JRadioButton("Class A");
bt1.addActionListener(this);
bt1.setBounds(10,140,100,20);
this.add(bt1);
bt2=new JRadioButton("Class B");
bt2.addActionListener(this);
bt2.setBounds(10,165,100,20);
this.add(bt2);
bt3=new JRadioButton("Class C");
bt3.addActionListener(this);
bt3.setBounds(10,190,100,20);
this.add(bt3);
bt4=new JRadioButton("Class D");
bt4.addActionListener(this);
bt4.setBounds(10,215,100,20);
this.add(bt4);
ButtonGroup a=new ButtonGroup();
a.add(bt1);
a.add(bt2);
a.add(bt3);
a.add(bt4);
l5=new JLabel("Basic");
l5.setBounds(10,255,135,20);
this.add(l5);
l6=new JLabel("Allowance");
l6.setBounds(10,290,135,20);
this.add(l6);
t3=new JTextField("");
t3.setBounds(165,290,135,20);
this.add(t3);
l7=new JLabel("None");
l7.setBounds(165,255,135,20);
this.add(l7);
l9=new JLabel("OT Hours");
l9.setBounds(400,60,135,20);
this.add(l9);
t4=new JTextField("");
t4.setBounds(555,60,135,20);
this.add(t4);
l10=new JLabel("OT Rate");
l10.setBounds(400,85,135,20);
this.add(l10);
l11=new JLabel("OT Pay");
l11.setBounds(400,110,135,20);
this.add(l11);
l12=new JLabel("Payment");
l12.setBounds(400,150,135,20);
this.add(l12);
t5=new JTextField("");
t5.setBounds(555,150,135,20);
this.add(t5);
l13=new JLabel("Interest Rate (%)");
l13.setBounds(400,180,135,20);
this.add(l13);
l14=new JLabel("Interest");
l14.setBounds(400,205,135,20);
this.add(l14);
l15=new JLabel("No:of Months");
l15.setBounds(400,245,135,20);
this.add(l15);
t6=new JTextField("");
t6.setBounds(555,245,135,20);
this.add(t6);
l16=new JLabel("Monthly Pay");
l16.setBounds(400,285,135,20);
this.add(l16);
l17=new JLabel("None");
l17.setBounds(555,85,135,20);
this.add(l17);
l18=new JLabel("None");
l18.setBounds(555,110,135,20);
this.add(l18);
l19=new JLabel("None");
l19.setBounds(555,180,135,20);
this.add(l19);
l20=new JLabel("None");
l20.setBounds(555,205,135,20);
this.add(l20);
l21=new JLabel("None");
l21.setBounds(555,285,135,20);
this.add(l21);
b1=new JButton("Count Salary");
b1.setBounds(280,350,170,30);
b1.setFont(m);
this.add(b1);
b1.addActionListener(this);
l8=new JLabel("Total Salary");
l8.setBounds(210,420,135,30);
l8.setFont(n);
this.add(l8);
l22=new JLabel("None");
l22.setBounds(353,421,135,30);
this.add(l22);
this.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
p=25000;
q=30000;
r=35000;
s=40000;
a=p/160;
b=q/160;
c=r/160;
d=s/160;
if(e.getSource()==bt1)
{
l7.setText(""+p);
l19.setText("5");
l17.setText(""+a);
}
if(e.getSource()==bt2)
{
l7.setText(""+q);
l17.setText(""+b);
l19.setText("8");
}
if(e.getSource()==bt3)
{
l7.setText(""+r);
l17.setText(""+c);
l19.setText("9");
}
if(e.getSource()==bt4)
{
l7.setText(""+s);
l17.setText(""+d);
l19.setText("10");
}
if(e.getSource()==b1)
al=Double.parseDouble(t3.getText());
ba=Double.parseDouble(l7.getText());
oth=Double.parseDouble(t4.getText());
otr=Double.parseDouble(l17.getText());
otp=oth*otr;
{
l18.setText(""+otp);
}
pay=Double.parseDouble(t5.getText());
ir=Double.parseDouble(l19.getText());
it=(pay*ir)/100;
{
l20.setText(""+it);
}
nom=Double.parseDouble(t6.getText());
mp=(pay+it)/nom;
{
l21.setText(""+mp);
}
ts=al+otp+ba-mp;
{
l22.setText(""+ts);
}}}
