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
        //���������������Ԫ�ر��ұ�Ԫ�ض�һ����Ҳ�������������ȥȡ
        int totalLeft=(leftLength+rightLength+1)/2;
        int left=0;
        int right=leftLength;
        while(left<right) {
        	//������ǵ�һ�������λ��
        	int i=left+(right-left+1)/2;
        	int j=totalLeft-i; //������ǵڶ��������λ�ã�������������˸���
            if(num1[i-1]>num2[j]) {	
            	//��һ�ֵ�����������[left,i-1]
            	//˵����һ��������Ҫ�����ƶ�
            	right=i-1;
            }else {
            	//��һ�ֵ�����������[i,right]
            	left=i;
            }
        }
         //�˳�ѭ����ʱ��һ����left����right��ʱ��
        int i=left;
        int j=totalLeft-i;
        //��iΪ0ʱ��˵����һ������ָ��������û��ֵ��
        int num1LeftMax=i==0?Integer.MIN_VALUE:num1[i-1];
        //��i���ڵ�һ������ĳ���ʱ��˵����һ��������ұ�û�зָ��ߣ�Ϊ�˲�Ӱ��
        int num1RightMin=i==leftLength?Integer.MAX_VALUE:num1[i];
        //��j����0˵���ڶ�������ָ������û��ֵ��Ϊ�˲�Ӱ��
        int num2LeftMax=j==0?Integer.MIN_VALUE:num2[j-1];
         //��j���ڵڶ������鳤�ȵ�ʱ��˵���ڶ���������ұ�û��ֵ��Ϊ�˲�Ӱ��
        int num2RightMin=j==rightLength?Integer.MAX_VALUE:num2[j];
        if(((leftLength+rightLength)%2)==1) {
        	return Math.max(num1LeftMax, num2LeftMax);
        }else {
        	return (double)((Math.max(num1LeftMax, num2LeftMax)+Math.min(num1RightMin,num2RightMin)))/2;
        	
        }
		
	}


}
