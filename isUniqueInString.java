
public class isUniqueInString {
	
	public static boolean isUnique(String s){
		
		
		boolean output=true;
		if(s.length()>128)
			return output=false;
		int[] arr=new int[256];
		for (int i=0;i<s.length();i++){
			if(arr[s.charAt(i)]!=0)
				output=false;
			arr[s.charAt(i)]++;
		}
		return output;
	}
	
	public static void main (String args[]){
		
		System.out.println(isUnique("catA 123"));
	}

}
