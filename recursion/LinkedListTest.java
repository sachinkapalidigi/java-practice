import java.util.List;

class ListNode {
	int data;
	ListNode next;
	
	ListNode(int value){
	data = value;
}
}


class LinkedListTest {

	public static void main(String[] args){
		ListNode head = null;

		head = new ListNode(5);
		head.next = new ListNode(7);
		
		printNodes(head);
		int n = getSize(head);
        System.out.println(n+" - size");
        printNodes(head);

        head = addAtStart(head, 3);
        printNodes(head);

        addAtEnd(head, 9);
        printNodes(head);

        head = addAtStart(head, 1);
        printNodes(head);

        // can assign or just call the function - either way element will be added to the end
        head = addAtEndAssign(head, 11);
        printNodes(head);

        // here head must be assigned
        head = deleteAtStart(head);
        printNodes(head);

        head = deleteAtEnd(head);
        printNodes(head);
        

        head = insertAtPosition(head, 4, 11);
        printNodes(head);

        head = insertAtPosition(head, 1, 4);
        printNodes(head);
        head = insertAtPosition(head, 0, 1);
        printNodes(head);

        head = reverseList(head); // must ressign 
        printNodes(head);

        System.out.println("<--------------------->");
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != null && curr.next != null){
            prev = swapExp(curr, prev);
            curr = prev.next;
            printNodes(head);
        }
        // printNodes(head);
    }
	

	static void printNodes(ListNode head){
		ListNode curr = head;
		while(curr != null){
			System.out.print(curr.data+" ");
			curr = curr.next;
        }
        System.out.print("\n");
    }

    static void printNodesHead(ListNode head){
        // doesnot change head in the main function that is called
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.print("\n");
    }

    static int getSize(ListNode head){
        int n = 0;
        while(head != null){
            n++;
            head = head.next;
        }
        return n;
    }
    
    static ListNode addAtStart(ListNode head, int x){
        ListNode temp = new ListNode(x);
        temp.next = head;
        // assign return value to head - as new head will now be temp
        return temp;
    }
    
    static void addAtEnd(ListNode head, int x){
        ListNode temp = new ListNode(x);
        while(head.next != null){
            head = head.next;
        }
        head.next = temp;
    }
    
    static ListNode addAtEndAssign(ListNode head, int x){
		ListNode temp = new ListNode(x);
		ListNode curr = head;
		if(curr == null) return temp;
		while(curr.next != null){
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }

    static ListNode deleteAtStart(ListNode head){
		if(head == null) return null;
		head = head.next;
		return head;
    }

    static ListNode deleteAtEnd(ListNode head){
        if(head==null) return null;
        if(head.next == null) return null;
        ListNode curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }
    
    static ListNode insertAtPosition(ListNode head, int i, int x){
        int n = getSize(head);
        if(i>n) return head;
        ListNode curr = head;
        while(i>1){
            curr = curr.next;
            i--;
        }
        ListNode temp = new ListNode(x);
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

    static ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
    
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
    

    static ListNode swapExp(ListNode curr, ListNode prev){
        ListNode temp = curr;

        curr = curr.next;
        ListNode tempNext = temp.next;

        temp.next = curr.next;

        ListNode currNext = curr.next;

        curr.next = temp;
        
        if(prev != null){
            prev.next = curr;
        }
        
        return temp;
    }
    

}
