import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static void main(String args[]){
		int[] nums1={2,7,11,15};
		 for(int i=0;i<twoSum(nums1,9).length;i++){
			 System.out.println(twoSum(nums1,9)[i]);
		 }
		
	}

	public static int[] twoSum(int[] nums, int target) { 
        
        Map<Integer,Integer> hashMap=new HashMap<>(); 
       
        int[] indices=new int[2];
        for(int i=0;i<nums.length;i++){
            hashMap.put(nums[i],i);
            
        }
        for(int j=0;j<nums.length;j++){
            int dummy=target-nums[j];
            if(hashMap.containsKey(dummy) && hashMap.get(dummy)!=j){
                indices[0]=j;
                indices[1]=hashMap.get(dummy);
                hashMap.remove(nums[j]);
                 
                
            }
            
        }
        return indices;
    }
}
