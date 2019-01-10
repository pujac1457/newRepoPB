import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
	
	public static int singleNumber(int[] nums) {
        Map<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hashMap.containsKey(nums[i])){
                int val=hashMap.get(nums[i]);
                hashMap.put(nums[i],++val);
            }
            else
                hashMap.put(nums[i],1);
        }
        
        for(int x:nums){
            if(hashMap.get(x)==1)
                return x;
        }
        return 0;
    }
	
	 public static void main(String args[]){
			int[] nums1={2,1,2,1,4};
			System.out.println(singleNumber(nums1));
	 }
	

}
