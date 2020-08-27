package com.nagappa;

public class StackX {
		
		//top will always point to the top element of stack , if stack is empty than top ==-1
		private int top;
		private int maxSize;
		private Object[] objects;
		
		/**
		 * 
		 * @param size : size of the stack
		 */
		public StackX(int size) {
			this.maxSize = size;
			this.objects =  new Object[size];
			this.top = -1;
		}
		
		/**
		 * 
		 * @param object
		 */
		public void push(Object object) {
			if(!this.isFull())
				this.objects[++this.top] = object;
			else
				System.out.println("Stack overflow , cannot add "+ object+" or any more elements");
		}
		/**
		 * 
		 * @return object top element of stack and decerement the top pointer
		 */
		public Object pop() {
			if(!this.isEmpty())
				return this.objects[this.top--];
			else {
				System.out.println("The stack is empty so returning null");
				return null;
			}
		}
		/**
		 * 
		 * @return object i.e. top element of stack
		 */
		public Object peek() {
			if(!this.isEmpty())
				return this.objects[this.top];
			else {
				System.out.println("The stack is empty so returning null");
				return null;
			}
		}
		
		/**
		 * 
		 * @return return is stack is empty
		 */
		private boolean isEmpty() {
			return this.top==-1;
		}
		
		/**
		 * 
		 * @return true is stack is full
		 */
		private boolean isFull() {
			return this.top == (maxSize-1);
		}
		/**
		 * 
		 * @return the size of the stack
		 */
		public int size() {
			if(this.top==-1)
				return 0;
			else
				return (this.top+1);
		}
		
}
