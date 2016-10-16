/*
 * Daniel Hug
 * Linked List Homework
 * 10/14/16
 * Part of my code is reference from my textbook "Starting out with Java
 * from Control structures to Data Structures"
 */

/** The Node class stores a list element
 *  and a reference to the next node
 */
 
public class Node {
	public String value; //Value of a list element
	public Node next; //Next node in the list
	public Node prev; //Previous node in the list
	
	/**
	 * Constructor
	 * @param value the element to be stored in the node
	 * @param next The reference to the successor node
	 * @param prev The reference to the Predecessor node
	 */
	public Node(String value, Node next, Node prev ){
		this.value = value;
		this.next = next;
		this.prev = prev;
	}
	
	/**
	 * Constructor
	 * @param value The element to be stored in the node
	 */
	public Node(String value){
		this(value, null, null);
	}

}






