import java.util.*;
public class threenplus1
{
    public static void main() 
    {
        for(int i = 1; i <= 10;i++)
        {
            fnc(i);
        }
    }

    public static void fnc(int number)
    {
        int node, maximum, iterations = 0;
        node = number;
        maximum = node;
        System.out.print(number + " , ");
        while(node!=1)
        {
            if(node%2 == 1)
            {
                node = node*3+1;
                System.out.print(node+" , ");
            }
            else
            {
                node = node/2;
                System.out.print(node+" , ");
            }
            if(node>maximum)
            {
                maximum = node;
            }
            iterations++;
        }
        System.out.println("num = "+number +" itr= "+iterations + " and max " + maximum);
    }
}
