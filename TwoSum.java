import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoSum {
	
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer,Integer> hashMap=new HashMap<>();
		int[] result=new int[2];
		for(int i=0;i<nums.length;i++){
			hashMap.put(nums[i],i);
			
		}
		for(int i=0;i<nums.length;i++){
			if(hashMap.containsKey(target-nums[i]) && hashMap.get(target-nums[i])!=i){
				 //return new int[] { i, hashMap.get(target-nums[i])} ;
				 result[0]=i;
				 result[1]=hashMap.get(target-nums[i]);
				 return result;
				 }
				}	
				
		 throw new IllegalArgumentException("No two sum solution");      
		
		
		
	}
	
	public static void main(String args[]){
		int[] arr1={4,9,5};
		int target=9;
		int[] result=twoSum(arr1,target);
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
		
		System.out.println(7%10);
	}

}
