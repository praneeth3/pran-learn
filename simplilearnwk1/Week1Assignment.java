package pranlearn.simplilearnwk1;

import java.util.Scanner;

public class Week1Assignment {

	static int y;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		y = sc.nextInt();
		System.out.println("Assignment 1 - Find weather the number is armstrong or not.");
		Armstrong();
		System.out.println("Assignment 10 - Print all the palindromes between 500 to 550.");
		
	}
	
	public static void Armstrong(){
		int n = y;
		int a = n;
		//int cnt = 0;
		int c = 0;
		while (a % 10 != 0) {
			//cnt++;
			int b = a % 10;
			c = c + (b * b * b);
			a = a / 10;
		}
		//System.out.println(cnt);
		System.out.println(c);
		if (c == n) {
			System.out.println("Entered Number "+n + " is Armstrong number");
		} else {
			System.out.println("Entered Number "+n + " is not an Armstrong number");
		}

	}
	
	public static void palindrome(){
		int cnt =0;
		int c = 0;
		for (int i =500; i<551; i++){
		while (a % 10 != 0) {
			cnt++;
			int b = a % 10;
			c = c + (b * b * b);
			a = a / 10;
		}
	}
	}