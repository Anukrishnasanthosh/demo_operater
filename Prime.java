package demo_operater;
import java.util.*;
class PrimeN
{
	int i,k=0,n;
	void setValue(int n1)
	{
		n=n1;
	}
	void getDisplay()
	{
		for(i=1;i<=n;i++)
		{
			 if(n%i==0)
			 {
				 k++;
			 }
		}
			if(k==2)
			{
				System.out.println("Is a Prime");
			}
			else
			{
				System.out.println("Is Not a Prime");
			}
	}

}

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int n=sc.nextInt();
		PrimeN p=new PrimeN();
		p.setValue(n);
		p.getDisplay();
		

	}

}

