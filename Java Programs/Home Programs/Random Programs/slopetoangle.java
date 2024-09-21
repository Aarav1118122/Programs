import java.util.*;
public class slopetoangle
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        double s,r,d;
        s=sc.nextInt();
        r=Math.atan(s);
        d=Math.toDegrees(r);
        System.out.println(d);
    }
}
