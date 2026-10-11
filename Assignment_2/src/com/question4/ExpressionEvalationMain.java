package com.question4;

public class ExpressionEvalationMain {

	public static int calculate(int op1, char opr, int op2) {
		switch (opr) {
		case '+':
			return op1 + op2;
		case '-':
			return op1 - op2;
		case '*':
			return op1 * op2;
		case '/':
			return op1 / op2;

		}
		return 0;
	}

	public static int postfixEvalution(String postfix) {

		int st[] = new int[10];
		int top = -1;
		String[] split = postfix.split(" ");
		for (int i = 0; i < split.length; i++) {

			char element = split[i].charAt(0);

			if (Character.isDigit(element)) {
				st[++top] = element - '0';
			} else {
				int op2 = st[top--];
				int op1 = st[top--];

				int res = calculate(op1, element, op2);
				st[++top] = res;
			}
		}
		return st[top];
	}

	public static int prefixEvaluation(String prefix) {
		int st[] = new int[10];
		int top = -1;

		String[] split = prefix.split(" ");

		for (int i = split.length - 1; i >= 0; i--) {
			char element = split[i].charAt(0);
			if (Character.isDigit(element))
				st[++top] = element - '0';

			else {
				int op1 = st[top--];
				int op2 = st[top--];
				int res = calculate(op1, element, op2);
				st[++top] = res;
			}
		}

		return st[top];
	}

	public static void main(String[] args) {

		String postfix = "1 2 + 9 -";

		int result = postfixEvalution(postfix);
		System.out.println("Postfix : " + result);

		String prefix = "- + 1 2 9";

		int res = prefixEvaluation(prefix);
		System.out.println("Postfix : " + res);

	}

}
