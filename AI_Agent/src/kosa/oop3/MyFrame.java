package kosa.oop3;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame extends Frame implements ActionListener, WindowListener{
	
	public MyFrame() {
		Button b = new Button("��ư");
		add(b);//���� : �̰��� java�� ����Ǿ��ִ� �޼�������
		b.addActionListener(this);
		addWindowListener(this);
		
		setSize(300,300);//���� : �̰��� java�� ����Ǿ��ִ� �޼�������
		setLocation(300, 200);//���� : �̰��� java�� ����Ǿ��ִ� �޼�������
		setVisible(true);//���� : �̰��� java�� ����Ǿ��ִ� �޼�������
		
	}
	//������ ����

	public static void main(String[] args) {
		new MyFrame();//������ ȣ��
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Button b = (Button)e.getSource();//���� : �̰��� java�� ����Ǿ��ִ� �޼�������
		String label = b.getLabel();//���� : �̰��� java�� ����Ǿ��ִ� �޼�������
		System.out.println(label+" ����");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);//���� : �̰��� java�� ����Ǿ��ִ� �޼�������
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
