import java.nio.charset.spi.CharsetProvider;
import java.util.Scanner;

public class eigth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str;
        Scanner in=new Scanner(System.in);
        str=in.nextLine();
        System.out.print(myAtoi(str));
		
	}
     public static int myAtoi(String str) {
    	 char[] chars=str.toCharArray();
    	 int n=chars.length;
    	 int index=0;
    	 int res=0;
    	 while(index<n&&chars[index]==' ') {
    		 index++;
    	 }
    	 if(index==n) {
    		 return 0;
    	 }
    	 boolean negative =false;
    	 	if(chars[index]=='-') {
    	 		negative=true;
    	 	    index++;
    	 	}else if(chars[index]=='+') {
    	 		index++;
    	 	}else if(!Character.isDigit(chars[index])) {
    	 		return 0;
    	 		//这里就是含有其他字符的时候，直接返回就行
    	 	}
    	 	int ans=0;
    	 	while(index<n&&Character.isDigit(chars[index])) {
    	 		 ans=chars[index]-'0';
    	 		 if(res>(Integer.MAX_VALUE-ans)/10) {
    	 			 //由于res*10+ans是有可能溢出的，所以就把整个表达式进行了处理
    	 			 return negative?Integer.MIN_VALUE:Integer.MAX_VALUE;
    	 		 }
    	 		 res=res*10+ans;
    	 		 index++;
    	 	}
    	 return negative?-res:res;
    	 
     }
	
	
}
