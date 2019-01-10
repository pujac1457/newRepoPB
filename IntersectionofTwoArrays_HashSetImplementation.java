import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IntersectionofTwoArrays_HashSetImplementation {
	public static void main (String args[]){
		int[] arr1= {4,9,5};
		int[] arr2= {9,4,9,8,4};
	
		System.out.print(Arrays.toString(intersection(arr1,arr2)));
		System.out.println();
		System.out.println("II");
		System.out.print(Arrays.toString(intersectionII(arr1,arr2)));
		//System.out.println();
		//intersectionII(arr1,arr2);
	}
	 
	
    public static int[] intersection(int[] nums1, int[] nums2) {
    	Set<Integer> hashSet1=new HashSet<>();
        Set<Integer> hashSet2=new HashSet<>();
        //Set<Integer> hashSet3=new HashSet<>(); 
        //ArrayList arlTest = new ArrayList();
        
        int[] output=new int [0];
        if(nums1.length==0 || nums2.length==0 )
            return output;
        
        for(Integer x : nums1)
            hashSet1.add(x); //Putting it in HashSet from array to remove duplicates
        for(Integer x : nums2)
            if(hashSet1.contains(x)) 
                hashSet2.add(x);
            
        
        int total_length=hashSet2.size();
        int[] intersection_array=new int[total_length];
        int i=0;
        for(Integer x : hashSet2){
        	intersection_array[i]=x;
        	i++;
        }
       
        return intersection_array ;
    }
    
    public static int[] intersectionII(int[] nums1, int[] nums2) {
    	Map<Integer,Integer> hashMap=new HashMap<>();
    	
    	int counter=1;
    	
    	
    	 int[] output=new int [0];
         if(nums1.length==0 || nums2.length==0 )
             return output;
         
         for(int i=0;i<nums1.length;i++){
 			if(hashMap.containsKey(nums1[i])){
 				counter++;
 				hashMap.put(nums1[i],counter);				
 			}
 			else
 				hashMap.put(nums1[i],1);	
 		}
        
         ArrayList<Integer> arr_list=new ArrayList<>();
         for(Integer x : nums2){
             if(hashMap.containsKey(x)){
                 if(hashMap.get(x)>1)
                     hashMap.put(x,hashMap.get(x)-1);
                  else
                      hashMap.remove(x);
                 arr_list.add(x);
             }
         }
         int total_length=arr_list.size();
         int[] intersection_array=new int[total_length];
         int k=0;
         while(k<arr_list.size()){
        	 intersection_array[k]=arr_list.get(k);
        	 k++;
         }
         return intersection_array ;	 
         
 		/*
         for(Integer x : nums2){
        	 if(hashMap1.containsValue(x)){
        		 hashMap2.put(key2, x);
        		 key2++;
        	 }
         }
        
         
         int total_length=hashMap2.size();
         int[] intersection_array=new int[total_length];
         int i=0;
         for(Map.Entry<Integer,Integer> entry: hashMap2.entrySet()){
         	intersection_array[i]=entry.getValue();
         	i++;
         }*/
        
      
    }
        
}
