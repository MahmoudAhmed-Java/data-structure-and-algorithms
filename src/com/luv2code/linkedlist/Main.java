package com.luv2code.linkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList myLinkedList = new LinkedList(11);
		myLinkedList.append(3);
		myLinkedList.append(23);
		myLinkedList.append(7);
		myLinkedList.set(1, 4);
		myLinkedList.printList();
	}

}
