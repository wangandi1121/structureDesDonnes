package zifuchuan;

import java.util.HashMap;
import java.util.Map;

public class firstUniqChar {
	public int firstUniqChar1(String s) {
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i = 0;i<s.length();i++) {
			char ch = s.charAt(i);
			map.put(ch,map.getOrDefault(ch,0)+1);
			//getOrDefault用于获取指定键的映射值,如果不存在可以设返回值为0；
		}
		for(int i = 0;i<s.length();i++) {
			if(map.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		return -1;
    }
}
