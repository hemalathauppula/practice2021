package practice;

import java.io.IOException;

public class Firstclass {

	public static void main(String[] args) throws IOException {
		String str1="hema";
		String str2="hema";
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		String str3=new String("latha");
		String str4=new String("latha");
		
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		
	}

	
}
