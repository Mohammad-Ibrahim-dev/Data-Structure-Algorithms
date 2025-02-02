package LinkedList;

class LL{
//    creation of node
    public class Node{
        int data;
        Node next;
        Node(int data){
        this.data=data;
        next=null;
        size++;
        }
    }
    Node head=null;
    Node last=null;
    int size=0;

//    insertion of node at starting
    public void insertFirst(int data){
        Node newnode= new Node(data);
        newnode.next=head;
        if(head==null){
        last=newnode;}
        head=newnode;
    }

//      insertion of node at last
    public void insertLast(int data){
        Node newnode= new Node(data);
        last.next=newnode;
        if(head==null){
        head=newnode;}
        last=newnode;
    }

//    insertion of node at middle of node
    public void insertMiddle(int index,int data){
        if(index<=0 || index>size){
            System.out.println("invalid index");
            return;
        }

        Node curNode=head;
        Node prevNode=head;
        for (int i = 1; i <= index; i++) {
            if(index==1){
                insertFirst(data);
                return;
            }
            if(i==index){
                Node newnode=new Node(data);
                newnode.next=curNode;
                prevNode.next=newnode;
            }
            prevNode=curNode;
            curNode=curNode.next;
        }
    }

//      deletion of node at first
    public void deleteFirst(){
        if (head==null){
        System.out.println("list is empty");
        return;
        }
        size--;
        if (head == last) {
            head=null;
            last=null;
            return;
        }
        head=head.next;
    }

//      deletion of node at last
    public void deleteLast(){
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        if(head==last){
            head=null;
            last=null;
            return;
        }
        Node CurNode=head;
        while(CurNode.next!=last){
            CurNode=CurNode.next;
        }
        CurNode.next=null;
        last=CurNode;
    }

//    to print linkedList
    public void show() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node curNode = head;
        while (curNode!=null) {
            System.out.print(curNode.data + " ");
            curNode = curNode.next;
        }
        System.out.println();
    }
//      to print the size of LL
    public void Size(){
        int count=0;
        Node curNode=head;
        while(curNode!=null) {
            count++;
            curNode=curNode.next;
        }
        System.out.println(count);
    }
//      to show last value of LL
    public void lastValue(){
        System.out.println(last.data);
    }

//    to sort the LL
    public void SortLL(){
        Node curNode= head;
        Node nextNode= curNode.next;
        for (int i = 0; i <size-1 ; i++) {
            for(int j = 0; j <size-i-1 ; j++) {
                if (curNode.data> nextNode.data){
                    int temp=curNode.data;
                    curNode.data= nextNode.data;
                    nextNode.data=temp;
                }
                curNode=nextNode;
                nextNode=curNode.next;
            }
            curNode= head;
            nextNode= curNode.next;
        }
        show();
    }

    public void reversed(){
        Node curNode=head;
        for (int i = 0; i <size/2 ; i++) {
            for (int j = i; j < size; j++) {
                if(j==size-1){
                    int temp= curNode.data;

                }
            }
        }
    }

    public void getIndex(int data){
        Node curNode= head;
        if(head==null){
            System.out.println("empty list");
        }
         int indx=0;
        while(curNode!=null){
            if(curNode.data==data){
                System.out.println("index="+indx);
                break;
            }
            indx++;
            curNode=curNode.next;
        }
    }
}


public class LnkdList{
    public static void main(String[] args) {
     LL obj= new LL();
     obj.insertFirst(4);
     obj.insertFirst(6);
     obj.insertFirst(34);
     obj.insertFirst(87);
     obj.insertLast(43);
     obj.insertLast(23);
     obj.insertMiddle(3,10);
     obj.show();
     obj.getIndex(4);
     obj.Size();
     obj.SortLL();
     obj.deleteFirst();
     obj.show();
     obj.deleteFirst();
     obj.show();
     obj.deleteLast();
     obj.deleteLast();
     obj.show();
     obj.lastValue();
     obj.Size();
     obj.show();
    }
}