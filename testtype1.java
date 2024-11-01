package makingcomputer01;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class testtype1 extends JFrame {

	JLabel l1;// 식
	JLabel l2;// 입력칸
	JTextField t1;// 쓰는칸
	JTextArea a1;// 썼던 입력들
	JButton b1;// 계산버튼
	JButton b2;// 계산버튼
	JButton b3;// 계산버튼
	JButton b4;// 계산버튼
	JButton b5;// 계산버튼
	JButton b6;// 계산버튼
	JButton b7;// 계산버튼
	JButton b8;// 계산버튼
	JButton b9;// 계산버튼
	JButton b10;// 계산버튼
	JButton b11;// 계산버튼
	JButton b12;// 계산버튼
	JButton b13;// 계산버튼
	JButton b14;// 계산버튼
	JButton b15;// 계산버튼
	JButton b16;// 계산버튼
	JButton b20;// 계산버튼
	JButton b21;// 계산버튼
	JButton b22;// 계산버튼
	JButton b23;// 계산버튼

	double num1;
	double num2;
	double result;
	int challenger; // 0,1,2,3,4 //4가지 상태 가진다 0은 평소 1은 더하기 2는 빼기 3은 곱하기 4는 빼기

	testtype1() {
		setTitle("마지막 계산기");
		setLayout(new BorderLayout(10, 10));
		showNorth();
		showSouth();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setVisible(true);
	}

	void showNorth() {
		JPanel panel = new JPanel();
		JPanel p1 = new JPanel(new GridLayout(2, 1));
		l1 = new JLabel("expression");
		l1.setFont(new Font("Arial", Font.BOLD, 16));
		a1 = new JTextArea();
		a1.setEditable(false);
		a1.setFont(new Font("Arial", Font.PLAIN, 18));
		l2 = new JLabel("input");
		l2.setFont(new Font("Arial", Font.BOLD, 16));
		t1 = new JTextField(10);
		t1.setFont(new Font("Arial", Font.PLAIN, 18));
		p1.add(l1);
		p1.add(a1);
		p1.add(l2);
		p1.add(t1);
		panel.add(p1);
		add(panel, BorderLayout.NORTH);
	}

	void showSouth() {

		JPanel panel = new JPanel();
		JPanel p1 = new JPanel(new GridLayout(5, 4, 10, 10));

		b1 = new JButton("7");
		b1.setFont(new Font("Arial", Font.BOLD, 20));
		ActionListener button1 = e -> {
			if (e.getSource() == b1) {
				t1.setText(t1.getText() + "7");
			}
		};
		b1.addActionListener(button1);
		b2 = new JButton("8");
		b2.setFont(new Font("Arial", Font.BOLD, 20));

		ActionListener button2 = e -> {
			if (e.getSource() == b2) {
				t1.setText(t1.getText() + "8");
			}
		};
		b2.addActionListener(button2);
		b3 = new JButton("9");
		b3.setFont(new Font("Arial", Font.BOLD, 20));

		ActionListener button3 = e -> {
			if (e.getSource() == b3) {
				t1.setText(t1.getText() + "9");
			}
		};
		b3.addActionListener(button3);

		b4 = new JButton("+");
		b4.setFont(new Font("Arial", Font.BOLD, 20));

		ActionListener button4 = e -> {
			if (e.getSource() == b4) {
				a1.setText(t1.getText() + "+");
				num1 = Double.parseDouble(t1.getText());
				t1.setText("");
				challenger = 1;// 1은 더하기 신호
			}
		};
		b4.addActionListener(button4);

		b5 = new JButton("4");
		b5.setFont(new Font("Arial", Font.BOLD, 20));

		ActionListener button5 = e -> {
			if (e.getSource() == b5) {
				t1.setText(t1.getText() + "4");
			}
		};
		b5.addActionListener(button5);

		b6 = new JButton("5");
		b6.setFont(new Font("Arial", Font.BOLD, 20));

		ActionListener button6 = e -> {
			if (e.getSource() == b6) {
				t1.setText(t1.getText() + "5");
			}
		};
		b6.addActionListener(button6);

		b7 = new JButton("6");
		b7.setFont(new Font("Arial", Font.BOLD, 20));

		ActionListener button7 = e -> {
			if (e.getSource() == b7) {
				t1.setText(t1.getText() + "6");
			}
		};
		b7.addActionListener(button7);

		b8 = new JButton("-");
		b8.setFont(new Font("Arial", Font.BOLD, 20));

		ActionListener button8 = e -> {
			if (e.getSource() == b8) {
				a1.setText(t1.getText() + "-");
				num1 = Double.parseDouble(t1.getText());
				t1.setText("");
				challenger = 2;// 2는 빼기 신호
			}
		};
		b8.addActionListener(button8);

		b9 = new JButton("1");
		b9.setFont(new Font("Arial", Font.BOLD, 20));

		ActionListener button9 = e -> {
			if (e.getSource() == b9) {
				t1.setText(t1.getText() + "1");
			}
		};
		b9.addActionListener(button9);

		b10 = new JButton("2");
		b10.setFont(new Font("Arial", Font.BOLD, 20));

		ActionListener button10 = e -> {
			if (e.getSource() == b10) {
				t1.setText(t1.getText() + "2");
			}
		};
		b10.addActionListener(button10);

		b11 = new JButton("3");
		b11.setFont(new Font("Arial", Font.BOLD, 20));

		ActionListener button11 = e -> {
			if (e.getSource() == b11) {
				t1.setText(t1.getText() + "3");
			}
		};
		b11.addActionListener(button11);

		b12 = new JButton("*");
		b12.setFont(new Font("Arial", Font.BOLD, 20));

		ActionListener button12 = e -> {
			if (e.getSource() == b12) {
				a1.setText(t1.getText() + "*");
				num1 = Double.parseDouble(t1.getText());
				t1.setText("");
				challenger = 3;// 1은 더하기 신호
			}
		};
		b12.addActionListener(button12);

		b13 = new JButton("C");// 이건초기화
		b13.setFont(new Font("Arial", Font.BOLD, 20));

		ActionListener button13 = e -> {
			if (e.getSource() == b13) {
				t1.setText("");
				a1.setText("");
			}
		};
		b13.addActionListener(button13);

		b14 = new JButton("0");
		b14.setFont(new Font("Arial", Font.BOLD, 20));

		ActionListener button14 = e -> {
			if (e.getSource() == b14) {
				t1.setText(t1.getText() + "0");
			}
		};
		b14.addActionListener(button14);

		b15 = new JButton("=");
		b15.setFont(new Font("Arial", Font.BOLD, 20));

		ActionListener button15 = e -> {
			if (e.getSource() == b15) {
				num2 = Double.parseDouble(t1.getText());
				a1.setText(a1.getText() + num2);
				if (challenger == 1) {
					result = num1 + num2;
				}
				if (challenger == 2) {
					result = num1 - num2;
				}
				if (challenger == 3) {
					result = num1 * num2;
				}
				if (challenger == 4) {
					result = num1 / num2;
				}
				challenger = 0;// 1은 더하기 신호
				t1.setText(Double.toString(result));
			}
		};
		b15.addActionListener(button15);

		b16 = new JButton("/");
		b16.setFont(new Font("Arial", Font.BOLD, 20));

		ActionListener button16 = e -> {
			if (e.getSource() == b16) {
				a1.setText(t1.getText() + "/");
				num1 = Double.parseDouble(t1.getText());
				t1.setText("");
				challenger = 4;// 1은 더하기 신호
			}
		};
		b16.addActionListener(button16);

		b20 = new JButton("1/x");
		b20.setFont(new Font("Arial", Font.BOLD, 20));

		ActionListener button20 = e -> {
			if (e.getSource() == b20) {

				t1.setText(Double.toString(1 / Double.parseDouble(t1.getText())));
			}
		};
		b20.addActionListener(button20);

		b21 = new JButton("x^2");
		b21.setFont(new Font("Arial", Font.BOLD, 20));

		ActionListener button21 = e -> {
			if (e.getSource() == b21) {
				t1.setText(Double.toString((Double.parseDouble(t1.getText())) * (Double.parseDouble(t1.getText()))));
			}
		};
		b21.addActionListener(button21);

		b22 = new JButton(".");
		b22.setFont(new Font("Arial", Font.BOLD, 20));

		ActionListener button22 = e -> {
			if (e.getSource() == b22) {
				t1.setText(t1.getText() + ".");

			}
		};
		b22.addActionListener(button22);

		b23 = new JButton("+/-");
		b23.setFont(new Font("Arial", Font.BOLD, 20));

		ActionListener button23 = e -> {
			if (e.getSource() == b23) {
				t1.setText("-" + t1.getText());

			}

		};

		b23.addActionListener(button23);

		p1.add(b20);
		p1.add(b21);
		p1.add(b13);
		p1.add(b4);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b8);
		p1.add(b5);
		p1.add(b6);
		p1.add(b7);
		p1.add(b12);
		p1.add(b9);
		p1.add(b10);
		p1.add(b11);
		p1.add(b16);
		p1.add(b23);
		p1.add(b14);
		p1.add(b22);
		p1.add(b15);

		panel.add(p1);

		this.add(panel, BorderLayout.SOUTH);

	}

	public static void main(String[] args) {
		new testtype1();

	}

}
