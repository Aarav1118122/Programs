import java.util.*;
public class longestconsecutive
{
    public static void main(String[]args)
    {                  
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int i,c=1,f=0;
        System.out.println("Enter the numbers");
        for(i=0;i<=9;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<=8;i++)
        {
            if(a[i]==a[i+1]-1)
            {
                c++;  
            }
            else
            {
                if (c>f) f=c;
                c=1;
            }   
        }
        if(c>f) f=c;
        System.out.println(f); 
    }      
}