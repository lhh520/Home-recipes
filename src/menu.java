
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.*;
import java.sql.SQLException;

import javax.swing.*;

public class menu extends JFrame implements ActionListener
{
	JTextArea t1 = new JTextArea(1,15);
JMenuBar menuBar = new JMenuBar();// 创建菜单栏对象
JMenu menu = new JMenu("餐饮记录管理");// 创建菜单对象
JMenuItem menuItem11 = new JMenuItem("餐饮记录上传");
JMenuItem menuItem12 = new JMenuItem("餐饮记录查询");
JMenu menu2 = new JMenu("成员健康管理");// 创建菜单对象
JMenuItem menuItem21 = new JMenuItem("健康信息录入");// 创建菜单项对象
JMenuItem menuItem22 = new JMenuItem("健康信息管理");// 创建菜单项对象
JMenu menu3 = new JMenu("食谱档案记录管理");// 创建菜单对象
JMenuItem menuItem31 = new JMenuItem("食谱添加");// 创建菜单项对象
JMenuItem menuItem32 = new JMenuItem("食谱管理");// 创建菜单项对象
JMenu menu4 = new JMenu("家庭饮食安排管理");// 创建菜单对象
JMenuItem menuItem41 = new JMenuItem("一周饮食安排");// 创建菜单项对象
JMenuItem menuItem42 = new JMenuItem("菜品购买");// 创建菜单项对象
JTextArea J1=new JTextArea(1,10);
private MyJJJPanel panel = new MyJJJPanel();
private Container contentPane = this.getContentPane();

	private static final long serialVersionUID = 1L;

	public static void main(String args[]) 
	{

		menu frame = new menu("123");

		frame.setVisible(true);

	}

	

	public menu(String name)
	{

		super("用户:"+name+",欢迎您");

		t1.setText(name);

		setBounds(300, 90,1240,900);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		

		

		setJMenuBar(menuBar);// 将菜单栏对象添加到窗体的菜单栏中

		

		

		menuBar.add(menu);// 将菜单对象添加到菜单栏对象中


		// 创建菜单项对象

		menuItem11.addActionListener(this);// 为菜单项添加事件监听器

		menu.add(menuItem11);// 将菜单项对象添加到菜单对象中
		menuItem12.addActionListener(this);// 为菜单项添加事件监听器

		menu.add(menuItem12);// 将菜单项对象添加到菜单对象中

		menuBar.add(menu2);// 将菜单对象添加到菜单栏对象中

		menuItem21.addActionListener(this);// 为菜单项添加事件监听器

		menu2.add(menuItem21);// 将菜单项对象添加到菜单对象中

		

		menuItem22.addActionListener(this);// 为菜单项添加事件监听器

		menu2.add(menuItem22);// 将菜单项对象添加到菜单对象中
		//
		menuBar.add(menu3);// 将菜单对象添加到菜单栏对象中

		menuItem31.addActionListener(this);// 为菜单项添加事件监听器

		menu3.add(menuItem31);// 将菜单项对象添加到菜单对象中

		

		menuItem32.addActionListener(this);// 为菜单项添加事件监听器

		menu3.add(menuItem32);// 将菜单项对象添加到菜单对象中
	
		//
		menuBar.add(menu4);// 将菜单对象添加到菜单栏对象中

		menuItem41.addActionListener(this);// 为菜单项添加事件监听器

		menu4.add(menuItem41);// 将菜单项对象添加到菜单对象中

		

		menuItem42.addActionListener(this);// 为菜单项添加事件监听器

		menu4.add(menuItem42);// 将菜单项对象添加到菜单对象中
		

		
		J1.setText("state: ");
		getContentPane().add(panel,BorderLayout.CENTER);
		this.add(J1,BorderLayout.SOUTH);
		
}


	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==menuItem12)//添加管理员
		{   String m1=menuItem12.getText();
		   J1.setText("state: "+m1);
		   this.add(J1,BorderLayout.SOUTH);
		   //JOptionPane.showMessageDialog(null,"菜单上传中",null,JOptionPane.ERROR_MESSAGE, null);
			
		   record_query frame = new record_query(t1.getText());
		        try {
					frame.connectToDB();
				} catch (ClassNotFoundException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				} catch (SQLException e1) 
		        {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
		        
		        frame.setMinimumSize(new Dimension(750, 500));
		        frame.setVisible(true);
		        frame.setResizable(false);
			
		}
		if(e.getSource()==menuItem11)//添加管理员
		{   String m1=menuItem11.getText();
		   J1.setText("state: "+m1);
		   this.add(J1,BorderLayout.SOUTH);
		   //JOptionPane.showMessageDialog(null,"菜单上传中",null,JOptionPane.ERROR_MESSAGE, null);
			
		   record_add frame = new record_add();
		       
		        
		        frame.setMinimumSize(new Dimension(750, 500));
		        frame.setVisible(true);
		        frame.setResizable(false);
			
		}
		if(e.getSource()==menuItem31)//添加食谱
		{   String m1=menuItem31.getText();
		   J1.setText("state: "+m1);
		   this.add(J1,BorderLayout.SOUTH);
		   //JOptionPane.showMessageDialog(null,"菜单上传中",null,JOptionPane.ERROR_MESSAGE, null);
			
		   cook_book_add frame = new cook_book_add();
		       
		        
		        frame.setMinimumSize(new Dimension(750, 500));
		        frame.setVisible(true);
		        frame.setResizable(false);
			
		}
		if(e.getSource()==menuItem21)//成员信息添加
		{   String m1=menuItem21.getText();
		   J1.setText("state: "+m1);
		   this.add(J1,BorderLayout.SOUTH);
		   //JOptionPane.showMessageDialog(null,"菜单上传中",null,JOptionPane.ERROR_MESSAGE, null);
			
		   info_add frame = new info_add();
		       
		        
		        frame.setMinimumSize(new Dimension(750, 500));
		        frame.setVisible(true);
		        frame.setResizable(false);
			
		}
		if(e.getSource()==menuItem22)//添加管理员
		{   String m1=menuItem22.getText();
		   J1.setText("state: "+m1);
		   this.add(J1,BorderLayout.SOUTH);
		   //JOptionPane.showMessageDialog(null,"菜单上传中",null,JOptionPane.ERROR_MESSAGE, null);
			
		   info_query frame = new info_query(t1.getText());
		        try {
					frame.connectToDB();
				} catch (ClassNotFoundException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				} catch (SQLException e1) 
		        {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
		        
		        frame.setMinimumSize(new Dimension(750, 500));
		        frame.setVisible(true);
		        frame.setResizable(false);
			
		}
		if(e.getSource()==menuItem32)//添加管理员
		{   String m1=menuItem32.getText();
		   J1.setText("state: "+m1);
		   this.add(J1,BorderLayout.SOUTH);
		   //JOptionPane.showMessageDialog(null,"菜单上传中",null,JOptionPane.ERROR_MESSAGE, null);
			
		   cook_book_query frame = new cook_book_query(t1.getText());
		        try {
					frame.connectToDB();
				} catch (ClassNotFoundException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				} catch (SQLException e1) 
		        {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
		        
		        frame.setMinimumSize(new Dimension(750, 500));
		        frame.setVisible(true);
		        frame.setResizable(false);
			
		}
		
		
	}
	class MyJJJPanel extends JPanel
	{

	    public void paintComponent(Graphics g){

	        super.paintComponent(g);

	        Image image = new ImageIcon("C:/Users/DELL/Documents/李合会/jj.jpg").getImage();

	        g.drawImage(image, 10, 10, this);

	    }

	}
	

}

