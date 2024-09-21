import java.util.*;
import java.lang.*;
public class magiccalculator
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        Scanner ob=new Scanner(System.in);
        String a,c,d="reveal the secrets";
        long b=0,f;
        boolean e;
        System.out.println("Hi");
        a=ob.nextLine();
        e=a.equalsIgnoreCase(d);
        if (e==true)
        {
            System.out.println("Enter the secret number");
            b=sc.nextLong();
            System.out.print("\f");
        }
        f=sc.nextInt();
        c=ob.nextLine();
        f=sc.nextInt();
        c=ob.nextLine();
        f=sc.nextInt();
        c=ob.nextLine();
        f=sc.nextInt();
        System.out.println(b);
    }
}