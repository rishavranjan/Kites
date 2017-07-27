import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class sud4 extends JFrame 
{
	public static JTextField T1;
	static JTextField T2;
	static JComboBox<String> CB = new JComboBox<String>();
	public static sud2 s2;
	public JLabel l=new JLabel("0 ");
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) 
//	{
//		sud4 s4 = new sud4("SETTINGS");
//		s4.setVisible(true);
//	}

//	/**
//	 * Create the frame.
//	 */
	public sud4(String title) 
	{
		super(title);
		setResizable(false);
		setLocationRelativeTo(this);
		Color c=Color.decode("#008080");
		setIconImage(Toolkit.getDefaultToolkit().getImage("aa.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 381,303);
		getContentPane().setLayout(null);
		
		JPanel P1 = new JPanel();
		P1.setBounds(0, 0, 375, 274);
		P1.setBackground(new Color(0, 128, 128));
		getContentPane().add(P1);
		P1.setLayout(null);
		
		JLabel L1 = new JLabel("Profile...");
		L1.setFont(new Font("Tahoma", Font.ITALIC, 30));
		L1.setForeground(Color.WHITE);
		L1.setBounds(10, 11, 155, 45);
		P1.add(L1);
		
		JLabel L2 = new JLabel("Nick Name:");
		L2.setForeground(Color.WHITE);
		L2.setFont(new Font("Tahoma", Font.ITALIC, 15));
		L2.setBounds(10, 67, 99, 19);
		P1.add(L2);
		
		T1 = new JTextField();
		T1.setToolTipText("Please enter any name.");
		T1.setBounds(124, 66, 199, 20);
		P1.add(T1);
		T1.setColumns(10);
		
		JLabel L3 = new JLabel("Age:");
		L3.setForeground(Color.WHITE);
		L3.setFont(new Font("Tahoma", Font.ITALIC, 15));
		L3.setBounds(10, 113, 46, 19);
		P1.add(L3);
		
		T2 = new JTextField();
		T2.setToolTipText("Please enter your age.");
		T2.setBounds(124, 112, 199, 20);
		P1.add(T2);
		T2.setColumns(3);
		
		JLabel L4 = new JLabel("Level:");
		L4.setFont(new Font("Tahoma", Font.ITALIC, 15));
		L4.setForeground(Color.WHITE);
		L4.setBounds(10, 160, 46, 14);
		P1.add(L4);
		
		CB.setToolTipText("Please select your level.");
		CB.setBounds(124, 159, 199, 20);
		P1.add(CB);
		CB.addItem("SELECT");
		CB.addItem("EASY");
		CB.addItem("MEDIUM");
		CB.addItem("HARD");
		CB.setSelectedIndex(0);
		JButton B1 = new JButton("Let's Start...");
		B1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent a)
			{
				Pattern p = Pattern.compile("[0-9]{1,3}");
				Matcher m = p.matcher(T2.getText());
				if(T1.getText().length()==0)
				{
					JOptionPane.showMessageDialog(sud1.ss4,"Please enter your nickname.");
				}
				else if(T2.getText().equals("0")||!m.matches())
				{
					JOptionPane.showMessageDialog(sud1.ss4,"Please enter valid age.");
				}
				else if(CB.getSelectedItem().equals("SELECT"))
				{
					JOptionPane.showMessageDialog(sud1.ss4,"Please select the level.");
				}
				else
				{	
					
					s2=new sud2("SUDOKU",l);
					s2.setVisible(true);
					new sud3(l);
					dispose();
				}
			}
		});
		B1.setFont(new Font("Tahoma", Font.ITALIC, 20));
		B1.setForeground(Color.WHITE);
		B1.setBounds(47, 215, 150, 23);
		P1.add(B1);
		B1.setBackground(c);
		B1.setFocusPainted(false);
		B1.setBorderPainted(false);
		
		JButton B2 = new JButton("Exit...");
		B2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				System.exit(0);
			}
		});
		B2.setForeground(Color.WHITE);
		B2.setFont(new Font("Tahoma", Font.ITALIC, 20));
		B2.setBounds(219, 215, 89, 23);
		P1.add(B2);
		B2.setBackground(c);
		B2.setFocusPainted(false);
		B2.setBorderPainted(false);
		
		
		
		
		
		UIManager.put("activeCaption", new javax.swing.plaf.ColorUIResource(c));
				JDialog.setDefaultLookAndFeelDecorated(true); 
				//JDialog.setDefaultLookAndFeelDecorated(true);
				
				
				
				
				
	}
}
