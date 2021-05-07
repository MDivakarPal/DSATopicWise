import java.util.*;
import mypack.Simple;
class Test
{
    public static void main(String[] args) {
        int a1[]=Simple.inputArray();
        int a2[]=Simple.inputArray();
        String no="Not equals";
        String yes="Yes equals";
        if (a1.length!=a2.length)
        {
            System.out.println(no);
        }
        else
        {
            for(int i=0;i<a1.length;i++)
            {
                if(!search(a2,a1[i]))
                {
                    System.out.println(no);
                    return;
                }
            }
        }
        System.out.println(yes);
    }

    static boolean search(int a[],int k)
    {
        
    }
}