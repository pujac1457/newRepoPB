import java.util.Arrays;

public class MedianOfTwoSortedArrays {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int totalSize=nums1.length+nums2.length;
		int[] finalnums=new int[totalSize];
		
		for(int i=0;i<nums1.length;i++){
			finalnums[i]=nums1[i];
		}
		int j=nums1.length;
		for(int i=0;i<nums2.length;i++){
			finalnums[j]=nums2[i];
			j++;
		}
		Arrays.sort(finalnums);
		
	
		int medianIndex=totalSize/2;
		if(totalSize%2==0){
			
			return (double)(finalnums[medianIndex-1]+finalnums[medianIndex])/2;
		}
		
			
		
        return  (double)finalnums[medianIndex];
    }
	
	public static void main(String args[]){
		int[] nums1={1,2,10};
		int[] nums2={4,5,8};
		System.out.print(findMedianSortedArrays(nums1,nums2));
	}
}
