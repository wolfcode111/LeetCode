import java.util.Stack;

import javax.xml.namespace.QName;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

public class twenty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String string="{[)}";
        System.out.print(isValid(string));
	}
	 public static boolean isValid(String s) {
        char tmp;
		if(s.isEmpty())return true;
		Stack<Character> stack=new Stack<>();
		for(char c:s.toCharArray()) {
			if(c==')'&&!stack.empty()) {
				tmp=stack.pop();
				if(tmp=='(') {
					continue;
				}else {
					return false;
				}
			}else if(c==']'&&!stack.empty()) {
				tmp=stack.pop();
				if(tmp=='[') {
					continue;
				}else {
					return false;
				}
			}else if(c=='}'&&!stack.empty()) {
				tmp=stack.pop();
				if(tmp=='{') {
					continue;
			}else {
				return false;
			}
		}else {
			stack.push(c);
		}
	 }
		return stack.empty();
    }
}