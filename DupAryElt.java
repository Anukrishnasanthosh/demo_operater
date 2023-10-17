package demo_operater;

public class DupAryElt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a= new int[] {1,2,5,5,6,6,7,2}; 
		 System.out.println("Duplicate elements is: "); 
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(a[i]==a[j])  
	                    System.out.print(a[j]+" "); 
			 }
		 }

	}

}
