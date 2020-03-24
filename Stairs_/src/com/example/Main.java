package com.example;

import java.util.List;

public class Main {


	public static void main(String[] args) {
        //Observable<String> observer = Observable.just("Hello"); // provides data
				
		Main.lineInclinedToLeft();
		Main.lineInclinedToRight();
		Main.rightAngleTriLeft();
		Main.rightAngleTriLeftToppled();
		Main.rightangleTriRight();
		Main.rightangleTriRightToppled();
		Main.triangle();
		Main.triangleToppled();
		Main.triangleTiptowardCenterRight();
	}

	private static void triangleTiptowardCenterRight() {
		// TODO Auto-generated method stub
		Main.upperSeg(6);
		Main.lowerSeg(5);
	}

	private static void upperSeg(int max) {
		// TODO Auto-generated method stub
		for (int i = 0; i < max; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	private static void lowerSeg(int max) {
		// TODO Auto-generated method stub
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < max - i; j++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static boolean isInteger( String input )
	{
	   try
	   {
	      Integer.parseInt( input );
	      return true;
	   }
	   catch(Exception e)
	   {
	      return false;
	   }
	}

	private static void primeRangeTill(int upperLimit) {
		// TODO Auto-generated method stub
		boolean isNumPrime = false;
		int i = 0;
		for(i = 2; i <= upperLimit; i++){
			for(int j = 2; j < i; j++){
				if (i%j == 0) {
					//System.out.println(i + " is not a prime");
					isNumPrime = false;
					break;
				}
			}
			if (isNumPrime) {
				System.out.println(i + " isPrime");
			} else {
				System.out.println(i + " is not Prime");
			}
			isNumPrime = false;
		}
	}

	private static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	private static void triangleToppled() {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= (6-i); j++) {
				if (j < i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

	}
	private static void triangle() {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i+4; j++) {
				
				if (j < 4-i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}	
	

	private static void rightangleTriRightToppled() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				
				if (j <= (i-1)) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
	}

	private static void rightangleTriRight() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				
				if (j < ((6-i)-1)) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
	}

	private static void rightAngleTriLeftToppled() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j <(7-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
	}

	private static void rightAngleTriLeft() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}

	private static void lineInclinedToRight() {
		// TODO Auto-generated method stub
		System.out.println();
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <=4; j++) {
				
				if (i+j == 4)
					System.out.print("*");
				else System.out.print(" ");
			}
			
			System.out.println();
		}
	}

	private static void lineInclinedToLeft() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				
				if (i == j)
					System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
