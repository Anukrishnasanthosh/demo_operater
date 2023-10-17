package demo_operater;
import java.util.*;
class FibonacciSeries {
    void Fibonacci1(int n) 
    {
        int a=1,b=1;
        System.out.print("Fibonacci Series : ");
        for (int i=1;i<=n;i++) 
        {
            System.out.print(a+" ");
            int sum=a+b;
            a=b;
            b=sum;
        }
    }
}
public class Fibonacci {
    public static void main(String[] args) 
    {
    	Scanner s=new Scanner(System.in);
        FibonacciSeries f1=new FibonacciSeries();
        System.out.println("Limit : ");
        int n=s.nextInt();
        f1.Fibonacci1(n);
    }
}
