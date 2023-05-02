public class LinkedListTest{
    private class Node{
        private int item; //data of node
        private Node next; //link to next node in LL 
        public Node(int itemToInsert, Node linkToNext){
            item = itemToInsert;
            next = linkToNext;
        }
    }
    //reference to first node of LL
    private Node front;
    //insert at the beginning of list
    public void addToFront(int itemToInsert){
        Node n = new Node(itemToInsert,front);
        front = n;
        size+=1;
    }

    public boolean addAfter(int target, int itemToInsert){
        Node p = front;
        while(p!=null&&p.item!=target){
            p = p.next;
        }
        if(p==null){//if you cant find target, return false
            return false;
        }
        else {
            Node n = new Node(itemToInsert,p.next);
            p.next = n;
            size+=1;
            return true;
        }
    }


    private int size;
    public LinkedListTest(){
        front = null;
        size = 0;
    }

    public void clear(){
        front = null;
        size = 0;
    }
    public int getSize(){
        return size;
    }

    public boolean delete (int target){
        Node p1 = front;
        Node p2 = null;
        while(p1!=null&&p1.item!=target){
            p2 = p1; //moves the back pointer to the og pointer
            p1 = p1.next; //moves to next node
        }
        if(p1 ==null){
           //didnt find shit
            return false;
        }
        else if (p1 == front){
            front = front.next;
        }
        else{
            p2.next = p1.next;
        }
        size-=1;
        return true;
    }
    public void print(){
        Node p = front;

        while(p!=null){
            System.out.print(p.item+" ->");
            p = p.next;
        }
        System.out.println("\\");
    }

    public static void main(String[]args){
        LinkedListTest ll = new LinkedListTest();
        ll.addToFront(7);
        ll.addToFront(4);
        ll.addToFront(3);
        ll.addToFront(2);
        ll.addToFront(1);
        ll.print();
        ll.addAfter(4,5);
        ll.print();
        ll.delete(3);
        ll.print();
    }
}