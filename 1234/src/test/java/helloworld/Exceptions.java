package helloworld;

public class Exceptions {

	public static void main(String[] args) {
		int b=7;
		int c=0;
		
		try
		{
			int k=b/c;
			System.out.println(k);
			
		}
		finally 
		{
			System.out.println("catch is not there");
		}
		

	}

}
