import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;

class sud extends JFrame
{
	public sud(String title) 
	{
		super(title);
		setUndecorated(true);
		setResizable(false);
		Color c=Color.decode("#008080");
		getContentPane().setBackground(c);
//		setIconImage(Toolkit.getDefaultToolkit().getImage("f.ico"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 381,303);
	}
}
public class sud1 extends Thread
{
	public static sud4 ss4;
	public static void main(String[] args) 
	{
		sud s = new sud("SUDOKU");
		s.getContentPane().setLayout(null);
		
		JLabel L1 = new JLabel("SUDOKU");
		L1.setForeground(Color.WHITE);
		L1.setFont(new Font("Arial", Font.ITALIC, 50));
		L1.setBounds(72, 172, 227, 69);
		s.getContentPane().add(L1);
		
		JLabel L2 = new JLabel("Let's");
		L2.setForeground(Color.WHITE);
		L2.setFont(new Font("Tahoma", Font.ITALIC, 50));
		L2.setBounds(137, 51, 122, 61);
		s.getContentPane().add(L2);
		
		JLabel lblPlay = new JLabel("Play");
		lblPlay.setFont(new Font("Arial", Font.ITALIC, 50));
		lblPlay.setForeground(Color.WHITE);
		lblPlay.setBounds(137, 111, 107, 61);
		s.getContentPane().add(lblPlay);
		s.setVisible(true);
		
		try
		{
			sleep(2000);
			ss4=new sud4("SETTINGS");
			ss4.setVisible(true);
			s.dispose();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
