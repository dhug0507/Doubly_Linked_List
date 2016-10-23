/*
 * Daniel Hug
 * Linked List Homework
 * 10/14/16
 * Part of my code is reference from my textbook "Starting out with Java
 * from Control structures to Data Structures"
 */

/**
 * The DList class contains methods for implementing a doubly
 * linked list.
 */
class DList {
	
	private class Node {
		 String value; //Value of a list element
		 Node next; //Next node in the list
		 Node prev; //Previous node in the list
		
		/**
		 * Constructor
		 * @param val the element to be stored in the node
		 * @param n The reference to the successor node
		 * @param p The reference to the Predecessor node
		 */
		 Node(String val, Node n, Node p ){
			value = val;
			next = n;
			prev = p;
		}
		
		/**
		 * Constructor
		 * @param value The element to be stored in the node
		 */
		 Node(String value){
			this(value, null, null);
		}

	}
	
	
	
	public Node head; //Head of the list
	public Node last; //Last element in the list
	
	/**
	 * Constructor
	 */
	public DList(){
		head = null;
		last = null;
	}
	
	/**
	 * The isEmpty methods checks to see if the list 
	 * is empty.
	 * @return true if list is empty, false otherwise
	 */
	
	public boolean isEmpty(){
		return (head == null);
	}
	
	/**
	 * The size method returns the length of the list
	 * @return true if list is empty, false otherwise 
	 */
	public int size(){
		int count = 0;
		Node p = head;
		while(p != null){
			count++;
			p = p.next;
		}
		return count;
	}
	
	/**
	 * The find method finds a matching value and returns true
	 * @param value is the value of the list element 
	 * @return returns true if there is a match false otherwise
	 */
	public Node find(String value){
        Node theNode = head;
        if(!isEmpty()){
            while(theNode.value != value){
                // Checks if at the end of the LinkedList
                if(theNode.next == null){
                    // Got to the end of the Links in LinkedList
                    // without finding a match
                    return null;

                } else {
                    // Found a matching Link in the LinkedList
                    theNode = theNode.next;
                }                
            }
        } else {
            System.out.println("Empty LinkedList");
        }
        return theNode;
    }
	
	/**
	 * The add method adds to the end of the list.
	 * @param var The value to add.
	 */
	public void add(String var){
		if (isEmpty()){
			last = new Node(var);
			head = last;
		} else {
			last.next = new Node (var, null, last);
			last = last.next;
			
		}
	
	}
	
	/**
	 * This add method adds an element at an index.
	 * @param var The element to add to the list.
	 * @param index The index at which to add.
	 * @exception IndexOutOfBoundsException
	 * when the index is out of bounds.
	 */
	public void add(int index, String var){
		if (index < 0 || index > size()){
			String message = String.valueOf(index);
			throw new IndexOutOfBoundsException(message);
		}
		if (index == 0){
			Node p = head;
			head = new Node (var, p, null);
			if(p != null)
				p.prev = head;
			if (last == null)
				last = head;
			return;
			
		}
		Node pred = head;
		for (int k = 1; k <= index - 1; k++){
			pred = pred.next;
		}
		Node succ = pred.next;
		Node middle = new Node(var, succ, pred);
		pred.next = middle;
		if (succ == null)
			last = middle;
		else
			succ.prev = middle;
	}
	
	/**
	 * The toString method
	 */
	//public String toString(){
		
	//}
	
	/**
	 * The traverseFoward method returns the list from the first 
	 * to the last value.
	 * @return returns the entire list from first to last.
	 */
	public void traverseFoward(){
		Node ref = head;
		while(ref != null){
			System.out.print(ref.value + " ");
			ref = ref.next;
		}
	}
	/**
	 * The traverseBackwards method returns the list from the last 
	 * to the first value.
	 * @return returns the entire list from last to first.
	 */
	public void traverseBackwards(){
		Node ref = last;
		while (ref != null){
		    System.out.print(ref.value + " ");
		    ref = ref.prev;
		}
		
		
	}
	/**
	 * The remove method removed a node at any given index
	 * @param index the position of the element to remove
	 * @return The element removed
	 * @exception IndexOutOfBoundsException When
	 * index is out of bounds.
	 */
	public String remove(int index){
		
		if (index < 0 || index >= size()){
			String message = String.valueOf(index);
			throw new IndexOutOfBoundsException(message);			
		}
		
		// Locate the node targeted for removal
		Node target = head;
		for (int k = 1; k <= index; k++)
			target=target.next;
		
		String element = target.value; // Element to return
		Node pred = target.prev; // node before the target
		Node succ = target.next; // node after the target
		
		// Route forward and back pointers around 
		// the node to be removed.
		if(pred == null)
			head = succ;
		else 
			pred.next = succ;
		
		if (succ == null)
			last = pred;
		else
			succ.prev = pred;
		
		return element;
		
		
	}
	
	
}








