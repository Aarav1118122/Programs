import java.util.*;
public class pattern
{
    public static void main (String[]args)
    {
        Scanner sc =new Scanner(System.in);
        int n,a,L1,l1,l2,l3,l4,b=2,c=0,L2,l5,l6,l7,l8,d=0,L3,l9,e,f,g,h,i,z,j,k,l;
        System.out.print("Enter the number of sides : ");
        n=sc.nextInt();
        if(n==4)
        {  
            System.out.println("Enter the length of the side");
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
        else if (n==6)
        {
            System.out.println("Enter the length of the side");
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
        else if (n==8)
        {
            System.out.println("Enter the length of the side");
            a=sc.nextInt();
            for(L1=1;L1<=a-1;L1++)
            {
                if(L1==1)
                {
                    for(l1=1;l1<=a-1;l1++)
                    {
                        System.out.print(" ");
                    }
                    for(l2=1;l2<=a;l2++)
                    {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                for(l3=1;l3<=a-b;l3++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                for(l4=1;l4<=2*(a+c)-1;l4++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
                b++;
                c++;
            }   
            for(L2=1;L2<=a-2;L2++)
            {
                System.out.print("*");
                for(l5=1;l5<=2*(a+a-2)-1;l5++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
            for(L3=2*a-1;L3>=a;L3--)
            {
                if(L3==a)
                {
                    for(l9=1;l9<=a-1;l9++)
                    {
                        System.out.print(" ");
                    }
                    for(l6=1;l6<=a;l6++)
                    {
                        System.out.print("* ");
                    }
                    System.out.println();
                    break;
                }
                for(l7=1;l7<=2*a-(L3+1);l7++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                for(l8=1;l8<=2*(a+a-2)-d-1;l8++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
                d+=2;
            }            
        }
        else 
        {
            System.out.println("Not able to make polygon of "+n+" sides.");
        }
    }
}