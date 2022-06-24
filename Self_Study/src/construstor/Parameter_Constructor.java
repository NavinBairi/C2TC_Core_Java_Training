package construstor;

public class Parameter_Constructor {
	int length , width;
	Parameter_Constructor (int x, int y)
	{
		length = x;
		width = y;
	}
	void display()
	{
		System.out.println(length);
		System.out.println(width);
	}
}
	class Areaa{
	public static void main(String[] args) {
		Parameter_Constructor rect1 = new Parameter_Constructor(10,20);
		rect1.display();
	}
}

