package zifuchuan;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverseWords {
	public String reverseWords(String s) {
		//我是一个冷酷无情的API挖掘机
        s = s.trim();//string内置，去除开头结尾的全部空格
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        //正则表达表示一个或多个空格就分开
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }
}
