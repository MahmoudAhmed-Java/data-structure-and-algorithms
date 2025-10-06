package com.luv2code.linkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList myLinkedList = new LinkedList(0);
		myLinkedList.append(1);
		myLinkedList.append(2);
		myLinkedList.append(3);
		System.out.println(myLinkedList.get(2).value+"\n");
		myLinkedList.printList();
	}

}
