import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter your array");
        for(int i=0;i<n;i++)
        a[i]=(-1)*sc.nextInt();
      
        // Use the array as hashmap
        int i=0;
        while(i<n)
        {
            int index=Math.abs(a[i])-1;
            if(a[i]>=0)
            i++;
            else 
            {
                if(a[index]>=0)
                {
                    a[index]+=1;
                    a[i]=0;
                }

                else
                {
                    a[i]=a[index];
                    a[index]=1;
                }
            }
            System.out.println(i);
        }
        System.out.println(Arrays.toString(a));
    }
}