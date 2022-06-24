package array;
import java.util.*;




public class Add_Two_Matrix {
	int m,n;
	int first[][] = new int[m][n];
	int second[][] = new int[m][n];
	

	

	
// constructor 
public Add_Two_Matrix(int m, int n, int[][] first, int[][] second) {
	super();
	this.m = m;
	this.n = n;
	this.first = first;
	this.second = second;
}
public static void main(String[] args) {
	int m,n,c,d;
	 Scanner in = new Scanner(System.in);
	 System.out.println("Enter the number of row and coloum");
	 m = in.nextInt();
	 n = in.nextInt();
	 

		int first[][] = new int[m][n];
		int second[][] = new int[m][n];
		 System.out.println("Enter the element of first matrix");
		
		 for(c=0; c<m; c++)
		 {
			 for(d=0;d<n;d++)
			 {
				 first[c][d] = in.nextInt();
				 
			 }
		 }
	 
		 System.out.println("Enter the element of Secound matrix");
		 for(c=0; c<m; c++)
		 {
			 for(d=0;d<n;d++)
			 {
				 second[c][d] = in.nextInt();
				 
			 }
		 }
		 System.out.println( "\n Element of first matrix" );
		 for(c=0; c<m; c++)
		 {
			 for(d=0;d<n;d++)
			 {
				 System.out.println( first[c][d]+ "\t" );
			 }
			 System.out.println();
		 }
		 System.out.println( "\n Element of second matrix" );
		 for(c=0; c<m; c++)
		 {
			 for(d=0;d<n;d++)
			 {
				 System.out.println( second[c][d]+ "\t" );
			 }
			 System.out.println();
		 }
		 
			 

Add_Two_Matrix  a = new Add_Two_Matrix(m,n,first,second);
a.addmatrix(a);
}

public void addmatrix(Add_Two_Matrix a)
{
	int c,d;
	int sum[][] = new int[a.m][a.n];
	 for(c=0; c<m; c++)
	 {
		 for(d=0;d<n;d++)
		 {
			 sum[c][d] = a.first[c][d] + a.second[c][d];
		 }
	 }
	 System.out.println( "\n Sum of two matrix is " );
	 for(c=0; c<m; c++)
	 {
		 for(d=0;d<n;d++)
		 {
			 System.out.println(sum[c][d] + "\t");
			 
		 }
		 System.out.println();
	 }
	 }
		 }




		 