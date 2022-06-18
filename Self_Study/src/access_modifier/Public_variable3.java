package access_modifier;

public class Public_variable3 {

	
	}



class A{
	public int month = 10;
}

class B {
	void display()
	{
		A a = new A();
		System.out.println(a.month);
	}
}
class C {
	public static void main(String[] args) {
	B b =new B();
		b.display();
	}

}