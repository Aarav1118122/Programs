import java.util.*;
public class hexagon
{
    public static void main (String[]args)
    {
        Scanner sc =new Scanner (System.in);
        int a,b,c,d,e,f,g,h,i;
        System.out.println("Enter a number");
        a=sc.nextInt();
        for(b=1;b<=a;b++)
        {
            c=a-b+1;
            for(e=1;e<c;e++)
            {         
                System.out.print(" ");
            }
            System.out.print("*");
            g=2*(b-1)-1;
            for(f=1;f<=g;f++)
            {
                System.out.print(" ");
            }
            if(b>=2)
            {
                 System.out.print("*");
            }
            System.out.println();
        }
        for(h=1;h<=a-2;h++)
        {
            c=2*(a-2);
            System.out.print("* ");
            for(i=1;i<=c;i++)
            {
                System.out.print(" ");
            }
            System.out.print("* ");
            System.out.println();
        }
        for(b=a;b>=1;b--)
        {
            c=a-b+1;
            for(e=c;e>1;e--)
            {         
                System.out.print(" ");
            }
            System.out.print("*");
            g=2*(b-1)-1;
            for(f=1;f<=g;f++)
            {
                System.out.print(" ");
            }
            if(b>=2)
            {
                 System.out.print("*");
            }
            System.out.println();
        }
    }
}