package part3;

public class ReverseString {
	public static void main(String[] args) {
		String s="hello";
		char a[]=s.toCharArray();
		char b[] = new char[a.length];
		int j = 0;
		for(int i=a.length-1;i>=0;i--) {
			b[j] = a[i];
			j++;
		}
		String rev=new String(b);
		System.out.println(rev);
		
	
	}

}
