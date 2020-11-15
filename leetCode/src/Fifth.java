public class Fifth {
	public static void main(String[] args) {
		//暴力解法	 
		String ss="babad";
	    System.out.print(longestPaLindrome(ss));
	}
	public static String longestPaLindrome(String s) {
		int len=s.length();
		if(len<2) {
			return s;
		}
		int maxLen=1; //这里就是记录下它最大的长度
		int begin=0;
		//s.charAt(i)每次都会检查数组下标越界，因此先转换成字符数组，这一步是非必须的
		char[] charArray=s.toCharArray();
		//枚举所以长度严格大于1的子串，charArray[i,j]
		for(int i=0;i<len-1;i++) {
			for(int j=i+1;j<len;j++) {
				if(j-i+1>maxLen&&validPalindromic(charArray, i, j)) {
					maxLen=j-i+1;
					begin=i;
				}
			}
		}
		return s.substring(begin, begin+maxLen);
	}
	private static boolean validPalindromic(char[] charArray,int left,int right) {
	
		while(left<right) {
			if(charArray[left]!=charArray[right]) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
