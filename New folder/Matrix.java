class Test
{
    public static void main(String[] args) {
        int arr[][]={{10,20,30},{40,50,60},{70,80,90}};
      
        rotateArray(arr);
    }

    static void rotateArray(int arr[][])
    {
         
        for(int j=0;j<arr[0].length;j++)
        {
            for(int i=arr.length-1;i>=0;i--)
            System.out.print(arr[i][j]+" , ");
            System.out.println();
        }
    }
}