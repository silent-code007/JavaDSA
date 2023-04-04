class Value{
    int data;
    Value next;
    Value(int x){
        data = x;
        next = null;
    }
}

public class Searching {
static int Search(Value head,int key){
    int pos=1;
    Value curr = head;
    while(curr!= null){
        if(curr.data == key){
            return pos;
        }
        else{
            curr = curr.next;
            pos++;
        }
    }
    return -1;
}
public static void main(String[]args){
    Value head=null;
    head=new Value(10);
    head.next = new Value(20);
    System.out.println(Search(head,20));
}
}
