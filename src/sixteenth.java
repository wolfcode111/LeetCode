import java.util.Arrays;

public class sixteenth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums= {-1,2,1,-4};
       int target=1;
       System.out.print(threeSumClose(nums, target));
	}
	
	public static int  threeSumClose(int[] nums,int target) {
	       Arrays.sort(nums);
	       int ans=nums[0]+nums[1]+nums[2];
	       for(int i=0;i<nums.length-2;i++) {
	    	   int start=i+1,end=nums.length-1;
	    	   while(start<end) {
	    		   int sum=nums[start]+nums[end]+nums[i];
	    		   if(Math.abs(sum-target)<Math.abs(ans-target)) {
	    			   ans=sum;
	    		   }
	    		   if(sum>target) {
	    			   end--;
	    		   }else if(sum<target) {
	    			   start++;
	    		   }else {
	    			   return ans;
	    		   }
	    	   }
	       }
	       return ans;
	}

}
