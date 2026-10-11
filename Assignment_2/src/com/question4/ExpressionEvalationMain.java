package com.question4;

public class ExpressionEvalationMain {

	public static int calculate(int op1, char opr, int op2) {
		switch (opr) {
		case '+': return op1 + op2;
		case '-': return op1 - op2;
		case '*': return op1 * op2;
		case '/': return op1 / op2;
		
		}
		return 0;
	}
	
	public static int postfixEvalution(String postfix) {

		int st[] = new int[10];
		int top = -1;

		for (int i = 0; i < postfix.length(); i++) {

			char element = postfix.charAt(i);
			
			if(Character.isDigit(element)) {
				st[++top] = element - '0';
			}
			else {
				int op1 = st[top --];
				int op2 = st[top --];
				
				int res = calculate(op1, element, op2);
				st[++top] = res;
			}
		}
		return st[top];
	}

	public static int prefixEvaluation(String prefix) {
		//0. create a stack to push operands
		int st[] = new int[10];
		int top = -1;
		//1. traverse prefix expression from right to left
		for(int i = prefix.length()-1 ; i >= 0 ; i--) {
			//2. extract element from string
			char element = prefix.charAt(i);
			//3. if element is operand, push on stack
			if(Character.isDigit(element))
				st[++top] = element - '0';		// to convert character digit into number
			//4. if element if operator
			else {
				//4.1 pop two elements from stack
				int op1 = st[top--];
				int op2 = st[top--];
				//4.2 perform operation of op1 and op2
				int res = calculate(op1, element, op2);
				//4.3 push result on stack
				st[++top] = res;
			}
		}
		//5. return result from stack
		return st[top];
	}
	
	public static void main(String[] args) {

		String postfix = "10 + 210 - 9";

		int result = postfixEvalution(postfix.split(" "));
		System.out.println("Postfix : " + result);

		String prefix = "10 + 210 - 9";

		int res = prefixEvalution(prefix);
		System.out.println("Postfix : " + res);

	}

}
