package kosa.data;

import java.util.LinkedList;
import java.util.Stack;

public class StackQueueExam {

	public static void main(String[] args) {
//		Stack<Integer> stack = new Stack<Integer>(); //무조건 stack 자료 구조
//		
//		stack.push(1);
//		stack.push(2);
//		stack.push(3);
//		
//		System.out.println("---stack---");
//		while(!stack.isEmpty()) {
		//비어있지 않을때까지
//			System.out.println(stack.pop());
		//pop이 제일 마지막에 들어간 것을 먼저 뽑아낸다
//		}
		
		
		LinkedList<Integer> queue = new LinkedList<Integer>();//Queue 자료구조
		//메서드에 따라 queue자료가 될 수도 있고 list자료구조가 될 수도 있다.
		//linkedlist라고 무조건 queue인 것은 아님
		//queue : 먼저들어간 놈이 먼저 나와야함.
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		System.out.println("---queue---");
		while(!queue.isEmpty()) {
			System.out.println(queue.poll()); //질문: pop을 해도 먼저 들어간 값부터 나오는데 왜일까?
		}
		//poll을 해야지만 먼저들어간 놈이 먼저 나간다


	}

}
