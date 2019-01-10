import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_HashMapImplementation {
	
	
	public static int[] twoSum(int[] nums, int target){
		
		Map<Integer,Integer> hashMap=new HashMap<>();
		int m=0;
		for(Integer x: nums){
			hashMap.put(x,m);
			m++;
		}
		for(int i=0;i<nums.length;i++){
			int complement=target-nums[i];
			if(hashMap.containsKey(complement) && i!=hashMap.get(complement) ){
				return new int [] {i,hashMap.get(complement)};
				
			}
		}
		throw new IllegalArgumentException("No two sum solution");  
		
	}
	
	public static void main (String args[]){
		int[] nums1={1,2,34,4,2};
		
		
		System.out.println(Arrays.toString(twoSum(nums1,6)));
	}

}
