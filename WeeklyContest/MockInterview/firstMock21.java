/*
This interview held on 21 feb 2021 with Mannu Kumar Pandey. They have given me 7 star out of 10
*/


import java.util.*;


double(int a[], int n)
{
    for(int i=0;i<n;i++)
    a[i]=2*a[i];
}

moveNegAndPos(int a[],int n)
{
    int pos[]=new int[n];
    int neg[]=new int[n];
    int j=0,k=0;
    for(int i=0;i<n;i++)
    {
        if(a[i]<0)
        {
            neg[j]=a[i];
            j++;
        }
        else
        {
            pos[k]=a[i];
            k++;
        }
    }
}

swapFirstAndLastcharacter(String s)
{
    int i=0,j=0;
    StringBuffer sd=  new StringBuffer(s);
    while(j<sd.length())
    {
      
        if(sd.charAt(j)==' ')
        {
            char temp=s.charAt(j-1);
            sd.insert(j-1,sd.charAt(i));
            sd.insert(i,temp);
        }
        j++;
    }
            char temp=s.charAt(j-1);
            sd.insert(j-1,sd.charAt(i));
            sd.insert(i,temp);
}

concatTwoString(String s1, String s2)
{
    String res="";
    for(int i=0;i<s1.length();i++)
    {
        res+=s1.charAt(i);
        res+=s2.charAt(i);
    }
    
    return res;
}

String deleteDuplicateChare(String s)
{
    String res="";
    int a[]=new int [26];
    for(int i=0;i<s.length();i++)
    {
        int k=s.charAt(i);
        a[k-97]+=1;
        if(a[k-97]==1)
        res+=s.charAt(i);
    }

    return res;
}
//a b c d e f g h i j k l a b c d e f h i j k l
boolean StringRotetedOrNot(String s1,String s2)
{
    //abcde
    //cdeab
    if(s1.length!=s2.length)
    return false;
    
    if(s1.charAt(0)!=s2.charAt(s2.length()-2) || s1.charAt(1)!=s2.charAt(s2.length()-1))
    return false;

    for(int i=2;i<s2.length();i++)
    {
        if(s1.charAt(i)!=s2.charAt(i))
        return false;
    }

    return true;
}

char MaximumOccuring(String s)
{
    int a[]=new int [26];
    
    for(int i=0;i<s.length();i++)
    {
        int k=s.charAt(i);
        a[k-26]+=1;
    }
    
    int res=0;
    for(int i=0;i<26;i++)
    {
        if(a[i]>a[res])
        res=i;
    }

    return (res+97);
}