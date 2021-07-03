import java.io.*;
import java.util.*;

import jdk.internal.org.jline.utils.InputStreamReader;
class Test
{
    public static void main(String[] args) throws Excetion{
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        int m=Integer.parseInt(rd.readLine());
        int n=Integer.parseInt(rd.readLine());
        int a[][]=new int[m][n];

        for(int i=0;i<m;i++)
        {
            String str[]=rd.readLine().split(" ");
            for(int j=0;j<n;j++)
            a[i][j]=Integer.parseInt(str[j]);
        }

        for(int i=0;i<m;i++)
        System.out.println(Arrays.toString(a[i]));

    }
}