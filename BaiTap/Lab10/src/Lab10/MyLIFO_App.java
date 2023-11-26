package Lab10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyLIFO_App {
	// This method reserves the given array

	public static <E> void reverse(E[] array) {
		Stack<E> stack = new Stack<E>();
		for (int i = 0; i < array.length; i++) {
			stack.push(array[i]);
		}
		for (int i = 0; i < array.length; i++) {
			array[i] = stack.pop();
		}
	}

	// This method checks the correctness of the given input
	// i.e. ()(())[]{(())} ==> true, ){[]}() ==> false
	public static boolean isCorrect(String input) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (stack.isEmpty()) {
				stack.push(ch);
			}

			else if ((ch == ')' && stack.peek() == '(') || (ch == '}' && stack.peek() == '{')
					|| (ch == ']' && stack.peek() == '[')) {
				stack.pop();
			} else {
				stack.push(ch);
			}
		}
		return stack.isEmpty();
	}

	// This method evaluates the value of anexpression
	// i.e. 51 + (54 *(3+2)) = 321
	public static int evaluateExpression(String expression) {
		// TODO
		return 0;
	}

	// method stutter that accepts a queue of integers as a parameter and replaces
	// every element of the queue with two copies of that element
	// front [1, 2, 3] back
	// becomes
	// front [1, 1, 2, 2, 3, 3] back
	public static <E> void stutter(Queue<E> input) {
		int size = input.size();
		for (int i = 0; i < size; i++) {
			E e = input.poll();
			input.add(e);
			input.add(e);
		}
		System.out.println("stutter" + input);
	}

	// Method mirror that accepts a queue of strings as a parameter and appends the
	// queue's contents to itself in reverse order
	// front [a, b, c] back
	// becomes
	// front [a, b, c, c, b, a] back
	public static <E> void mirror(Queue<E> input) {
		Stack<E> stack = new Stack<E>();
		int size = input.size();

		// Push all elements into the stack
		for (int i = 0; i < size; i++) {
			E e = input.poll();
			input.add(e);
			stack.push(e);
		}

		// Add all elements from the stack back into the queue
		while (!stack.isEmpty()) {
			input.add(stack.pop());
		}
		System.out.println("mirror" + input);
	}

	public static void main(String[] args) {
		Integer[] array = {1, 2, 3, 4, 5};
		reverse(array);
		String s = "()(())[]{(())}";
		System.out.println(isCorrect(s));
		Queue<String> queue = new LinkedList<String>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        stutter(queue);
        mirror(queue);
	}
}
