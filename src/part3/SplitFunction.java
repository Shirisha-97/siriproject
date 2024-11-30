package part3;

public class SplitFunction {
	public static void main(String[] args) {
		String s="hello__doctor";
		String s1[]=s.split("__");
		for(int i=0;i<s1.length;i++) {
		System.out.println(s1[i]);
		
	}

}}
