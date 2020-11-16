import java.util.Scanner;

public class ninth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in=new Scanner(System.in);
       int number=in.nextInt();
       System.out.print(name(number));
		
		
	}
    public static boolean name(int x) {
		if(x<0||(x%10==0&&x!=0)) {
			return false;
		}
    	int revertedNumber=0;
    	while(x>revertedNumber) {
    		revertedNumber=revertedNumber*10+x%10;
    		x/=10;
    	}
		return x==revertedNumber||x==revertedNumber/10;
	}
}
