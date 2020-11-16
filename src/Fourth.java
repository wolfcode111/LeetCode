public class Fourth {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] num1= {1,3};
      int[] num2= {2};
      System.out.print(findMedianSortedArrays(num1, num2));
      
	}
	public static double findMedianSortedArrays(int[] num1,int[] num2) {
		int leftLength=num1.length;
		int rightLength=num2.length;
        if(leftLength>rightLength) {
        	return findMedianSortedArrays(num2, num1);
        }
        //这里是设置了左边元素比右边元素多一个，也就是优先在左边去取
        int totalLeft=(leftLength+rightLength+1)/2;
        int left=0;
        int right=leftLength;
        while(left<right) {
        	//这里就是第一个数组的位置
        	int i=left+(right-left+1)/2;
        	int j=totalLeft-i; //这里就是第二个数组的位置，这里就是利用了个数
            if(num1[i-1]>num2[j]) {	
            	//下一轮的搜索区间是[left,i-1]
            	//说明第一个数组需要往左移动
            	right=i-1;
            }else {
            	//下一轮的搜索区间是[i,right]
            	left=i;
            }
        }
         //退出循环的时候一定是left等于right的时候
        int i=left;
        int j=totalLeft-i;
        //当i为0时，说明第一个数组分割线左边是没有值的
        int num1LeftMax=i==0?Integer.MIN_VALUE:num1[i-1];
        //当i等于第一个数组的长度时，说明第一个数组的右边没有分割线，为了不影响
        int num1RightMin=i==leftLength?Integer.MAX_VALUE:num1[i];
        //当j等于0说明第二个数组分割线左边没有值，为了不影响
        int num2LeftMax=j==0?Integer.MIN_VALUE:num2[j-1];
         //当j等于第二个数组长度的时候，说明第二个数组的右边没有值，为了不影响
        int num2RightMin=j==rightLength?Integer.MAX_VALUE:num2[j];
        if(((leftLength+rightLength)%2)==1) {
        	return Math.max(num1LeftMax, num2LeftMax);
        }else {
        	return (double)((Math.max(num1LeftMax, num2LeftMax)+Math.min(num1RightMin,num2RightMin)))/2;
        	
        }
		
	}


}
