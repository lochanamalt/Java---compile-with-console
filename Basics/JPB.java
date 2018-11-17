import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.text.html.*;
public class JPB
{
final static int intvl=500;//500=speed of filling progress bar.
int i;
JLabel lbl;
JProgressBar pb;
Timer tmr;
JButton btn;
public JPB()
{
JFrame frm=new JFrame("Swing Progress Bar");
btn=new JButton("Start");
btn.addActionListener(new ButtonListener());//can substitute by 1 "ButtonListener l=new ButtonListener();" & "btn.addActionListener(l);"
//ButtonListener can change.but in below it is defined as Action Listener.
pb=new JProgressBar(0,20);
pb.setValue(0);
pb.setStringPainted(true);
lbl=new JLabel("Roseindia.net");
JPanel pnl=new JPanel();//can substitute by 2 "private JPanel pnl;" to up & "pnl=new JPanel();" to here
pnl.add(btn);
pnl.add(pb);
JPanel pnl1=new JPanel();//can substitute by 2
pnl1.setLayout(new BorderLayout());//can substitute by 1       //wenadata panel wala layout null
pnl1.add(pnl,BorderLayout.NORTH);
pnl1.add(lbl,BorderLayout.CENTER);
pnl1.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));//1st symbolize y axis from top,2nd x axis from left.3rd y axis from bottom.4th x axis from right.of the window.
frm.setContentPane(pnl1);
frm.pack();
frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frm.setVisible(true);
//create a timer
tmr=new Timer(intvl,new ActionListener()
{
public void actionPerformed(ActionEvent evt)
{
if(i==20)
{
Toolkit.getDefaultToolkit().beep();
tmr.stop();
String str="<html>"+"<font color=\"#FF0000\">"+"<b>"+"Downloading completed."+"</b>"+"</font>"+"</html>";
lbl.setText(str);
}
i=i+1;
pb.setValue(i);
}});
}
class ButtonListener implements ActionListener
{
public void actionPerformed(ActionEvent ae)
{
btn.setEnabled(false);
i=0;
String str="<html>"+"<font color=\"#008000\">"+"<b>"+"Downloading Progress.........."+"</b>"+"</font>"+"</html>";
lbl.setText(str);
tmr.start();
}}
public static void main(String[] args)
{
JPB spb=new JPB();
}}