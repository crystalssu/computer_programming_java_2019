package ÀÚ½À;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tax extends JFrame {
	private double money;
	private JPanel contentPane;
	private JTextField txtAmount;
	private JTextField txtCarTax;
	private JTextField txtIncomeTax;
	private JTextField txtDeduction;
	private JTextField txtTaxTotal;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tax frame = new Tax();
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
	public Tax() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 414, 415);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 192, 203));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setFont(new Font("±¼¸²", Font.BOLD, 15));
		lblAmount.setBounds(56, 51, 86, 15);
		contentPane.add(lblAmount);
		
		JLabel lblCarTax = new JLabel("Car Tax");
		lblCarTax.setFont(new Font("±¼¸²", Font.BOLD, 15));
		lblCarTax.setBounds(56, 103, 86, 15);
		contentPane.add(lblCarTax);
		
		JLabel lblIncomeTax = new JLabel("Income Tax");
		lblIncomeTax.setFont(new Font("±¼¸²", Font.BOLD, 15));
		lblIncomeTax.setBounds(56, 151, 86, 15);
		contentPane.add(lblIncomeTax);
		
		JLabel lblDeduction = new JLabel("Deduction");
		lblDeduction.setFont(new Font("±¼¸²", Font.BOLD, 15));
		lblDeduction.setBounds(56, 206, 86, 15);
		contentPane.add(lblDeduction);
		
		JLabel lblTaxTotal = new JLabel("Tax Total");
		lblTaxTotal.setFont(new Font("±¼¸²", Font.BOLD, 15));
		lblTaxTotal.setBounds(56, 267, 86, 15);
		contentPane.add(lblTaxTotal);
		
		txtAmount = new JTextField();
		txtAmount.setBounds(182, 49, 106, 21);
		contentPane.add(txtAmount);
		txtAmount.setColumns(10);
		
		txtCarTax = new JTextField();
		txtCarTax.setBounds(182, 101, 106, 21);
		contentPane.add(txtCarTax);
		txtCarTax.setColumns(10);
		
		txtIncomeTax = new JTextField();
		txtIncomeTax.setBounds(182, 149, 106, 21);
		contentPane.add(txtIncomeTax);
		txtIncomeTax.setColumns(10);
		
		txtDeduction = new JTextField();
		txtDeduction.setBounds(182, 204, 106, 21);
		contentPane.add(txtDeduction);
		txtDeduction.setColumns(10);
		
		txtTaxTotal = new JTextField();
		txtTaxTotal.setBounds(182, 265, 106, 21);
		contentPane.add(txtTaxTotal);
		txtTaxTotal.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				money = (Double.parseDouble(txtAmount.getText()));
				double cartax=money* 0.0793;
				double incometax=money*0.15;
				double deduction=money*0.08;
				double taxtotal=-deduction+cartax+incometax;
			
				
				txtCarTax.setText(Double.toString(cartax));
				txtIncomeTax.setText(Double.toString(incometax));
				txtDeduction.setText(Double.toString(deduction));
				txtTaxTotal.setText(Double.toString(taxtotal));
				
			}
		});
		btnCalculate.setBounds(83, 329, 95, 23);
		contentPane.add(btnCalculate);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrystalBank cb = new CrystalBank();
				cb.setVisible(true);
			}
		});
		btnReturn.setBounds(212, 329, 95, 23);
		contentPane.add(btnReturn);
	}
	
	
}
