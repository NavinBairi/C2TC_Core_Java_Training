package oops;

public class Method_overload {

	public static void main(String[] args) {
		int value1,value2;
		Adder add1 =new Adder();
		Adder add2 = new Adder();
		value1 = add1.add(11, 11);
		value2 = add2.add(11, 11,22);
		System.out.println(value1);
		System.out.println(value2);
	}

}


class Adder{
	int add(int x, int y)
	{
		int c = x+y;
		return(c);
	}
	int add(int x, int y,int z)
	{
		int c = x+y+z;
		return(c);
	}
}