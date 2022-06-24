package array;

public class Array_add {

	public static void main(String[] args) {
		int len , i,sum = 0;
		int number [] = {1,2,3,4,5,6};
		len = number.length;
		for ( i = 0; i<len;i++ )
		{
			sum = sum + number[i];
		//	System.out.println("Number  " + i + " is " + number[i]);
			
			System.out.println(sum);
			
		}

	}

}
