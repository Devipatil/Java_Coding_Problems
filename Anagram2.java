// Checking if the two strings are anagram or not using built-in functions 
// Second way of using built in functions


import java.util.Arrays;
import java.util.Scanner;

public class Anagram2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String str1 = sc.next();
		System.out.println("Enter second string");
		String str2 = sc.next();
		
		char [] arr1 = str1.toCharArray();
		char [] arr2 = str2.toCharArray();
		
		 Arrays.sort(arr1);
		 Arrays.sort(arr2);
		 
		String s1 = new String(arr1);
		String s2 = new String(arr2);
		
		if(s1.equals(s2)) {
			System.out.println("The given two strings are anagram");
		} else {
			System.out.println("The given two strings are not anagram");
		}
	}

}
