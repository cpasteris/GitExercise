package src;

import java.util.Scanner;

public class GitExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers that you want to add.");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=x+y;
		System.out.println("The two numbers you entered equals: "+z);
		sc.close();
	}

}
