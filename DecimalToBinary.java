import java.util.*;

class DecimalToBinary
{
    public static void main(String args[])
    {
        String rev="",d;int a;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int n=num;
        if(n==0)
        {
            rev="0";
        }
        else
        {
            while(n>0)
            {
                a=n%2;
                d=Integer.toString(a);
                rev=d+rev;
                n=n/2;
            }
        }
        
            System.out.println(rev);
        
    }
}