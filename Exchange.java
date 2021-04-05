package 자습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Exchange extends JFrame {

	 JLabel LBmoney   = new JLabel("MONEY : KR", SwingConstants.CENTER); 

	   JLabel LBcountry = new JLabel("SELECT COUNTRY", SwingConstants.CENTER); 

	   JLabel JLresult1 = new JLabel("RESULT", SwingConstants.CENTER); 

	   JLabel JLresult2 = new JLabel("", SwingConstants.CENTER); 

	   JLabel JLspace3 = new JLabel(""); 

	   JButton JBresult = new JButton("환율 계산"); 

	   JTextField TFmoney = new JTextField(10); 

	   JComboBox countryBox; 

	   String Text; 

	   JPanel jpn0 = new JPanel(); 

	   JPanel jpn1 = new JPanel(); 

	   JButton btn3 = new JButton("File"); 

	   JButton btn4 = new JButton("Help"); 

	   MyPanel draw = new MyPanel(); 
	   private final JButton btnReturn = new JButton("Return");

	   public Exchange() { 

	     setTitle("최강의 팀플레이"); 

	     //  setContentPane(new MyPanel()); 

	     createMenu();
	     jpn1.setBackground(Color.PINK);

	     jpn1.setBorder(new EmptyBorder(10,10,10,10));

	     getContentPane().add(jpn0);
	     LBmoney.setFont(new Font("굴림", Font.BOLD, 17));
	     LBmoney.setBounds(10, 45, 382, 36);

	     LBmoney.setForeground(SystemColor.desktop);
	     LBcountry.setFont(new Font("굴림", Font.BOLD, 17));
	     LBcountry.setBounds(10, 137, 382, 36);

	     LBcountry.setForeground(SystemColor.desktop);
	     JLresult1.setFont(new Font("굴림", Font.BOLD, 17));
	     JLresult1.setBounds(10, 228, 382, 36);

	     JLresult1.setForeground(SystemColor.desktop);
	     JBresult.setFont(new Font("굴림", Font.BOLD, 17));
	     JBresult.setBounds(68, 305, 268, 50);

	     JBresult.addActionListener(new Actionl()); 

	     String [] country = {"미국 USD (1169.5)", "일본 JPY (1023.2)", "유럽연합 EUR (1240.8)", "중국 CNY (169.4)", 

	       "영국 UK (1466.2)",  "대만 TWD (36.6)"  , "홍콩 HKD (150.7)"    , "캐나다 CAD (870.8)", 

	    "스위스 CHF (1151.4)","스웨덴 SEK (126.5)","호주 AUD (864.2)"        , "뉴질랜드 NZD (828.9)"}; 

	    countryBox = new JComboBox(country);
	    countryBox.setBackground(new Color(255, 182, 193));
	    countryBox.setBounds(89, 179, 229, 36);
	    jpn1.setLayout(null);

	    jpn1.add(LBmoney);
	    TFmoney.setBounds(68, 91, 268, 36);

	    jpn1.add(TFmoney);

	    jpn1.add(LBcountry); 

	    jpn1.add(countryBox);
	    JLspace3.setBounds(10, 403, 308, 65);

	    jpn1.add(JLspace3);  

	    jpn1.add(JLresult1);
	    JLresult2.setBackground(Color.WHITE);
	    JLresult2.setBounds(10, 259, 382, 36);

	    jpn1.add(JLresult2); 

	    jpn1.add(JBresult);

	    /* 

	    jpn0.add(jpn1, "West"); 

	    jpn0.add(jpn2, "Center"); 

	    jpn0.add(jpn3, "East"); 

	    */ 

	    jpn0.setLayout(new GridLayout(1,3)); 

	    jpn0.add(jpn1);
	    btnReturn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		CrystalBank cb = new CrystalBank();
				cb.setVisible(true);
	    	}
	    });
	    btnReturn.setBounds(156, 385, 91, 23);
	    
	    jpn1.add(btnReturn);

	    setSize(418, 492); 

	    setVisible(true); 

	    super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

	 } 

	 void createMenu() { 

	   JMenuBar mb = new JMenuBar(); 

	   JMenu screenMenu = new JMenu("메뉴"); 

	   screenMenu.add(new JMenuItem("Load")); 

	   screenMenu.add(new JMenuItem("Hide")); 

	   screenMenu.add(new JMenuItem("ReShow")); 

	   screenMenu.addSeparator(); 

	   screenMenu.add(new JMenuItem("Exit")); 

	   mb.add(screenMenu); 

	   setJMenuBar(mb); 

	 } 

	 public static void main(String[] args) { 

	   new Exchange(); 

	 } 

	 class Actionl implements ActionListener {     

	   public void actionPerformed(ActionEvent e){ 

	     try{ 

	       Text = TFmoney.getText(); 

	       String Text2 = null; 

	       float num1 = Integer.parseInt(Text); 

	       float num2 = 0; 

	       switch(countryBox.getSelectedIndex()){ 

	        case 0 : 

	         num2 = (float)1169.5; 

	         Text2 = "USD"; 

	         break; 

	         case 1 : 

	         num2 = (float)1023.2; 

	         Text2 = "JPY"; 

	         break; 

	         case 2: 

	         num2 = (float)1240.8; 

	         Text2 = "EUR"; 

	         break; 
	         
	         case 3: 

	             num2 = (float)169.4; 

	             Text2 = "CNY"; 

	             break;

	         case 4: 

	         num2 = (float)1466.2; 

	         Text2 = "UK"; 

	         break; 

	         case 5: 

	         num2 = (float)36.6; 

	         Text2 = "TWD"; 

	         break; 

	         case 6: 

	         num2 = (float)150.7; 

	         Text2 = "HKD"; 

	         break; 

	         case 7: 

	         num2 = (float)870.8; 

	         Text2 = "CAD"; 

	         break; 

	         case 8: 

	         num2 = (float)1151.4; 

	         Text2 = "CHF"; 

	         break; 

	         case 9: 

	         num2 = (float)126.5; 

	         Text2 = "SEK"; 

	         break; 

	         case 10: 

	         num2 = (float)864.2; 

	         Text2 = "AUD"; 

	         break; 

	         case 11: 

	         num2 = (float)828.9; 

	         Text2 = "NZD"; 

	         break; 

	      } 

	      float result3 = (float)num1 / (float)num2; 

	      String Number = String.format("%.2f", result3); 

	      JLresult2.setText(Number +" "+ Text2);   

	   } 

	   catch(Exception e1){ 

	     JLresult2.setText("   잘못 입력하였습니다."); 

	     JLresult2.setForeground(Color.gray); 

	  } 

	 } 

	 } 

	 class MyPanel extends JPanel{ 

	   Vector<Point> vStart = new Vector<Point>(); 

	   Vector<Point> vEnd = new Vector<Point>(); 

	   public MyPanel(){ 

	     addMouseListener(new MouseAdapter(){ 

	       public void mousePressed(MouseEvent e){ 

	         Point startP = e.getPoint(); 

	         vStart.add(startP); 

	      } 

	      public void mouseReleased(MouseEvent e){ 

	        Point endP = e.getPoint(); 

	        vEnd.add(endP);     

	        repaint(); 

	     } 

	  }); 

	 } 

	 public void paintComponent(Graphics g){ 

	   super.paintComponent(g); 

	   g.setColor(Color.BLUE); 

	   for(int i=0; i<vStart.size(); i++){ 

	     Point s = vStart.elementAt(i); 

	     Point e = vEnd.elementAt(i); 

	     g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY()); 

	  } 

	 } 

	 } 
}
