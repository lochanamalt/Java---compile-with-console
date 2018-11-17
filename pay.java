import javax.swing.*;
import java.awt.event.*;
public class pay extends JFrame implements ActionListener
{
public static void main(String[] args)
{
new pay();
}
private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
private JButton b1;
private JTextField t1,t2,t3;
int nou,ppu,pay,dr,dis,totpay;
public pay()
{
this.setSize(600,500);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setTitle("Sample Calculations");
this.setLayout(null);
l1=new JLabel("Payment per Unit");
l1.setBounds(100,100,200,30);
this.add(l1);
t1=new JTextField("",20);
t1.setBounds(250,100,200,30);
this.add(t1);
l2=new JLabel("No of Unit");
l2.setBounds(100,150,200,30);
this.add(l2);
t2=new JTextField("",20);
t2.setBounds(250,150,200,30);
this.add(t2);
l3=new JLabel("Discount Rate");
l3.setBounds(100,200,200,30);
this.add(l3);
t3=new JTextField("",20);
t3.setBounds(250,200,200,30);
this.add(t3);
l4=new JLabel("Payment");
l4.setBounds(100,250,200,30);
this.add(l4);
l5=new JLabel("None");
l5.setBounds(250,250,200,30);
this.add(l5);
l6=new JLabel("Discount");
l6.setBounds(100,300,200,30);
this.add(l6);
l7=new JLabel("None");
l7.setBounds(250,300,200,30);
this.add(l7);
l8=new JLabel("Total Payment");
l8.setBounds(100,350,200,30);
this.add(l8);
l9=new JLabel("None");
l9.setBounds(250,350,200,30);
this.add(l9);
b1=new JButton("Total pay");
b1.setBounds(250,400,200,30);
this.add(b1);
b1.addActionListener(this);
this.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
ppu=Integer.parseInt(t1.getText());
nou=Integer.parseInt(t2.getText());
dr=Integer.parseInt(t3.getText());
pay=ppu*nou;
dis=(pay*dr)/100;
totpay=pay-dis;
{
l5.setText(""+pay);
l7.setText(""+dis);
l9.setText(""+totpay);
}}}