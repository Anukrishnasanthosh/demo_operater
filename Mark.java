package demo_operater;
import java.util.Scanner;
public class Mark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total=300;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rollno : ");
		int Rollno = sc.nextInt();
		System.out.println("Enter Student Name : ");
		String Name = sc.next();
		System.out.println("Enter Mark1 : ");
		int m1 = sc.nextInt();
		System.out.println("Enter Mark2 : ");
		int m2 = sc.nextInt();
		System.out.println("Enter Mark3 : ");
		int m3 = sc.nextInt();
		System.out.println("Student ID : "+Rollno);
		System.out.println("Student Name : "+Name);
		System.out.println("M1 : "+m1);
		System.out.println("M2 : "+m2);
		System.out.println("M3 : "+m3);
		int sum=m1+m2+m3;
		System.out.println("Total Mark : "+sum);
		double percentage=(sum/total)*100;
		System.out.println("Percentage : "+percentage);
		if(percentage>=90)
		{
			System.out.println("GRADE : O");
		}
		else if(percentage>=70)
		{
			System.out.println("GRADE : A");
		}
		else if(percentage>=60)
		{
			System.out.println("GRADE : B");
		}
		else if(percentage>50)
		{
			System.out.println("GRADE : C");
		}
		else if(percentage>40)
		{
			System.out.println("GRADE : D");
		}
		else
		{
		System.out.println("Re-attempt");
		}
	    if(sum>=40)
		{
			System.out.println("Result : PASSED");
		}
		else
		{
			System.out.println("Result : FAILED");
		}
	}

}
