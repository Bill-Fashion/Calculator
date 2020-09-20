package calculator_gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField textField;
	public double first;
	public double second;
	public String operator;
	public double result;
	public String answer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setForeground(SystemColor.desktop);
		frmCalculator.setBackground(SystemColor.windowBorder);
		frmCalculator.setResizable(false);
		frmCalculator.setType(Type.UTILITY);
		frmCalculator.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 312, 401);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		textField.setBounds(6, 16, 300, 57);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		textField.requestFocusInWindow();

		
		JButton btnNewButton = new JButton("ON/OFF");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(SystemColor.scrollbar);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 10));
		btnNewButton.setBounds(6, 85, 64, 38);
		frmCalculator.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton_1.setBounds(6, 135, 64, 38);
		frmCalculator.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("%");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				textField.setText(textField.getText() + "%");
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "%";
			}
		});
		btnNewButton_1_1.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(82, 135, 64, 38);
		frmCalculator.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("+/-");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				textField.setText(textField.getText() + "√");
//				if(operator == "=") {
//					result = -result;
//					answer = String.format("%0.2f", result);
//					textField.setText(answer);
//				}
//				else	{
					double pm = Double.parseDouble(textField.getText());
					result = -pm;
					answer = Double.toString(result);
					textField.setText(answer);
				
					
			}
		});
		btnNewButton_1_2.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton_1_2.setBounds(158, 135, 64, 38);
		frmCalculator.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("/");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				textField.setText(textField.getText() + "/");
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "/";
			}
		});
		btnNewButton_1_3.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton_1_3.setBounds(242, 135, 64, 38);
		frmCalculator.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("7");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		btnNewButton_1_4.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton_1_4.setBounds(6, 185, 64, 38);
		frmCalculator.getContentPane().add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("8");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		btnNewButton_1_5.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton_1_5.setBounds(82, 185, 64, 38);
		frmCalculator.getContentPane().add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("9");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		btnNewButton_1_6.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton_1_6.setBounds(158, 185, 64, 38);
		frmCalculator.getContentPane().add(btnNewButton_1_6);
		
		JButton btnNewButton_1_7 = new JButton("x");
		btnNewButton_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				textField.setText(textField.getText() + "x");
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "*";
			}
		});
		btnNewButton_1_7.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton_1_7.setBounds(242, 185, 64, 38);
		frmCalculator.getContentPane().add(btnNewButton_1_7);
		
		JButton btnNewButton_1_8 = new JButton("4");
		btnNewButton_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		btnNewButton_1_8.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton_1_8.setBounds(6, 235, 64, 38);
		frmCalculator.getContentPane().add(btnNewButton_1_8);
		
		JButton btnNewButton_1_9 = new JButton("5");
		btnNewButton_1_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		btnNewButton_1_9.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton_1_9.setBounds(82, 235, 64, 38);
		frmCalculator.getContentPane().add(btnNewButton_1_9);
		
		JButton btnNewButton_1_10 = new JButton("6");
		btnNewButton_1_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		btnNewButton_1_10.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton_1_10.setBounds(158, 235, 64, 38);
		frmCalculator.getContentPane().add(btnNewButton_1_10);
		
		JButton btnNewButton_1_11 = new JButton("-");
		btnNewButton_1_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				textField.setText(textField.getText() + "-");
				first = Double.parseDouble(textField.getName());
				textField.setText("");
				operator = "-";
			}
		});
		btnNewButton_1_11.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton_1_11.setBounds(242, 235, 64, 38);
		frmCalculator.getContentPane().add(btnNewButton_1_11);
		
		JButton btnNewButton_1_12 = new JButton("1");
		btnNewButton_1_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
				
			}
		});
		btnNewButton_1_12.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton_1_12.setBounds(6, 285, 64, 38);
		frmCalculator.getContentPane().add(btnNewButton_1_12);
		
		JButton btnNewButton_1_13 = new JButton("2");
		btnNewButton_1_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		btnNewButton_1_13.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton_1_13.setBounds(82, 285, 64, 38);
		frmCalculator.getContentPane().add(btnNewButton_1_13);
		
		JButton btnNewButton_1_14 = new JButton("3");
		btnNewButton_1_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		btnNewButton_1_14.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton_1_14.setBounds(158, 285, 64, 38);
		frmCalculator.getContentPane().add(btnNewButton_1_14);
		
		JButton btnNewButton_1_15_1 = new JButton("0");
		btnNewButton_1_15_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		btnNewButton_1_15_1.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton_1_15_1.setBounds(6, 335, 64, 38);
		frmCalculator.getContentPane().add(btnNewButton_1_15_1);
		
		JButton btnNewButton_1_15_2 = new JButton(".");
		btnNewButton_1_15_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
		});
		btnNewButton_1_15_2.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton_1_15_2.setBounds(82, 335, 64, 38);
		frmCalculator.getContentPane().add(btnNewButton_1_15_2);
		
		JButton btnNewButton_1_15_3 = new JButton("=");
		btnNewButton_1_15_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(textField.getText());
				
				if(operator == "+") {
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operator == "-") {
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operator == "*") {
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operator == "/") {
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operator == "%") {
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				operator = "=";
			}
		});
		btnNewButton_1_15_3.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton_1_15_3.setBounds(158, 335, 64, 38);
		frmCalculator.getContentPane().add(btnNewButton_1_15_3);
		
		JButton btnNewButton_1_15_4 = new JButton("+");
		btnNewButton_1_15_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				textField.setText(textField.getText() + "+");
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "+";
				
			}
		});
		btnNewButton_1_15_4.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton_1_15_4.setBounds(242, 285, 64, 88);
		frmCalculator.getContentPane().add(btnNewButton_1_15_4);
		
		JButton btnNewButton_2 = new JButton("DEL");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String del = null;
				if(textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length() - 1);
					del = str.toString();
					textField.setText(del);
				}
			}
		});
		btnNewButton_2.setBounds(242, 85, 64, 38);
		frmCalculator.getContentPane().add(btnNewButton_2);
	}
}
