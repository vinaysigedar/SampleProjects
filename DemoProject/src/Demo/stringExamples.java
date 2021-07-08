package Demo;

import java.util.HashMap;

public class stringExamples {
	public static void main(String[] args) {
		//Reverse a string with using StringBuffer
		String name="Vinay Sigedar";
		StringBuffer sb=new StringBuffer();
		sb.append(name);
		sb=sb.reverse();
		System.out.println(sb);
		//Reverse a string without using StringBuffer
		char[] chararray=name.toCharArray();
		for(int i=chararray.length-1;i>=0;i--) {
			System.out.println(chararray[i]);
		}
		//Replace All
		String name1="Vinay21345";
		name1=name1.replaceAll("[0-9]", "");
		System.out.println(name1);
		//Count duplicate characters in string
		String s1="Vinay Vins Sigedar";
		char[] charray=s1.toCharArray();
		int count=0;
		for(int i=0;i<s1.length();i++) {
			for(int j=i+1;j<s1.length();j++) {
				if(charray[i]==charray[j])
					System.out.println(charray[j]);
					count++;
					break;
			}
		}
		System.out.println("The count of duplicates is:"+count);
		
		//Program to find number of words in string using Hashmap
		String s2="My name is Vinay Sigedar. I am QA Engineer. Vinay is a good QA Engineer.";
		String[] split=s2.split(" ");
		char[] s2char=s2.toCharArray();
		HashMap<String, Integer> countMap=new HashMap<String, Integer>();
		for(int i=0;i<split.length;i++) {
			if(countMap.containsKey(split[i])) {
				count=countMap.get(split[i]);
				countMap.put(split[i], count+1);
			}
			else {
				countMap.put(split[i], 1);
			}
		}
		System.out.println(countMap);
	}
}