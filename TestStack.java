package com.bridgelabz.day14;

public class TestStack {
	public static void main(String[] args)
	{
		Stack stack = new Stack();
		stack.push(56);
		stack.push(30);
		stack.push(70);
		stack.display();
		stack.peak();

		for (int i=0;i<4;i++){
			stack.pop();
		}
	}
}
