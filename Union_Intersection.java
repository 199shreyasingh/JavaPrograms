import java.util.*;
class Union_Intersection {
    public static void inuni(int[] nums1, int[] nums2) {

        HashSet<Integer> list1=new HashSet<Integer>();
        HashSet<Integer> list2=new HashSet<Integer>();
        HashSet<Integer> in=new HashSet<Integer>();
        HashSet<Integer> un=new HashSet<Integer>();
        for(int el:nums1){
            list1.add(el);
            un.add(el);
        }
        for(int el:nums2){
            list2.add(el);
            un.add(el);
        }
        for(int i:list1){
                if(list2.contains(i)){
                    in.add(i);
                }
        }
        int[] inter=new int[in.size()];
        int x=0;
        System.out.print("Intersection: ");
        for(int i:in){
            inter[x++]=i;
        }
        Arrays.sort(inter);
        for(int i=0;i<(inter.length);i++){
            System.out.print(inter[i]+" ");
        }
        System.out.println("");
        int[] uni=new int[un.size()];        
        System.out.print("Union: ");
        x=0;
        for(int i:un){
            uni[x++]=i;
        }
        Arrays.sort(uni);
        for(int i=0;i<(uni.length);i++){
            System.out.print(uni[i]+" ");
        }

    }
    public static void main(String[] args){
        int[] nums1={1,2,5,6,2,6};
        int[] nums2={5,6,7,9};
        inuni(nums1,nums2);

    }
}