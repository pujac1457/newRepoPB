import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class firstUniqueCharacter {
	
	public static void main (String args[]){
		System.out.println(firstUniqChar_notUsingHashMAP("leetcode"));
		
	} 
	public static int firstUniqChar_notUsingHashMAP(String s){
		int[] arr=new int[256];
		for(int i=0;i<s.length();i++){
			arr[s.charAt(i)]++;
		}
		int index=0;
		for(int i=0;i<s.length();i++){
			if(arr[s.charAt(i)]==1){
				index=i;
				break;
			}
		}
		return index;
	}
	public static int firstUniqChar(String s){
		
		Map<Character,Integer> hashMap=new HashMap<>();
		int counter=0;
		for(int i=0;i<s.length();i++){
			if(hashMap.containsKey(s.charAt(i))){
				counter++;
				hashMap.put(s.charAt(i),counter);				
			}
			else
				hashMap.put(s.charAt(i),1);	
		}
		
		for(int i=0;i<s.length();i++){
			if(hashMap.get(s.charAt(i))==1)
				return s.charAt(i);
		}
		
		throw new RuntimeException("did not find any repeated characters");
	}
}
