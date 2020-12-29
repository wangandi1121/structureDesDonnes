package Search;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ladderLength {
	public int ladderLength(String beginWord, String endWord,
			List<String> wordList) {
		//将wordList放到哈希表里，判断单词是否在字典中
		Set<String> wordSet = new HashSet<String>(wordList);
		if(wordSet.size()==0|!wordSet.contains(endWord)) {
			return 0;
		}
		//用左右分别扩散的哈希表代替队列
		Set<String> beginVisit = new HashSet<String>();
		Set<String> endVisit = new HashSet<String>();
		beginVisit.add(beginWord);
		endVisit.add(endWord);
		//将已经访问过的单词添加到visit里
		Set<String> visit = new HashSet<String>();
		
		int step = 1;
		while(!beginVisit.isEmpty()&&!endVisit.isEmpty()) {
			//双向遍历的技术处理，优先选择小的哈希表进行扩散
			if(beginVisit.size()>endVisit.size()) {
				Set<String> temp = beginVisit;
				beginVisit = endVisit;
				endVisit = temp;
			}
			
			//nextVisit在扩散完成以后，会成为新的beginVisit
			Set<String> nextVisit = new HashSet<String>();
			for(String word:beginVisit) {
				//for里为搜索字典中目标
				char[] chs = word.toCharArray();
				for(int i = 0;i<word.length();i++) {
					char old = chs[i];
					for(char c = 'a';c<'z';c++) {
						if(old == c)continue;
						chs[i] = c;
						String target = String.valueOf(chs);
						
						if(wordSet.contains(target)) {
							if(endVisit.contains(target)) {
								return step+1;
							}
							//如果还没有访问过目标值而且字典里有目标值，则将目标值加入列表
							if(!visit.contains(target)) {
								nextVisit.add(target);
								visit.add(target);
							}
						}
					}

					chs[i] = old;
					//每次要变回原状态
				}
			}
			//原来的beginVisit废弃，从新的nextVisit开始双向BFS
			beginVisit = nextVisit;
			step++;
		}
		return 0;
		
   }
}	
