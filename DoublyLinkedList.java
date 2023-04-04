class Double{
    int data;
    Double next;
    Double prev;
    Double(int x){
        data = x;
        next = prev = null;
    }
}
public class DoublyLinkedList {
    public static void main(String args[])
    {
        Double head=new Double(10);
        Double temp1=new Double(20);
        Double temp2=new Double(30);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        printlist(head);
        head=insertAtBegin(head,56);
        printlist(head);
        head = insertAtEnd(head,45);
        printlist(head);
    }
    static Double insertAtBegin(Double head,int d){
        Double curr = new Double(d);
        curr.next = head;
        if(head == null){
            return curr;
        }
        head.prev = curr;
        return curr;
    }
    static Double insertAtEnd(Double head,int d){
        Double temp = new Double(d);
        Double curr = head;
        if(head == null){
            return curr;
        }
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        return head;
    }
//static Double insertBegin(Double head,int data){
//    Double temp=new Double(data);
//    temp.next=head;
//    if(head!=null)head.prev=temp;
//    return temp;
//}
    public static void printlist(Double head){
        Double curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }

}

