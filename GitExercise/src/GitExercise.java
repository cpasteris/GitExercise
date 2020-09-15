package src;

import java.util.Scanner;

public class GitExercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers that you want to add:");
		int x=sc.nextInt();//takes to numbers as user input
		int y=sc.nextInt();
		int z=x+y;//adds the two numbers together
		System.out.println(x+"+"+y+"="+z);//displays the calculation and the result
		sc.close();
	}

}
