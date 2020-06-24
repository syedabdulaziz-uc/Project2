package com.dowhile.zak;

import java.util.Scanner;

public class DoWhileloop {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int num=0;
		do {
			if(num!=-1) {
				System.out.println();
			}
		System.out.println("Enter a number:");
		num=scan.nextInt();
		System.out.println("Cube is:"+(num*num*num));
		}while(num>=0);
		System.out.println("Thank u");
	}

}
