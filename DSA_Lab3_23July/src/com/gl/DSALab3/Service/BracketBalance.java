package com.gl.DSALab3.Service;

import java.util.Stack;

public class BracketBalance {

	public static boolean isBracketBalance(String bracketExpression) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < bracketExpression.length(); i++) {
			char ch = bracketExpression.charAt(i);
			if (ch == '{' || ch == '(' || ch == '[')
				stack.push(ch);
			else if (ch == '}' || ch == ')' || ch == ']') {
				if (stack.isEmpty())
					return false;
				stack.pop();
			}
		}
		return stack.isEmpty();
	}
}
