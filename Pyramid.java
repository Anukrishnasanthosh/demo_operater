package demo_operater;
public class Pyramid {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		
		for (int i = 0; i < n; i++) 
		{
           for (int j =n-i;j>1; j--) 
           {   
        	   System.out.print(" "); 

           }
           for (int k =0; k <=i; k++) 
           {   
        	   System.out.print("* ");
           }
           System.out.println();
		}
	}
}