public class Fifth {
	public static void main(String[] args) {
		//�����ⷨ	 
		String ss="babad";
	    System.out.print(longestPaLindrome(ss));
	}
	public static String longestPaLindrome(String s) {
		int len=s.length();
		if(len<2) {
			return s;
		}
		int maxLen=1; //������Ǽ�¼�������ĳ���
		int begin=0;
		//s.charAt(i)ÿ�ζ����������±�Խ�磬�����ת�����ַ����飬��һ���ǷǱ����
		char[] charArray=s.toCharArray();
		//ö�����Գ����ϸ����1���Ӵ���charArray[i,j]
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
