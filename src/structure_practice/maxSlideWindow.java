package structure_practice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class maxSlideWindow {
	 public int[] maxSlidingWindow(int[] nums, int k) {
		 Monotonicqueue window = new Monotonicqueue();
		   int[] res = new int[nums.length-k+1];
		    for (int i = 0; i < nums.length; i++) {
		        if (i < k - 1) { //先填满窗口的前 k - 1
		            window.push(nums[i]);
		        } else { // 窗口向前滑动
		            window.push(nums[i]);   
		            res[i-k+1] = window.max();
		            window.pop(nums[i - k + 1]);
		        }
		    }
		    return res;
	 }
		
		
	}

