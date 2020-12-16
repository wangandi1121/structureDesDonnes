package structure_practice;

public class removeDuplicate {
	public int removeDuplicates(int[] nums) {
		
	       int p = 0,q = 1;
	       for(;q<nums.length;q++){
	           if(nums[q]!=nums[p]){
	                nums[p+1] = nums[q];
	                p++;
	           }
	       }
	       return p+1;
	    }

}