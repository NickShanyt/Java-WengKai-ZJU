package kcb;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class KCB {

	public KCB() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JTable table = new JTable(new KCBdata());
		
		JScrollPane pane =new JScrollPane(table); //�д˲����Ż���ʾ��ͷ����ȫ��ʾ������ݣ�
		
		frame.add(pane);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
