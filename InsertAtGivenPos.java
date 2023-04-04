
class Node1{
    int data;
    Node1 next;
    Node1(int x){
        data =x;
        next = null;
    }
}

class InsertAtGivenPos {
static Node1 insertAtS(Node1 head,int pos,int data){
    Node1 temp = new Node1(data);
    if (head == null) {
        if (pos == 1) return temp;
        else return head;
    }
    if (pos == 1) {
        temp.next = head;
        return temp;
    }
    Node1 curr = head;
    for (int i=1; i<pos-1 && curr!=null; i++){
        curr=curr.next;
    }
    if(curr == null){
        return head;
    }
    temp.next=curr.next;
    curr.next = temp;
    return head;
}
    public static void main(String args[])
    {
        Node1 head=null;
        head=new Node1(10);
        head.next = new Node1(20);
        printlist(head);
        head = insertAtS(head,1,100);
        printlist(head);

    }

    public static void printlist(Node1 head){
        Node1 curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
}
