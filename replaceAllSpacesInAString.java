
public class replaceAllSpacesInAString {
	
	public static String replaceSpaces(String input,int actualLength){
		char[] output=new char[input.length()];
		char[] holder=input.toCharArray();
		int k=0;
		for(int i=0;i<actualLength;i++){
			if(holder[i]==' '){
				output[k]='%';	
				output[k+1]='2';
				output[k+2]='0';
				k=k+3;
			}
			else{
				output[k]=holder[i];
				k++;
			}
				
		}
		String out=new String(output);
		return out;
	}
	
	public static void main (String args[]){
		System.out.println(replaceSpaces("cat tom gina    ",12));
	}

}
