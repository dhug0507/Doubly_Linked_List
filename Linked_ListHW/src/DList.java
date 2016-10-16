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
public class DList {
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
		Node prev = head;
		while(prev != null){
			count++;
			prev = prev.next;
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
			Node prev = head;
			head = new Node (var, prev, null);
			if(prev != null)
				prev.prev = head;
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
	
}








