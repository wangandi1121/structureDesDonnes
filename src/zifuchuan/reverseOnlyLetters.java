package zifuchuan;

import java.util.Stack;

public class reverseOnlyLetters {
	public String reverseOnlyLetters(String S) {
		//1.字母栈
		Stack<Character> letters = new Stack();
		for(char c: S.toCharArray()) {
			if(Character.isLetter(c)) {
				//判断字符是否是字母
				letters.push(c);
			}
		}
		StringBuilder res = new StringBuilder();
		for(char c: S.toCharArray()) {
			if(Character.isLetter(c))
				res.append(letters.pop());
			else
				res.append(c);
		}
		return res.toString();
    }
}
