import java.util.HashMap;
import java.util.Map;

public class jewelsAndStones {
	
	public static int numJewelsInStones(String J, String S) {
		Map<Character,Integer> hashMap1=new HashMap<>();
		
		for(int i=0;i<S.length();i++){
			if(hashMap1.containsKey(S.charAt(i))){
				int val=hashMap1.get(S.charAt(i));
				hashMap1.put(S.charAt(i),val+1);
			}
			else
				hashMap1.put(S.charAt(i),1);				
		}
		int counter=0;
		for(int i=0;i<J.length();i++){
			if(hashMap1.containsKey(J.charAt(i))){
				counter=counter+hashMap1.get(J.charAt(i));
			}
		}
		
        return counter; 
    }
	
	public static void main (String args[]){
		String J="z";
		String S="ZZ";
		
		System.out.println(numJewelsInStones(J,S));
	}

}
