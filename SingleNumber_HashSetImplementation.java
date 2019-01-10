import java.util.HashSet;

import java.util.Set;

public class SingleNumber_HashSetImplementation {
	
	public static void main (String args[]){
		int[] arr= {3,3,1};
		System.out.println(singleNumber(arr));
	}
	
	public static int singleNumber(int[] nums) {
		Set<Integer> hashSet=new HashSet<>(nums.length); 
		int stor=0;
		for (int x: nums){
			if(!hashSet.contains(x)){
				hashSet.add(x); 
			}
			else {
				hashSet.remove(x);}
			
		}
		for (Integer i: hashSet){
			stor=i;
		}
		
		return stor	;
	} 
	
	

}
