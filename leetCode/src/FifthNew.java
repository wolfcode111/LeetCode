import java.beans.beancontext.BeanContextChildSupport;

public class FifthNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss="ababa";
		System.out.print(longestPalindrome(ss));

	}
	//动态规划
	public static String longestPalindrome(String s) {
		int len=s.length();
		if(len<2) {
			return s;
		}
		int maxLen=1;
		int begin=0;
		//dp[i][j]表示s[i..j]是否是回文串
		//布尔型默认的是初始化为false
		boolean[][] dp=new boolean[len][len];
		for(int i=0;i<len;i++) {
			dp[i][i]=true;
		}
		char[] charArray=s.toCharArray();
		//注意的就是左下角要先填
		for(int j=1;j<len;j++) {
		    for(int i=0;i<j;i++) {
		    	if(charArray[i]!=charArray[j]) {
		    		dp[i][j]=false;
		    	}else {
		    		if(j-i<3) {
		    			dp[i][j]=true;
		    		}else {
		    			dp[i][j]=dp[i+1][j-1];
		    		}
		    	}
		    	if(dp[i][j]&&j-i+1>maxLen) {
		    		maxLen=j-i+1;
		    		begin=i;
		    	}
		    }
		}
		System.out.println(dp);
		return s.substring(begin,begin+maxLen);
	}

}
