import java.util.*;
public class sevenboom
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int listsize,i,j,b,c=1,d=1;
        System.out.println("Enter the size of list");
        listsize=sc.nextInt();
        int a[]=new int[listsize];
        for(i=0;i<=listsize-1;i++)
        {
            a[i]=sc.nextInt();
        }
        for(j=1;j<=listsize;j++)
        {
            b=a[j-1];
            while(b>0)
            {
                c=b%10;
                if(c==7)
                {
                    d++;
                }
                b=b/10;
            }
        }
        if(d>1)
        {
            System.out.print("Boom");
        }
        else
        {
            System.out.print("There is not a 7 is this list");
        }
    }
}