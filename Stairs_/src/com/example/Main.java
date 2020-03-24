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
		
		/*Integer[] ints = new Integer[7];
		ints[0] = 2;
		ints[1] = 1;
		ints[2] = 20;
		ints[3] = 3;
		ints[4] = 1;
		ints[5] = 55;
		ints[6] = 7;

		Integer[] sorted = Main.sorting(ints);
		for (int i = 0; i <= sorted.length-1; i++) {
			System.out.println(sorted[i]);
		}*/
		/*
		Main.doPolyndrom("abcdef");
		Main.getMaxDigit(1043532321);
		Main.lineInclinedToLeft();
		Main.lineInclinedToRight();
		Main.rightAngleTriLeft();
		Main.rightAngleTriLeftToppled();
		Main.rightangleTriRight();
		Main.rightangleTriRightToppled();
		Main.triangle();
		Main.triangleToppled();		
		System.out.println("factorialRecursive: " + Main.factorialRecursive(7));
		System.out.println("factorial: " + Main.factorial(7));
//fabonacci numbers
		System.out.println(isPrime(9));
		Main.primeRangeTill(10);
		System.out.println(reverseOrder("abcde"));
		//Main.fabonnanci(9);
		Main.isPolyndrom("abcdeedcba");
		SORTING ALGORITHMS*/
		
		//Main.fabonnanci(10);

		/*List<String> opertionsToFormList = new ArrayList<String>();
		opertionsToFormList.add("4");
		opertionsToFormList.add("-");
		opertionsToFormList.add("7");
		opertionsToFormList.add("5");
		opertionsToFormList.add("6");
		opertionsToFormList.add("+");
		opertionsToFormList.add("-");
		Main.applyOperationsOn(opertionsToFormList);*/
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

	private static Integer[] sorting(Integer[] ints) {
		Integer temp;
		Integer high;
		Integer low;
		
		//System.out.println("->: " + list.size());
		for ( int i = 0; i <=ints.length-2; i++) {
			for (int j = 0; j<= ints.length-2; j++) {
				System.out.println("index: " + j);
				System.out.println(j + ": " + ints[j]);
				System.out.println((j+1) + ":" + ints[j+1]);
				if (ints[j] < ints[j+1]) {
					temp = ints[j];
					ints[j] = ints[j+1];
					ints[j+1] = temp;
				}				
				System.out.println("->ints: " + ints);
			}
		}
		return ints;
	}
	private static void fabonnanci(int limit) {
		String fabo = "";
		int first = 0;
		int second = 0;
		int sum = 0;
		for (int i = 0; i < limit-1; i++) {
			
			first = i;
			second = i + 1;
			sum += first + second;
			fabo += String.valueOf(sum + " ");
			sum = 0;
			//fabo += String.valueOf("len" + fabo.length());
			
			/*if (fabo.length() > 0) {
				sum += i;
				fabo += String.valueOf(sum + " ");
			} else {
				first = i;
				second = i + 1;
				sum += first + second;
				fabo += String.valueOf(sum + " ");
				fabo += String.valueOf("len" + fabo.length());
			}*/
		}
		
		System.out.println(fabo);

	}
	private static void applyOperationsOn(List<String> opertionsEntriesList) {
		// TODO Auto-generated method stub
		System.out.println("Original list: " ); Main.listContains(opertionsEntriesList);
		int iterator = 0;
		int sum = 0;
		int opCnt = 0;
		int operandCnt = -1;
		while(opertionsEntriesList.size() >= 3) {
			operandCnt++;
			if (!Main.isInteger(opertionsEntriesList.get(iterator))) {
				opCnt++;
				String operator = opertionsEntriesList.get(iterator);
				String firstOperand = opertionsEntriesList.get(iterator-1);
				String secondOperand = opertionsEntriesList.get(iterator-2);
				System.out.println("OperationNumber[" + opCnt + "]: " + firstOperand + " " + operator + " " + secondOperand);
				Main.removeOperation(opertionsEntriesList, iterator);
				System.out.println("OperationNumber[" + opCnt + "] REMOVED");
				sum = Main.applyOperationsOn(firstOperand, secondOperand, operator);
				System.out.println("sum: " + sum); 
				System.out.print("Before adding sum to array: " + sum + " "); Main.listContains(opertionsEntriesList);
				opertionsEntriesList.add(operandCnt-2, String.valueOf(sum));
				System.out.println("After adding sum to array: " + sum); Main.listContains(opertionsEntriesList);
				iterator = -1;
				operandCnt = -1;
			}
			iterator++;
		}
	}
	private static void removeOperation(List<String> opertionsEntriesList, int iter) {
		// TODO Auto-generated method stub
		opertionsEntriesList.remove(iter);
		opertionsEntriesList.remove(iter-1);
		opertionsEntriesList.remove(iter-2);
	}

	private static void listContains(List<String> opertionsToFormList) {
		// TODO Auto-generated method stub
		String trailer = ", ";
		if (opertionsToFormList.size() == 1) {
			trailer = " ";
		} else if (opertionsToFormList.size() == 0) {
			System.out.println("LIST IS EMPTY");
		}
		 
		for (int i = 0; i < opertionsToFormList.size(); i++) {
			System.out.print(opertionsToFormList.get(i) + trailer);
		}
		System.out.println();
	}

	private static int applyOperationsOn(String firstOperand, String secondOperand, String operator) {
		// TODO Auto-generated method stub
		int x = Integer.valueOf(firstOperand);
		int y = Integer.valueOf(secondOperand);
		int operation = 0;
		
		switch (operator) {
		case "+":
			operation = x + y;
			break;
			
		case "-":
			operation = x - y;
			break;
			
		case "*":
			operation = x * y;
			break;
		case "/":
			operation = x / y;	
			break;				

		default:
			break;
		}
		return operation;
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
	
	private static String reverseOrder(String str) {
	int len = str.length();
	String[] rStr = new String[len];
	int j = 0;
	System.out.println("len: " + len);
	
	String strr = "";
	for (int i = len-1; i >= 0; i--) {
		System.out.println("str.charAt(i): " + str.charAt(i));
		System.out.println("i: " + i);
		strr = strr + String.valueOf(str.charAt(i));
	}
	
	return strr;
	}
	private static int factorialRecursive(int num) {
		// TODO Auto-generated method stub
		if (num == 0)
			return 1;
		
		return num * factorialRecursive(num - 1);
	}

	private static int factorial(int num) {
		// TODO Auto-generated method stub
		int sum = 1;
		for (int i = 1; i <= num; i++) {
			sum *= i;
		}
		return sum;
	}
	
	private static void getMaxDigit(int num) {
		// TODO Auto-generated method stub
		int maxRef = -1;
		String num2Str = ""+num;
		int len = num2Str.length();
		
		for (int i = 0; i <= len-1; i++) {
			int digit = Integer.parseInt(String.valueOf(num2Str.charAt(i)));
			System.out.println("digit: " + digit);
			if (digit >= maxRef) {
				maxRef = digit;
			}
		}
		System.out.println("max: " + maxRef);
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

	private static void doPolyndrom(String oriStr) {
		// TODO Auto-generated method stub
		int len = oriStr.length();
		String p = "";
		for(int i = len -1; i >= 0; i--) {
			p = p + oriStr.charAt(i);
		}
		
		String poly = oriStr + p;
		System.out.println("" + poly);
	}
	
	private static boolean isPolyndrom(String oriStr) {
		// TODO Auto-generated method stub
		int len = oriStr.length();
		boolean isPoly = true;
		 
		for(int i = 0; i < len/2; i++) {
			char leftChar = oriStr.charAt(i);
			char rightChar = oriStr.charAt((len-1) - i);
			if (leftChar != rightChar) {
				isPoly = false;
				break;
			}
		}
		if (isPoly) {
			System.out.println("<isPolyndrom> String: " + oriStr + " -> Polyndrome");
			return true;
		} else {
			System.out.println("<isPolyndrom> String: " + oriStr + " -> NOT Polyndrome");
			return false;
		}

	}
}
