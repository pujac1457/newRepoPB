import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMapImplementation {
	
	public static void main (String args[]){
		//Initialize hash map 1
		Map<Integer,Integer> hashMap1=new HashMap<>();
		//Initialize hash map 2
		HashMap<Integer,Integer> hashMap2=new HashMap<>();
		//Hashmap cannot have duplicate keys, but can have duplicate values
		hashMap1.putIfAbsent(0, 2);
		hashMap1.putIfAbsent(1, 2);
		
		hashMap1.put(2, 4);
		hashMap1.putIfAbsent(2, 3);
		
		System.out.println("The value for key 2 is "+hashMap1.get(2));
		//for(Map<Integer,Integer> )
		
		hashMap1.remove(0);
		
		//Iterate through the HashMap
		for(Map.Entry<Integer,Integer> entry: hashMap1.entrySet()){
			
		}	
		int[] arr= {3,3,1};
		System.out.println(Arrays.toString(twoSum(arr,6))); 
		
		//System.out.print(Arrays.toString(intersection(arr1,arr2)));
	}
	
	public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashMap=new HashMap<>();
        int j=0;
        //Add the values from nums to a HashMap
        for(int x:nums){
            hashMap.put(x,j);
            j++;
        }   
        
       for (int i = 0; i < nums.length; i++) {
    	   int complement=target-nums[i];
    	   if(hashMap.containsKey(complement) && hashMap.get(complement)!=i)
    		   return new int[] { i, hashMap.get(complement) };
       }
       throw new IllegalArgumentException("No two sum solution");
        
    }
	
	public boolean isIsomorphic(String s, String t) {
		if(s.length()==0)
			return true;
		int[] recordsS=new int[256];
		int[] recordsT=new int[256];
		int label=0;
		for(int i=0;i<s.length();i++)
		{
			recordsS[s.charAt(i)]=label;
			recordsT[t.charAt(i)]=label;
			label++;
		}
		return true;
	}
	
	

}
