package LinkedList;

public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            next=null;
            prev=null;
            size++;
        }
    }
    int size=0;
    Node head=null;
    Node last=null;
    public void insertFirst(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        if (head == null) {
            last=newnode;
            head=newnode;
            return;
        }
        head.prev=newnode;
        head=newnode;
    }

    public void insertLast(int data){
        Node newnode =new Node(data);
        newnode.prev=last;
        if(head==null){
            last=newnode;
            head=newnode;
            return;
        }
        last.next=newnode;
        last=newnode;
    }

    public void deleteFirst(){
        if (head==null){
            System.out.println("empty list");
            return;
        }
        size--;
        if (head==last) {
            head=null;
            last=null;
            return;
        }
        head=head.next;
        head.prev=null;
    }

    public void deleteLast(){
        if (head == null) {
            System.out.println("empty list");
            return;
        }
        size--;
        if (head==last) {
            head=null;
            last=null;
            return;
        }
        last=last.prev;
        last.next=null;
    }

    public void getSize(){
        System.out.println("size: "+size);
    }
    public void show(){
        if (head == null) {
            System.out.println("empty list");
            return;
        }
        Node curNode=head;
        while(curNode!=null){
            System.out.print(curNode.data+" ");
            curNode=curNode.next;
        }
    }
    public static void main(String[] args) {
        DoubleLL list =new DoubleLL();
        list.insertFirst(0);
        list.insertFirst(-1);
        list.insertFirst(-2);
        list.insertFirst(-3);
        list.insertFirst(-4);
        list.insertFirst(-5);
        list.show();
        list.getSize();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.show();
        list.getSize();
        list.deleteLast();
        list.deleteLast();
        list.deleteLast();
        list.deleteLast();
        list.deleteLast();
        list.show();
        list.getSize();
        list.deleteFirst();
        list.deleteFirst();
        list.deleteFirst();
        list.deleteFirst();
        list.deleteFirst();
        list.show();
        list.getSize();
    }
}
