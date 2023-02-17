public class linkedlist {
    node head;
    node tail;
    int size=0;

    public class node{
        int data;
        node next;
        public node(int value)
        {
            data=value;
        }
        public node(int value,node next)
        {
            data=value;
            this.next=next;
        }
    }
    public void insertfirst(int val)
    {
        node nd=new node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;

    }
    public void display()
    {
        node temp=head;
        while (temp!=null) {
            System.out.println(temp.value +"->");
            temp=temp.next;
        }
        System.out.println(" end");
    }
    public static void main(String[] args)
    {
        linkedlist list=new linkedlist();
        list.insertfirst(34);
        list.insertfirst(10);
        list.insertfirst(4);
        list.insertfirst(64);
        list.insertfirst(36);
        list.display;
    }


}
