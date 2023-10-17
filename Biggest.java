package demo_operater;
import java.util.*;
public class Biggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[]=new int[100];
		int n,i;
		int max=a[0];
		System.out.println("Enter size of the array : ");
		n =sc.nextInt();
		System.out.println("Enter the elements of the array : ");
		for(i=0;i<n;i++)
		{
		a[i] = sc.nextInt();
		}
		System.out.println("The Biggest element is : ");
		for(int i1=1;i1<=a.length;i1++)
		{
			if(a[i1]>max)
			{
				max=a[i1];
				{
					System.out.println(a[i1]);
				}
			}
		}

	}

}
