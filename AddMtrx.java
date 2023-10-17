package demo_operater;
import java.util.Scanner;
public class AddMtrx {
 public static void main(String args[])
   {
      int a,b,c,d;
      Scanner s=new Scanner(System.in);
      System.out.println("Input number of rows of matrix : ");
      a=s.nextInt();
      System.out.println("Input number of columns of matrix : ");
      b=s.nextInt();
      int a1[][]=new int[a][b];
      int a2[][]=new int[a][b];
      int sum[][]=new int[a][b];
      System.out.println("Input elements of first matrix : ");
      for(c=0;c<a;c++)
         for(d=0;d<b;d++)
            a1[c][d]=s.nextInt();
      System.out.println("Input the elements of second matrix : ");
      for(c=0;c<a;c++)
         for(d=0;d<b;d++)
            a2[c][d]=s.nextInt();
      for(c=0;c<a;c++)
         for(d=0;d<b;d++)
             sum[c][d]=a1[c][d]+a2[c][d]; 
      System.out.println("Sum of the matrices:-");
      for(c=0;c<a;c++)
      {
         for(d=0;d<b;d++)
            System.out.print(sum[c][d]+"\t");
         System.out.println();
      }
   }
}

