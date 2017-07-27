import java.io.PrintWriter;
import java.util.TreeSet;
import javax.swing.JFrame;

public class demo extends JFrame 
{
	int arr[][]=new int[9][9];
	int a[][]=new int[9][9];
	int z;
	boolean m,n;
	private TreeSet<Integer> t=new TreeSet<>();
	private TreeSet<Integer> t1=new TreeSet<>();
	private TreeSet<Integer> t2=new TreeSet<>();
	private TreeSet<Integer> t3=new TreeSet<>();
	private TreeSet<Integer> t4=new TreeSet<>();
	private TreeSet<Integer> t5=new TreeSet<>();
	private TreeSet<Integer> t6=new TreeSet<>();
	private TreeSet<Integer> t7=new TreeSet<>();
	private TreeSet<Integer> t8=new TreeSet<>();
	private TreeSet<Integer> t9=new TreeSet<>();
	private TreeSet<Integer> A=new TreeSet<>();
	private TreeSet<Integer> B=new TreeSet<>();
	private TreeSet<Integer> C=new TreeSet<>();
	private TreeSet<Integer> D=new TreeSet<>();
	private TreeSet<Integer> E=new TreeSet<>();
	private TreeSet<Integer> F=new TreeSet<>();
	private TreeSet<Integer> G=new TreeSet<>();
	private TreeSet<Integer> H=new TreeSet<>();
	private TreeSet<Integer> I=new TreeSet<>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		demo frame = new demo();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public demo() 
	{
		fun();
	}
	void fun()
	{
			for(int i=0;i<9;i++)
			{
				System.out.println("=============================================================");
				for(int j=0;j<9;)
				{
					z=(int)(Math.random()*9)+1;
//					System.out.print(z+"		"+j);
					if(t.add(z)==true)
					{
						System.out.println("	"+t);
						
						if(i<3&&j>=6&&j<9)
						{
							m=C.add(z);
							if(j==6)
								n=t7.add(z);
							else if(j==7)
								n=t8.add(z);
							else if(j==8)
								n=t9.add(z);
							if(m==true&&n==true)
							{
								arr[i][j]=z;
								j++;
//								System.out.print(z+"	c	"+j);
//								System.out.println();
								
							}
						}
						if(i<3&&j>=3&&j<6)
						{
							m=B.add(z);
							if(j==3)
								n=t4.add(z);
							else if(j==4)
								n=t5.add(z);
							else if(j==5)
								n=t6.add(z);
							if(m==true&&n==true)
							{
								arr[i][j]=z;
								j++;
//								System.out.print(z+"	b	"+j);
//								System.out.println();
							}
						}
						if(i<3&&j<3)
						{
							m=A.add(z);
							if(j==0)
								n=t1.add(z);
							else if(j==1)
								n=t2.add(z);
							else if(j==2)
								n=t3.add(z);
							if(m==true&&n==true)
							{
								arr[i][j]=z;
								j++;
//								System.out.print(z+"	a	"+j);
//								System.out.println();
							}
						}
						

						if(i>=3&&i<6&&j>=6&&j<9)
						{
							m=F.add(z);
							if(j==6)
								n=t7.add(z);
							else if(j==7)
								n=t8.add(z);
							else if(j==8)
								n=t9.add(z);
							if(m==true&&n==true)
							{
								arr[i][j]=z;
								j++;
//								System.out.print(z+"	f	"+j);
//								System.out.println();
							}
						}
						
						if(i>=3&&i<6&&j>=3&&j<6)
						{
							m=E.add(z);
							if(j==3)
								n=t4.add(z);
							else if(j==4)
								n=t5.add(z);
							else if(j==5)
								n=t6.add(z);
							if(m==true&&n==true)
							{
								arr[i][j]=z;
								j++;
//								System.out.print(z+"	e	"+j);
//								System.out.println();
							}
						}
						if(i>=3&&i<6&&j<3)
						{
							m=D.add(z);
							if(j==0)
								n=t1.add(z);
							else if(j==1)
								n=t2.add(z);
							else if(j==2)
								n=t3.add(z);
							if(m==true&&n==true)
							{
								arr[i][j]=z;
								j++;
//								System.out.print(z+"	d	"+j);
//								System.out.println();
							}
						}
						
						if(i>=6&&i<9&&j>=6&&j<9)
						{
							m=I.add(z);
							if(j==6)
								n=t7.add(z);
							else if(j==7)
								n=t8.add(z);
							else if(j==8)
								n=t9.add(z);
							if(m==true&&n==true)
							{
								arr[i][j]=z;
								j++;
//								System.out.print(z+"	i	"+j);
//								System.out.println();
							}
						}
						if(i>=6&&i<9&&j>=3&&j<6)
						{
							m=H.add(z);
							if(j==3)
								n=t4.add(z);
							else if(j==4)
								n=t5.add(z);
							else if(j==5)
								n=t6.add(z);
							if(m==true&&n==true)
							{
								arr[i][j]=z;
								j++;
//								System.out.print(z+"	h	"+j);
//								System.out.println();
							}
						}

						if(i>=6&&i<9&&j<3)
						{
							m=G.add(z);
							if(j==0)
								n=t1.add(z);
							else if(j==1)
								n=t2.add(z);
							else if(j==2)
								n=t3.add(z);
							if(m==true&&n==true)
							{
								arr[i][j]=z;
								j++;
//								System.out.print(z+"	g	"+j);
//								System.out.println();
							}
						}
						
					}
					
				}
//				System.out.println("++++++++++++++++++++++++++++++++++");
//				System.out.println(t);
//				System.out.println();
				t.clear();
			}
//			print();
	}
	
	void print()
	{
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}