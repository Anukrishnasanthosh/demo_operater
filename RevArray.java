package demo_operater;

public class RevArray 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {1789,2035,1899,1456,2013,1458,2458,1254,1472,2365,1456,2165,1457,2456};
		System.out.println("Original array: ");  
		for (int i=0;i<a.length;i++) 
		{  
            System.out.print(a[i]+",");  
        }  
		System.out.println();  
        System.out.println("Array in reverse order: ");
        for (int i=a.length-1;i>=0;i--) 
        {  
            System.out.print(a[i]+",");  
        }  
	}

}
