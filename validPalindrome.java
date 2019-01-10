
public class validPalindrome {
	
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
	 
	 public static void main (String args[]){
			String st="dd";
			System.out.println(isPalindrome(st));
		}

}
