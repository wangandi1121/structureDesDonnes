package structure_practice;

public class rongqichengshui {
	 public int maxArea(int[] height) {
	        int i = 0;int j = height.length-1;
	        int max = 0;
	        while(i<j) {
	        	int minHeight = height[i]<height[j]?height[i++]:height[j--];
	        	int area = (j-i+1)*minHeight;
	        	max = Math.max(max, area);
	        }
	        return max;
	    }
}
