
public class CharacterProblems {
public static void main(String [] args) {
	String s = "ZCLEARY";
	printCharacter(s);
	printUppercase(s);
	printLowerCase(s);
	countUppercase(s);
	newStringOnlyUpper(s);
	digitFirstThenCharacter(s);
	upperCaseFirstThenRemaining(s);
	removeAllSpaces(s);
	reverseCase(s);
	reverseString(s);
	palindrome(s);
	piglatin(s);
	shiftEachCharacterBytwo(s);
}

private static void shiftEachCharacterBytwo(String s) {
	 String word = "";
 for(int i = 0;i<s.length();i++) {
	
	 char c = s.charAt(i);
	 if(c == 'Y'||c=='Z') {
		  c-=26;
		  
		  
	 }
	 c+=2;
	  word = word + c;
 } 
 System.out.println(word);
}

private static void piglatin(String s) {
	 String ans = "";
 	for(int i = 0; i<s.length();i++) {
 		
 		char ch = s.charAt(i);
 		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
 			if(i==0) ans = s +"WAY";
 			else ans = s.substring(i-1) + s.substring(0,i) + "AY";
 			 
 		} 
 	}
 	
		System.out.println(ans);
}

private static void palindrome(String s) {
	String rev = "";
	 for(int i = 0; i<s.length();i++) {
		 char c = s.charAt(i);
		 rev = c + rev;
	 }
	 if(rev.equalsIgnoreCase(s)) System.out.println("palindrome");
	 else System.out.println("not palindrome");	
}

private static void reverseString(String s) {
 String rev = "";
 for(int i = 0; i<s.length();i++) {
	 char c = s.charAt(i);
	 rev = c + rev;
 }
 
 System.out.println(rev);
}

private static void reverseCase(String s) {//Hello World
 String sn = "";
 for(int i = 0 ; i<s.length();i++) {
	 char c = s.charAt(i);
	 if(Character.isUpperCase(c)) {
		 sn = sn + Character.toLowerCase(c);
	 }
	 if(Character.isLowerCase(c)) {
		 sn = sn + Character.toUpperCase(c);
	 }
	 if(Character.isDigit(c) || Character.isWhitespace(c)) {
		 sn = sn + c;
	 }
 }
 System.out.println(sn);
}

private static void removeAllSpaces(String s) {
 String sn = "";
 for(int i = 0;i<s.length();i++) {
	 char c = s.charAt(i);
	 if(!Character.isWhitespace(c)) {
		 sn = sn + c;
	 }
 }
 System.out.println(sn);
}

private static void upperCaseFirstThenRemaining(String p) {
 String u = "";
 String r ="";
 String s = p.replaceAll("\\s+", "");
 for(int i = 0;i<s.length();i++) {
	 char c = s.charAt(i);
	 if(Character.isUpperCase(c)) {
		 u = u + c;
	 }else {
		 r = r+c;
	 }
	 
 }
 System.out.println(u+  r);
 
 
}

private static void digitFirstThenCharacter(String s) {
 String digit = "";
 String character = "";
 for(int i = 0; i<s.length();i++) {
	 char c = s.charAt(i);
	 if(Character.isDigit(c)) {
		 digit = digit + c;
	 }
	 if(Character.isAlphabetic(c)) {
		 character = character + c;
	 }
 }
 System.out.println(digit+" "+character.toUpperCase());
}

private static void newStringOnlyUpper(String s) {
	String u = "";
	for(int i = 0; i<s.length();i++) {
		char c = s.charAt(i);
		u = u + Character.toUpperCase(c);
		
 	}
	System.out.println(u);
}

private static void countUppercase(String s) {
	int count= 0,countl=0,isDigit=0;
 for(int i = 0;i<s.length();i++) {
	 char c = s.charAt(i);
	 if(Character.isUpperCase(c)) {
		 count++;
	 }
	 if(Character.isLowerCase(c)) {
		 countl++;
	 }
	  if(Character.isDigit(c)) {
		 
		  isDigit++;
	  }
 }
 System.out.println(count);
// System.out.println(countl);
// System.out.println(isDigit);

}

private static void printLowerCase(String s) {
 for(int i = 0; i<s.length();i++) {
	 char c = s.charAt(i);
	 if(Character.isLowerCase(c)) {
		 System.out.println(c);
	 }
 }
}

private static void printUppercase(String s) {
 for(int i = 0; i<s.length();i++) {
	 char c = s.charAt(i);
	 if(Character.isUpperCase(c)) {
		 System.out.println(c);
	 }
	
 }
}

private static void printCharacter(String s) {
 	 for(int i = 0;i<s.length();i++) {
		 char c = s.charAt(i);
 		 System.out.println(c +" ascii code is :- "+(int)c);
 	 }
	
}

}
