package demo_operater;
class Emp
{
    private String name;
    private String designation;
    private int basicPay;
    private double hra;
    private double allowance;
    private double pf;
    private double grossPay;
    private double netPay;
    public Emp(String name, String designation, int basicPay) 
    {
        this.name=name;
        this.designation=designation;
        this.basicPay=basicPay;
        HRA();
        Allowance();
        PF();
        GrossPay();
        NetPay();
    }
    private void HRA() {
        hra=0.10*basicPay;
    }
    private void Allowance() 
    {
        if (designation.equalsIgnoreCase("Manager")) 
        {
            allowance=0.20*basicPay;
        } 
        else 
        {
            allowance=0.12*basicPay;
        }
    }

    private void PF() 
    {
        pf =0.15*basicPay;
    }
    private void GrossPay() 
    {
        grossPay=basicPay+hra+allowance;
    }
    private void NetPay() 
    {
        netPay=grossPay - pf;
    }
    public void display() 
    {
        System.out.println("Employee Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Pay:" + basicPay);
        System.out.println("HRA:" + hra);
        System.out.println("Allowance:" + allowance);
        System.out.println("PF:" + pf);
        System.out.println("Gross Pay:" + grossPay);
        System.out.println("Net Pay:" + netPay);
    }
}
public class EmpCons
{
    public static void main(String[] args) 
    {
        Emp manager=new Emp("Godwin", "Manager",50000);
        Emp emp1=new Emp("Sreejith", "Embloyee", 30000);
        System.out.println("Employee 1 Details:");
        manager.display();
        System.out.println("\nEmployee 2 Details:");
        emp1.display();
    }
}

