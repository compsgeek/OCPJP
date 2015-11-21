package ocpjp.chapter6;

public class StrBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		
		sb.append(" World"); 						// concatenates the string data to the end
		System.out.println(sb);
		
		System.out.println(sb.length()); 		// returns length of StringBuffer
		System.out.println(sb.capacity()); 		// Returns allocated capacity 
		
		System.out.println(sb.charAt(6)); 		// returns char position 
		sb.setCharAt(0, 'Y'); 						// set character in the string buffer
		System.out.println(sb);
		
		sb.insert(6, "new "); 						// inserts one string into another
		System.out.println(sb);
		
		sb.reverse(); 									// reverses the characters in the string buffer
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		sb.delete(6, 9);  								// deletes a sequence of characters
		System.out.println(sb);
		
		sb.deleteCharAt(0); 						// deletes a single character from a position in string buffer
		System.out.println(sb);
		
		sb.replace(0, 5, "Hello"); 					// replaces set of characters with another set
		System.out.println(sb);
				
		String s = sb.substring(7,9); // returns a substring from a string buffer
		System.out.println(s);
				
	}
}
