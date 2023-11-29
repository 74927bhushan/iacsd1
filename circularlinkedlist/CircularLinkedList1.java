package circularlinkedlist;

public class CircularLinkedList1 {

    node head;

    public CircularLinkedList1() {
        head = null;
    }

    public boolean insert(int data) {
        node newnode = new node(data);

        if (newnode == null) {
            return false;
        }

        if (head == null) {
            head = newnode;
            newnode.setNext(head);
            return true;
        }

        node last = head;
        while (last.getNext() != head) {
            last = last.getNext();
        }

        last.setNext(newnode);
        newnode.setNext(head);
        return true;
    }

    public boolean insert(int data, int position) {
        if (position <= 0) {
            return false;
        }

        node newnode = new node(data);
        if (newnode == null) {
            return false;
        }

        if (position == 1) {
            if (head == null) {
                head = newnode;
                newnode.setNext(newnode);
                return true;
            }

            node prev = head;
            for (int i = 1; i < position - 1; i++) {
                prev = prev.getNext();
                if (prev == head) {
                    return false;
                }
            }
            newnode.setNext(prev.getNext());
            prev.setNext(newnode);
            return true;
        }
        // Additional logic for other positions can be added here if needed

        
        return false; 
    }

    
    public void display() {
        if (head == null) {
            return;
        }
        node temp = head;

        do {
            System.out.println(temp.getData() + "");
            temp = temp.getNext();
        } while (temp != head);
        System.out.println();
    }

    public boolean deleteByVal(int data) {
        if (head == null) {
            return false;
        }
       if(head.getData()==data) {
    	   if(head.getNext()==head) {
    		   head=null;
    		   return true;
    	   }
    	  node last=head;
    	  while(last.getNext()!=head) {
    		  last=last.getNext();
    	  }
    	  last.setNext(head.getNext());
    	  head=head.getNext();
    	  return true;
       }
       node prev=head,del=head;
       while(del.getData()!=data) {
    	   prev=del;
    	   del=del.getNext();
    	   if(del==head) {
    		   return false;
    	   }
       }
       prev.setData(del.getData());
        return true; 
    }
    public boolean deletebyposition(int position) {
    	if(head==null || position <1 ) {
    		return false;
    	}
    	if(position==1) {
    		if(head.getNext()==head) {
    			head=null;
    			return true;
    		}
    		node last =head;
    		while(last.getNext()!= head) {
    			last=last.getNext();
    		}
    		last.setNext(head.getNext());
    		head=head.getNext();
    		return true;
    	}
    	node prev = head;
    	for(int i=1;i<position -1;i++) {
    		prev=prev.getNext();
    		if(prev.getNext()==head) {
    			return false;
    		}
    	}
    	prev.setNext(prev.getNext().getNext());
    	return true;
    }
}
