//import java.util.*;
//import java.io.*;
//import java.lang.*;
//class List{
//    int data;
//    List next;
//    List(int x){
//        x = data;
//        next =null;
//    }
//
//}
//class Delete{
//
//    public static void main(String[]args){
//        List head = new List(10);
//        head.next = new List(20);
//        head.next.next = new List(30);
//        head=deleteHead(head);
//        printlist(head);
//
//    }
//    static List deleteHead(List head){
//        if(head == null){
//            return null;
//        }
//        else{
//            return head.next;
//        }
//    }
//
//    public static void printlist(List head){
//        List curr=head;
//        while(curr!=null){
//            System.out.print(curr.data+" ");
//            curr=curr.next;
//        }
//    }
//}
import java.util.*;
import java.io.*;
import java.lang.*;

class Node3{
    int data;
    Node3 next;
    Node3(int x){
        x = data;
        next=null;
    }
}

class Test {

    public static void main(String args[])
    {
        Node3 head=new Node3(10);
        head.next=new Node3(20);
        head.next.next=new Node3(30);
        printlist(head);
        head=delHead(head);
        printlist(head);

    }

    static Node3 delHead(Node3 head){
        if(head==null)return null;
        else{
            return head.next;
        }
    }
    public static void printlist(Node3 head){
        Node3 curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
}