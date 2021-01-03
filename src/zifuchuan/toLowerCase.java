package zifuchuan;

public class toLowerCase {
	 public String toLowerCase(String str) {
	        if(str == null||str.length()==0){
	            return str;
	        }
	        char[] ch = str.toCharArray();
	        for(int i = 0;i<str.length();i++){
	                ch[i]|=32;
	         }
	            return String.valueOf(ch);
	    }
}
