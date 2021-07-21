package strings;

public class Strings1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="hello";
		String str2="java";
		String result= str1.compareTo(str2)>0?"Yes":"No";
		System.out.println(str1.length()+str2.length());
		System.out.println(result);
		String firststr1=str1.substring(0,1);
		String firststr2=str2.substring(0,1);
		str1=str1.substring(1);
		str2=str2.substring(1);
		
		str1=firststr1.toUpperCase()+str1;
		str2=firststr2.toUpperCase()+str2;
		
		System.out.println(str1+" "+str2);
		

	}

}
