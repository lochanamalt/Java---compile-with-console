import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.text.html.*;
public class JPB1 extends JFrame//////////////////////////
{
final static int intvl=500;//500= speed of filling the progress bar.
int i;
private JLabel lbl;//////////////private
private JProgressBar pb;////////////private
private JPanel pnl;////new
private JPanel pnl1;///new
private Timer tmr;//////////private
private JButton btn;//////////private
public JPB1()
{
this.setTitle("Swing Progress Bar");//////////
btnl l=new btnl();////////////
btn=new JButton("Start");
btn.addActionListener(l);////l
pb=new JProgressBar(0,20);
pb.setValue(0);
pb.setStringPainted(true);
lbl=new JLabel("Rose.net");
pnl=new JPanel();
pnl.add(btn);
pnl.add(pb);
pnl1=new JPanel();
BorderLayout k=new BorderLayout();///////////
pnl1.setLayout(k);////////////////k
pnl1.add(pnl,BorderLayout.NORTH);
pnl1.add(lbl,BorderLayout.CENTER);
pnl1.setBorder(BorderFactory.createEmptyBorder(20,20,20,100));//1st symbolize y axis from top,2nd x axis from left.3rd y axis from bottom.4th x axis from right.of the window.
this.setContentPane(pnl1);///////////this
this.pack();///////////this
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);///////////this
this.setVisible(true);///////////////
//create a timer
tmr=new Timer(intvl,new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
if(i==18)//one unit defines 5 partitions.18 or 19
{
Toolkit.getDefaultToolkit().beep();
tmr.stop();
String strng="<html>"+"<font color=FF0000>"+"<b>"+"Downloading completed."+"</b>"+"</font>"+"</html>";//colour
lbl.setText(strng);
}
i=i+2;//one unit defines 5 partitions.2 or 1
pb.setValue(i);
}});
}
private class btnl implements ActionListener//private
{
public void actionPerformed(ActionEvent ae)
{
btn.setEnabled(false);
i=0;
tmr.start();//uplifted 2 lines
String strng="<html>"+"<font color=871F78>"+"<i>"+"Downloading Progress.........."+"</i>"+"</font>"+"</html>";//colour,font
lbl.setText(strng);
}}
public static void main(String[] args)
{
new JPB1();//////////not typed " JPB1 spb= new JPB1()"
}}