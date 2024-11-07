package string;

public class StringBufferDemo {

	public static void main(String[] args) {
		// StringBuilder,StringBuffer
		StringBuffer str=new StringBuffer("Wlcome for Java Session");
		System.out.println(str);
		str.insert(1, 'e');
		System.out.println(str);
		
		str.append(" Dear Students");
		System.out.println(str);
		
		str.delete(16, 24);
		System.out.println(str);
		
		str.replace(8, 12, "to ");
		System.out.println(str);
	}

}