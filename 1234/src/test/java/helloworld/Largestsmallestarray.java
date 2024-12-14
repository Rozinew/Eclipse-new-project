package helloworld;

public class Largestsmallestarray {

	public static void main(String[] args) {
		int []a= {25,11,7,75,56,96};
		int max = a[0];
		for (int i = 1; i < a.length; i++)
		{
			if (a[i] > max)
				max=a[i];
			
		}
		System.out.println("Largest number :" + max);
	}

}
