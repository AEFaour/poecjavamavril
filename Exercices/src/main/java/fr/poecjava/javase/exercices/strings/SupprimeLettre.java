package fr.poecjava.javase.exercices.strings;

public class SupprimeLettre {

	public static void main(String[] args) {
		String str = "Bonjour"; 
		 
		char[] strCh = str.toCharArray();
		
		for (int i = 0; i < strCh.length; i++) {
			if (strCh[i] == 'B' || strCh[i] == 'b') {
				strCh[i] = ' ';
			}
			
		}
		System.out.print(strCh);
		
		str = new String(strCh);
		
		System.out.println("\n" + str);


	}

}
