import java.util.*;
public class Rhombus
{
    public static void main (String[]args)
    {
        Scanner sc =new Scanner (System.in);
        int a,z,i,j,k,l;
        System.out.println("Enter a number");
        a=sc.nextInt();
        for(i=1;i<=a;i++)
        {
            z=a-i+1;
            for(k=1;k<z;k++)
            {         
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {           
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(i=a-1;i>=1;i--)
        {
            z=a-i+1;
            l=1;
            for(k=z;k>1;k--)
            {         
                System.out.print(" ");
            }
            for(j=i;j>=1;j--)
            {           
                System.out.print(l+" ");
                l++;
            }
            System.out.println();
        }
    }
}