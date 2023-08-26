class doublyLinkedList{
    int size;
    doublyLinkedList(){
        size = 0;
        head = null;
    }
    Node head;
    class Node{
        int data;
        Node next;
        Node previous;
        Node(int data){
            this.data = data;
            this.next = null;
            this.previous = null;
        }
        Node(){
            this.data = 0;
            this.next = null;
            this.previous = null;
        }

    }
    public void InsertAtFirst(int data){
        Node n1 = new Node(data);
        n1.next = head;
        head = n1;
        n1.previous = null;
        size++ ;
    }
    public void InsertAtLast(int data){
        Node n1 = new Node(data);
        Node Pointer = head;
        while(Pointer.next != null){
            Pointer = Pointer.next;
        }
        Pointer.next = n1;
        n1.previous = Pointer;
        size++ ;
    }
    public void printList() {
        Node current = head;
        System.out.print("Null <-> ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args){
        doublyLinkedList list1 = new doublyLinkedList();
        list1.InsertAtFirst(1);
        list1.InsertAtLast(2);
        list1.InsertAtLast(3);
        list1.InsertAtLast(4);
        list1.InsertAtLast(5);
        list1.printList();
    }
}
