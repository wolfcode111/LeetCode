
public class eleventh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] num= {1,8,6,2,5,4,100,3,7};
       System.out.print(maxArea(num));
		
	}
    public static int maxArea(int[] height) {
		int l=0,r=height.length-1;
		int ans=0;
		while(l<r) {
			int area=Math.min(height[l], height[r])*(r-l);
			ans=Math.max(ans, area);
			if(height[l]<=height[r]) {
				++l;
			}else {
				--r;
			}
		}
    	return ans;
	}
}
