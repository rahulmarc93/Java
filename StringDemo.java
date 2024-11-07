package string;

public class StringDemo {

	public static void main(String[] args) {
		// declare String in literal way
		String str1="welcome";
		String str6="welcome";
		String str2="WELCOME";
		String str3=" To";
		String str4=" Java";
		// declare String using new keyword
		String str5=new String("welcome");
		System.out.println(str1);
		System.out.println(str5);
		//concatenation(+,concat)
		System.out.println(str1+str3+str4);
		System.out.println(str1.concat(str3).concat(str4));
		System.out.println(str1.equals(str5));//check value only
		System.out.println(str1==str5);//value as well as memory address location
		System.out.println(str1==str6);
		System.out.println(str1==str2);
//remove unwanted space->trim
		//System.out.println(str1.trim());
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toLowerCase());
		System.out.println(str1.valueOf(str2));
		System.out.println(str1.charAt(2));
		System.out.println(str1.length());
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.indexOf('e'));
		System.out.println(str1.substring(0,3));
		String s="Java is an object oriented programm";
		//split
		String result[]=s.split(" ");
		System.out.println("Result is:");
		for(String str:result)
		{
			System.out.println(str+",");
		}
		//Strat with
		System.out.println(str1.startsWith("del"));
		//endwith
		System.out.println(str1.endsWith("ome"));
		//for getting Single character from String
		char ch[]=str1.toCharArray();
		System.out.println("Char array elements are:");
		
		for(int i=0;i<str1.length();i++)
		{
			System.out.println(ch[i]);
		}
				
		//char array to String
		char[]letter= {'h','a','i'};
		String ChToS=new String(letter);
		System.out.println(ChToS);
		
	}

}
