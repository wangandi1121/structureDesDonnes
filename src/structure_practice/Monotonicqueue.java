package structure_practice;

import java.util.ArrayDeque;
import java.util.Deque;

public class Monotonicqueue {
	Deque<Integer> data = new ArrayDeque<Integer>();
	Monotonicqueue(){}
	public void push(int n) {
		        while (!data.isEmpty() && data.getLast() < n) 
		            data.pollLast();
		        data.addLast(n);
    }
		    
   int max() { return data.peekFirst(); }
    void pop(int n) {
		        if (!data.isEmpty() && data.peekFirst() == n)
		            data.pollFirst();
		    }
		}


