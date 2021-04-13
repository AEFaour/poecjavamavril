package fr.poecjava.javase.classes;

public class TestString {
    public static void main(String[] args) {
        String str1 = "Coucou";
        System.out.println(str1);
        String str2 = new String(str1);
        System.out.println(str2);
        String str3 = new String(new char[]{'c', 'o', 'u', 'c', 'o', 'u'});
        String str4 = new String(str1.toCharArray());
        System.out.println(str3);
        System.out.println(str4);


        System.out.printf("str1 == str 2 : %s\n", str1 == str2);
        System.out.printf("str1.equals(str2) : %s\n\n", str1.equals(str2));

        StringBuilder sb = new StringBuilder();
        sb.append("Bonjour");
        System.out.println(sb);
        sb.append(" Joa");
        System.out.println(sb);

        final int MAX = 10000;
        long depart = System.currentTimeMillis();

        for (int i = 0; i < MAX; i++){
            str1 += 'q';
        }

        long tempsPerformance = System.currentTimeMillis() - depart;
        System.out.println("String --> " + tempsPerformance);

        StringBuilder builder = new StringBuilder();



        for (int i = 0; i < MAX; i++){
            str1 += 'q';
        }

        long tempsPerformance1 = System.currentTimeMillis() - depart;
        System.out.println("String --> " + tempsPerformance1);
    }
}
