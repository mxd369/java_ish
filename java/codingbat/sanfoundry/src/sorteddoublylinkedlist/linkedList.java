package sorteddoublylinkedlist;
// http://www.sanfoundry.com/java-program-implement-sorted-doubly-linked-list/

/* Class linkedList */
class linkedList
{
    protected Node start;
    public int size;
 
    /* Constructor */
    public linkedList()
    {
        start = null;
        size = 0;
    }
    /* Function to check if list is empty */
    public boolean isEmpty()
    {
        return start == null;
    }
    /* Function to get size of list */
    public int getSize()
    {
        return size;
    }
    /* Function to insert element */
    public void insert(int val)
    {
        Node nptr = new Node(val, null, null);
        Node tmp, ptr;        
        boolean ins = false;
        if(start == null)
            start = nptr;
        else if (val <= start.getData())
        {
            nptr.setLinkNext(start);
            start.setLinkPrev(nptr);
            start = nptr;
        }
        else
        {
            tmp = start;
            ptr = start.getLinkNext();
            while(ptr != null)
            {
                if(val >= tmp.getData() && val <= ptr.getData())
                {
                    tmp.setLinkNext(nptr);
                    nptr.setLinkPrev(tmp);
                    nptr.setLinkNext(ptr);
                    ptr.setLinkPrev(nptr);
                    ins = true;
                    break;
                }
                else
                {
                    tmp = ptr;
                    ptr = ptr.getLinkNext();
                }
            }
            if(!ins)
            {
                tmp.setLinkNext(nptr);
                nptr.setLinkPrev(tmp);
 
            }
        }
        size++;
    }
    /* Function to delete node at position */
    public void deleteAtPos(int pos)
    {        
        if (pos == 1) 
        {
            if (size == 1)
            {
                start = null;
                size = 0;
                return; 
            }
            start = start.getLinkNext();
            start.setLinkPrev(null);
            size--; 
            return ;
        }
        if (pos == size) 
        {
            Node ptr = start;
 
            for (int i = 1; i < size - 1; i++)
                ptr = ptr.getLinkNext();
            ptr.setLinkNext(null);            
            size --;
            return;
        }
        Node ptr = start.getLinkNext();
        for (int i = 2; i <= size; i++)
        {
            if (i == pos)
            {
                Node p = ptr.getLinkPrev();
                Node n = ptr.getLinkNext();
 
                p.setLinkNext(n);
                n.setLinkPrev(p);
                size-- ;
                return;
            }
            ptr = ptr.getLinkNext();
        }        
    }    
    /* Function to display status of list */
    public void display()
    {
        System.out.print("Doubly Linked List = ");
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }
        if (start.getLinkNext() == null) 
        {
            System.out.println(start.getData() );
            return;
        }
        Node ptr = start;
        System.out.print(start.getData()+ " <-> ");
        ptr = start.getLinkNext();
        while (ptr.getLinkNext() != null)
        {
            System.out.print(ptr.getData()+ " <-> ");
            ptr = ptr.getLinkNext();
        }
        System.out.print(ptr.getData()+ "\n");
    }
}