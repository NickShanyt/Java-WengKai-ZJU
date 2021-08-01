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
		
		JScrollPane pane =new JScrollPane(table); //有此操作才会显示表头（完全显示表格内容）
		
		frame.add(pane);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
