package com.nagappa;

import java.util.Date;

public class DemoStack {

	public static void main(String[] args) {
		
		StackX stack = new StackX(5);
		
		Person p1 = new Person(28, "rohit","nagappa",new Date());
		Person p2 = new Person(30, "monu","nagappa",new Date());
		Person p3 = new Person(34, "ironman","nagappa",new Date());
		Person p4 = new Person(35, "superman","nagappa",new Date());
		Person p5 = new Person(42, "batman","nagappa",new Date());
		System.out.println(stack.size());
		stack.push(p1);
		
		stack.push(p2);
		stack.push(p3);
		stack.push(p4);
		stack.push(p5);
		stack.push(p1);
		System.out.println(stack.size());
		System.out.println(((Person)stack.peek()).getFname());
		stack.pop();
		stack.pop();
		stack.pop();
		
		System.out.println(stack.size());
		System.out.println(((Person)stack.peek()).getFname());
		
		stack.pop();
		stack.pop();
		System.out.println(stack.size());
		
	}
}
