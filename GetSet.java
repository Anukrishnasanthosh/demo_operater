package demo_operater;
class Fact
{
	int i,fact=1;
	void setValue(int fact1)
	{
		fact=fact1;
	}
	int getDisplay()
	{
		for(i=1;i<=6;i++)
		{
			 fact=fact*i;
		}
		return fact;
	}
}

public class GetSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fact f=new Fact();
		int fac=f.getDisplay();
		System.out.println("factorial of number : "+fac);

	}

}
