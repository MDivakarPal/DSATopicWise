import java.util.*;
class Test
{
    static ArrayList<Integer> list2=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a1[][]=new int[4][4];
        int a2[][]=new int[4][4];
        int a3[][]=new int[4][4];
        int a4[][]=new int[4][4];
        int a5[][]=new int[4][4];
        //fill first card
        int j=1;
        for(int i=0;i<4;i++)
        {
            for(int k=0;k<4;k++)
            {
              a1[i][k]=j;
              j+=2;
            }
        }

        boolean st=true;
        j=2;
        for(int i=0;i<4;i++)
        {
            for(int k=0;k<4;k++)
            {
              a2[i][k]=j;
              if(st)
              j++;
              else
              j+=3;
              st=!st;
            }
        }

        // Card 3
        j=4;
        for(int i=0;i<4;i++)
        {
            for(int k=0;k<4;k++)
            {
              a3[i][k]=j;
              j++;
            }
            j+=4;
        }

        // Card 4
        j=8;
        for(int i=0;i<4;i++)
        {
            for(int k=0;k<4;k++)
            {
              a4[i][k]=j;
              j++;
            }
            if(i==1)
            j=24;
        }

        // Card 5
        j=16;
        for(int i=0;i<4;i++)
        {
            for(int k=0;k<4;k++)
            {
              a5[i][k]=j;
              j++;
            }
        }
        boolean status[]=new boolean[5];
        int n=1;
        System.out.println("Enter 0 for No 1 for yes");
        
            System.out.println("Is your birth day present in this card");
            printArray(a1);
            n=sc.nextInt();
            
            if(n==0)
            status[0]=false;
            else
            status[0]=true;
            System.out.println("Is your birth day present in this card");
            printArray(a2);
            n=sc.nextInt();
            if(n==0)
            status[1]=false;
            else
            status[1]=true;
            System.out.println("Is your birth day present in this card");
            printArray(a3);
            n=sc.nextInt();
            if(n==0)
            status[2]=false;
            else
            status[2]=true;
            System.out.println("Is your birth day present in this card");
            printArray(a4);
            n=sc.nextInt();
            if(n==0)
            status[3]=false;
            else
            status[3]=true;
            System.out.println("Is your birth day present in this card");
            printArray(a5);
            n=sc.nextInt();
            if(n==0)
            status[4]=false;
            else
            status[4]=true;
            int visitedStatus[]={-1,-1,-1,-1,-1};
           // System.out.println(Arrays.toString(status));
            for(int i=0;i<5;i++)
            {
                if(status[i])
                {
                  visitedStatus[i]=1;
                  switch (i+1) {
                    case 1:
                      list2=intersectionOfTwo(list2,twoDToOneD(a1));
                      break;
                    case 2:
                      list2=intersectionOfTwo(list2,twoDToOneD(a2));
                      break;
                    case 3:
                      list2=intersectionOfTwo(list2,twoDToOneD(a3));
                      break;
                    case 4:
                      list2=intersectionOfTwo(list2,twoDToOneD(a4));
                      break;
                    case 5:
                      list2=intersectionOfTwo(list2,twoDToOneD(a5));
                      break;
                  }
                }
            }


            //Delete a element from list2
           
            for(int i=0;i<5;i++)
            {
              
              if(visitedStatus[i]==-1)
              {
                switch (i+1) {
                  case 1:
                    list2=deleteCommonElement(list2,twoDToOneD(a1));
                    break;
                  case 2:
                    list2=deleteCommonElement(list2,twoDToOneD(a2));
                    break;
                  case 3:
                    list2=deleteCommonElement(list2,twoDToOneD(a3));
                    break;
                  case 4:
                    list2=deleteCommonElement(list2,twoDToOneD(a4));
                    break;
                  case 5:
                    list2=deleteCommonElement(list2,twoDToOneD(a5));
                    break;
                }
              }
              visitedStatus[i]=1;
            }

            System.out.println("Your birth date is "+list2);
    }

    static void printArray(int a[][])
    {
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
              System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    static ArrayList<Integer> intersectionOfTwo(ArrayList<Integer> list1, int a[])
    {
       ArrayList<Integer> list=new ArrayList<Integer>();
       if(list1.isEmpty())
       {
         for(int i=0;i<a.length;i++)
         list.add(a[i]);
         return list;
       }
       for(int i=0;i<list1.size();i++)
       {
           for(int j=0;j<a.length;j++)
           {
             if(a[j]==list1.get(i))
             list.add(a[j]);
           }
       }

      return list;
    }

    static int[] twoDToOneD(int a[][])
    {
        int res[]=new int [16];
        int k=0;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
           { res[k]=a[i][j];
            k++;
           }
        }
        return res;
    }
     
    static ArrayList<Integer> deleteCommonElement(ArrayList<Integer> list1,int a[])
    {

      ArrayList<Integer> list=new ArrayList<>();
         for(int i=0;i<list1.size();i++)
         {
           for(int j=0;j<a.length;j++)
           {
             if(a[j]!=list1.get(i))
             list1.remove(new Integer(a[j]));
           }
         }

         return list1;
    }

}