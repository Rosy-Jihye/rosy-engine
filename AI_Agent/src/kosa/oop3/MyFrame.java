package kosa.oop3;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame extends Frame implements ActionListener, WindowListener{
	
	public MyFrame() {
		Button b = new Button("버튼");
		add(b);//질문 : 이것은 java에 내장되어있는 메서드인지
		b.addActionListener(this);
		addWindowListener(this);
		
		setSize(300,300);//질문 : 이것은 java에 내장되어있는 메서드인지
		setLocation(300, 200);//질문 : 이것은 java에 내장되어있는 메서드인지
		setVisible(true);//질문 : 이것은 java에 내장되어있는 메서드인지
		
	}
	//생성자 형성

	public static void main(String[] args) {
		new MyFrame();//생성자 호출
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Button b = (Button)e.getSource();//질문 : 이것은 java에 내장되어있는 메서드인지
		String label = b.getLabel();//질문 : 이것은 java에 내장되어있는 메서드인지
		System.out.println(label+" 선택");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);//질문 : 이것은 java에 내장되어있는 메서드인지
		
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
