// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class ArrayProgram {
    public static void sort(int[] a,int l) {
        int temp;
        for(int i=0;i<l;i++){
            for(int j=0;j<l-i-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    
    }
    public static void main(String[] args) {
        int x=0,y=0,temp;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a size: ");
        int l=sc.nextInt();
        int a[]=new int[l];
        int e[]=new int[l];
        int o[]=new int[l];
        for(int i=0;i<l;i++){
            System.out.print("Enter element "+i+": ");
            a[i]=sc.nextInt();
        }
        
        for(int i=0;i<l;i++){
            if(i%2==0){
                e[x]=a[i];
                x++;
            }
            else{
                o[y]=a[i];
                y++;
            }
        }
        sort(e,x);
        sort(o,y);
        System.out.print("Even: ");
        for(int i=0;i<x;i++){
            System.out.print(e[i]+" ");
        }
        System.out.println("");

        System.out.print("Odd: ");
        for(int i=0;i<y;i++){
            System.out.print(o[i]+" ");
        }    
        System.out.println("");
        int sum=e[x-2]+o[y-2];
        System.out.println("Sum: "+sum);
}
}
