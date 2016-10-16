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
}








