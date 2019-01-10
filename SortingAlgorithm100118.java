
public class SortingAlgorithm100118 {
	public static void main (String args[]){
		int[] arr= {9,3,9,2,8};
		//BubbleSort(arr);
		MergeSort(arr,0,arr.length-1);
		 for (int i=0;i<arr.length;i++){
			 System.out.print(arr[i]+" ");
		 }
		
	}
	 
	public static int[] BubbleSort(int[] arr){
		 for (int i=arr.length-1;i>0;i--){
			 for (int j=0;j<i;j++){
				 if(arr[j]>arr[j+1])
				 {
					 int temp=0; 
					 temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
					 //swap(arr[j],arr[j+1]);
				 }					 
			 }				 
		} 
		 return arr;		
	}
	
	public static void MergeSort(int[] arr,int start, int end){
		int middle =(int)Math.floor((start+end)/2);
		MergeSort(arr,start,middle);
		MergeSort(arr,middle+1,end);
		Merge(arr,start,middle,end);

	}
	public static void Merge(int[] arr,int start, int middle,int end){
		int sizeOfLeft= (middle-start)+1;
		int sizeOfRight= (end-middle);
		int[] left=new int[sizeOfLeft];
		int[] right=new int[sizeOfRight]; // should not have -1
		
		for(int i=0;i<((middle-start)+1);i++){
			left[i]=arr[start+i];
		}
		for(int i=0;i<(end-(middle+1));i++){
			right[i]=arr[middle+1+i];
		}
		int i=0;
		int j=0;
		for(int k=start;k<end;k++){			
			if((left[i]<=right[j] && i< sizeOfLeft)|| j>sizeOfRight){
				arr[k]=left[i];
				i++;
			}
			else{
				arr[k]=left[j];
				j++;
			}
		}
		
	}
	
	public static void swap(int num1,int num2){
		int temp= 0;
		temp=num1;
		num1=num2;
		num2=temp;
	}
	

}
