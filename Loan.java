package ÀÚ½À;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class Loan extends JFrame {

		private JPanel contentPane;
		private JTextField txtLoanAmount;
		private JTextField txtNumberofYears;
		private JTextField txtInterestRate;
		private JTextField txtMonthlyPayment;
		
		private double loan, years, rate, monthly;
		

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Loan frame = new Loan();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the frame.
		 */
		public Loan() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 365, 443);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(255, 192, 203));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblInterestRate = new JLabel("Interest Rate");
			lblInterestRate.setFont(new Font("±¼¸²", Font.BOLD, 15));
			lblInterestRate.setBounds(41, 166, 130, 15);
			contentPane.add(lblInterestRate);
			
			JLabel lblNumberOfYear = new JLabel("Number of Years");
			lblNumberOfYear.setFont(new Font("±¼¸²", Font.BOLD, 15));
			lblNumberOfYear.setBounds(41, 118, 130, 15);
			contentPane.add(lblNumberOfYear);
			
			JLabel lblNewLabel = new JLabel("ex.(5.0 for 5%)");
			lblNewLabel.setBounds(41, 187, 130, 15);
			contentPane.add(lblNewLabel);
			
			JLabel lblLoanAmount = new JLabel("Loan Amount");
			lblLoanAmount.setFont(new Font("±¼¸²", Font.BOLD, 15));
			lblLoanAmount.setBounds(41, 65, 130, 15);
			contentPane.add(lblLoanAmount);
			
			JLabel lblMonthlyPayment = new JLabel("Monthly Payment");
			lblMonthlyPayment.setFont(new Font("±¼¸²", Font.BOLD, 15));
			lblMonthlyPayment.setBounds(41, 231, 130, 15);
			contentPane.add(lblMonthlyPayment);
			
			txtLoanAmount = new JTextField();
			txtLoanAmount.setBounds(189, 63, 106, 21);
			contentPane.add(txtLoanAmount);
			txtLoanAmount.setColumns(10);
			
			txtNumberofYears = new JTextField();
			txtNumberofYears.setBounds(189, 116, 106, 21);
			contentPane.add(txtNumberofYears);
			txtNumberofYears.setColumns(10);
			
			txtInterestRate = new JTextField();
			txtInterestRate.setBounds(189, 164, 106, 21);
			contentPane.add(txtInterestRate);
			txtInterestRate.setColumns(10);
			
			txtMonthlyPayment = new JTextField();
			txtMonthlyPayment.setBounds(189, 229, 106, 21);
			contentPane.add(txtMonthlyPayment);
			txtMonthlyPayment.setColumns(10);
			
			JButton btnCalculate = new JButton("Calculate");
			btnCalculate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					loan = (Double.parseDouble(txtLoanAmount.getText()));
			    	years = (Double.parseDouble(txtNumberofYears.getText()));
			    	rate = (Double.parseDouble(txtInterestRate.getText()));
			    	double mRate = (rate)/1200.0;
			    	double months = (years)*12.0;
			    	double denom = (Math.pow((1+mRate),months)-1);
			    	monthly = (mRate + mRate/denom)*loan;
			    	DecimalFormat x = new DecimalFormat("#.##");
			    	monthly = Double.valueOf(x.format(monthly));
			    	txtMonthlyPayment.setText("");
			    	txtMonthlyPayment.setText(monthly +"");
				}
			});
			btnCalculate.setFont(new Font("±¼¸²", Font.BOLD, 15));
			btnCalculate.setBounds(113, 298, 106, 34);
			contentPane.add(btnCalculate);
			
			JButton btnReturn = new JButton("Return");
			btnReturn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CrystalBank cb = new CrystalBank();
					cb.setVisible(true);
				}
			});
			btnReturn.setBounds(113, 357, 106, 21);
			contentPane.add(btnReturn);
		}
}