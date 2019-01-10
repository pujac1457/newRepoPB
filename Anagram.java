import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Anagram {
	
	public static void main(String args[]){
		//System.out.println(isAnagram("eat","ateaa"));
		String[] strs= {"eat", "tea", "tan", "ate", "nat", "bat","bta"};   
		System.out.println(groupAnagram(strs)); 
	}
	
	
	public static List<List<String>> groupAnagram(String[] strs){
		List<List<String>> newList=new 	ArrayList<>(); 
		if(strs.length==0){
			return newList;
		}
		for(int i=0;i<strs.length;i++){
			List<String> insideList=new ArrayList<>();
			if(strs[i]!=""){
				insideList.add(strs[i]);
			}
		
			for(int j=i+1;j<strs.length;j++){
				if(strs[j]!=""){
					if(isAnagram(strs[i],strs[j])){
						insideList.add(strs[j]);
						strs[j]="";
					}
				}
			}					
			
			
			if(insideList.size()!=0)
				newList.add(insideList);
		}
		return newList;
		
	}
	
	public static boolean isAnagram(String S,String T){
		Set<Character> hashSet=new HashSet<>();
		for(int i=0;i<S.length();i++){
			hashSet.add(S.charAt(i));
		}
		
		for(int i=0;i<T.length();i++){
			if(!hashSet.contains(T.charAt(i)))
				return false;
			
				
			else{
				hashSet.remove(T.charAt(i));
			}
				
		}
		if(hashSet.size()==0)
			return true;
		else
			return false;
	}
}
