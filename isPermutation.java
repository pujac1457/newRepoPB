import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class isPermutation {
	
	public static boolean isPermut(String s1,String s2){
		//if(s1.length()!=s2.length())
			//return false;
		
		Map<Character,Integer> hashMap=new HashMap<>();
		
		for (int i=0;i<s1.length();i++){
			
			if(hashMap.containsKey(s1.charAt(i)))
					hashMap.put(s1.charAt(i),hashMap.get(s1.charAt(i))+1);
			
			hashMap.put(s1.charAt(i), i);
				
		}
		
		for (int i=0;i<s2.length();i++){
			if(hashMap.containsKey(s2.charAt(i))){
				hashMap.remove(s2.charAt(i));
			}
			else if(hashMap.isEmpty() && i>=0)
				return false;
		}
		
		if(hashMap.isEmpty())
			return true;
		else
			return false;
		
	}
	
	public static void main (String args[]){
		System.out.println(isPermutCorrectVersion1("dcaat","tacd"));
		System.out.println(isPermutCorrectVersion2("dcaat","tacad"));
	}
	
	public static boolean isPermutCorrectVersion1(String s1,String s2){
		if(s1.length()!=s2.length())
			return false;
		int[] holder1=new int[256];
		for (int i=0;i<s1.length();i++){
			holder1[s1.charAt(i)]++;
		}
		
		for (int i=0;i<s2.length();i++){
			int temp=s2.charAt(i);
			holder1[temp]--;
			if(holder1[temp]<0)
				return false;
		}
		return true;
		
	}
	
	public static String Sort(String s){
		char[] content =s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
	
	public static boolean isPermutCorrectVersion2(String s1,String s2){
		return Sort(s1).equals(Sort(s2));
	}

}
