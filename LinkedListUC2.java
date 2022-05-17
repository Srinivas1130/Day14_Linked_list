package com.bridgelabz.day14;

public class LinkedListUC2 {
	class Node{    
		int data;    
		Node next;    

		public Node(int data) {    
			this.data = data;    
			this.next = null;    
		}    
	}    

	//Represent the head and tail of the singly linked list    
	public Node head = null;    
	public Node tail = null;    

	public void addNode(int data) {        
		Node newNode = new Node(data);       
		if(head == null) {        
			head = newNode;    
			tail = newNode;    
		}    
		else {       
			tail.next = newNode;    
			tail = newNode;    
		}    
	}   

	public void display() {        
		Node current = head;    
		if(head == null) {    
			System.out.println("List is empty");        
		}    
		System.out.println("Nodes of singly linked list: ");    
		while(current != null) {
			System.out.print(current.data + " ");    
			current = current.next;    
		}        
	}    

	public static void main(String[] args) {
		LinkedListUC2 linkedListUC2 =new LinkedListUC2();
		linkedListUC2.addNode(70);
		linkedListUC2.addNode(36);
		linkedListUC2.addNode(50);
		linkedListUC2.display();
	}
}
