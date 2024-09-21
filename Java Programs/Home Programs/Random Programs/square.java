import java.util.*;
public class square
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a,i,j;
        System.out.println("Enter a number");
        a=sc.nextInt();
        for(i=1;i<=a;i++)
        {
            System.out.print("* ");
        }
        System.out.println();
        for(i=1;i<=a-2;i++)
        {
            System.out.print("*");
            for(j=1;j<=2*a-3;j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for(i=1;i<=a;i++)
        {
            System.out.print("* ");
        }
    }
}
