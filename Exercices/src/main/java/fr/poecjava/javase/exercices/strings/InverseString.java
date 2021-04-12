package fr.poecjava.javase.exercices.strings;

public class InverseString {

	public static void main(String[] args) {
		String str = "Bonjour"; 
		 
		char[] strCh = str.toCharArray();
		
		System.out.println(strCh);
		
		for (int i = 0; i < strCh.length; i++) {
			
			int j = strCh.length - 1 ; 
			System.out.print(strCh[j - i]);
			
		}
		System.out.println("\n"+str);

	}

}
