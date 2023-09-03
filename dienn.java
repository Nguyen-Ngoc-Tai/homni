package bai1;

import java.util.Scanner;

public class java {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		//var declaration
		int first, last, amount; 
		long money;
		
		//Input data
		do {
			System.out.println("Nhap chi so dien dau thang");
			first = input.nextInt();
		} while ( first < 0 );
		do {
			System.out.println("Nhap chi so dien cuoi thang");
			last = input.nextInt();
		} while ( last < first );
		
		amount = last - first;
		
		if ( amount >= 0 && amount <= 50 ) money = amount * 1648;
		else if ( amount >= 51 && amount <= 100 ) money = amount * 1734;
		else if ( amount >= 101 && amount <= 200 ) money = amount * 2014;
		else if ( amount >= 201 && amount <= 300 ) money = amount * 2536;
		else if ( amount >= 301 && amount <= 400 ) money = amount * 2834;
		else money = amount * 2927;
		
		//Output data 
		System.out.println("So tien phai tra la " + money/1000 + " nghin dong");
	}

}