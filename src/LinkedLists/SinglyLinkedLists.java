package LinkedLists;

public class SinglyLinkedLists<E> {
    ListNode<E> head;
    int counter = 0;

    public void printLinkedList(){
        ListNode<E> current = head;
        while (current!=null){
            if(current.next != null){
                System.out.print(current.data + " -> ");
            }
            else{
                System.out.print(current.data);
            }
            current = current.next;
        }
        System.out.println();
    }

}
class ListNode<E>{
    E data;
    ListNode<E> next;
    public ListNode(E data){
        this.data = data;
        this.next = null;
    }
}


