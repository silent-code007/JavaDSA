
class Node6 {
    int data;
    Node6 next;
    Node6(int d){
        data=d;
        next=null;
    }
}
public class CircularLinkedList {
    public static void main(String args[])
    {
        Node6 head=new Node6(10);
        head.next=new Node6(5);
        head.next.next=new Node6(20);
        head.next.next.next=new Node6(15);
        head.next.next.next.next=head;
        printlist(head);

    }

    public static void printlist(Node6 head){
        if(head==null)return;
        System.out.print(head.data+" ");
        for(Node6 r = head.next; r!=head; r=r.next)
            System.out.print(r.data+" ");
    }
}
