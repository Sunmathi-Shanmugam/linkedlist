
 class node // doubly circular linkedlist
{
    int data;
    node next;
    node prev;
    node(int d)
    {
        data=d;
        prev=null;
        next=null;
    }
}

class linkdlist 
{
    node head=null;
    node tail=null;
    void insertb(int d) {
        node nnode = new node(d);
        if (head == null) {
            head = nnode;
            tail = nnode;
            head.next = head;
            head.prev = head;
        } else {
            nnode.next = head;
            nnode.prev = tail;
            tail.next = nnode;
            head.prev = nnode;
            head = nnode;
        }
    }
    void insertl(int d)
    {
        node nnode=new node(d);
      if(head==null)
      {
           nnode.next=head;
            head=nnode;
            tail=head;
      }
      else
      {
         tail.next=nnode;
         nnode.prev=tail;
         nnode.next=head;
         head.prev=nnode;
         tail=nnode;
      }
    }
    
    void deleteb()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        else
        {
            head=head.next;
            tail.next=head;
            head.prev=tail;
        }
    }
    
    void deletel()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        else 
        {
            tail=tail.prev;
            tail.next=head;
            head.prev=tail;
            
            
        }
    }
    
    void display()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        else
        {
            node temp=head;
            do 
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }while(temp!=head);
            System.out.println("\n");
        }
    }
}


public class linkedlist
{
    public static void main(String[] args)

    {
        
        linkdlist l1=new linkdlist();
        l1.insertb(12);
        l1.insertb(67);
        l1.insertb(90);
        l1.insertl(62);
        l1.insertl(34);
        l1.insertl(92);
        
       l1.deleteb();
       
        l1.display();
        l1.deletel();
        l1.display();
        
    }
}