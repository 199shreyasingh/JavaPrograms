import java.util.*;
class LL{
    Node head;
    int size;
    
    LL(){
        this.size=0;
    }
    
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    void firstadd(String data){
        Node new_node=new Node(data);
        if(head==null){
            head=new_node;
            return;
        }
        new_node.next=head;
        head=new_node;
    
    }

    void lastadd(String data){
        Node new_node=new Node(data);
        if(head==null){
            head=new_node;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=new_node;

    }

    void deletefirst(){

        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        head=head.next;
        size--;
    }
    
    void deletelast(){
        
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            size--;
            return;
        }
        Node secondlast=head;
        Node last=head.next;
        while(last.next!=null){
            secondlast=secondlast.next;
            last=last.next;
        }
        secondlast.next=null;
    }
    
     void size(){
        System.out.println("Size = "+size);
    }

    void printlist(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("Null");
    }

    void reverseiterate(){
        if(head==null || head.next==null){
            return;
        }
                
        Node prev=head;
        Node curr=head.next;
        while(curr!=null){
            Node nextnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }
        head.next=null;
        head=prev;
    }
    
    public static void main(String[] args){
        LL list=new LL();

        list.firstadd("am");
        list.firstadd("I");
        list.printlist();
        list.size();

        list.lastadd("Shreya");
        list.lastadd("Singh");
        list.printlist();
        list.size();

        list.deletefirst();
        list.printlist();
        list.size();

        list.deletelast();
        list.printlist();
        list.size();

        list.reverseiterate();
        list.printlist();
        list.size();
    
    }
}