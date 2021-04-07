package fr.poecjava.javase.type.primitifs;

public class Conversion {

	public static void main(String[] args) {
		int x;
		double y = 2.5;
		x = (int) y; // Conversion explicite == valeur tronquée

		System.out.printf("x = %s\n", x);

		int a;
		short b = 2;
		a = b; // Conversion implicite

		System.out.printf("a = %s\n", a);

		int c = 234455649;

		b = (short) c;
		
		System.out.printf("b = %s\n", b);

		
		System.out.printf("maxShort = %s\n", Short.MAX_VALUE);
	}

}
