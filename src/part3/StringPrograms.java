package part3;

public class StringPrograms {
	public static void main(String[] args) {
		String s="java";
		String s1=new String("java");
		System.out.println(s);
		System.out.println(s1);
		//== methods compares address
		System.out.println(s==s1);
		//equsla method compares data
		System.out.println(s.equals(s1));

	}

}
