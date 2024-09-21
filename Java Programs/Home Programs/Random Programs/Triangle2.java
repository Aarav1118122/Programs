import java.util.*;
public class Triangle2
{
    public static void main (String[]args)
    {
        Scanner sc =new Scanner (System.in);
        int a,b,n,i,j,k,l=0;
        System.out.println("Enter a number");
        a=sc.nextInt();
        b=a;
        for(i=1;i<=a;i++)
        {    
            n=b*2-2;
            for(k=0;k<n;k++)
            {         
                System.out.print(" ");
            }
            for(j=1;j<=i+l;j++)
            {           
                System.out.print(j+" ");
            }
            l++;
            b--;
            System.out.println();
        }
    }
}
/*    
        1
      1 2 3   
    1 2 3 4 5   
  1 2 3 4 5 6 7
1 2 3 4 5 6 7 8 9    
   
   
   
   
   */

