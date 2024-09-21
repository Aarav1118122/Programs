import java.util.*;
public class hollowrhombus
{
    public static void main (String[]args)
    {
        Scanner sc =new Scanner (System.in);
        int a,b,c,d,e,f,g;
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
        for(b=a-1;b>=1;b--)
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