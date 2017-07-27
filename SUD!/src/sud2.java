import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
public class sud2 extends JFrame implements ActionListener
{

	private JPanel contentPane;
	private JLabel label;
	private final JPanel P = new JPanel();
	private JButton T1[][]=new JButton[9][9];
	private String T2[][]= {{"5","3","4","6","7","8","9","1","2"},{"6","7","2","1","9","5","3","4","8"},{"1","9","8","3","4","2","5","6","7"},{"8","5","9","7","6","1","4","2","3"},{"4","2","6","8","5","3","7","9","1"},{"7","1","3","9","2","4","8","5","6"},{"9","6","1","5","3","7","2","8","4"},{"2","8","7","4","1","9","6","3","5"},{"3","4","5","2","8","6","1","7","9"}};
	//private String T3[][]=new String[9][9];
	private JComboBox<String> CB1 = new JComboBox<String>();
	private static sud2 s2;
	private JPanel P2 = new JPanel();
	private JPanel P3 = new JPanel();
	private JPanel P4 = new JPanel();
	private JPanel P5 = new JPanel();
	private JPanel P6 = new JPanel();
	private JPanel P7 = new JPanel();
	private JPanel P8 = new JPanel();
	private JPanel P9 = new JPanel();
	private JPanel P10 = new JPanel();
	private JPanel panel = new JPanel();
	private JPanel panel_1 = new JPanel();
	private int m=0;
	Color c=Color.decode("#008080");
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) 
//	{
//		s2 = new sud2("SUDOKU");
//		s2.setVisible(true);
//	}
//
//	/**
//	 * Create the frame.
//	 */
	public sud2(String title,JLabel l) 
	{
		super(title);
		setIconImage(Toolkit.getDefaultToolkit().getImage("aa.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 381, 344);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		P.setBackground(Color.BLACK);
		P.setBounds(0, 34, 378, 258);
		contentPane.add(P);
		P.setLayout(new GridLayout(3, 3, 2, 2));
		
		P2.setBackground(c);
		P.add(P2);
		P2.setLayout(new GridLayout(3, 3, 0, 0));
		
		P3.setBackground(c);
		P.add(P3);
		P3.setLayout(new GridLayout(3, 3, 0, 0));
		
		P4.setBackground(c);
		P.add(P4);
		P4.setLayout(new GridLayout(3, 3, 0, 0));
		
		P5.setBackground(c);
		P.add(P5);
		P5.setLayout(new GridLayout(3, 3, 0, 0));
		
		P6.setBackground(c);
		P.add(P6);
		P6.setLayout(new GridLayout(3, 3, 0, 0));
		
		P7.setBackground(c);
		P.add(P7);
		P7.setLayout(new GridLayout(3, 3, 0, 0));
		
		P8.setBackground(c);
		P.add(P8);
		P8.setLayout(new GridLayout(3, 3, 0, 0));
		
		P9.setBackground(c);
		P.add(P9);
		P9.setLayout(new GridLayout(3, 3, 0, 0));
		
		P10.setBackground(c);
		P.add(P10);
		P10.setLayout(new GridLayout(3, 3, 0, 0));
		
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 378, 34);
		contentPane.add(panel);
		panel.setLayout(null);
		
		CB1.setToolTipText("select an option.");
		CB1.setBounds(336, 0, 42, 34);
		panel.add(CB1);
		CB1.setBackground(c);
		
		JLabel L2 = new JLabel("");
		L2.setForeground(Color.WHITE);
		L2.setBackground(Color.WHITE);
		L2.setBounds(0, 0, 125, 34);
		panel.add(L2);
		L2.setText(sud4.T1.getText().toUpperCase());
		
		label=l;
		label.setBounds(290, 0, 46, 34);
		panel.add(label);
		label.setForeground(Color.white);
		
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 293, 375, 24);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel L1 = new JLabel("SUBMIT");
		L1.setBackground(Color.BLACK);
		L1.setForeground(Color.white);
		L1.setFont(new Font("Tahoma", Font.BOLD, 13));
		L1.setBounds(168, 0, 66, 25);
		L1.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent a) 
			{
				String t=sud3.l.getText();
				System.out.println(t);
				sud3.timeflag=-1;
				if(F4())
					JOptionPane.showMessageDialog(sud4.s2,":::::Congratulation:::::");					
				else
				{
					JOptionPane.showMessageDialog(sud4.s2,":::::Sorry:::::");
					dispose();
					new sud4("SETTINGS").setVisible(true);
				}
				
			}
		});
		
		panel_1.add(L1);
		CB1.addItem("1");
		CB1.addItem("2");
		CB1.addItem("3");
		CB1.addItem("4");
		CB1.addItem("5");
		CB1.addItem("6");
		CB1.addItem("7");
		CB1.addItem("8");
		CB1.addItem("9");
		F1();
		F2();
		F3();
	}
	public void actionPerformed(ActionEvent e)
	{
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				if(e.getSource()==T1[i][j])
				{
					String s1=CB1.getSelectedItem().toString();
					T1[i][j].setText(s1);
					//T3[i][j]=T1[i][j].getText();
				}
			}
		}	
	}
	public void F1()
	{
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				T1[i][j]=new JButton();
				T1[i][j].addActionListener(this);
				if(i<3&&j<3)
				{
					T1[i][j].setBackground(c);
					T1[i][j].setForeground(Color.white);
					P2.add(T1[i][j]);
					T1[i][j].setFocusable(false);					
				}
				if(i<3&&j>=3&&j<6)
				{
					T1[i][j].setBackground(c);
					T1[i][j].setForeground(Color.white);
					P3.add(T1[i][j]);
					T1[i][j].setFocusable(false);
				}
				if(i<3&&j>=6&&j<9)
				{
					T1[i][j].setBackground(c);
					T1[i][j].setForeground(Color.WHITE);
					P4.add(T1[i][j]);
					T1[i][j].setFocusable(false);
				}
				if(i>=3&&i<6&&j<3)
				{
					T1[i][j].setBackground(c);
					T1[i][j].setForeground(Color.white);
					P5.add(T1[i][j]);
					T1[i][j].setFocusable(false);
				}
				if(i>=3&&i<6&&j>=3&&j<6)
				{
					T1[i][j].setBackground(c);
					T1[i][j].setForeground(Color.white);
					P6.add(T1[i][j]);
					T1[i][j].setFocusable(false);
				}
				if(i>=3&&i<6&&j>=6&&j<9)
				{
					T1[i][j].setBackground(c);
					T1[i][j].setForeground(Color.white);
					P7.add(T1[i][j]);
					T1[i][j].setFocusable(false);
				}
				if(i>=6&&i<9&&j<3)
				{
					T1[i][j].setBackground(c);
					T1[i][j].setForeground(Color.white);
					P8.add(T1[i][j]);
					T1[i][j].setFocusable(false);
				}
				if(i>=6&&i<9&&j>=3&&j<6)
				{
					T1[i][j].setBackground(c);
					T1[i][j].setForeground(Color.white);
					P9.add(T1[i][j]);
					T1[i][j].setFocusable(false);
				}
				if(i>=6&&i<9&&j>=6&&j<9)
				{
					T1[i][j].setBackground(c);
					T1[i][j].setForeground(Color.white);
					P10.add(T1[i][j]);
					T1[i][j].setFocusable(false);
				}
			}	
		}
	}
	public void F2()
	{
		for(int p=0;p<10;p++)
		{
			int b;
			int a=(int)(Math.random()*9);
			if(a==0)
				b=a+1;
			else
				b=a-1;
			String c="";
			for(int q=0;q<9;q++)
			{
				if(a<3&&b<3)
				{
					c=T2[a][q];
					T2[a][q]=T2[b][q];
					T2[b][q]=c;
				}
				if(a>=3&&a<6&&b>=3&&b<6)
				{
					c=T2[a][q];
					T2[a][q]=T2[b][q];
					T2[b][q]=c;
				}
				if(a>=6&&a<9&&b>=6&&b<9)
				{
					c=T2[a][q];
					T2[a][q]=T2[b][q];
					T2[b][q]=c;
				}
			}
			for(int q=0;q<9;q++)
			{
				if(a<3&&b<3)
				{
					c=T2[q][a];
					T2[q][a]=T2[q][b];
					T2[q][b]=c;
				}
				if(a>=3&&a<6&&b>=3&&b<6)
				{
					c=T2[q][a];
					T2[q][a]=T2[q][b];
					T2[q][b]=c;
				}
				if(a>=6&&a<9&&b>=6&&b<9)
				{
					c=T2[q][a];
					T2[q][a]=T2[q][b];
					T2[q][b]=c;
				}
			}
		}
	}
	public void F3()
	{
		if(sud4.CB.getSelectedItem()=="EASY")
		{
		for(int t=0;t<200;t++)
		{
			int a=(int)(Math.random()*9);
			int b=(int)(Math.random()*9);
			T1[a][b].setEnabled(false);
			T1[a][b].setText(T2[a][b]);
			T1[a][b].setBackground(Color.white);
			T1[a][b].setForeground(c);
		}
		}
		if(sud4.CB.getSelectedItem()=="MEDIUM")
		{
		for(int t=0;t<40;t++)
		{
			int a=(int)(Math.random()*9);
			int b=(int)(Math.random()*9);
			T1[a][b].setEnabled(false);
			T1[a][b].setText(T2[a][b]);
			T1[a][b].setBackground(Color.white);
			T1[a][b].setForeground(c);
		}
		}
		if(sud4.CB.getSelectedItem()=="HARD")
		{
		for(int t=0;t<30;t++)
		{
			int a=(int)(Math.random()*9);
			int b=(int)(Math.random()*9);
			T1[a][b].setEnabled(false);
			T1[a][b].setText(T2[a][b]);
			T1[a][b].setBackground(Color.white);
			T1[a][b].setForeground(c);
		}
		}
	}
	public boolean F4()
	{
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				if(T2[i][j]==T1[i][j].getText())
				{
					m++;
				}
					
				else
				{
					m=0;
				    break;
				}
			}
			if(m==0)
				break;
		}
		if(m!=0)
			return(true);
		else
			return(false);
	}
}


