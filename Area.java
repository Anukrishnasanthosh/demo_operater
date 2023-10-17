package demo_operater;
class Area1 
{
    private static double area;
    public static double RectArea(double length, double width) 
    {
        area=length*width;
        return area;
    }
    public static double RhombArea(double dia1, double dia2) {
        area=(dia1*dia2)/2.0;
        return area;
    }
}
public class Area
{
    public static void main(String[] args) 
    {
        double rectangleArea=Area1.RectArea(5.0, 7.0);
        double rhombusArea=Area1.RhombArea(6.0, 8.0);
        System.out.println("Area of Rectangle: " +rectangleArea);
        System.out.println("Area of Rhombus: " +rhombusArea);
    }
}

