
public class stringDemo {

	public static void main(String[] args) {
		
		String[] ex0= {"kumaran"};
		char[] ex6= {'a','b','c','d','e','f','h'};
		
	
		String ex1="BCAS";
		String ex2="jaffna";
		String ex3="bcas";
		String ex4="university of jaffna";
		char ex5='a';
		String ex8="        vavuniya";
		
		
		
		System.out.println(ex1);
		System.out.println(ex4.charAt(2));
		System.out.println(ex2.compareTo(ex3));
		System.out.println(ex2.compareToIgnoreCase(ex3));
		System.out.println(ex4.concat(ex3));
		System.out.println(ex3.contentEquals(ex2));
		System.out.println(ex4.copyValueOf(ex6,2,2));
		System.out.println(ex4.endsWith(ex3));
		System.out.println(ex4.getBytes());
		System.out.println(ex2.hashCode());
		System.out.println(ex4.indexOf("y"));
		System.out.println(ex2.intern());
		System.out.println(ex4.lastIndexOf(ex1));
		System.out.println(ex4.length());
		System.out.println(ex3.matches(ex4));
		//System.out.println(ex2.regionMatches(ex5, ex4, ex3, ex2));
		System.out.println(ex2.replace("f", "n"));
		System.out.println(ex2.replaceAll(ex2, ex3));
		System.out.println(ex4.subSequence(2, 4));
		System.out.println(ex4.startsWith(ex3));
		System.out.println(ex3.substring(2));
		System.out.println(ex3.toCharArray());
		System.out.println(ex2.toUpperCase());
		System.out.println(ex3.toUpperCase());
		System.out.println(ex8.trim());
		System.out.println(ex4.valueOf(ex3));
		
	}
	
}
