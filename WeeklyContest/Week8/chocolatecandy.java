import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int aa[]=new int[a];
        int bb[]=new int[b];
        int cc[]=new int[c];
        for(int i=0;i<a;i++)
        aa[i]=sc.nextInt();

        for(int i=0;i<b;i++)
        bb[i]=sc.nextInt();

        for(int i=0;i<c;i++)
        cc[i]=sc.nextInt();

        Arrays.sort(cc);
        Arrays.sort(aa);
        Arrays.sort(bb);

      
        int xx[]=copyArray(aa,x,a);
        int yy[]=copyArray(bb,y,b);
        
        int xyc[]=new int[x+y+c];
        xyc=mergeArray(xx,x,xyc,0);
        xyc=mergeArray(yy,y,xyc,x);
        xyc=mergeArray(cc,c,xyc,(x+c));  
        Arrays.sort(xyc);
        int totalEat=x+y;
        long maxSweet=0;
        int k=xyc.length-1;
        while(totalEat>0)
        {
          maxSweet+=xyc[k];
          k--;
          totalEat--;
        }

        System.out.println(maxSweet);
        //System.out.println(Arrays.toString(xyc));
    }

    static int [] mergeArray(int xx[],int x,int xyc[],int l )
   {
        int i=0;
        while(i<x)
        {
        xyc[l]=xx[i];
        i++;
        l++;
        }
       return xyc;
   }

    static int [] copyArray(int aa[],int x,int a)
    {
        int xx[]=new int[x];
        int l=a-1;
        for(int i=0;i<x;i++)
        {
        xx[i]=aa[l];
        l--;
        }

        return xx;
    }
}