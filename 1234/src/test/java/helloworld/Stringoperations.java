package helloworld;

public class Stringoperations {

	public static void main(String[] args) {
		String S1="hello";
		String S2="hello";
		String S3= "Rozi";
		System.out.println(S2.concat(S3));
		System.out.println(S2.substring(0,2));
		System.out.println(S2.charAt(0));
		System.out.println(S2.replace("e", "w"));
		StringBuffer a= new StringBuffer("Rozi");
		System.out.println(a.append("shahid"));
		
		
		String s3= new String("hello");
		String s4 = new String ("hello");
		String s5= new String ("hello");
		
		System.out.println(S1==S2);
		System.out.println(S1==s3);
		System.out.println(s4==s5);
		
		System.out.println(S1.equals(S2));
		System.out.println(S2.equals(s5));
		System.out.println(s4.equals(s5));
		
		
	}

}
