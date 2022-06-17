package array;

import java.util.*;

public class Two_Dimensional_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// standard input stream // Scanner is a class in java.util package
		//Create an object for Scanner Class
 Scanner scan = new Scanner(System.in); // scan is object
 
 System.out.print("enter of rows ");
 
int rows = scan.nextInt() ;//Read the input from user

System.out.print("Enter no: of coloumn ");
int cols=scan.nextInt();

int [][] a = new int[rows][cols]; 

System.out.print("enter " + rows + "x" + cols+ " " + (rows +cols) + "integer" );

for(int i = 0; i<rows;i++) // 0<2,,,1<2
{
	for(int j = 0; j<cols;j++) //0<3,1<3,2<3,,  
		{
		
		 
		a[i][j]=scan.nextInt();//a[0][0]=1, a[0][1],a[0][2],,,,,a[1][0]=1, a[1][1],a[1][2]
		
		}}
System.out.println("here are those" + (rows+cols)+"integer is a "+rows+"x"+cols+ "2d array");
System.out.print(Arrays.deepToString(a));

	}

}
