package array;

public class Largest_Number {

	public static void main(String[] args) {
	/*	int large ,i,len;
		
		int[] number = {1,2,4,5,6};
		len = number.length;
		large = number[0];
		for(i=0;i<len;i++) {
			if (number[i] > large)
			{
			large = number[i];
			}
		}
		
		
		System.out.println(large);
		
	}*/
		// Small Number
	int small ,i,len;
		
		int[] number = {1,2,4,5,6,0};
		len = number.length;
		small = number[0];
		for(i=0;i<len;i++) {
			if (number[i] < small)
			{
			small = number[i];
			}
		}
		
		
		System.out.println(small);
		
	}

}
