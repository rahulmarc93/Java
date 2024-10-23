package string;

public class StringBuilderDemo {

		public static void main(String[] args) {
			// StringBuilder,StringBuffer
			StringBuilder str=new StringBuilder("Wlcome for Java Session");
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