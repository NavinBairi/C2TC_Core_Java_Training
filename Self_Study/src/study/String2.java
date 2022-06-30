package study;

public class String2 {

	public static void main(String[] args) {
		String s1,s2;
		int len,pos;
		s1 = "Good Morning  ";
		// to find the length of string
		len = s1.length();
		System.out.println(len);
		// Remove white space at the beginning and end of the  string
		s2 = s1.trim();
		System.out.println(s2);
		pos = s1.charAt(5);
		System.out.println(pos);

	}

}
