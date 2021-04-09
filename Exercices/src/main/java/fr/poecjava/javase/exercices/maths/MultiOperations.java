package fr.poecjava.javase.exercices.maths;

public class MultiOperations {

	public static void main(String[] args) {
		double x = 2.5; 
		double y = -1.5;
		int m = 18; 
		int n = 4;
		
		double res1 = x + n * y - (x + n) * y; 
		
		System.out.printf(" res1 = %s\n", res1);
		
		double res2 = m / n + m % n; 
		
		System.out.printf(" res2 = %s\n", res2);
		
		double res3 = 5 * x - n / 5; 
		
		System.out.printf(" res3 = %s\n", res3);
		
		double res4 = 1 - (1 - (1 - (1 - (1 - n))));
		
		System.out.printf(" res4 = %s\n", res4);
		
		double res5 = Math.sqrt(Math.sqrt(n)); 
		
		System.out.printf(" res5 = %s\n", res5);

	}

}
