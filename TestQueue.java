package com.bridgelabz.day14;

public class TestQueue {
	public static void main(String[] args) {

		Queue queue = new Queue();
		queue.enQueue(56);
		queue.enQueue(30);
		queue.enQueue(70);
		queue.display();

		for (int i=0;i<4;i++){
			queue.deQueue();
		}
	}
}
