package Demo;

public class IntegerExamples {

	public static void main(String[] args) {

//Program to check if given number is prime or not
		int temp;
		int num=449;
		boolean isPrime = true;
		for (int i=2;i<=num/2;i++) {
			temp=num%i;
			if(temp==0) {
				isPrime=false;
			break;
		}
		}
		if(isPrime)
			System.out.println(num+ " Number is Prime:");
		else
			System.out.println(num+ "Number is not prime");
		
		
		//Java program to calculate sum of all digits from String
		String str="Indianeeds45runsfrom27ballsandrishabhpantscored92from58balls.";
		String temp1="0";
		int sum=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				temp1+=ch;
			}
			else {
				sum+=Integer.parseInt(temp1);
				temp1="0";
				}
			}
		System.out.println("The sum of all numbers from string is:"+sum);
		}
		
	}
