import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;

public class sevenTeenth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.print(letterCombinations("234"));
	}
	 public static List<String> letterCombinations(String digits){
            if(digits==null||digits.length()==0) {
            	return new ArrayList<String>();
            }
            String[] letter_map= {
            		" ","*","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
            };
            List<String> res=new ArrayList<>();
            res.add("");
            for(int i=0;i<digits.length();i++) {
            	String letters=letter_map[digits.charAt(i)-'0'];
            	int size=res.size();  //������˶��еĳ��ȣ��������е�Ԫ��һһȡ��
            	for(int j=0;j<size;j++) {
            		String temp=res.remove(0);
            		for(int k=0;k<letters.length();k++) {
            			res.add(temp+letters.charAt(k));
            		}
            	}
            	
            }
            return res;
	 }
}
