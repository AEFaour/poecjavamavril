package fr.poecjava.javase.exercices.strings;


import java.util.Scanner;

public class StringEtoiles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Veuillez entrer une chaîne, svp : ");

        StringBuilder sb = new StringBuilder();
        sb.append(sc.nextLine());

        System.out.println(sb);



      /*  for(int i = 0; i < sb.length() -1; i++){
           sb =  sb.replace(sb.charAt(0), sb.charAt(i), sb);
        }
        System.out.println(sb);*/

       /* String str = sc.next();

        char[] strCh = new char[str.length()];

        for (int i = 0; i < strCh.length; i++) {

            strCh[i] = '*';
        }

        System.out.print(strCh);

        str = new String(strCh);

        System.out.println("\n" + str);*/

    }

}
