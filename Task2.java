package com.syntax.project01;

public class Task2 {

	public static void main(String[] args) {
		/*Create a 2D array or integer type where you will store odd and even numbers. 
		 * Develop a program which will identify/print the even numbers only.
		 * 
		 */
int [][] arr= {
		{4,5,7,2,0},
		{1,6,9}
};

for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
		if(arr[i][j]%2==0) {
			System.out.println(arr[i][j]);
		}
	}
}
System.out.println("=================================group======================================");
int[][] num = { { 1, 2, 3, 4 }, { 11, 20, 32 }, { 101, 200, 302, 433 } };

for (int i = 0; i < num.length; i++) {
	for (int j = 0; j < num[i].length; j++) {
		if (num[i][j] % 2 == 0) {
			System.out.println(num[i][j]);
		}
	}
}
	}

}
