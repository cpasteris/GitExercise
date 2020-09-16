package src;

import java.util.Scanner;

public class GitExercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("press 0 if you would like to add two numbers, or 1 if you would like to subtract two numbers.");
		int i = sc.nextInt();
		if(i==0) {
			System.out.println("Enter two numbers that you want to add:");
			int x=sc.nextInt();//takes to numbers as user input
			int y=sc.nextInt();
			int z=x+y;//adds the two numbers together
			System.out.println(x+"+"+y+"="+z);//displays the calculation and the result
			}
		if(i==1) {
			System.out.println("Enter two numbers that you want to subtract:");
			int x=sc.nextInt();//takes to numbers as user input
			int y=sc.nextInt();
			int z=x-y;//subtracts the two numbers
			System.out.println(x+"-"+y+"="+z);//displays the calculation and the result
		}else {
			while(i!=1 || i!=0) {
				System.out.println("please provide a valid input.\npress 0 if you would like to add two numbers, or 1 if you would like to subtract two numbers.");
				i = sc.nextInt();
				if (i==1 || i==0) {break;}
			}if(i==0) {
				System.out.println("Enter two numbers that you want to add:");
				int x=sc.nextInt();//takes to numbers as user input
				int y=sc.nextInt();
				int z=x+y;//adds the two numbers together
				System.out.println(x+"+"+y+"="+z);//displays the calculation and the result
				}
			if(i==1) {
				System.out.println("Enter two numbers that you want to subtract:");
				int x=sc.nextInt();//takes to numbers as user input
				int y=sc.nextInt();
				int z=x-y;//subtracts the two numbers
				System.out.println(x+"-"+y+"="+z);//displays the calculation and the result
			}
		}
		sc.close();
	}

}
