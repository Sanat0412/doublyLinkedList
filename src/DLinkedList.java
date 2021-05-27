public class DLinkedList {
    public Node head;
    public Node tail;

    public DLinkedList() {
        this.head = null;
        this.tail = null;
    }
    public void insertAtEnd(Node newNode){
        if (head==null && tail==null){
            head=tail=newNode;
            return;
        }
        newNode.prev=tail;
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        if (head!=null){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data + "-> <-");
            temp=temp.next;
        }
            System.out.println();
        }
    }
}
