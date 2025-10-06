package com.luv2code.linkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList myLinkedList = new LinkedList(1);
		
		myLinkedList.append(2);
		
		System.out.println(myLinkedList.removeLast().value);
		System.out.println(myLinkedList.removeLast().value);
		System.err.println(myLinkedList.removeLast());
	}

}
