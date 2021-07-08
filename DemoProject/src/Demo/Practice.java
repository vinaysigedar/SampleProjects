package Demo;

public class Practice {

	public static void main(String[] args) {
		
		String str="Vinay Sigedar";
		int len=str.length();
		System.out.println(len);
		
		
		char[] ch=str.toCharArray();
		int len1=ch.length;
		System.out.println(len1);
		
		int index=str.indexOf('d');
		System.out.println(index);
		
		int a=10;
		int b=a++;
		System.out.println(a);
		System.out.println(b);
		
		int a1=10;
		int b1=++a1;
		System.out.println(a1);
		System.out.println(b1);
	}

}