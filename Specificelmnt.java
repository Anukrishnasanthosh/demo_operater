package demo_operater;
public class Specificelmnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={77,77,65,65,65,77}; 
		int n1=77;
		int n2=65;
		System.out.println("Result : "+result(a,n1,n2));
	}
	public static boolean result(int[] a,int n1,int n2)
	{
		for(int n : a)
		{
			boolean r =n!=n1&&n!=n2;
			if(r)
			{
				return false;
			}
		}
		return true;
	}

}
