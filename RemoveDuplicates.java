package selenium;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String name = "PayPal India";
		char[] charArray = name.toCharArray();
		
		LinkedHashSet<Character> charSet = new LinkedHashSet<Character>();
		LinkedHashSet<Character> dupCharSet = new LinkedHashSet<Character>();
		for(int i = 0; i<charArray.length;i++) {
			System.out.println("charArray["+i+"]" + charArray[i]);
			boolean add1 = charSet.add(charArray[i]);			
			if(add1==false) {
				dupCharSet.add(charArray[i]);
			}
			for(Character char1 : dupCharSet) {
				charSet.remove(char1);
			}		
		}
		System.out.println(charSet);
		System.out.println(dupCharSet);
		
		
		
	}

}
