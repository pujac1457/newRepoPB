
public class MaximumSubArray {
	
	  public static int maxSubArray(int[] nums) {
		  int max=nums[0];
		  int currentMax=max;
		  for(int i=1;i<nums.length;i++){
			  currentMax=Math.max(nums[i],currentMax+nums[i]);
			  if(currentMax>max)
				  max=currentMax;
		  }
		  return max;
	  }
	  
	  public static void main(String args[]){
			int[] nums1={-1,45};
			System.out.print(maxSubArray(nums1));
	  }

}
