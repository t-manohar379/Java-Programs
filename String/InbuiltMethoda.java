package String;

public class InbuiltMethoda {

	public static void main(String[] args) {
		String s1="banana";
		String s2="black";
		
		//1. length
		System.out.println(s1.length());
		
		//2. charAt(int index)
		System.out.println(s1.charAt(5));
		
		//3. indexOf(int ch)
		//4. indexOf(String str)
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.indexOf("program"));
		
		//5. isEmpty()
		System.out.println(s1.isEmpty());
		
		//6. equals(Object o)
		System.out.println(s1.equals(s2));
		
		//7. equalsIgnoreCase(String str)
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//8. compareTo(String str)
//		lexicographical order
		System.out.println(s1.compareTo(s2));
		
		//9.concat(String str)
		System.out.println(s2.concat(s1));
		
		//10. substring(int beginingIndex)
		//11. substring(int beginingIndex,int endingIndex)
		System.out.println(s1.substring(0,1));
		
		//12. replace(char old,char new)
		System.out.println(s1.replace("a", "o").equals(s1));
		
		//13. toLowerCase()
		System.out.println(s1.toLowerCase());
		
		//14.toUpperCase()
		System.out.println(s1.toUpperCase());
	}
}
