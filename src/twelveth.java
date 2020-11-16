import java.util.Scanner;

public class twelveth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner in =new Scanner(System.in);
      int number=in.nextInt();
      System.out.print(inToRoman(number));
	} 
    public static String inToRoman(int num) {
		if(num<1||num>3999)return null;
		int[] values= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] key= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		StringBuilder str=new StringBuilder();
		for(int i=0;i<values.length;i++) {
			while(num>=values[i]) {
				num-=values[i];
				str.append(key[i]);
			}
		}
		return str.toString();
		
	}
}
