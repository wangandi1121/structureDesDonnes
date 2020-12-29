package Search;

import java.util.HashSet;

public class minMutation {
	int minStepCount = Integer.MAX_VALUE;
	public int minMutation(String start, String end, String[] bank) {
		
    }
	//好困 明天再写咯
	public void dfs(HashSet<String> step,int stepCount,String cur,String end,String[] bank) {
		if(cur.equals(end))
			minStepCount = Math.min(stepCount,minStepCount);
		for(String str: bank) {
			int diff = 0;
			for(int i = 0;i<str.length();i++) {
				if(cur.charAt(i)!=str.charAt(i))
					
			}
		}
	}
}
