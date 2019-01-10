import java.util.Stack;

public class ValidParenthesis {
	
	public static void main (String args[]){
		System.out.println(isValid("({}]"));
	}
	
	public static boolean isValid(String s) {
		Stack<Character> newStack=new Stack<>();
		boolean return_ans = true;
		char newPop = 0; 
		for(int i=0;i<s.length();i++){
			switch (s.charAt(i))
			{
			case '[':
			case '{':
			case '(':
				newStack.push(s.charAt(i));
				break;
			case ']':
			case '}':
			case ')':
			{
				if(newStack.empty())
					return_ans= false;
				else{
					newPop=newStack.pop();				
					if(s.charAt(i)==']' && newPop!='[')
						return_ans= false;
					else if(s.charAt(i)=='}' && newPop!='{')
						return_ans= false;
					else if(s.charAt(i)==')' && newPop!='(')
						return_ans= false;
				}				
			}
			break;
			}				
		}
		
		if(!newStack.empty())
			return_ans= false;
		
		
        return return_ans;
    }

}
