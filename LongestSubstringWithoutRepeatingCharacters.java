import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
	
	public static int lengthOfLongestSubstring(String s) {
		int counter=0;
		int final_counter=0;
		Set<Character> hashSet=new HashSet<>();
		if(s.charAt(0)==' ')
			return 1;
		for(int i=0;i<s.length();i++){
			if(hashSet.contains(s.charAt(i))){
				if(final_counter<=counter){
					final_counter=counter;
					counter=0;
				}
				hashSet.clear();
			}		
			hashSet.add(s.charAt(i));
			counter++;
		}	
        return final_counter;
    }
	
	public static void main (String args[]){
		System.out.println(lengthOfLongestSubstring(" "));
	}

}
