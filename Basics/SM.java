import javax.swing.*;
public class SM
{
public static void main(String[] args)
{
SM k=new SM();
}
public SM()
{
JFrame frame=new JFrame
("creating a JMenuBar,JMenu,JMenuItem and separator Component");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JMenuBar menubar=new JMenuBar();
JMenu filemenu=new JMenu("File");
filemenu.add(new JSeparator());
JMenu editmenu=new JMenu("Edit");
editmenu.add(new JSeparator());
JMenuItem fileItem1=new JMenuItem("New");
JMenuItem fileItem2=new JMenuItem("Open");
JMenuItem fileItem3=new JMenuItem("Close");
fileItem3.add(new JSeparator());
JMenuItem fileItem4=new JMenuItem("Save");
JMenuItem editItem1=new JMenuItem("Cut");
JMenuItem editItem2=new JMenuItem("Copy");
editItem2.add(new JSeparator());
JMenuItem editItem3=new JMenuItem("Paste");
JMenuItem editItem4=new JMenuItem("Insert");
filemenu.add(fileItem1);
filemenu.add(fileItem2);
filemenu.add(fileItem3);
filemenu.add(fileItem4);
editmenu.add(editItem1);
editmenu.add(editItem2);
editmenu.add(editItem3);
editmenu.add(editItem4);
menubar.add(filemenu);
menubar.add(editmenu);
frame.setJMenuBar(menubar);
frame.setSize(400,400);
frame.setVisible(true);
}}