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
    public void insertFirst(E data){

        if(head == null) head = new ListNode<>(data);

        //Sir's code
        ListNode<E> newNode = new ListNode<>(data);
        newNode.next = head;
        head = newNode;


        //My code
        /*ListNode<E> temp = head;
        head = new ListNode<>(data);
        head.next = temp;*/
    }

    public void insertLast(E data){
        ListNode<E> current = head;

        if(current == null){
            head = new ListNode<>(data);
        }

        while (current.next != null) {
            current = current.next;
        }
        current.next = new ListNode<>(data);
    }

    public ListNode<E> deleteFirst(){
        if(head == null) return null;
        else{
            ListNode<E> current = head;
            head = head.next;
            current.next = null;
            return current;
        }
    }

    public ListNode<E> deleteLast(){
        if(head == null || head.next == null){
            return head;
        }
        ListNode<E> current = head;
        ListNode<E> prev = null;

        while (current.next!=null){
            prev = current;
            current = current.next;
        }
        prev.next = null;
        return current;
    }

    public void insertAtPosition(int position, E data){
        ListNode<E> node = new ListNode<>(data);
        if(position == 1){
            node.next = head;
            head = node;
        }
        else{
            ListNode<E> previous = head;
            int count = 1;
            while (count<position-1){
                previous = previous.next;
                count++;
            }
            ListNode<E> current = previous.next;
            previous.next = node;
            node.next = current;
        }
    }

    public void deleteAtPosition(int position){
        if(position == 1){
            head = head.next;
        }
        else{
            ListNode<E> previous = head;
            int count = 1;
            while (count<position-1){
                previous = previous.next;
                count++;
            }
            ListNode<E> current = previous.next;
            previous.next = current.next;
        }
    }


    public int countLength(){
        int count = 0;
        ListNode<E> temp = head;
        if(head == null) return 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
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


