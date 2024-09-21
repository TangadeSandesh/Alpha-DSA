import java.util.*;

public class AreaCircle {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float r=sc.nextFloat();
        float A=3.14f*r*r;
        System.out.println("Area of circle="+ A);
    }    
}
