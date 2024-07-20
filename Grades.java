/*Write a Java program that prompts the user to enter 
 * student grades and calculates the average. Ensure that 
 * the program can handle different numbers of grades and invalid inputs.package javaclasses;
 */
package javaclasses;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Grades 
{
	public static void main(String[] args)
	{
		 int math=0,science=0,english=0;
		 Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Please Enter the grades");
		System.out.println("Enter marks of subject Math");
		try {
			math=sc.nextInt();
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Invalid");
		}
		System.out.println("Enter marks of subject Science");
		try {
			science=sc.nextInt();
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Invalid");
		}
		System.out.println("Enter marks of subject English");
		 try {
			english=sc.nextInt();
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Invalid");
		}
		
		System.out.println("Average of grades");
		int total=math+science+english;
		int avg=total/3;
		System.out.println(avg);
	}
}
