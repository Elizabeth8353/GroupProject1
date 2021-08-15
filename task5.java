package com.syntax.project01;

public class task5 {

	public static void main(String[] args) {
		// Write a program to check whether a given number is prime or not?
		
		
			
			int num = 0;//missing if condition only if num grater than 1 because 0 and 1 not prime
			boolean notPrime = false;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					notPrime = true;
				}
			}
			if (!notPrime) {
				System.out.println(num + " is a prime number");
			} else {
				System.out.println(num + " is not a prime number");
			}
			System.out.println("=============================Asgar======================================");
			
			int number=5;
			boolean isPrime=true;
			if (number>1) {
				for(int i=2;i<number;i++) {
					if(number%i==0) {
						isPrime=false;
						break;
					}
				}
			}else {
				isPrime=false;
			}
			
			System.out.println(number+" is prime "+isPrime);
			
		}

	}


