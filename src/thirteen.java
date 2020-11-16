import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.crypto.MacSpi;

public class thirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		System.out.print(romanToInt(str));
	}
	public static int romanToInt(String str) {
		int ans=0;
		Map<String, Integer> map=new HashMap<>();
		map.put("I", 1);
		map.put("IV", 4);
		map.put("V", 5);
		map.put("IX", 9);
		map.put("X", 10);
		map.put("XL",40);
		map.put("L", 50);
		map.put("XC", 90);
		map.put("C", 100);
		map.put("CD", 400);
		map.put("D", 500);
		map.put("CM", 900);
		map.put("M", 1000);
		for(int i=0;i<str.length();) {
			if(i+1<str.length()&&map.containsKey(str.substring(i,i+2))) {
			ans+=map.get(str.substring(i, i+2));
			i+=2;
			}
		else {
			ans+=map.get(str.substring(i, i+1));
			i++;
		  }
		}
		return ans;
		
    }
}
