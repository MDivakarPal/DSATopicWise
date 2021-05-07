static void Print_Digits(int N){
//Enter your code here
if (N==0)
return ;
switch (N%10)
{
    case 1:
    Print_Digits(N/10);
    System.out.print("one ");
    break;
    case 2:
    Print_Digits(N/10);
    System.out.print("two ");
    break;
    case 3:
    Print_Digits(N/10);
    System.out.print("three ");
    break;
    case 4:
    Print_Digits(N/10);
    System.out.print("four ");
    break;
    case 5:
    Print_Digits(N/10);
    System.out.print("five ");
    break;
    case 6:
    Print_Digits(N/10);
    System.out.print("six ");
     break;
    case 7:
    Print_Digits(N/10);
    System.out.print("seven ");
    break;
    case 8:
    Print_Digits(N/10);
    System.out.print("eight ");
    break;
    case 9:
    Print_Digits(N/10);
    System.out.print("nine ");
    
    break;
    default :
    Print_Digits(N/10);
    System.out.print("zero ");
    break;

}
}