package fr.poecjava.javase.type.primitifs;

public class TypeEntier {

	public static void main(String[] args) {
		System.out.println("========Type Byte=======\n");
		/**
		 * Le type byte est un entier signé, codé sur un octet soit 8 bits La valeur par
		 * defaut d'un byte est 0;
		 */

		byte unByte = 25;

		System.out.printf("unByte = %s\n", unByte);
		System.out.printf("minByte = %s\n", Byte.MIN_VALUE);
		System.out.printf("maxByte = %s\n", Byte.MAX_VALUE);

		unByte = 127;

		System.out.println("\n========Type SHORT=======\n");
		/**
		 * Le typeSHORT est un entier signé, codé sur 2 octetS soit 16 bits La valeur
		 * par defaut d'un SHORT est 0;
		 * 
		 */

		short unShort = -8547;

		System.out.printf("unShort = %s\n", unShort);
		System.out.printf("minShort = %s\n", Short.MIN_VALUE);
		System.out.printf("maxShort = %s\n", Short.MAX_VALUE);

		System.out.println("\n========Type int=======\n");
		/**
		 * Le type int est un entier signé, codé sur 3 octetS soit 32 bits La valeur par
		 * defaut d'un SHORT est 0;
		 * 
		 */

		int unInt = 520202;

		System.out.printf("unInt = %s\n", unInt);
		System.out.printf("minInt = %s\n", Integer.MIN_VALUE);
		System.out.printf("maxInt = %s\n", Integer.MAX_VALUE);

		System.out.println("\n========Type long=======\n");
		/**
		 * Le type long est un entier signé, codé sur 4 octetS soit 64 bits La valeur
		 * par defaut d'un SHORT est 0;
		 * 
		 */

		long unLong = 520201222;

		System.out.printf("unLong = %s\n", unLong);
		System.out.printf("minLong = %s\n", Long.MIN_VALUE);
		System.out.printf("maxLong = %s\n", Long.MAX_VALUE);

		unLong = 52020122495282L;

		System.out.printf("unLong = %s\n", unLong);

		unInt = unByte;
		System.out.printf("unInt = %s\n", unInt);
		unByte = (byte) unInt;

		System.out.printf("unByte = %s\n", unByte);
		unLong = unByte;
		System.out.printf("unLong = %s\n", unLong);
		unByte = (byte) unLong;

		System.out.printf("unByte = %s\n", unByte);

		System.out.println(unLong / 0.0);
		
		System.out.println(0.0 / 0);
		
		System.out.println( 8 / 3);
		System.out.println( 8. / 3);
		System.out.println( 8 / 3.);
		System.out.println((float)( 8 / 3));
		System.out.println(8f / 3);
		System.out.println((float) 8 / 3);
		System.out.println( 8d / 3);
		System.out.println( (double) 8 / 3);

	}

}
