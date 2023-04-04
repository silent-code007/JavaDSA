class Node5{
    int data;
    Node5 next;
    Node5(int x){
        data =x;
        next = null;
    }
}
class main{
   static Node5 deleteLastNode(Node5 head){
       if(head == null)return null;
       if(head.next == null)return null;
       Node5 curr = head;
       while(curr.next.next != null)
           curr = curr.next;

       curr.next = null;
       return head;
   }
   public static void main(String []args){
       Node5 head = new Node5(10);
       head.next = new Node5(20);
       head.next.next = new Node5(50);
       printList(head);
       head = deleteLastNode(head);
       printList(head);

   }
   static void printList(Node5 head){
       Node5 curr= head;
       while(curr !=null){
           System.out.print(curr.data+" ");
           curr = curr.next;
       }
       System.out.println();
   }
}
//import java.util.*;
//import java.io.*;
//import java.lang.*;
//
//class Node4{
//    int data;
//    Node4 next;
//    Node4(int x){
//        data=x;
//        next=null;
//    }
//}
//
//class Test3 {
//
//    public static void main(String args[])
//    {
//        Node4 head=new Node4(10);
//        head.next=new Node4(20);
//        head.next.next=new Node4(30);
//        printlist(head);
//        head=delTail(head);
//        printlist(head);
//
//    }
//
//    static Node4 delTail(Node4 head){
//        if(head==null)return null;
//        if(head.next==null)return null;
//        Node4 curr=head;
//        while(curr.next.next!=null)
//            curr=curr.next;
//        curr.next=null;
//        return head;
//    }
//    public static void printlist(Node4 head){
//        Node4 curr=head;
//        while(curr!=null){
//            System.out.print(curr.data+" ");
//            curr=curr.next;
//        }System.out.println();
//    }
//}