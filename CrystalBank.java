package 자습;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CrystalBank extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrystalBank frame = new CrystalBank();
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
	public CrystalBank() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 345);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 192, 203));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn환전 = new JButton("Exchange");
		btn환전.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exchange hj = new Exchange();
				hj.setVisible(true);
			}
		});
		btn환전.setFont(new Font("굴림", Font.BOLD, 15));
		btn환전.setBounds(308, 192, 133, 37);
		contentPane.add(btn환전);
		
		JButton btn세금계산 = new JButton("Tax Bill");
		btn세금계산.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tax tx = new Tax();
				tx.setVisible(true);
			}
		});
		btn세금계산.setFont(new Font("굴림", Font.BOLD, 15));
		btn세금계산.setBounds(74, 120, 133, 37);
		contentPane.add(btn세금계산);
		
		JButton btn투자분석 = new JButton("BA");
		btn투자분석.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BA ba = new BA();
				ba.setVisible(true);
			}
		});
		btn투자분석.setFont(new Font("굴림", Font.BOLD, 15));
		btn투자분석.setBounds(74, 192, 133, 37);
		contentPane.add(btn투자분석);
		
		JButton btnLoan = new JButton("Loan");
		btnLoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Loan dc = new Loan();
				dc.setVisible(true);

			}
		});
		btnLoan.setFont(new Font("굴림", Font.BOLD, 15));
		btnLoan.setBounds(308, 120, 133, 37);
		contentPane.add(btnLoan);
		
		JLabel lblNewLabel_1 = new JLabel("CRYSTAL BANK");
		lblNewLabel_1.setBounds(134, 36, 245, 51);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("궁서체", Font.BOLD | Font.ITALIC, 30));
	}
	

	
}