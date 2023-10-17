package demo_operater;
class Student2
{ 
	int id;  
	String name;  
}  
class Student
{  
public static void main(String args[])
{  
	Student2 s1=new Student2();  
	s1.id=1001;  
	s1.name="Arun.J";  
	System.out.println("Student ID : " +s1.id+"\n"+"Student Name : "+s1.name);
}

}