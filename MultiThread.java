package demo_operater;
class Oddeven extends Thread
{
	public void run()
	{
		int i;
		System.out.println("Printing Odd Even Numbers :");
		for(i=1;i<+20;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even Number : "+i);
			}
			else
			{
				System.out.println("Odd Number : "+i);
			}
		}
		System.out.println("Exit from Thread Oddeven");
	}
}
class Rev extends Thread
{
	public void run()
	{
		System.out.println("Reverse a String :");
		String s="Java Programming";
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
		System.out.println("Exit from Thread Rev");
	}
}
class Mul extends Thread
{
	public void run()
	{
		int i,j,k=6;
		System.out.println("Multiplication Tables :");
		for(i=1;i<=10;i++)
		{
			j=i*k;
			System.out.println(i+"*"+k+"="+j);
		}
		System.out.println("Exit from Thread Mul");
	}
}
public class MultiThread 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Rev r=new Rev();
		Mul m=new Mul();
		Oddeven o=new Oddeven();
		r.start();
		m.start();
		o.start();
		}
}
