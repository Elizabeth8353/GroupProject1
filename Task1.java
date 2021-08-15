package com.syntax.project01;

public class Task1 {

	public static void main(String[] args) {
		/*Create a 2D array of integer values. Print the sum of all numbers.
		 */
		
		int [][] nums= {
				
				{2,5,4,3},
				{5,4,4,},
				{4,2,}
		};
		
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				sum+=nums[i][j];
			}
		}
		System.out.println("The sum of my array is "+sum);
System.out.println("========================================Asghar===================================================================");
int [][] array= {
	{1,2,3,4,5},
	{1,2,3,4,5}
};
System.out.println("NO of rows in above 2D array "+array.length);
for(int row=0;row<array.length;row++) {
	//int res=0;//will be 0
	System.out.println("Number of columns in the "+row+" row "+array.length);
	for(int col=0;col<array[row].length;col++) {
		System.out.println(array[row][col]);
		
	}
	//System.out.println("the res"+res);
}

System.out.println("======================================group=======================================================================");
int[][] num = {{1, 2, 3, 4},{10,20,32},{100,200,302, 400}};
int sum1 = 0;

for (int i = 0; i < num.length; i++) {
	
	for (int j = 0; j < num[i].length; j++) {
		sum+=num[i][j];
	}
	
}
System.out.println("Sum of all values in the array = " + sum1);


	}

}
