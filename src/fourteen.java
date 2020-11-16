
public class fourteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] strings= {"flower","flow","flight"};
        System.out.print(longestCommonPrefix(strings));
	}
    public static String longestCommonPrefix(String[] strs) {
    	if(strs==null || strs.length==0) {
    		 return "";
    	}
		for(int i=0;i<strs.length-1;i++) {
			strs[i+1]=commonPrefix(strs[i],strs[i+1]);
		}
		return strs[strs.length-1];
	}
    private static String commonPrefix(String s1,String s2) {
         int len=s1.length()>s2.length()?s2.length():s1.length();
         int i=0;
         while(i<len) {
        	 if(s1.charAt(i)!=s2.charAt(i)) {
        		 break;
        	 }
        	 i++;
         }
		return s1.substring(0,i);
	}
}
