import java.util.*;
import java.io.*;
import java.lang.*;

class ListNode{
    int data;
    ListNode next;
    ListNode(int x){
        data=x;
        next=null;
    }
}

class Test2 {


    static ListNode insertEnd(ListNode head, int x){
        ListNode temp=new ListNode(x);
        if(head==null)return temp;
        ListNode curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        return head;
    }

    public static void main(String args[])
    {
        ListNode head=null;
        head=insertEnd(head,10);
        head=insertEnd(head,20);
        head=insertEnd(head,30);
        head=insertEnd(head,40);
        printlist(head);

    }

    public static void printlist(ListNode head){
        ListNode curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}
