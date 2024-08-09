
public class StringWordsProblem {

	public static void main(String[] args) {
		String sn = "The Red dnd the Rox we suraj i they is anaasdf";
		//printSn(sn);
		//printFirstCharacter(sn);
		//printFirstTwoCharacter(sn);
		//printOnlyWordStartWithR(sn);
		//printWordEndingWith(sn);
		//printWordContaining(sn);
		//printOnlyWordwithLength(sn);
		//printSpecialWord(sn);
		//longestWord(sn);
		//wordExist(sn);
		//countWord(sn);
		//changeWord(sn);
		alternateUpperLowerCase(sn);
	}

	private static void alternateUpperLowerCase(String sn) {
		String w = "";
		 sn+=" ";
		 String ans = "";
		 int count = 0;
		 for(int i =0;i<sn.length();i++) {
			 char c = sn.charAt(i);
			 if(c!=' ') {
				 w+=c;
			 }else {
				 if(count++%2==0) {
					 ans = ans+w.toUpperCase()+" ";
				 }else {
				  ans = ans + w.toLowerCase()+" ";}
				 w="";
			 }
		 }
		 System.out.println(ans);
	}

	private static void changeWord(String sn) {
		 String w = "";
		 sn+=" ";
		 String ans = "";
		 for(int i =0;i<sn.length();i++) {
			 char c = sn.charAt(i);
			 if(c!=' ') {
				 w+=c;
			 }else {
				 if(w.equalsIgnoreCase("red")) {
					 ans = ans+"Blue"+" ";
				 }else {
				  ans = ans + w+" ";}
				 w="";
			 }
		 }
		 System.out.println(ans);
	}

	private static void countWord(String sn) {
		 String w = "";
		 sn+=" ";
		 int count = 0;
		 for(int i =0;i<sn.length();i++) {
			 char c = sn.charAt(i);
			 if(c!=' ') {
				 w+=c;
			 }else {
				 count++;
				 w="";
			 }
		 }
		 System.out.println(count);
	}

	private static void wordExist(String sn) {
		String w ="";
		sn+=" ";
		for(int i =0;i<sn.length();i++) {
			char c = sn.charAt(i);
			if(c != ' ') {
				w+=c;
			}else {
				if(w.equalsIgnoreCase("suraj"))System.out.println(w);
 				w="";
			}
		}
	}

	private static void longestWord(String sn) {
		String lw = "";
		String w="";
		sn+=" ";
		for(int i = 0; i<sn.length();i++) {
			char c = sn.charAt(i);
			if(c != ' ') {
				w+=c;
			}else {
				if(w.length()>lw.length()) {
					lw = w;
				}
				w="";
			}
		}
		System.out.println(lw);
	}

	private static void printSpecialWord(String sn) {
		String w = "";
		sn+=" ";
		for(int i=0;i<sn.length();i++) {
			char c = sn.charAt(i);
			if(c!=' ') {
				w+=c;
			}else {
				if(w.charAt(0) == w.charAt(w.length()-1)){System.out.println(w);}
				w="";
			}
		}
	}

	private static void printOnlyWordwithLength(String sn) {
		sn+=" ";
		String w = "";
		for(int i=0;i<sn.length();i++) {
			char c = sn.charAt(i);
			if(c!=' ') {
				w+=c;
			}else {
				if(w.length()==2)System.out.println(w);
				w="";
			}
		}
	}

	private static void printWordContaining(String sn) {
		String w = "";
		sn+="";
		for(int i = 0; i<sn.length();i++) {
			char c = sn.charAt(i);
			if(c !=' ') {
				w+=c;
			}else {
				if(w.contains("d"))System.out.println(w);
				
				w="";
			}
		}
	}

	private static void printWordEndingWith(String sn) {
 			String w =  "";
 			sn+=" ";
 			for(int i = 0; i<sn.length(); i++) {
 				char c = sn.charAt(i);
 				if(c!=' ') {
 					w+=c;
 				}else {
 					System.out.println(w.substring(w.length()-2));
 					w="";
 				}
 			}
	}

	private static void printOnlyWordStartWithR(String sn) {
		String word = "";
		sn+=" ";
		for(int i = 0; i<sn.length();i++) {
			char c = sn.charAt(i);
			if(c!=' ') {
				word  = word + c;
			}else {
				word = word.toUpperCase();
				 
				if(word.startsWith("R")) {
					System.out.println(word);
				}
				word ="";	
					
				
			}
		}
	}

	private static void printFirstTwoCharacter(String sn) {
		String word = "";
		sn+=" ";
		for(int i = 0 ; i<sn.length();i++) {
			char c = sn.charAt(i);
			if(c!=' ') {
				word = word + c;
			}else {
				System.out.println(word.substring(0,2));
				word = "";
			}
		}
	}

	private static void printFirstCharacter(String sn) {
		String word = "";
		sn +=" ";
		for(int i = 0; i<sn.length();i++) {
			char c = sn.charAt(i);
			if(c!=' ') {
				word = word + c;
			}else {
				System.out.println(word.charAt(0));
				word = "";
			}
		}
	}

	private static void printSn(String sn) {
 			String word = "";
 			for(int i = 0 ; i<sn.length();i++) {
 				char c = sn.charAt(i);
 				if(c!=' ') {
 					word = word + c;
 				}else {
 					System.out.println(word);
 					word = "";
 				}
 			}
	}

}
