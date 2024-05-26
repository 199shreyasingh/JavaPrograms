import java.util.*;

class Anagram {
    static boolean Anag(char[] str1,char[] str2) {

        int l1 = str1.length;
        int l2 = str2.length;
        int flag=0;

        if(l1!=l2)
        {
            return false;
        }
        else
        {
            Arrays.sort(str1);
            Arrays.sort(str2);
            for(int i=0;i<l1;i++)
            {
                if(str1[i]==str2[i])
                { 
                    flag++;
                }                
            }
            if(flag==l1)
            {   return true;  }
            
            else
            {    return false; }
            
        }
    }
    public static void main(String[] args)
    {
        char str1[]={'r','a','c','d'};
        char str2[]={'c','a','r','e'};

        if(Anag(str1,str2))
            System.out.println("It is Anagram");
        else
            System.out.println("It is not Anagram");
    }        
        
}
