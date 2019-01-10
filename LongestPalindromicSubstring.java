
public class LongestPalindromicSubstring {

	/*
	public static String longestPalindrome(String s) {
		int count=0;
		String largestPalendrome="";
		if(s.length()==1)
			return s;
		
		
		for(int i=0;i<s.length();i++){
			String newString="";
			newString=newString+s.charAt(i);
			count=1;
			for(int j=i+1;j<s.length()-1;j++){
				newString=newString+s.charAt(j);
				if(isPalindrome(newString) && count <newString.length()){
					largestPalendrome=newString;
					count=newString.length();
				}					
			}
		}		
		if(largestPalendrome.length()==0)
			largestPalendrome=largestPalendrome+s.charAt(s.length()-1);
		return largestPalendrome;
	}
	
	public static boolean isPalindrome(String s) {
		 
		 String reverseArray="";
		 if(s.length()==0)
			 return true;
		 s = s.replaceAll("[^A-Za-z0-9]", "");
		 s=s.toLowerCase();
		 
		 for(int i=s.length()-1;i>=0;i--){ 
			 reverseArray=reverseArray+s.charAt(i);
		 }
		 
		 if(reverseArray.equals(s))
			 return true;
		
		
	      return false;
	    }
	
	*/
	
	public static String longestPalindrome(String s) {
		int end=0;int start=0;
		for(int i=0;i<s.length();i++){
			int len1=expandCenter(s,i,i); //One character in center
			int len2=expandCenter(s,i,i+1); //Two characters in center
			int len=Math.max(len1, len2);
			if(len>(end-start))
			{
				end=i-(len-1)/2;
				start=i+(len)/2;
			}
			
		}
		
		return s.substring(start,end+1);
	}
	
	public static int expandCenter(String s,int left,int right) {
		int L=left;
		int R= right;
		while(s.charAt(L)==s.charAt(R) && L>=0 && R<s.length())
		{
			L--;
			R++;
		}
		
		return R-L-1;
	}
	
	
	public static void main (String args[]){
		String st="babad";
		System.out.println(longestPalindrome(st));
	}
}
