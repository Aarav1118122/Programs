import java.util.*;
public class distance
{    
    public static void main(String[]args)
    {       
        Scanner sc = new Scanner(System.in);
        double d,x1,y1;
        int x[]=new int[2];
        int y[]=new int[2];
        System.out.println("Enter first quardinates");
        x[0]=sc.nextInt();
        y[0]=sc.nextInt();
        System.out.println("Enter second quardinates");
        x[1]=sc.nextInt();
        y[1]=sc.nextInt();
        x1=Math.abs(x[1]-x[0]);
        y1=Math.abs(y[1]-y[0]);
        d=Math.hypot(x1,y1);
        System.out.println("The distance between "+x[0]+","+y[0]+" and "+x[1]+","+y[1]+" is "+d);
    }
}