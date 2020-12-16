package structure_practice;

import java.util.Stack;

public class parametre_valide {
	public boolean isValid(String s) {
		if(s.isEmpty())return true;
		Stack<Character> stack = new Stack<Character>();
		for(char c:s.toCharArray()) {
			if(c == '(')
				stack.push(')');
			else if(c =='[')
				stack.push(']');
			else if(c == '{')
				stack.push('}');
			else if(stack.isEmpty()||c!=stack.pop())
				return false;
		}
		if(stack.isEmpty())return true;
		return false;
    }
}
