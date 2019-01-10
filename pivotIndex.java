
public class pivotIndex {
	
	public static int findPivotIndex(int[] nums){
		for(int i=0;i<nums.length;i++){
			int leftSum=0;
			int rightSum=0;
			for(int k=i-1;k>=0;k--){
				leftSum=leftSum+nums[k];
			}
			
			for(int m=i+1;m<nums.length;m++){
				rightSum=rightSum+nums[m];
			}
			
			
			if(leftSum==rightSum)
				return i;
		}
		
		return -1;
	}
	
	public static int findPivotIndexEfficient(int[] nums){
		int sum=0;
		int leftSum=0;
		for(int x: nums)
			sum=sum+x;
		for(int i=0;i<nums.length;i++){
			if(leftSum==sum-nums[i]-leftSum) //rightSume=sum-nums[i]-leftSum
				return i;
			leftSum=leftSum+nums[i]; //LeftSum is being calculated here
		}
		
		return -1;
	}
	
	public static void main (String args[]){
		int[] nums={7,0,1,3,4};
		System.out.println("Brute Force: "+findPivotIndex(nums));
		
		System.out.println("Efficient: "+findPivotIndexEfficient(nums));
	}


}
