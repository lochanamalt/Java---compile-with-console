import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
public class Jcheckbx extends JFrame
{
public static void main(String[] args)
{
new Jcheckbx();
}
private JTextField t;//t=text box
private JCheckBox c;//c=check box
public Jcheckbx()
{
this.setSize(600,700);
this.setTitle("Hi Checkboxs");
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLayout(null);
Font f=new Font("Lucida Fax",Font.ITALIC,32);//f=font type
t=new JTextField("Example for Checkboxes");
t.setBounds(10,30,500,50);
t.setForeground(Color.YELLOW);
t.setBackground(Color.WHITE);
t.setFont(f);
this.add(t);
ClickChk ck=new ClickChk();//ClickChk can change.but in below it is defined as Action Listener.
c=new JCheckBox();
c.setBounds(10,100,500,50);
c.setBackground(Color.ORANGE);
c.setFont(f);
c.setText("Change Black and White");
c.addActionListener(ck);
this.add(c);
this.setVisible(true);}
private class ClickChk implements ActionListener
{
protected ClickChk(){}
public void actionPerformed(ActionEvent evnt)
{
if(evnt.getSource()==c)
{
if(c.isSelected())
{
t.setForeground(Color.WHITE);
t.setBackground(Color.BLACK);}
else
{
t.setForeground(Color.YELLOW);
t.setBackground(Color.GREEN);}}}}}