package fr.poecjava.javase.exercices.strings;



public class StringEtoiles {
	
	public static void main(String[] args) {
	
	String str = "Bonjour"; 
	 
	char[] strCh = new char[str.length()];
	
	for (int i = 0; i < strCh.length; i++) {
		
		strCh[i] = '*';
	}
	
	System.out.print(strCh);
	
	str = new String(strCh);
	
	System.out.println("\n" + str);
	
	}
	
}
