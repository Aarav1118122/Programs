/*import java.util.*;
public class pnc 
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        Scanner ob = new Scanner (System.in);
        String s;
        int n,b,f=1,r,d,e=1,p,c,g=1;
        System.out.println("Enter a number objects(n)");
        n=sc.nextInt();
        System.out.println("Enter a number of places(r)");
        r=sc.nextInt();
        if(n>r)
        {
            System.out.println("Permutation(p) or Combination(c)");
            s=ob.nextLine();
            b=n;        
            if(s.equalsIgnoreCase("p"))
            {
                f=factorial.fact(b);
                d=n-r;
                e=factorial.fact(d);
                p=f/e;
                System.out.println(p);
            }
            if(s.equalsIgnoreCase("c"))
            {
                f=factorial.fact(b);
                d=n-r;
                e=factorial.fact(d);
                g=factorial.fact(r);
                c=f/(e*g);
                System.out.println(c);
            }
        }
        else
        {
            System.out.println("ERROR,not able to calculate");
        }
    }
}*/

