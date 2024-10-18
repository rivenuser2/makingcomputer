package makingcomputer01;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
// 제목은 계산기
// 결과를 16,10,8,2진수로 4가지 출력예쩡
// 0~9까지 숫자,+-구분자,소수점,+,-,/,*,c,log10^x,x^2,=,문자한개삭제,펙토리얼,괄호(,),이렇게 해서 버튼24개 그리고
// 결과화면5개

public class test1 extends JFrame {
	private JTextField t2; // 입력칸을 멤버 변수로 선언

	test1() {
		setTitle("계산기");
		setLayout(new BorderLayout(10, 10));
		showNorth();
		showCenter();
		setSize(400, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	// 보더레이아웃으로 북쪽,센터쪽으로 나누어서 설계 북쪽은 입력창과 결과가 나오는 칸들
	void showNorth() {
		JPanel p1 = new JPanel();// 식
		JPanel p2 = new JPanel();// 입력칸
		JPanel p3 = new JPanel();// 16진수
		JPanel p4 = new JPanel();// 10진수
		JPanel p5 = new JPanel();// 8진수
		JPanel p6 = new JPanel();// 2진수
		JPanel panel = new JPanel(new GridLayout(6, 0));
		// 지금까지쓴 식들과 버튼을 통해 입력할수있는 입력칸,결과를 16진수,10진수,8,2진수로 볼수있게 페널을 6개 만듬
		// 2024-10-17 : 최초생성

		JLabel l1 = new JLabel("식");
		JTextField t1 = new JTextField(25);
		t1.setEnabled(false);// 식에는 입력불가능
		JLabel l2 = new JLabel("입력칸");
		t2 = new JTextField(25);// 유일하게 t2에만 입력이 가능하다
		JLabel l3 = new JLabel("16진수");
		JTextField t3 = new JTextField(25);
		t3.setEnabled(false);// 입력불가능
		JLabel l4 = new JLabel("10진수");
		JTextField t4 = new JTextField(25);
		t4.setEnabled(false);// 입력불가능
		JLabel l5 = new JLabel("8진수");
		JTextField t5 = new JTextField(25);
		t5.setEnabled(false);// 입력불가능
		JLabel l6 = new JLabel("2진수");
		JTextField t6 = new JTextField(25);
		t6.setEnabled(false);// 입력불가능

		// 입력칸에만 입력가능하게 해놓고 나머지 칸들은 입력 불가능
		// 2024-10-17 : 최초생성

		p1.add(l1);
		p1.add(t1);
		p2.add(l2);
		p2.add(t2);
		p3.add(l3);
		p3.add(t3);
		p4.add(l4);
		p4.add(t4);
		p5.add(l5);
		p5.add(t5);
		p6.add(l6);
		p6.add(t6);

		panel.add(p1);
		panel.add(p2);
		panel.add(p3);
		panel.add(p4);
		panel.add(p5);
		panel.add(p6);

		add(panel, BorderLayout.NORTH);
		// 보더 레이아웃 북쪽으로
		// 2024-10-17 : 최초생성

	}

	void showCenter() {
		JButton b1 = new JButton("7");
		JButton b2 = new JButton("8");
		JButton b3 = new JButton("9");
		JButton b4 = new JButton("+");
		JButton b5 = new JButton("x!");
		JButton b6 = new JButton("(");
		JButton b7 = new JButton("4");
		JButton b8 = new JButton("5");
		JButton b9 = new JButton("6");
		JButton b10 = new JButton("-");
		JButton b11 = new JButton("logx");
		JButton b12 = new JButton(")");
		JButton b13 = new JButton("1");
		JButton b14 = new JButton("2");
		JButton b15 = new JButton("3");
		JButton b16 = new JButton("/");
		JButton b17 = new JButton("x^2");
		JButton b18 = new JButton("c");
		JButton b19 = new JButton("+/-");
		JButton b20 = new JButton("0");
		JButton b21 = new JButton(".");
		JButton b22 = new JButton("*");
		JButton b23 = new JButton("=");
		JButton b24 = new JButton("ce");

		JPanel panel = new JPanel(new GridLayout(4, 6));

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t2.setText(t2.getText() + "7");
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t2.setText(t2.getText() + "8");
			}
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t2.setText(t2.getText() + "9");
			}
		});
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t2.setText(t2.getText() + "4");
			}
		});
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t2.setText(t2.getText() + "5");
			}
		});
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t2.setText(t2.getText() + "6");
			}
		});
		b13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t2.setText(t2.getText() + "1");
			}
		});
		b14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t2.setText(t2.getText() + "2");
			}
		});
		b15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t2.setText(t2.getText() + "3");
			}
		});
		b20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t2.setText(t2.getText() + "0");
			}
		});
		//0~9까지 숫자버튼 이벤트처리 

		// 24개의 버튼(숫자와 연산키 넣고 4행6열로 만든다)
		// 2024-10-17 : 최초생성

		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(b10);
		panel.add(b11);
		panel.add(b12);
		panel.add(b13);
		panel.add(b14);
		panel.add(b15);
		panel.add(b16);
		panel.add(b17);
		panel.add(b18);
		panel.add(b19);
		panel.add(b20);
		panel.add(b21);
		panel.add(b22);
		panel.add(b23);
		panel.add(b24);

		this.add(panel, BorderLayout.CENTER);
		// 보더레이아웃은 센터로 해서 만든다
		// 2024-10-17 : 최초생성

	}

	public static void main(String[] args) {
		new test1();

	}

}