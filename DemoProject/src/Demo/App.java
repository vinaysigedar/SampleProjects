package Demo;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of element:");
		int sum=0;
		int length = scan.nextInt();

		int[] arrayElements = new int[length];

		for (int i = 0; i < length; i++) {
			System.out.println("Give array elements here:");
			arrayElements[i] = scan.nextInt();
		}

		for(Integer i:arrayElements) {
			sum=sum+i;
		}
		System.out.println("sum of array is:"+sum);
	}
}
