import java.util.*;
public class Arrow
{
    public static void main (String[]arg)
    { 
        Scanner sc = new Scanner(System.in);
        int n,i,j,k;
        System.out.println("Enter a number");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");   
            }
            System.out.println();
        }
        for(i=n-1;i>=1;i--)
        {
            k=1;
            for(j=i;j>=1;j--)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}