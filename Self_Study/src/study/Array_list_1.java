package study;

import java.util.ArrayList;

public class Array_list_1 {

	public static void main(String[] args) {
	ArrayList<Integer> number = new ArrayList<Integer> ();
number.add(5);
number.add(6);
//lambda
//(parameter1,parameter2)->(code block)
number.forEach((n) -> {System.out.println(n);});
	}

}
