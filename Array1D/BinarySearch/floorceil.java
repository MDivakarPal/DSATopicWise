static void floorAndCeil(int a[], int n, int x){	
//Enter your code here

int l=0,r=n-1;
int min=-1;
while(l<=r)
{
    int mid=l+(r-l)/2;
    if(a[mid]==x)
    {
        min=a[mid];
        break;
    }
    if(a[mid]<x)
    {
        min=a[mid];
        l=mid+1;
    }
    else
    r=mid-1;
}
System.out.print(min+" ");

l=0;r=n-1;
min=-1;
while(l<=r)
{
    int mid=l+(r-l)/2;
    if(a[mid]==x)
    {
        min=a[mid];
        break;
    }
    //2 5 6 11 15
    if(a[mid]>x)
    {
        min=a[mid];
        r=mid-1;
    }
    else
    l=mid+1;
}
System.out.print(min);

System.out.println();
}