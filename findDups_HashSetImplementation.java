import java.util.HashSet;
import java.util.Set;

public class findDups_HashSetImplementation {
	
	public static boolean containsDup(int[] nums){
		Set<Integer> hashSet=new HashSet<>(nums.length);
		boolean containsDup=false;
		System.out.println("Size 1:"+hashSet.size());
		for(int x : nums){
			if(hashSet.contains(x)){
				containsDup=true;}
			hashSet.add(x);			
		}
		System.out.println("Size 2:"+hashSet.size());
		return containsDup;
	}
	
	public static void main (String args[]){
		int[] arr= {1,2,3,1,4};
		System.out.println(containsDup(arr));
	}

}
