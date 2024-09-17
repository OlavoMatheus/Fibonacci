package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Write a number: ");
	int number = sc.nextInt();
	int a=0;
	int b=1;
	
	for(int c = a+b; c<number; c = a + b) {
		a=b;
		b=c;
	}
	
	if(a+b==number) {
		System.out.println("faz parte");
	}
	else {
		System.out.println("não faz parte");
	}
	
	
	
	
	
	}
	
}
