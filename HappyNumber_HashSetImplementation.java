import java.util.HashSet;
import java.util.Set;

public class HappyNumber_HashSetImplementation {
	
	/*
	public static boolean isHappy(int n) {
		String input=String.valueOf(n);
		int sum=0;
		boolean ans=false;
		
		if(String.valueOf(input.charAt(0)).equals("-"))
			return ans;
		else{
			for(int i=0;i<input.length();i++){
				int newNum=Integer.parseInt(String.valueOf(input.charAt(i)));
				sum=sum+(newNum*newNum);
			}
			if(sum==1)
				ans=true;
			else
				isHappy(sum);
		}
		return ans;
		
	}*/
	
	public static boolean isHappy(int num) {		
		Set<Integer> hashSet=new HashSet<>();
		while (hashSet.add(num)) //Returns true if this set did not already contain the specified element
		{
			int value=0;
			while(num>0){
				value=(int) (value+Math.pow(num%10, 2));
				num=num/10;				
			}
			num=value;
		}
		return num==1;
	}
	
	public static void main (String args[]){
		System.out.print(1%10);
		
		System.out.print(isHappy(19));
	}
	
}
