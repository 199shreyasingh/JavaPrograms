// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class StringProgram {
    
    public static void main(String[] args) {
        String str="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        int l=s.length();
        for(int i=0;i<l;i++){
            char c=s.charAt(i);
            if(Character.isLowerCase(c)){
                str=str+Character.toUpperCase(c);
            }
            else{
                str=str+Character.toLowerCase(c);
            }
        }
        
        for(int i=0;i<l;i++){
            char c=str.charAt(i);
            if(Character.isLowerCase(c)){
                System.out.println("");
            }
            System.out.print(c);
        }
}
}
