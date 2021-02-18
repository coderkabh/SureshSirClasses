package LinkedLists;

public class LinkedListMainClass {
    public static void main(String[] args) {
        SinglyLinkedLists sll = new SinglyLinkedLists();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode forth = new ListNode(11);

        sll.head.next = second;
        second.next = third;
        third.next = forth;

        sll.insertFirst(34);

        sll.insertLast(100);

        System.out.println(sll.deleteFirst());

        sll.printLinkedList();

        System.out.println(sll.countLength());

        sll.deleteLast();
        sll.printLinkedList();
    }
}
