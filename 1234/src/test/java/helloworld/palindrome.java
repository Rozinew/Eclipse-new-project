package helloworld;

public class palindrome {

	public static void main(String[] args) {
		
		String input ="Abcba";
		String rev =  "";
		int l = input.length(); 
		for(int i = l-1; i >=0;i--)
		{
			rev = rev + input.charAt(i);
		}
		
		if (input.equalsIgnoreCase(rev)) {
			
			System.out.println("given string is palindrome ");
			
			
		}else {
			System.out.println("given string is  not a palindrome ");
			
			
		}
		
		

	}

}
