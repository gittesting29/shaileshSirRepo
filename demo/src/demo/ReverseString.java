package demo;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String name="Advik Rathod";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string to reverse: ");
		String name=sc.nextLine();
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));
		}
		
		
		
	}

}
