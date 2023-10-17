package demo_operater;
import java.util.*;
public class Vote {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : ");
		int a = sc.nextInt();
		if(a>=18)
		{
			System.out.println("Eligible for Votting");
		}
		else
		{
		System.out.println("Not Eligible for Votting");
		}
	}

}
