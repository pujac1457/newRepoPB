import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class intersectionOfTwoArraysII {
	
	public static int[] intersectionOfTwoArraysII(int[] nums1, int[] nums2){
		Map<Integer,Integer> hashMap=new HashMap<>();
		for(int i=0;i<nums1.length;i++){
			if(hashMap.containsKey(nums1[i])){
				int getKey=hashMap.get(nums1[i]);
				hashMap.put(nums1[i],getKey+1);
			}
			else
				hashMap.put(nums1[i],1);
		}
		
		//Iterate through the HashMap to print its contents
		for(Map.Entry<Integer,Integer> entry: hashMap.entrySet()){
				System.out.println(entry.getKey()+" "+entry.getValue());
		}
		ArrayList<Integer> arr_list=new ArrayList<>();	
		System.out.println("+++++++++++");	
		for(int i=0;i<nums2.length;i++){
			if(hashMap.containsKey(nums2[i])){
				arr_list.add(nums2[i]);

				int getKey=hashMap.get(nums2[i]);
				if(getKey>1){
					hashMap.put(nums2[i],getKey-1);
				}
				if(getKey==1)
					hashMap.remove(nums2[i]);
				
			}
				
				
		} 
		//Iterate through the HashMap to print its contents
		for(Map.Entry<Integer,Integer> entry: hashMap.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		int total_length=arr_list.size();
        int[] intersection_array=new int[total_length];
        int k=0;
        while(k<arr_list.size()){
       	 intersection_array[k]=arr_list.get(k);
       	 k++;
        }
        System.out.println("+++++++++++");	
        for(int i=0;i<intersection_array.length;i++){
			System.out.println(intersection_array[i]);
		}
        
        
 		return intersection_array;
	}
	
	
	public static void main(String args[]){
		int[] arr1={4,9,5};
		int[] arr2={9,4,9,8,4};
		intersectionOfTwoArraysII(arr1,arr2);
		
        
	}

}
