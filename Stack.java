package dataStructures;

public class Stack {
	int data[];
	int index;
	
	public static final int DEF_VAL = 10; 
	
	public Stack() {
		this(10);
	}
	
	public Stack(int capacity) {
		this.data = new int[capacity];
		this.index = -1;
	}
	
	public int size() {
		return this.index + 1;
	}
	
	public boolean isEmpty() {
		return this.size() == 0;
	}
	
	public void push(int data) throws Exception{
		if(this.data.length == this.size()) {
			throw new Exception("Stack is empty");
		}
		index++;
		this.data[index] = data;
		
	}
	public int top() throws Exception{
		if(this.isEmpty()) {
			throw new Exception("stack is empty");
		}
		return this.data[index];
	}
	public int pop() throws Exception{
		if(this.isEmpty()) {
			throw new Exception("Stack is empty");
		}
		int retval = this.data[index];
		this.data[index] = 0;
		this.index--;
		return retval;
	}
	
	public void display() {
		for(int i = 0; i < this.data.length; i++) {
			System.out.print(this.data[i] + " ");
		}
	}
}
