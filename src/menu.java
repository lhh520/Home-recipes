
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
JMenuBar menuBar = new JMenuBar();// �����˵�������
JMenu menu = new JMenu("������¼����");// �����˵�����
JMenuItem menuItem11 = new JMenuItem("������¼�ϴ�");
JMenuItem menuItem12 = new JMenuItem("������¼��ѯ");
JMenu menu2 = new JMenu("��Ա��������");// �����˵�����
JMenuItem menuItem21 = new JMenuItem("������Ϣ¼��");// �����˵������
JMenuItem menuItem22 = new JMenuItem("������Ϣ����");// �����˵������
JMenu menu3 = new JMenu("ʳ�׵�����¼����");// �����˵�����
JMenuItem menuItem31 = new JMenuItem("ʳ�����");// �����˵������
JMenuItem menuItem32 = new JMenuItem("ʳ�׹���");// �����˵������
JMenu menu4 = new JMenu("��ͥ��ʳ���Ź���");// �����˵�����
JMenuItem menuItem41 = new JMenuItem("һ����ʳ����");// �����˵������
JMenuItem menuItem42 = new JMenuItem("��Ʒ����");// �����˵������
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

		super("�û�:"+name+",��ӭ��");

		t1.setText(name);

		setBounds(300, 90,1240,900);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		

		

		setJMenuBar(menuBar);// ���˵���������ӵ�����Ĳ˵�����

		

		

		menuBar.add(menu);// ���˵�������ӵ��˵���������


		// �����˵������

		menuItem11.addActionListener(this);// Ϊ�˵�������¼�������

		menu.add(menuItem11);// ���˵��������ӵ��˵�������
		menuItem12.addActionListener(this);// Ϊ�˵�������¼�������

		menu.add(menuItem12);// ���˵��������ӵ��˵�������

		menuBar.add(menu2);// ���˵�������ӵ��˵���������

		menuItem21.addActionListener(this);// Ϊ�˵�������¼�������

		menu2.add(menuItem21);// ���˵��������ӵ��˵�������

		

		menuItem22.addActionListener(this);// Ϊ�˵�������¼�������

		menu2.add(menuItem22);// ���˵��������ӵ��˵�������
		//
		menuBar.add(menu3);// ���˵�������ӵ��˵���������

		menuItem31.addActionListener(this);// Ϊ�˵�������¼�������

		menu3.add(menuItem31);// ���˵��������ӵ��˵�������

		

		menuItem32.addActionListener(this);// Ϊ�˵�������¼�������

		menu3.add(menuItem32);// ���˵��������ӵ��˵�������
	
		//
		menuBar.add(menu4);// ���˵�������ӵ��˵���������

		menuItem41.addActionListener(this);// Ϊ�˵�������¼�������

		menu4.add(menuItem41);// ���˵��������ӵ��˵�������

		

		menuItem42.addActionListener(this);// Ϊ�˵�������¼�������

		menu4.add(menuItem42);// ���˵��������ӵ��˵�������
		

		
		J1.setText("state: ");
		getContentPane().add(panel,BorderLayout.CENTER);
		this.add(J1,BorderLayout.SOUTH);
		
}


	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==menuItem12)//��ӹ���Ա
		{   String m1=menuItem12.getText();
		   J1.setText("state: "+m1);
		   this.add(J1,BorderLayout.SOUTH);
		   //JOptionPane.showMessageDialog(null,"�˵��ϴ���",null,JOptionPane.ERROR_MESSAGE, null);
			
		   record_query frame = new record_query(t1.getText());
		        try {
					frame.connectToDB();
				} catch (ClassNotFoundException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				} catch (SQLException e1) 
		        {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				}
		        
		        frame.setMinimumSize(new Dimension(750, 500));
		        frame.setVisible(true);
		        frame.setResizable(false);
			
		}
		if(e.getSource()==menuItem11)//��ӹ���Ա
		{   String m1=menuItem11.getText();
		   J1.setText("state: "+m1);
		   this.add(J1,BorderLayout.SOUTH);
		   //JOptionPane.showMessageDialog(null,"�˵��ϴ���",null,JOptionPane.ERROR_MESSAGE, null);
			
		   record_add frame = new record_add();
		       
		        
		        frame.setMinimumSize(new Dimension(750, 500));
		        frame.setVisible(true);
		        frame.setResizable(false);
			
		}
		if(e.getSource()==menuItem31)//���ʳ��
		{   String m1=menuItem31.getText();
		   J1.setText("state: "+m1);
		   this.add(J1,BorderLayout.SOUTH);
		   //JOptionPane.showMessageDialog(null,"�˵��ϴ���",null,JOptionPane.ERROR_MESSAGE, null);
			
		   cook_book_add frame = new cook_book_add();
		       
		        
		        frame.setMinimumSize(new Dimension(750, 500));
		        frame.setVisible(true);
		        frame.setResizable(false);
			
		}
		if(e.getSource()==menuItem21)//��Ա��Ϣ���
		{   String m1=menuItem21.getText();
		   J1.setText("state: "+m1);
		   this.add(J1,BorderLayout.SOUTH);
		   //JOptionPane.showMessageDialog(null,"�˵��ϴ���",null,JOptionPane.ERROR_MESSAGE, null);
			
		   info_add frame = new info_add();
		       
		        
		        frame.setMinimumSize(new Dimension(750, 500));
		        frame.setVisible(true);
		        frame.setResizable(false);
			
		}
		if(e.getSource()==menuItem22)//��ӹ���Ա
		{   String m1=menuItem22.getText();
		   J1.setText("state: "+m1);
		   this.add(J1,BorderLayout.SOUTH);
		   //JOptionPane.showMessageDialog(null,"�˵��ϴ���",null,JOptionPane.ERROR_MESSAGE, null);
			
		   info_query frame = new info_query(t1.getText());
		        try {
					frame.connectToDB();
				} catch (ClassNotFoundException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				} catch (SQLException e1) 
		        {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				}
		        
		        frame.setMinimumSize(new Dimension(750, 500));
		        frame.setVisible(true);
		        frame.setResizable(false);
			
		}
		if(e.getSource()==menuItem32)//��ӹ���Ա
		{   String m1=menuItem32.getText();
		   J1.setText("state: "+m1);
		   this.add(J1,BorderLayout.SOUTH);
		   //JOptionPane.showMessageDialog(null,"�˵��ϴ���",null,JOptionPane.ERROR_MESSAGE, null);
			
		   cook_book_query frame = new cook_book_query(t1.getText());
		        try {
					frame.connectToDB();
				} catch (ClassNotFoundException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				} catch (SQLException e1) 
		        {
					// TODO �Զ����ɵ� catch ��
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

	        Image image = new ImageIcon("C:/Users/DELL/Documents/��ϻ�/jj.jpg").getImage();

	        g.drawImage(image, 10, 10, this);

	    }

	}
	

}

