package valverij.codingbat;

/**
 * Solutions for problems from <a href='http://codingbat.com/java/String-1'>CodingBat String-1</a>
 */
public class String1 {

	/** Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!" */
	public String helloName(String name) {		
		return String.format("Hello %s!", name);		
	}

	/** Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi". */
	public String makeAbba(String a, String b) {		
		// or a + b + b + a
		return String.format("%1$s%2$s%2$s%1$s", a, b);
	}
	
	/**
	 * The web is built with HTML strings like "&lt;i&gt;Yay&lt;/i&gt;" which draws Yay as italic text. 
	 * In this example, the "i" tag makes &lt;i&gt; and &lt;/i&gt; which surround the word "Yay". 
	 * Given tag and word strings, create the HTML string with tags around the word, e.g. "&lt;i&gt;Yay&lt;/i&gt;"
	 */
	public String makeTags(String tag, String word) {
		return String.format("<%1$s>%2$s</%1$s>", tag, word);
	}

	/**
	 * Given an "out" string length 4, such as "&lt;&lt;&gt;&gt;", and a word, 
	 * return a new string where the word is in the middle of the out string, e.g. "&lt;&lt;word&gt;&gt;". 
	 * Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j
	 */
	public String makeOutWord(String out, String word) {
		int middle = out.length() / 2;
		String front = out.substring(0, middle);
		String back = out.substring(middle);
		return front + word + back;
	}
	
	/** Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2. */
	public String extraEnd(String str) {
		String lastTwo = str.substring(str.length() - 2);
		return lastTwo + lastTwo + lastTwo;
	}
	
	/**
	 * Given a string, return the string made of its first two chars, so the String "Hello" yields "He". 
	 * If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". 
	 * Note that str.length() returns the length of a string.
	 */
	public String firstTwo(String str) {
		int end = str.length() >= 2 ? 2 : str.length();
		String firstTwo = str.substring(0, end);
		return firstTwo;
	}
	
	/** Given a string of even length, return the first half. So the string "WooHoo" yields "Woo". */
	public String firstHalf(String str)	{
		int end = str.length() / 2;
		String firstHalf = str.substring(0, end);		
		return firstHalf;
	}
	
	/** Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2 */
	public String withoutEnd(String str) {		
		String middle = str.substring(1, str.length() - 1);		
		return middle;
	}
	
	/**
	 * Given 2 strings, a and b, return a string of the form short+long+short, 
	 * with the shorter string on the outside and the longer string on the inside. 
	 * The strings will not be the same length, but they may be empty (length 0). 
	 */
	public String comboString(String a, String b) {
		String longer = a.length() > b.length() ? a : b;
		String shorter = a.length() < b.length() ? a : b;		
		return shorter + longer + shorter;
	}
	
	/** Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1. */
	public String nonStart(String a, String b) {
		String first = a.substring(1);
		String last = b.substring(1);
		return first + last;
	}
	
	/** Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2. */
	public String left2(String str) {
		String front = str.substring(0, 2);
		String end = str.substring(2);		
		return end + front;
	}
	
	/** Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2. */
	public String right2(String str) {
		int endIndex = str.length() - 2;
		String front = str.substring(0, endIndex);
		String end = str.substring(endIndex);		
		return end + front;
	}
	
	/** Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty. */
	public String theEnd(String str, boolean front) {
		if(front) {
			return str.substring(0, 1);
		}
		else {
			return str.substring(str.length() - 1);
		}		
	}
	
	/** Given a string, return a version without both the first and last char of the string. The string may be any length, including 0 */
	public String withoutEnd2(String str) {		
		if(str.length() <= 2) {
			return "";
		}
		else {
			String retVal = str.substring(1, str.length() - 1);					
			return retVal;
		}		
	}
	
	/** Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2. */
	public String middleTwo(String str) {
		int index = str.length() / 2;
		String middle = str.substring(index - 1, index + 1);
		return middle;
	}
	
	/** Given a string, return true if it ends in "ly" */
	public boolean endsLy (String str) {		
		return str.endsWith("ly");
	}
	
	/** Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n. */
	public String nTwice(String str, int n) {		
		String front = str.substring(0, n);
		String back = str.substring(str.length() - n);
		return front + back;
	}
	
	/** 
	 * Given a string and an index, return a string length 2 starting at the given index.
	 * If the index is too big or too small to define a string length 2, use the first 2 chars. 
	 * The string length will be at least 2
	 */
	public String twoChar(String str, int index) {
		int length = str.length();
		index = index > 0 && length - index >= 2 ? index : 0; 
		return str.substring(index, index + 2);
	}
	
	/** Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.  */
	public String middleThree(String str) {
		int index = str.length() / 2;
		String middle = str.substring(index - 1, index + 2);
		return middle;
	}
	
	/**
	 * Given a string, return true if "bad" appears starting at index 0 or 1 in the string, 
	 * such as with "badxxx" or "xbadxx" but not "xxbadxx". 
	 * The string may be any length, including 0. Note: use .equals() to compare 2 strings.
	 */
	public boolean hasBad(String str) {
		int index = str.indexOf("bad");
		return  index >= 0 && index < 2;
	}
	
	/** 
	 * Given a string, return a string length 2 made of its first 2 chars. 
	 * If the string length is less than 2, use '@' for the missing chars.
	 */
	public String atFirst(String str) {
		String retVal = str;
		if(retVal.length() < 2) {
			for(int i = retVal.length(); i < 2; i++) {
				retVal += "@";
			}
			return retVal;
		}
		retVal = str.substring(0, 2);
		return retVal;
	}
	
	/** 
	 * Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, 
	 * so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char. 
	 */
	public String lastChars(String a, String b) {
		String first = !a.isEmpty() ? a : "@";
		String last = !b.isEmpty() ? b : "@";
		
		first = first.substring(0, 1);
		last = last.substring(last.length() - 1);
		
		return first + last;
	}
	
	/** 
	 * Given two strings, append them together (known as "concatenation") and return the result. 
	 * However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat"
	 */
	public String conCat(String a, String b) {
		if(a.isEmpty() || b.isEmpty()) {
			return a + b;
		}
		
		int finalIndex = (a.charAt(a.length() - 1) == b.charAt(0)) ? a.length() - 1 : a.length();		
		return a.substring(0, finalIndex) + b;
	}
	
	/** Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign" */
	public String lastTwo(String str) {
		if(str.length() >= 2){			
			int firstIndex = str.length() - 2;
			
			char first = str.charAt(firstIndex);
			char last = str.charAt(firstIndex + 1);
			
			return str.substring(0, firstIndex) + last + first;
		}		
		return str;
	}
	
	/** Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string */
	public String seeColor(String str) {
		if(str.startsWith("red")) {
			return str.substring(0, 3);
		} else if (str.startsWith("blue")) {			
			return str.substring(0, 4);
		}
		return "";
	}
	
	/** Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited" */
	public boolean frontAgain(String str) {
		int length = str.length();
		if(length > 1) {
			String front = str.substring(0, 2);
			String end = str.substring(length - 2);			
			return front.equals(end);
		}
		return false;
	}
	
	/** 
	 * Gtwo strings, append them together (known as "concatenation") and return the result. 
	 * However, if the strings are different lengths, omit chars from the longer string so it is the same length 
	 * as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length. 
	 */
	public String minCat(String a, String b) {
		if(a.length() > b.length()) {
			a = a.substring(a.length() - b.length());
		} 
		else if(b.length() > a.length()) {
			b = b.substring(b.length() - a.length());
			
		}
		return a + b;
	}
	
	/** Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited" */
	public String extraFront(String str) {
		int length = str.length() > 1 ? 2 : str.length();
		String front = str.substring(0, length);				
		return front + front + front;
	}

	/**
	 * Given a string, if a length 2 substring appears at both its beginning and end, return a string without the 
	 * substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". 
	 * Otherwise, return the original string unchanged
	 */
	public String without2(String str) {
		if(str.length() >= 2 && str.endsWith(str.substring(0, 2))) {
			return(str.substring(2));
		}
		return str;
	}
	
	/**
	 * Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and 
	 * keep the second char if it is 'b'. The string may be any length. Harder than it looks.
	 */
	public String deFront(String str) {
		if(str.length() > 1 && str.charAt(1) != 'b') {
			str = str.substring(0, 1) + str.substring(2);
		}
		
		if(str.length() > 0 && str.charAt(0) != 'a') {
			str = str.substring(1);
		}		
		return str;
	}
	
	/**
	 * Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front 
	 * of the string, except its first char does not need to match exactly. On a match, return the front of the string, 
	 * or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". 
	 * The word will be at least length 1. 
	 */
	public String startWord(String str, String word) {
		if(str.length() >= word.length()) {
			if(word.length() == 1) {
				return str.substring(0, 1);
			}
			else if(word.length() > 1 && str.substring(1).startsWith(word.substring(1))) {
				return str.substring(0, word.length());
			}
		}
		return "";
	}

	/**
	 * Given a string, if the first or last chars are 'x', return the string without those 'x' 
	 * chars, and otherwise return the string unchanged
	 */
	public String withoutX(String str) {
		String retVal= str;
		if(retVal.startsWith("x")) {
			retVal = retVal.substring(1);
		}
		if(retVal.endsWith("x")) {
			retVal = retVal.substring(0, retVal.length() - 1);
		}
		return retVal;
	}
	
	/**
	 *  Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, 
	 *  and otherwise return the string unchanged. This is a little harder than it looks.
	 */
	public String withoutX2(String str) {
		if(str.length() > 1 && str.charAt(1) == 'x') {
			str = str.substring(0, 1) + str.substring(2);
		}
		
		if(str.length() > 0 && str.charAt(0) == 'x') {
			str = str.substring(1);
		}		
		return str;
	}
}
