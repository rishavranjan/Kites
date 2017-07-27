import javax.swing.JLabel;

public class sud3 implements Runnable
{
	public static int timeflag=0;
	public static int starttime,lasttime;
	static JLabel l;
	
	public sud3(JLabel l)
	{
		l.setText("0 ");
		starttime=(int)(System.currentTimeMillis()/1000);
		lasttime=starttime;
		this.l=l;
		timeflag=1;
		new Thread(this).start();
	}
	
	public void run()
	{
		do
		{
			lasttime=(int)(System.currentTimeMillis()/1000);
			l.setText((int)(lasttime-starttime)+"   ");
		}while(timeflag!=-1);
		timeflag=0;
	}
}