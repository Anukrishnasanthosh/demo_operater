package demo_operater;
public class Overload 
{
    public void talk() 
    {
        System.out.print("Hello");
    }
    public void talk(String name) 
    {
        System.out.println(" "+name);
    }
    public static void main(String[] args) 
    {
        Overload person=new Overload();
        person.talk();
        person.talk("Godu");
    }
}


