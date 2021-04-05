package 자습;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class BA<투자> extends JFrame {

	private JPanel contentPane;
	private JTextField txt11;
	private JTextField txt12;
	private JTextField txt13;
	private JTextField txt21;
	private JTextField txt31;
	private JTextField txt22;
	private JTextField txt32;
	private JTextField txt23;
	private JTextField txt33;
	
	private 투자 투자;
	private int sales;
	private JTextField txtEnterAmount;
	private double money;
	private String Result;
	private String years;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BA frame = new BA();
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
	public BA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 427);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 192, 203));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(33, 78, 467, 175);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txt11 = new JTextField();
		txt11.setBounds(115, 64, 106, 21);
		panel.add(txt11);
		txt11.setColumns(10);
		
		txt12 = new JTextField();
		txt12.setBounds(231, 64, 106, 21);
		panel.add(txt12);
		txt12.setColumns(10);
		
		txt13 = new JTextField();
		txt13.setBounds(349, 64, 106, 21);
		panel.add(txt13);
		txt13.setColumns(10);
		
		txt21 = new JTextField();
		txt21.setBounds(115, 95, 106, 21);
		panel.add(txt21);
		txt21.setColumns(10);
		
		txt31 = new JTextField();
		txt31.setBounds(115, 126, 106, 21);
		panel.add(txt31);
		txt31.setColumns(10);
		
		txt22 = new JTextField();
		txt22.setBounds(231, 95, 106, 21);
		panel.add(txt22);
		txt22.setColumns(10);
		
		txt32 = new JTextField();
		txt32.setBounds(231, 126, 106, 21);
		panel.add(txt32);
		txt32.setColumns(10);
		
		txt23 = new JTextField();
		txt23.setBounds(349, 95, 106, 21);
		panel.add(txt23);
		txt23.setColumns(10);
		
		txt33 = new JTextField();
		txt33.setBounds(349, 126, 106, 21);
		panel.add(txt33);
		txt33.setColumns(10);
		
		JLabel lblyearArm = new JLabel("1-year ARM");
		lblyearArm.setBounds(12, 67, 91, 15);
		panel.add(lblyearArm);
		
		JLabel lblyearArm_1 = new JLabel("3-year ARM");
		lblyearArm_1.setBounds(12, 98, 91, 15);
		panel.add(lblyearArm_1);
		
		JLabel lblyearFixed = new JLabel("30-year fixed");
		lblyearFixed.setBounds(12, 129, 91, 15);
		panel.add(lblyearFixed);
		
		JLabel lblRatesRise = new JLabel("Rates Rise");
		lblRatesRise.setBounds(115, 39, 104, 15);
		panel.add(lblRatesRise);
		
		JLabel lblRatesStable = new JLabel("Rates Stable");
		lblRatesStable.setBounds(231, 39, 106, 15);
		panel.add(lblRatesStable);
		
		JLabel lblRatesFall = new JLabel("Rates Fall");
		lblRatesFall.setBounds(349, 39, 106, 15);
		panel.add(lblRatesFall);
		
		JLabel lblOutcome = new JLabel("Outcome");
		lblOutcome.setBounds(231, 10, 52, 15);
		panel.add(lblOutcome);
		
		JLabel lblDecision = new JLabel("Decision");
		lblDecision.setBounds(12, 39, 52, 15);
		panel.add(lblDecision);
		
		JLabel lblSelectStrategy = new JLabel("Select Strategy");
		lblSelectStrategy.setBounds(33, 287, 94, 15);
		contentPane.add(lblSelectStrategy);
		
		JRadioButton rdbtnAggressive = new JRadioButton("Aggressive");
		rdbtnAggressive.setBackground(Color.PINK);
		rdbtnAggressive.setBounds(135, 283, 119, 23);
		contentPane.add(rdbtnAggressive);
		
		JRadioButton rdbtnConservative = new JRadioButton("Conservative");
		rdbtnConservative.setBackground(Color.PINK);
		rdbtnConservative.setBounds(258, 283, 119, 23);
		contentPane.add(rdbtnConservative);
		
		JRadioButton rdbtnOpportunity = new JRadioButton("Opportunity");
		rdbtnOpportunity.setBackground(Color.PINK);
		rdbtnOpportunity.setBounds(381, 283, 119, 23);
		contentPane.add(rdbtnOpportunity);
		
		//Group the radio buttons.
	    ButtonGroup group = new ButtonGroup();
	    group.add(rdbtnAggressive);
	    group.add(rdbtnConservative);
	    group.add(rdbtnOpportunity);
		
		JButton btnExecute = new JButton("Execute");
		btnExecute.setBackground(new Color(255, 250, 250));
		btnExecute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				money = (Double.parseDouble(txtEnterAmount.getText()));
				double t11=money*0.4;
				double t12=money*0.31;
				double t13=money*0.27;
				double t21=money*0.38;
				double t22=money*0.34;
				double t23=money*0.31;
				double t31=money*0.36;
				double t32=money*0.36;
				double t33=money*0.36;
				
				txt11.setText(Double.toString(t11));
				txt12.setText(Double.toString(t12));
				txt13.setText(Double.toString(t13));
				txt21.setText(Double.toString(t21));
				txt22.setText(Double.toString(t22));
				txt23.setText(Double.toString(t23));
				txt31.setText(Double.toString(t31));
				txt32.setText(Double.toString(t32));
				txt33.setText(Double.toString(t33));
					
			}
		});
		btnExecute.setBounds(258, 37, 95, 23);
		contentPane.add(btnExecute);
		
		JLabel lblEnterAmount = new JLabel("Enter Amount");
		lblEnterAmount.setBounds(33, 41, 94, 15);
		contentPane.add(lblEnterAmount);
		
		txtEnterAmount = new JTextField();
		txtEnterAmount.setBounds(135, 38, 106, 21);
		contentPane.add(txtEnterAmount);
		txtEnterAmount.setColumns(10);
		
		JButton btnReport = new JButton("Result");
		btnReport.setBackground(new Color(255, 250, 250));
		btnReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String years;
				if (rdbtnAggressive.isSelected()) //maximax
				 years = "1-year ARM";
				else if (rdbtnConservative.isSelected()) //maximin
				 years = "30-year ARM";
				else //minimax
				years = "1-year ARM";
				
				txtResult.setText(years);
			
			
			}
		});
		btnReport.setBounds(232, 357, 95, 23);
		contentPane.add(btnReport);
		
		JLabel lblYouNeedTo = new JLabel("You need to select ");
		lblYouNeedTo.setBounds(33, 328, 119, 15);
		contentPane.add(lblYouNeedTo);
		
		txtResult = new JTextField();
		txtResult.setBounds(164, 325, 106, 21);
		contentPane.add(txtResult);
		txtResult.setColumns(10);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrystalBank cb = new CrystalBank();
				cb.setVisible(true);
			}
		});
		btnReturn.setBounds(409, 357, 91, 23);
		contentPane.add(btnReturn);
	}
}
