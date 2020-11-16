import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fifteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums= {0,0,0,0,0};
        List<List<Integer>> res=threeSum(nums);
       for(List<Integer>out : res) {
    	   System.out.println(out.toString());
    	   
       }
         
	}
   public static List<List<Integer>> threeSum(int[] nums) {
	   Arrays.sort(nums);
	   List<List<Integer>> res=new ArrayList<>();
	   for(int k=0;k<nums.length-2;k++) {
		   if(nums[k]>0)break;
		   if(k>0&&nums[k]==nums[k-1])continue;
		   int i=k+1;
		   int j=nums.length-1;
		   while(i<j) {
			   int sum=nums[k]+nums[i]+nums[j];
			    if(sum<0) {
			    	while(i<nums.length-1&&nums[i+1]==nums[i])
			    		i++;
			    	i++;
			    }else if(sum>0) {
			    	while(j>k&&nums[j-1]==nums[j])
			    	j--;
			    	j--;
			    }else {
			    	res.add(new ArrayList<Integer>(Arrays.asList(nums[k],nums[i],nums[j])));
			    	while(i<nums.length-1&&nums[i+1]==nums[i]) i++;
			    	i++;
			    	while(j>k&&nums[j-1]==nums[j])j--;
			    	j--;
			    }
		   }
	   }
	   return res;
	
}
}
