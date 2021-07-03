class Test
{
    public static void main(String[] args) {
        print1(3);
    }

    static void print1(int x)
    {
        if(x<=0)
        return;
        print1(x-1);
        System.out.print(x+" ");
        print1(x-1);
    }
}