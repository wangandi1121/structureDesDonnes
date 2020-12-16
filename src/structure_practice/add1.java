package structure_practice;

public class add1 {
	public int[] plusOne(int[] digits) {
        int i = digits.length-1;
        int c = 0;
        for(;i>=0;i--) {
        	digits[i]+=1+c;
        	c = 0;
        	if(digits[i]==10) {
        		digits[i] = 0;
        		c = 1;
        	}
        }
        if(c==1) {
        	int[] res = new int[digits.length+1];
        	System.arraycopy(digits, 0, res, 1, digits.length);
        	res[0] = 1;
        	digits = res;
        }
        
        return digits;
    }
}
