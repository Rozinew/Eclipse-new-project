package helloworld;

public class Countstring {

	public static void main(String[] args) {
		String s = "Rozi is a good girl";
		int count = 1;
		
		for(int i=0;i<=s.length();i++)
		{
			
			if((s.charAt(i)==' ') && (s.charAt(i + 1) != ' '))
			{
				count++;
			}
			System.out.println("Number of words i string=" +count);
			
		}
		
	}
	

}
	
	
