
public class LargestNumberAtLeastTwiceofOthers {
	public static int dominantIndex(int[] nums) {
		int max_index=0;	
		for(int i=0;i<nums.length;i++){			
			if(nums[i]>nums[max_index]){
				max_index=i;
			}
		}
		for(int i=0;i<nums.length;i++){		
			if(i!=max_index){
				if((nums[i]*2)>nums[max_index] && i!=max_index)
					return -1;
			}
		}
		return max_index;
	}
	
	public static void main (String args[]){
		int[] nums={0,2,0,3};
		System.out.println(dominantIndex(nums));
	}
}
