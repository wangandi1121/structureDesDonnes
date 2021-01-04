package zifuchuan;

import java.util.Deque;
import java.util.LinkedList;

public class reverseString {
	//这方法太废，用双指针。
	public void reverseString1(char[] s) {
//		Deque<Character> stack = new LinkedList<Character>();
//		for(int i = 0;i<s.length;i++) {
//			stack.push(s[i]);
//		}
//		for(int i = 0;i<s.length;i++) {
//			s[i] = stack.pop();
//		}
		int n = s.length;
		for(int i = 0,j = n-1;i<j;++i,--j) {
			char tmp = s[i];
			s[i] = s[j];
			s[j] = tmp;
		}
    }
	
}
