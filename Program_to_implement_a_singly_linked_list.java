class linklist{
    Node head;
    int size;
    linklist(){
        this.size = 0;
    }
    static class Node{
        int data;

        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
        Node(){
            this.data = 0;
            this.next = null;
        }
    }
    public void InsertFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++ ;
    }
    public void DeleteFirst(){
        if(head == null){
            System.out.println("list already empty");
            return;
        }
        head = head.next;
        size-- ;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("list already empty");
            return;
        }
        if(head.next == null){
            head = null;
        }
        Node SecondLastNode = head;
        Node LastNode = head.next;
        while(LastNode.next != null){
            LastNode = LastNode.next;
            SecondLastNode = SecondLastNode.next;
        }
        SecondLastNode.next = null;
        size-- ;
    }
    public void InsertLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        Node currentNode = head;
        while(currentNode.next !=null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        size++ ;
    }
    public void printList(){
        Node currentNode = head;
        while(currentNode !=null){
            System.out.print(currentNode.data +"-->");
            currentNode = currentNode.next;
        }
        System.out.print("Null");
        System.out.println();
    }
    public void InsertAtIndex(int target, int index){
        Node newnode = new Node(target);
        Node currnode = head;
        for(int i=0; i<index-1; i++){
            currnode = currnode.next;
        }
        currnode.next = newnode;
        size++;
    }
    public void deleteAtIndex(int index){
        if (head == null) {
            System.out.println("list already empty");
            return;
        }
        Node Pointer = head;
        for(int i=0; i<index-1; i++){
            Pointer = Pointer.next;
        }
        Pointer.next = (Pointer.next).next;
        size-- ;

    }
    public int SizeofLIST(){
        if (head == null) {
            System.out.println("the list is empty");
        }
        Node n1 = head;
        while(head.next != null){
            size++ ;
        }
        return size;
    }
    public static void main(String args[]){
        linklist list1 = new linklist();
        list1.InsertFirst(1);
        list1.InsertFirst(2);
        list1.InsertFirst(3);
        list1.InsertFirst(4);
        list1.InsertFirst(5);
        list1.printList();
        System.out.println("the size is "+ list1.size);
        list1.DeleteFirst();
        list1.printList();
        System.out.println("the size is "+ list1.size);
        list1.deleteLast();
        list1.printList();
        System.out.println("the size is "+ list1.size);
        list1.InsertAtIndex(1,3);
        list1.printList();
        System.out.println("the size is "+ list1.size);
        list1.deleteAtIndex(2);
        list1.printList();
        System.out.println("the size is "+ list1.size);
    }
}
