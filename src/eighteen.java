import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class eighteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] nums= {1,0,-1,0,-2,2};
     int target=0;
     System.out.print(fourSum(nums, target));
		
	}

	public static List<List<Integer>> fourSum(int[] nums,int target) {
		  List<List<Integer>> result =new ArrayList<>();
		  if(nums==null || nums.length<4) {
			  return result;
		  }
		  Arrays.sort(nums);
		  int length=nums.length;
		  for(int index1=0;index1<length-3;index1++) {
			  if(index1>0&&nums[index1]==nums[index1-1]) {
				  continue;  //ШЅжи
			  }
			  int curMin=nums[index1]+nums[index1+1]+nums[index1+2]+nums[index1+3];
			  if(curMin>target) {
				  break;
			  }
			  int curMax=nums[index1]+nums[length-3]+nums[length-2]+nums[length-1];
			  if(curMax<target) {
				  continue;
			  }
			  for(int index2=index1+1;index2<length-2;index2++) {
				  if(index2>index1+1&&nums[index2]==nums[index2-1]) {
					  continue;
				  }
				  int index3=index2+1;
				  int maxIndex=length-1;
				  int curMin1=nums[index1]+nums[index1+1]+nums[index1+2]+nums[index1+3];
				  if(curMin1>target) {
					  break;
				  }
				  int curMax1=nums[index1]+nums[length-3]+nums[length-2]+nums[length-1];
				  if(curMax1<target) {
					  continue;
				  }
				  while(index3<maxIndex) {
					  int curValue=nums[index1]+nums[index2]+nums[index3]+nums[maxIndex];
					  if(curValue==target) {
						  result.add(Arrays.asList(nums[index1],nums[index2],nums[index3],nums[maxIndex]));
						  index3++;
						  while(index3<maxIndex&&nums[index3]==nums[index3-1]) {
							  index3++;
						  }
						  maxIndex--;
						  while(maxIndex>index3&&nums[maxIndex]==nums[maxIndex+1]) {
							  maxIndex--;
						  }
					  }else if(curValue>target) {
						  maxIndex--;
					  }else {
						  index3++;
					  }
				  }
					  
			  }
		  }
		  return result;
	}
}
