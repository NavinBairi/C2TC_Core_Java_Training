package math;

public class Area_of_rectangle {
	
	// accessing class members
	int length, width;         // class variable
	int rectArea(int x ,int y)  // rectArea is class method
	{
		int area = x * y;
		return(area);
	}
	
class Area{
	public static void main(String[] args) {
	
int area1, area2;
//create any number of object of rectangle
Area_of_rectangle rect1 = new Area_of_rectangle(); // rect1 is a object_name
Area_of_rectangle rect2 = new Area_of_rectangle();


area1 =rect1.rectArea( 10 ,20);
area2 =rect2.rectArea( 15,20);
System.out.println("Area1 = " +area1);
System.out.println("Area2 = " +area2);
	}

}
}