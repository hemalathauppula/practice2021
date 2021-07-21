package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern p= Pattern.compile("s.");
		Matcher m=p.matcher("sh");
		
		boolean b=m.matches();
		
		System.out.println(b);
		
		boolean b2=Pattern.compile("....s").matcher("hemas").matches();
		System.out.println(b2);
		
		boolean b3=Pattern.matches(".s", "as");
		System.out.println(b3);
		
		System.out.println(Pattern.matches("[abc]", "f"));
	}

}
