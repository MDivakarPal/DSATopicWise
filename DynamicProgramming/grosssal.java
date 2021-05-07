import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(grossSalary(n));
    }

    static int grossSalary(int sal)
    {
        int hra=0,da=0;
        if(sal<1550)
        {
            hra=(sal*10)/100;
            da=(sal*80)/100;
        }
        else
        {
            hra=(sal*30)/100;
            da=(sal*90)/100;
        }
        
        return hra+da+sal;
    }
}