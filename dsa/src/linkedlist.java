public class linkedlist {
    public node head;
    public node tail;
    public int size=0;

    private class node{
        private int data;
        private node next;
        public node(int data)
        {
            this.data=data;
        }
        public node(int data,int index)
        {
            this.data=data;

        }
    }
    public void insertatfirst(int data)
    {
        node nd=new node(data);
        nd.next=head;
        head=nd;
        if(tail==null)
        {
            tail=head;
        }
        size+=1;

    }
    public void insertatend(int data){
        node nd=new node(data);
        if(tail==null)
        {
            head=nd;
            tail=nd;
            return;
        }
        tail.next = nd;
        tail = nd;

        size+=1;
    }
    public void insertatsomeindex(int data,int index)
    {
        node nd =new node(data,index);
    }
    public void sizeofnode()
    {
        System.out.println(size);
    }
    public void display()
    {
        node temp=head;
        while (temp!=null) {
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.println(" end");
    }
    public static void main(String[] args)
    {
        linkedlist list=new linkedlist();
//        list.insertatfirst(34);
//        list.insertatfirst(10);
//        list.insertatfirst(4);
//        list.insertatfirst(64);
//        list.insertatfirst(36);
//        list.display();
//        list.sizeofnode();;
        list.insertatend(90);
        list.insertatend(91);
        list.insertatend(92);

        list.display();

    }


}
