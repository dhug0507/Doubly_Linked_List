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
}








