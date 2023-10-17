package demo_operater;
public class DiffArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={5,7,2,4,9}; 
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			else if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Difference B/w Largest value and Smallest value : " + (max-min));
	}

}
