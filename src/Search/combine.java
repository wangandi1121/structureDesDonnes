package Search;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class combine {
	public List<List<Integer>> combine(int n, int k) {
//问题有多个步骤，每个步骤有多种方法，使用回溯算法
//回溯是在一棵树上的深度优先遍历
		List<List<Integer>> res = new ArrayList<>();
		if(k<=0||n<k) {
			return res;
		}
		Deque<Integer> path = new ArrayDeque<>();
		dfs(n,k,1,path,res);
		return res;
    }
	private void dfs(int n,int k,int begin,Deque<Integer> path,List<List<Integer>> res) {
		//terminator
		if(path.size()==k) {
			res.add(new ArrayList<>(path));
			return;
		}
		//process
		//搜索起点的上界 + 接下来要选择元素的个数 - 1 = n
		//for(int i = begin;i<=n;i++) {
		for(int i = begin;i<=n-(k-path.size())+1;i++) {
			path.addLast(i);;
			//drill down
			dfs(n,k,i+1,path,res);
			//深度遍历有回头的过程，因此要撤销选择
			path.removeLast();
		}
	}
}
