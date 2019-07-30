package stacksAndHashmap;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
	public static void main (String[] args) {
		boolean result = valid("()"); // true
		boolean result1 = valid("()[]{}"); // true
		boolean result2 = valid("(]"); // false
		boolean result3 =valid("([)]"); //false
		boolean result4 = valid("{[]}"); // true
		
		
		System.out.print(result+ " "+result1+ " "+result2+ " "+result3+ " "+result4+ " ");
		System.out.println("Here "+result4);
		
		
				
		
	}
	
	public static boolean valid (String a) {
		HashMap<Character, Character> mp = new HashMap();
		Stack s = new Stack();
		
		mp.put('(', ')');
		mp.put('[', ']');
		mp.put('{', '}');
	
		for(int i = 0 ; i<a.length();i++) {

			if(mp.containsKey(a.charAt(i))) {
				s.push(a.charAt(i));
			}
			else {
				if(s.isEmpty()) {
					return false;
				}
				else {
					char value = mp.get(s.peek());
					
					if(value==a.charAt(i)) {
						s.pop();
					}
					else {
						return false;
					}				
				}			
			}
		}
		
		if(!s.empty()) {
			return false ;
		}
		
		return true ;
		
	}

}
