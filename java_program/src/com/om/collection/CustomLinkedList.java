package com.om.collection;

public class CustomLinkedList {

	private static int counter;
	private Node head;

	public CustomLinkedList() {

	}

	// appends the specified element to the end of this list.
	public void add(Object data) {

		// Initialize Node only incase of 1st element
		if (head == null) {
			head = new Node(data);
		}

		Node temp = new Node(data);
		Node current = head;

		// Let's check for NPE before iterate over crunchifyCurrent
		if (current != null) {

			// starting at the head node, crawl to the end of the list and then
			// add element after last node
			while (current.getNext() != null) {
				current = current.getNext();
			}

			// the last node's "next" reference set to our new node
			current.setNext(temp);
			// increment the number of elements variable
			counter++;
		}

	}

	public Object get(int index)
	// returns the element at the specified position in this list.
	{
		// index must be 1 or higher
		if (index < 0)
			return null;
		Node current = null;
		if (head != null) {
			current = head.getNext();
			for (int i = 0; i < index; i++) {
				if (current.getNext() == null)
					return null;

				current = current.getNext();
			}
			return current.getData();
		}
		return current;

	}

	// returns the number of elements in this list.
	public int size() {
		return counter;
	}

	public String toString() {
		String output = "";
		if (head != null) {
			Node current = head.getNext();
			while (current != null) {
				output += "[" + current.getData().toString() + "]";
				current = current.getNext();
			}
		}
		return output;
	}

}
